package org.example.policyengine.ACEngine.models;

public class PolicyEffectRequest {

    private String subject;
    private String action;
    private String resource;
    private String policyId;

    public PolicyEffectRequest(String action, String subject, String resource, String policyId) {
        this.action = action;
        this.subject = subject;
        this.resource = resource;
        this.policyId = policyId;
    }

    public String getSubject() {
        return subject;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
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
}
