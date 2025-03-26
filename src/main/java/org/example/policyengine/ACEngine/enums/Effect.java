package org.example.policyengine.ACEngine.enums;

public enum Effect {
    ALLOW("Permit"),
    DENY("Deny");

    private String effect;

    Effect(String effect) {
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }
}
