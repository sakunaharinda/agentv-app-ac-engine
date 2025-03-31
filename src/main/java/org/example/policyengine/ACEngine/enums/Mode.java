package org.example.policyengine.ACEngine.enums;

public enum Mode {
    SINGLE("single"),
    OVERALL("overall");

    private String mode;

    Mode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}
