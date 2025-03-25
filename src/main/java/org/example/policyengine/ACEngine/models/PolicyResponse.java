package org.example.policyengine.ACEngine.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class PolicyResponse {

    private String decision;
    private List<String> advice;

    public PolicyResponse() {}

    public PolicyResponse(String decision, List<String> advice) {
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
