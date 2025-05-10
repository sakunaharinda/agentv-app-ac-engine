package org.example.policyengine.ACEngine.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pdp")
public class PDPPolicyRecord {

    @Id
    private String policyId;
    private String policyDescription;
    private List<ACR> policy;
    private boolean published;
    private boolean ready_to_publish;
    private boolean with_context;

    public PDPPolicyRecord(String policyId, String policyDescription, List<ACR> policy, boolean published, boolean ready_to_publish, boolean with_context) {
        this.policyId = policyId;
        this.policyDescription = policyDescription;
        this.policy = policy;
        this.published = published;
        this.ready_to_publish = ready_to_publish;
        this.with_context = with_context;
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isReady_to_publish() {
        return ready_to_publish;
    }

    public void setReady_to_publish(boolean ready_to_publish) {
        this.ready_to_publish = ready_to_publish;
    }

    public boolean isWith_context() {
        return with_context;
    }

    public void setWith_context(boolean with_context) {
        this.with_context = with_context;
    }
}
