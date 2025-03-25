package org.example.policyengine.BasePolicyEngine.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "base_policies")
public class Policy {

    @Id
    private String id;
    private String nlacp;
    private List<Rule> rules;

    public Policy(String id, String nlacp, List<Rule> rules) {
        this.id = id;
        this.nlacp = nlacp;
        this.rules = rules;
    }

    public Policy(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNlacp() {
        return nlacp;
    }

    public void setNlacp(String nlacp) {
        this.nlacp = nlacp;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
