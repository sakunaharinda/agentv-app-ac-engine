package org.example.policyengine.BasePolicyEngine.models;

public class Rule {

    private String decision;
    private String subject;
    private String action;
    private String resource;
    private String condition;
    private String purpose;

    public Rule(String decision, String subject, String action, String resource, String purpose, String condition) {
        this.decision = decision;
        this.subject = subject;
        this.action = action;
        this.resource = resource;
        this.purpose = purpose;
        this.condition = condition;
    }

    public Rule() {
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
