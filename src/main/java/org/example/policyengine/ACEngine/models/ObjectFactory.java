
package org.example.policyengine.ACEngine.models;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.modelsJaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.modelsJaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link Policy.Rule }
     * 
     */
    public Policy.Rule createPolicyRule() {
        return new Policy.Rule();
    }

    /**
     * Create an instance of {@link Policy.Rule.AdviceExpressions }
     * 
     */
    public Policy.Rule.AdviceExpressions createPolicyRuleAdviceExpressions() {
        return new Policy.Rule.AdviceExpressions();
    }

    /**
     * Create an instance of {@link Policy.Rule.AdviceExpressions.AdviceExpression }
     * 
     */
    public Policy.Rule.AdviceExpressions.AdviceExpression createPolicyRuleAdviceExpressionsAdviceExpression() {
        return new Policy.Rule.AdviceExpressions.AdviceExpression();
    }

    /**
     * Create an instance of {@link Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression }
     * 
     */
    public Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression createPolicyRuleAdviceExpressionsAdviceExpressionAttributeAssignmentExpression() {
        return new Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target }
     * 
     */
    public Policy.Rule.Target createPolicyRuleTarget() {
        return new Policy.Rule.Target();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target.AnyOf }
     * 
     */
    public Policy.Rule.Target.AnyOf createPolicyRuleTargetAnyOf() {
        return new Policy.Rule.Target.AnyOf();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target.AnyOf.AllOf }
     * 
     */
    public Policy.Rule.Target.AnyOf.AllOf createPolicyRuleTargetAnyOfAllOf() {
        return new Policy.Rule.Target.AnyOf.AllOf();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target.AnyOf.AllOf.Match }
     * 
     */
    public Policy.Rule.Target.AnyOf.AllOf.Match createPolicyRuleTargetAnyOfAllOfMatch() {
        return new Policy.Rule.Target.AnyOf.AllOf.Match();
    }

    /**
     * Create an instance of {@link Policy.Target }
     * 
     */
    public Policy.Target createPolicyTarget() {
        return new Policy.Target();
    }

    /**
     * Create an instance of {@link Policy.Target.AnyOf }
     * 
     */
    public Policy.Target.AnyOf createPolicyTargetAnyOf() {
        return new Policy.Target.AnyOf();
    }

    /**
     * Create an instance of {@link Policy.Target.AnyOf.AllOf }
     * 
     */
    public Policy.Target.AnyOf.AllOf createPolicyTargetAnyOfAllOf() {
        return new Policy.Target.AnyOf.AllOf();
    }

    /**
     * Create an instance of {@link Policy.Target.AnyOf.AllOf.Match }
     * 
     */
    public Policy.Target.AnyOf.AllOf.Match createPolicyTargetAnyOfAllOfMatch() {
        return new Policy.Target.AnyOf.AllOf.Match();
    }

    /**
     * Create an instance of {@link Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression.AttributeValue }
     * 
     */
    public Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression.AttributeValue createPolicyRuleAdviceExpressionsAdviceExpressionAttributeAssignmentExpressionAttributeValue() {
        return new Policy.Rule.AdviceExpressions.AdviceExpression.AttributeAssignmentExpression.AttributeValue();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target.AnyOf.AllOf.Match.AttributeValue }
     * 
     */
    public Policy.Rule.Target.AnyOf.AllOf.Match.AttributeValue createPolicyRuleTargetAnyOfAllOfMatchAttributeValue() {
        return new Policy.Rule.Target.AnyOf.AllOf.Match.AttributeValue();
    }

    /**
     * Create an instance of {@link Policy.Rule.Target.AnyOf.AllOf.Match.AttributeDesignator }
     * 
     */
    public Policy.Rule.Target.AnyOf.AllOf.Match.AttributeDesignator createPolicyRuleTargetAnyOfAllOfMatchAttributeDesignator() {
        return new Policy.Rule.Target.AnyOf.AllOf.Match.AttributeDesignator();
    }

    /**
     * Create an instance of {@link Policy.Target.AnyOf.AllOf.Match.AttributeValue }
     * 
     */
    public Policy.Target.AnyOf.AllOf.Match.AttributeValue createPolicyTargetAnyOfAllOfMatchAttributeValue() {
        return new Policy.Target.AnyOf.AllOf.Match.AttributeValue();
    }

    /**
     * Create an instance of {@link Policy.Target.AnyOf.AllOf.Match.AttributeDesignator }
     * 
     */
    public Policy.Target.AnyOf.AllOf.Match.AttributeDesignator createPolicyTargetAnyOfAllOfMatchAttributeDesignator() {
        return new Policy.Target.AnyOf.AllOf.Match.AttributeDesignator();
    }

}
