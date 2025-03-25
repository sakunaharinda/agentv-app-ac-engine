package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.Policy;
import org.example.policyengine.ACEngine.models.PolicyRequest;
import org.example.policyengine.ACEngine.models.PolicyResponse;
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

    public List<Policy> getAllPolicies(){
        return acEngineRepository.findAll();
    }

    public PolicyResponse getEffectOne(PolicyRequest request){

        String policyId = request.getPolicyId();

        acPolicyFinderModule.setPolicyId(policyId);
        String xacmlRequest = acPolicyFinderModule.createXACMLRequest(request.getSubject(), request.getAction(), request.getResource());

        PDP pdp = getPDP(acPolicyFinderModule);

        String response = pdp.evaluate(xacmlRequest);

        return serializeResponse(response);
    }

    public PolicyResponse getEffect(PolicyRequest request){

        acPolicyFinderModule.setPolicyId(null);
        String xacmlRequest = acPolicyFinderModule.createXACMLRequest(request.getSubject(), request.getAction(), request.getResource());

        PDP pdp = getPDP(acPolicyFinderModule);

        String response = pdp.evaluate(xacmlRequest);

        return serializeResponse(response);

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

    public PolicyResponse serializeResponse(String response){

        PolicyResponse policyResponse = new PolicyResponse();

        try {
            ResponseCtx responseCtx = ResponseCtx.getInstance(getXacmlResponse(response));
            AbstractResult result  = responseCtx.getResults().iterator().next();
            if(AbstractResult.DECISION_PERMIT == result.getDecision()){
                policyResponse.setDecision("permit");
            } else if (AbstractResult.DECISION_NOT_APPLICABLE == result.getDecision()) {
                policyResponse.setDecision("not_applicable");
            } else {
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


}
