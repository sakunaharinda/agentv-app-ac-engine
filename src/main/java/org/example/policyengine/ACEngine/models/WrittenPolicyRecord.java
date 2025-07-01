package org.example.policyengine.ACEngine.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "written_policy")
public class WrittenPolicyRecord {

    @Id
    private String id;
    private String sentence;
    private List<ACR> policy;
    private String error;
    private boolean is_incorrect;
    private boolean is_reviewed;

    public WrittenPolicyRecord(String id, String sentence, List<ACR> policy, String error, boolean is_incorrect, boolean is_reviewed) {
        this.id = id;
        this.sentence = sentence;
        this.policy = policy;
        this.error = error;
        this.is_incorrect = is_incorrect;
        this.is_reviewed = is_reviewed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<ACR> getPolicy() {
        return policy;
    }

    public void setPolicy(List<ACR> policy) {
        this.policy = policy;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isIs_incorrect() {
        return is_incorrect;
    }

    public void setIs_incorrect(boolean is_incorrect) {
        this.is_incorrect = is_incorrect;
    }

    public boolean isIs_reviewed() {
        return is_reviewed;
    }

    public void setIs_reviewed(boolean is_reviewed) {
        this.is_reviewed = is_reviewed;
    }
}
