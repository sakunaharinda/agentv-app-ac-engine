package org.example.policyengine.ACEngine;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.example.policyengine.ACEngine.enums.Effect;
import org.example.policyengine.ACEngine.models.*;

import java.io.File;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ACPolicyGenerator {

    private static final String firstApplicable = "urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:first-applicable";

    private static final String matchId = "urn:oasis:names:tc:xacml:1.0:function:string-equal";
    private static final String dataType = "http://www.w3.org/2001/XMLSchema#string";

    private static final String subjectCategory = "urn:oasis:names:tc:xacml:1.0:subject-category:access-subject";
    private static final String subjectId = "urn:oasis:names:tc:xacml:1.0:subject:subject-id";

    private static final String actionCategory = "urn:oasis:names:tc:xacml:3.0:attribute-category:action";
    private static final String actionId = "urn:oasis:names:tc:xacml:1.0:action:action-id";

    private static final String resourceCategory = "urn:oasis:names:tc:xacml:3.0:attribute-category:resource";
    private static final String resourceId = "urn:oasis:names:tc:xacml:1.0:resource:resource-id";

    private static final String conditionCategory = "urn:oasis:names:tc:xacml:3.0:attribute-category:";

    private static ObjectFactory objectFactory;
    private static ObjectMapper objectMapper;

    public ACPolicyGenerator() {
        objectFactory = new ObjectFactory();
        objectMapper = new ObjectMapper();
    }

    public Policy.Target getRuleTarget(HashMap<String, ?> entityMap){

        Policy.Target target = objectFactory.createPolicyTarget();
        List<Policy.Target.AnyOf> anyOfs = new ArrayList<>();
        Policy.Target.AnyOf anyOf = new Policy.Target.AnyOf();
        Policy.Target.AnyOf.AllOf allOf = new Policy.Target.AnyOf.AllOf();
        List<Policy.Target.AnyOf.AllOf> allOfs = new ArrayList<>();
        List<Policy.Target.AnyOf.AllOf.Match> allOfMatches = new ArrayList<>();

        for (Map.Entry<String, ?> entry : entityMap.entrySet()) {
            if (entry.getKey().equals("decision") || entry.getKey().equals("purpose") || entry.getKey().equals("ruleId") || entry.getKey().equals("ruleDescription")) {
                continue;
            }
            Policy.Target.AnyOf.AllOf.Match match = new Policy.Target.AnyOf.AllOf.Match();

            Policy.Target.AnyOf.AllOf.Match.AttributeValue attributeValue = new Policy.Target.AnyOf.AllOf.Match.AttributeValue();

            Policy.Target.AnyOf.AllOf.Match.AttributeDesignator attributeDesignator = new Policy.Target.AnyOf.AllOf.Match.AttributeDesignator();

            if (entry.getKey().matches("subject")){
                attributeDesignator.setMustBePresent(true);
                attributeDesignator.setDataType(dataType);
                attributeDesignator.setCategory(subjectCategory);
                attributeDesignator.setAttributeId(subjectId);
                attributeValue.setDataType(dataType);
                attributeValue.setValue(entry.getValue().toString());
                match.setAttributeValue(attributeValue);
                match.setAttributeDesignator(attributeDesignator);
                match.setMatchId(matchId);
                allOfMatches.add(match);
            } else if (entry.getKey().equals("action")){
                attributeDesignator.setMustBePresent(true);
                attributeDesignator.setDataType(dataType);
                attributeDesignator.setCategory(actionCategory);
                attributeDesignator.setAttributeId(actionId);
                attributeValue.setDataType(dataType);
                attributeValue.setValue(entry.getValue().toString());
                match.setAttributeValue(attributeValue);
                match.setAttributeDesignator(attributeDesignator);
                match.setMatchId(matchId);
                allOfMatches.add(match);
            } else if (entry.getKey().equals("resource")){
                attributeDesignator.setMustBePresent(true);
                attributeDesignator.setDataType(dataType);
                attributeDesignator.setCategory(resourceCategory);
                attributeDesignator.setAttributeId(resourceId);
                attributeValue.setDataType(dataType);
                attributeValue.setValue(entry.getValue().toString());
                match.setAttributeValue(attributeValue);
                match.setAttributeDesignator(attributeDesignator);
                match.setMatchId(matchId);
                allOfMatches.add(match);
            } else if (entry.getKey().equals("condition") && entry.getValue() != null){
                attributeDesignator.setMustBePresent(true);
                attributeDesignator.setDataType(dataType);
                HashMap<String, String> conditionMap = (HashMap<String, String>) entry.getValue();
                attributeDesignator.setCategory(conditionCategory+conditionMap.get("left"));
                attributeDesignator.setAttributeId(conditionMap.get("left"));
                attributeValue.setDataType(dataType);
                attributeValue.setValue(conditionMap.get("right"));
                match.setAttributeValue(attributeValue);
                match.setAttributeDesignator(attributeDesignator);
                match.setMatchId(matchId);
                allOfMatches.add(match);
            }

        }

        allOf.setMatch(allOfMatches);
        allOfs.add(allOf);
        anyOf.setAllOf(allOfs);
        anyOfs.add(anyOf);

        target.setAnyOf(anyOfs);

        return target;

    }

    public Policy.Target getMainTarget(HashMap<String, String> entityMap){

        Policy.Target target = objectFactory.createPolicyTarget();
        List<Policy.Target.AnyOf> anyOfs = new ArrayList<>();
        Policy.Target.AnyOf anyOf = new Policy.Target.AnyOf();
        List<Policy.Target.AnyOf.AllOf> allOfs = new ArrayList<>();

        for (Map.Entry<String, String> entry : entityMap.entrySet()) {
            Policy.Target.AnyOf.AllOf allOf = new Policy.Target.AnyOf.AllOf();
            Policy.Target.AnyOf.AllOf.Match match = new Policy.Target.AnyOf.AllOf.Match();

            Policy.Target.AnyOf.AllOf.Match.AttributeValue attributeValue = new Policy.Target.AnyOf.AllOf.Match.AttributeValue();
            attributeValue.setDataType(dataType);
            attributeValue.setValue(entry.getValue());
            match.setAttributeValue(attributeValue);
            Policy.Target.AnyOf.AllOf.Match.AttributeDesignator attributeDesignator = new Policy.Target.AnyOf.AllOf.Match.AttributeDesignator();
            attributeDesignator.setMustBePresent(true);
            attributeDesignator.setDataType(dataType);

            if (entry.getKey().matches("subject_.*")){
                attributeDesignator.setCategory(subjectCategory);
                attributeDesignator.setAttributeId(subjectId);
            } else if (entry.getKey().equals("action")){
                attributeDesignator.setCategory(actionCategory);
                attributeDesignator.setAttributeId(actionId);
            } else if (entry.getKey().equals("resource")){
                attributeDesignator.setCategory(resourceCategory);
                attributeDesignator.setAttributeId(resourceId);
            }
            match.setAttributeDesignator(attributeDesignator);
            match.setMatchId(matchId);
            List<Policy.Target.AnyOf.AllOf.Match> allOfMatches = new ArrayList<>();
            allOfMatches.add(match);
            allOf.setMatch(allOfMatches);

            allOfs.add(allOf);
        }
        anyOf.setAllOf(allOfs);
        anyOfs.add(anyOf);
        target.setAnyOf(anyOfs);

        return target;

    }

    public Policy.Rule getRule (ACR acr){

        HashMap acrMap = objectMapper.convertValue(acr, HashMap.class);

        Policy.Rule rule = objectFactory.createPolicyRule();
        Policy.Target target = getRuleTarget(acrMap);
        rule.setTarget(target);
        rule.setRuleId(acr.getRuleId());
        rule.setDescription(acr.getRuleDescription());
        if (acr.getDecision().equals("allow")) {
            rule.setEffect(Effect.ALLOW.getEffect());
        } else {
            rule.setEffect(Effect.DENY.getEffect());
        }
        return rule;
    }

    public Policy.Rule getDefaultRule(){
        Policy.Rule rule = objectFactory.createPolicyRule();
        rule.setDescription("Default deny rule");
        rule.setEffect(Effect.DENY.getEffect());
        rule.setRuleId("default-deny");

        return rule;
    }

    public String getStringPolicy(Policy policy) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Policy.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(policy, new File("policies/test_policy.xml"));
        StringWriter sw = new StringWriter();
        mar.marshal(policy, sw);
        return sw.toString();
    }

    public XACMLPolicyRecord getXACMLPolicy (JSONPolicyRecord policyRecord) throws JAXBException {
        List<Policy.Rule> rules = new ArrayList<>();

        HashMap<String, String> subjectMap = new HashMap<>();
        int i = 0;
        for (ACR acr : policyRecord.getPolicy()) {

            if (!subjectMap.containsValue(acr.getSubject())) {
                subjectMap.put("subject_" + i, acr.getSubject());
                i+=1;
            }

            Policy.Rule rule = getRule(acr);

            rules.add(rule);
        }

        Policy policy = new Policy();

        Policy.Target target = getMainTarget(subjectMap);

        policy.setRule(rules);
        policy.setTarget(target);
        policy.setVersion(BigDecimal.valueOf(1.0));
        policy.setRuleCombiningAlgId(firstApplicable);
        policy.setDescription(policyRecord.getPolicyDescription());
        policy.setPolicyId(policyRecord.getPolicyId());

        String stringPolicy = getStringPolicy(policy);

        return new XACMLPolicyRecord(policyRecord.getPolicyId(), stringPolicy);

    }
}
