package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.enums.Mode;
import org.example.policyengine.ACEngine.models.Expression;
import org.example.policyengine.ACEngine.models.XACMLPolicyRecord;
import org.example.policyengine.ACEngine.models.PolicyEffectRequest;
import org.example.policyengine.ACEngine.models.PolicyEffectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.wso2.balana.PDP;
import org.wso2.balana.PDPConfig;
import org.wso2.balana.ParsingException;
import org.wso2.balana.ctx.AbstractResult;
import org.wso2.balana.ctx.AttributeAssignment;
import org.wso2.balana.ctx.ResponseCtx;
import org.wso2.balana.finder.AttributeFinder;
import org.wso2.balana.finder.PolicyFinder;
import org.wso2.balana.finder.PolicyFinderModule;
import org.wso2.balana.xacml3.Advice;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ACEngineService {

    @Autowired
    private ACEngineRepository acEngineRepository;

    @Autowired
    private ACPolicyFinderModule acPolicyFinderModule;

    public ACEngineService() throws ParserConfigurationException {

    }

    public List<XACMLPolicyRecord> getAllPolicies(){
        return acEngineRepository.findAll();
    }

    public XACMLPolicyRecord getPolicy(String policyId){
        // TODO: Handle the error when there is no policy to return

        return acEngineRepository.findById(policyId).get();
    }

    public PolicyEffectResponse getEffectOne(PolicyEffectRequest request){

        String policyId = request.getPolicyId();

        acPolicyFinderModule.setPolicyId(policyId);
        String xacmlRequest = createXACMLRequest(request.getSubject(), request.getAction(), request.getResource(), request.getCondition());

        PDP pdp = getPDP(acPolicyFinderModule);

        String response = pdp.evaluate(xacmlRequest);

        return serializeResponse(response, Mode.SINGLE);
    }

    public PolicyEffectResponse getEffect(PolicyEffectRequest request){

        acPolicyFinderModule.setPolicyId(null);
        String xacmlRequest = createXACMLRequest(request.getSubject(), request.getAction(), request.getResource(), request.getCondition());

        PDP pdp = getPDP(acPolicyFinderModule);

        String response = pdp.evaluate(xacmlRequest);

        return serializeResponse(response, Mode.OVERALL);

    }

    public PDP getPDP(PolicyFinderModule policyFinderModule){
        Set<PolicyFinderModule> policyFinderModules = new HashSet<>();
        policyFinderModules.add(policyFinderModule);

        PolicyFinder policyFinder = new PolicyFinder();
        policyFinder.setModules(policyFinderModules);

        PDP  pdp = new PDP(new PDPConfig(
                new AttributeFinder(),
                policyFinder,
                null,
                true
        ));

        return pdp;
    }

    public PolicyEffectResponse serializeResponse(String response, Mode mode){
        System.out.println(response);
        PolicyEffectResponse policyResponse = new PolicyEffectResponse();

        try {
            ResponseCtx responseCtx = ResponseCtx.getInstance(getXacmlResponse(response));
            AbstractResult result  = responseCtx.getResults().iterator().next();
            if(AbstractResult.DECISION_PERMIT == result.getDecision()){
                policyResponse.setDecision("permit");
            } else if (AbstractResult.DECISION_DENY == result.getDecision()) {
                policyResponse.setDecision("deny");
                List<Advice> advices = result.getAdvices();
                List<String> responseAdvices = new ArrayList<>();
                for(Advice advice : advices){
                    List<AttributeAssignment> assignments = advice.getAssignments();
                    for(AttributeAssignment assignment : assignments){
                        responseAdvices.add(assignment.getContent());
                    }
                }
                policyResponse.setAdvice(responseAdvices);
            } else {

                if (mode == Mode.SINGLE){
                    policyResponse.setDecision("not_applicable");
                } else if (mode == Mode.OVERALL) {
                    // Handling default deny
                    policyResponse.setDecision("deny");
                }

            }

        } catch (ParsingException e) {
            e.printStackTrace();
        }

        return policyResponse;
    }

    public Element getXacmlResponse(String response) {

        ByteArrayInputStream inputStream;
        DocumentBuilderFactory dbf;
        Document doc;

        inputStream = new ByteArrayInputStream(response.getBytes());
        dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);

        try {
            doc = dbf.newDocumentBuilder().parse(inputStream);
        } catch (Exception e) {
            System.err.println("DOM of request element can not be created from String");
            return null;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.err.println("Error in closing input stream of XACML response");
            }
        }
        return doc.getDocumentElement();
    }

    public String createXACMLRequest(String subject, String action, String resource, Expression condition){
        String conditionString = "";
        if (condition!=null){
            conditionString = "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:" + condition.getLeft() + "\">\n" +
                    "<Attribute AttributeId=\"" + condition.getLeft() + "\" IncludeInResult=\"false\">\n" +
                    "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + condition.getRight() + "</AttributeValue>\n" +
                    "</Attribute>\n" +
                    "</Attributes>\n";
        }
        return "<Request xmlns=\"urn:oasis:names:tc:xacml:3.0:core:schema:wd-17\" CombinedDecision=\"false\" ReturnPolicyIdList=\"false\">\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:action\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:action:action-id\" IncludeInResult=\"false\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + action + "</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:1.0:subject-category:access-subject\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\" IncludeInResult=\"true\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + subject +"</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:resource\">\n" +
                "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:resource:resource-id\" IncludeInResult=\"false\">\n" +
                "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">" + resource + "</AttributeValue>\n" +
                "</Attribute>\n" +
                "</Attributes>\n" +
                conditionString +
                "</Request>";
    }
}
