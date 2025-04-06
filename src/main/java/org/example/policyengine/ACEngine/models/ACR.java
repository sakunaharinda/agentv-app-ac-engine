package org.example.policyengine.ACEngine.models;

import java.util.UUID;

public class ACR {

    private String decision;
    private String subject;
    private String action;
    private String resource;
    private Expression condition;
    private String purpose;
    private String ruleId = "";
    private String ruleDescription = "";

    public ACR(String decision, String subject, String action, String resource, Expression condition, String purpose) {
        UUID uuid = UUID.randomUUID();

        this.decision = decision;
        this.subject = subject;
        this.action = action;
        this.resource = resource;
        this.condition = condition;
        this.purpose = purpose;
        this.ruleId = uuid.toString();
        this.ruleDescription = decision + " " + subject + " " + action + " " + resource;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
