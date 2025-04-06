package org.example.policyengine.ACEngine.models;

public class Expression {

    private String left;
    private String right;
    private String operator;

    public Expression(String left, String operator, String right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
