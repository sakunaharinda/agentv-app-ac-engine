package org.example.policyengine.ACEngine.models;

import java.util.List;

public class JSONPolicyRecord {

    private String policyId;
    private String policyDescription;
    private List<ACR> policy;

    public JSONPolicyRecord(String policyId, String policyDescription, List<ACR> policy) {
        this.policyId = policyId;
        this.policyDescription = policyDescription;
        this.policy = policy;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    public List<ACR> getPolicy() {
        return policy;
    }

    public void setPolicy(List<ACR> policy) {
        this.policy = policy;
    }
}
