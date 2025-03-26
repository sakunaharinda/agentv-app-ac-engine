package org.example.policyengine.ACEngine.models;

import java.util.List;

public class PolicyEffectResponse {

    private String decision;
    private List<String> advice;

    public PolicyEffectResponse() {}

    public PolicyEffectResponse(String decision, List<String> advice) {
        this.decision = decision;
        this.advice = advice;
    }

    public List<String> getAdvice() {
        return advice;
    }

    public void setAdvice(List<String> advice) {
        this.advice = advice;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
}
