package org.example.policyengine.ACEngine;

import com.mongodb.annotations.Beta;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;
import org.wso2.balana.*;
import org.wso2.balana.combine.PolicyCombiningAlgorithm;
import org.wso2.balana.combine.xacml2.DenyOverridesPolicyAlg;
import org.wso2.balana.ctx.EvaluationCtx;
import org.wso2.balana.ctx.Status;
import org.wso2.balana.finder.PolicyFinder;
import org.wso2.balana.finder.PolicyFinderModule;
import org.wso2.balana.finder.PolicyFinderResult;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Component
public class ACPolicyFinderModule extends PolicyFinderModule {

    private DocumentBuilder documentBuilder;
    private MongoCollection<Document> policyCollection;
    private PolicyFinder finder = null;
    private Map<URI, AbstractPolicy> policies = new HashMap();
    private PolicyCombiningAlgorithm combiningAlg;
    private static final Log log = LogFactory.getLog(ACPolicyFinderModule.class);

    @Autowired
    private ACEngineRepository acEngineRepository;

    public ACPolicyFinderModule() throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        this.documentBuilder = documentBuilderFactory.newDocumentBuilder();

//        MongoClient mongoClient = MongoClients.create(connectionString);
//        MongoDatabase database = mongoClient.getDatabase(databaseName);
//        this.policyCollection = database.getCollection(collectionName);
    }

    @Override
    public void init(PolicyFinder policyFinder) {
        this.finder = finder;
        // Load policies from MongoDB
        this.loadPolicies();
        this.combiningAlg = new DenyOverridesPolicyAlg();
    }

    public void loadPolicies() {
        this.policies.clear();

        List<org.example.policyengine.ACEngine.models.Policy> policyDb = acEngineRepository.findAll();

        // Load policies from MongoDB
        for (org.example.policyengine.ACEngine.models.Policy policyDoc : policyDb) {
            String policyXml = policyDoc.getPolicy();
//            System.out.println(policyXml);
            try {
                // Parse XML to Node
                Node policyNode = documentBuilder.parse(
                        new ByteArrayInputStream(policyXml.getBytes(StandardCharsets.UTF_8))
                ).getDocumentElement();

                // Create AbstractPolicy from Node
                AbstractPolicy policy = Policy.getInstance(policyNode);
                this.policies.put(policy.getId(), policy);
            } catch (Exception e) {
                System.err.println("Error loading policy: " + e.getMessage());
            }
        }
    }

    public PolicyFinderResult findPolicy(EvaluationCtx context) {
        ArrayList<AbstractPolicy> selectedPolicies = new ArrayList();
        Set<Map.Entry<URI, AbstractPolicy>> entrySet = this.policies.entrySet();
        Iterator var4 = entrySet.iterator();

        while(var4.hasNext()) {
            Map.Entry<URI, AbstractPolicy> entry = (Map.Entry)var4.next();
            AbstractPolicy policy = (AbstractPolicy)entry.getValue();
            MatchResult match = policy.match(context);
            int result = match.getResult();
            if (result == 2) {
                return new PolicyFinderResult(match.getStatus());
            }

            if (result == 0) {
                if (this.combiningAlg == null && selectedPolicies.size() > 0) {
                    ArrayList<String> code = new ArrayList();
                    code.add("urn:oasis:names:tc:xacml:1.0:status:processing-error");
                    Status status = new Status(code, "too many applicable top-level policies");
                    return new PolicyFinderResult(status);
                }

                selectedPolicies.add(policy);
            }
        }

        switch (selectedPolicies.size()) {
            case 0:
                if (log.isDebugEnabled()) {
                    log.debug("No matching XACML policy found");
                }

                return new PolicyFinderResult();
            case 1:
                return new PolicyFinderResult((AbstractPolicy)selectedPolicies.get(0));
            default:
                return new PolicyFinderResult(new PolicySet((URI)null, this.combiningAlg, (AbstractTarget)null, selectedPolicies));
        }
    }

    public PolicyFinderResult findPolicy(URI idReference, int type, VersionConstraints constraints, PolicyMetaData parentMetaData) {
        AbstractPolicy policy = (AbstractPolicy)this.policies.get(idReference);
        if (policy != null) {
            if (type == 0) {
                if (policy instanceof Policy) {
                    return new PolicyFinderResult(policy);
                }
            } else if (policy instanceof PolicySet) {
                return new PolicyFinderResult(policy);
            }
        }

        ArrayList<String> code = new ArrayList();
        code.add("urn:oasis:names:tc:xacml:1.0:status:processing-error");
        Status status = new Status(code, "couldn't load referenced policy");
        return new PolicyFinderResult(status);
    }

    @Override
    public boolean isIdReferenceSupported() {
        return true;
    }

    public boolean isRequestSupported() {
        return true;
    }

    public String createXACMLRequest(String subject, String action, String resource){

        return "<Request xmlns=\"urn:oasis:names:tc:xacml:3.0:core:schema:wd-17\" CombinedDecision=\"false\" ReturnPolicyIdList=\"false\">\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:action\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:action:action-id\" IncludeInResult=\"false\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + action + "</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:1.0:subject-category:access-subject\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\" IncludeInResult=\"false\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + subject +"</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:resource\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:resource:resource-id\" IncludeInResult=\"false\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + resource + "</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                "</Request>";
    }
}
