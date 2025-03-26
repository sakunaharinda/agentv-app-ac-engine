package org.example.policyengine.ACEngine.models;

import java.util.List;

public class JSONPolicyRecord {

    private String policyId;
    private String policyDescription;
    private List<ACR> acrs;

    public JSONPolicyRecord(String policyId, String policyDescription, List<ACR> acrs) {
        this.policyId = policyId;
        this.policyDescription = policyDescription;
        this.acrs = acrs;
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

    public List<ACR> getAcrs() {
        return acrs;
    }

    public void setAcrs(List<ACR> acrs) {
        this.acrs = acrs;
    }
}
