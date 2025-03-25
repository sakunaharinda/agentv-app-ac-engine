package org.example.policyengine.ACEngine.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "policy")
public class Policy {

    @Id
    private String id;
    private String policy;

    public Policy() {}

    public Policy(String id, String policy) {
        this.id = id;
        this.policy = policy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String xacmlPolicy) {
        this.policy = xacmlPolicy;
    }
}
