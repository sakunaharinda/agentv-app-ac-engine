
package org.example.policyengine.ACEngine.models;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Target"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AnyOf" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AllOf" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Match" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AttributeValue"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AttributeDesignator"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                         &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rule" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Target" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AnyOf" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AllOf" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Match" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="AttributeValue"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;simpleContent&gt;
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                                   &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/simpleContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="AttributeDesignator"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                   &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                   &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                                   &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                         &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AdviceExpressions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AdviceExpression"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AttributeAssignmentExpression"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="AttributeValue"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="AdviceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="AppliesTo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RuleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PolicyId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RuleCombiningAlgId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "target",
    "rule"
})
@XmlRootElement(name = "Policy", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17")
public class Policy {

    @XmlElement(name = "Description", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
    protected String description;
    @XmlElement(name = "Target", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
    protected Target target;
    @XmlElement(name = "Rule", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
    protected List<Rule> rule;
    @XmlAttribute(name = "PolicyId", required = true)
    protected String policyId;
    @XmlAttribute(name = "RuleCombiningAlgId", required = true)
    protected String ruleCombiningAlgId;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rule }
     * 
     * 
     */
    public List<Rule> getRule() {
        if (rule == null) {
            rule = new ArrayList<Rule>();
        }
        return this.rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the ruleCombiningAlgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCombiningAlgId() {
        return ruleCombiningAlgId;
    }

    /**
     * Sets the value of the ruleCombiningAlgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCombiningAlgId(String value) {
        this.ruleCombiningAlgId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Target" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AnyOf" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AllOf" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Match" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="AttributeValue"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;simpleContent&gt;
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                                         &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/simpleContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="AttributeDesignator"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                         &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                         &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                                         &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                               &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AdviceExpressions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AdviceExpression"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AttributeAssignmentExpression"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AttributeValue"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="AdviceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="AppliesTo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RuleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "target",
        "adviceExpressions"
    })
    public static class Rule {

        @XmlElement(name = "Description", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
        protected String description;
        @XmlElement(name = "Target", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17")
        protected Policy.Target target;
        @XmlElement(name = "AdviceExpressions", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17")
        protected AdviceExpressions adviceExpressions;
        @XmlAttribute(name = "RuleId", required = true)
        protected String ruleId;
        @XmlAttribute(name = "Effect", required = true)
        protected String effect;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link Policy.Target }
         *     
         */
        public Policy.Target getTarget() {
            return target;
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policy.Target }
         *     
         */
        public void setTarget(Policy.Target value) {
            this.target = value;
        }

        /**
         * Gets the value of the adviceExpressions property.
         * 
         * @return
         *     possible object is
         *     {@link AdviceExpressions }
         *     
         */
        public AdviceExpressions getAdviceExpressions() {
            return adviceExpressions;
        }

        /**
         * Sets the value of the adviceExpressions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdviceExpressions }
         *     
         */
        public void setAdviceExpressions(AdviceExpressions value) {
            this.adviceExpressions = value;
        }

        /**
         * Gets the value of the ruleId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleId() {
            return ruleId;
        }

        /**
         * Sets the value of the ruleId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleId(String value) {
            this.ruleId = value;
        }

        /**
         * Gets the value of the effect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffect() {
            return effect;
        }

        /**
         * Sets the value of the effect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffect(String value) {
            this.effect = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AdviceExpression"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AttributeAssignmentExpression"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AttributeValue"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="AdviceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="AppliesTo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "adviceExpression"
        })
        public static class AdviceExpressions {

            @XmlElement(name = "AdviceExpression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
            protected AdviceExpression adviceExpression;

            /**
             * Gets the value of the adviceExpression property.
             * 
             * @return
             *     possible object is
             *     {@link AdviceExpression }
             *     
             */
            public AdviceExpression getAdviceExpression() {
                return adviceExpression;
            }

            /**
             * Sets the value of the adviceExpression property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdviceExpression }
             *     
             */
            public void setAdviceExpression(AdviceExpression value) {
                this.adviceExpression = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AttributeAssignmentExpression"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="AttributeValue"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="AdviceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="AppliesTo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attributeAssignmentExpression"
            })
            public static class AdviceExpression {

                @XmlElement(name = "AttributeAssignmentExpression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                protected AttributeAssignmentExpression attributeAssignmentExpression;
                @XmlAttribute(name = "AdviceId", required = true)
                protected String adviceId;
                @XmlAttribute(name = "AppliesTo", required = true)
                protected String appliesTo;

                /**
                 * Gets the value of the attributeAssignmentExpression property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttributeAssignmentExpression }
                 *     
                 */
                public AttributeAssignmentExpression getAttributeAssignmentExpression() {
                    return attributeAssignmentExpression;
                }

                /**
                 * Sets the value of the attributeAssignmentExpression property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributeAssignmentExpression }
                 *     
                 */
                public void setAttributeAssignmentExpression(AttributeAssignmentExpression value) {
                    this.attributeAssignmentExpression = value;
                }

                /**
                 * Gets the value of the adviceId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdviceId() {
                    return adviceId;
                }

                /**
                 * Sets the value of the adviceId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdviceId(String value) {
                    this.adviceId = value;
                }

                /**
                 * Gets the value of the appliesTo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAppliesTo() {
                    return appliesTo;
                }

                /**
                 * Sets the value of the appliesTo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAppliesTo(String value) {
                    this.appliesTo = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="AttributeValue"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "attributeValue"
                })
                public static class AttributeAssignmentExpression {

                    @XmlElement(name = "AttributeValue", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                    protected AttributeValue attributeValue;
                    @XmlAttribute(name = "AttributeId", required = true)
                    protected String attributeId;

                    /**
                     * Gets the value of the attributeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AttributeValue }
                     *     
                     */
                    public AttributeValue getAttributeValue() {
                        return attributeValue;
                    }

                    /**
                     * Sets the value of the attributeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AttributeValue }
                     *     
                     */
                    public void setAttributeValue(AttributeValue value) {
                        this.attributeValue = value;
                    }

                    /**
                     * Gets the value of the attributeId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAttributeId() {
                        return attributeId;
                    }

                    /**
                     * Sets the value of the attributeId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAttributeId(String value) {
                        this.attributeId = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/simpleContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class AttributeValue {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "DataType", required = true)
                        protected String dataType;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the dataType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDataType() {
                            return dataType;
                        }

                        /**
                         * Sets the value of the dataType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDataType(String value) {
                            this.dataType = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AnyOf" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AllOf" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Match" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="AttributeValue"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;simpleContent&gt;
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                               &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/simpleContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="AttributeDesignator"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                               &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                               &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                               &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                     &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "anyOf"
        })
        public static class Target {

            @XmlElement(name = "AnyOf", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
            protected List<AnyOf> anyOf;

            /**
             * Gets the value of the anyOf property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the anyOf property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAnyOf().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AnyOf }
             * 
             * 
             */
            public List<AnyOf> getAnyOf() {
                if (anyOf == null) {
                    anyOf = new ArrayList<AnyOf>();
                }
                return this.anyOf;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AllOf" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Match" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="AttributeValue"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;simpleContent&gt;
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                                     &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/simpleContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="AttributeDesignator"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                     &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                     &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                                     &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                           &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "allOf"
            })
            public static class AnyOf {

                @XmlElement(name = "AllOf", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                protected List<AllOf> allOf;

                /**
                 * Gets the value of the allOf property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the allOf property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAllOf().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AllOf }
                 * 
                 * 
                 */
                public List<AllOf> getAllOf() {
                    if (allOf == null) {
                        allOf = new ArrayList<AllOf>();
                    }
                    return this.allOf;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Match" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="AttributeValue"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;simpleContent&gt;
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                           &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/simpleContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="AttributeDesignator"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                           &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                           &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                           &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *                 &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "match"
                })
                public static class AllOf {

                    @XmlElement(name = "Match", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                    protected List<Match> match;

                    /**
                     * Gets the value of the match property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the Jakarta XML Binding object.
                     * This is why there is not a <CODE>set</CODE> method for the match property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMatch().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Match }
                     * 
                     * 
                     */
                    public List<Match> getMatch() {
                        if (match == null) {
                            match = new ArrayList<Match>();
                        }
                        return this.match;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="AttributeValue"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;simpleContent&gt;
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *                 &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *               &lt;/extension&gt;
                     *             &lt;/simpleContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="AttributeDesignator"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                 &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                 &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *                 &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *       &lt;/sequence&gt;
                     *       &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "attributeValue",
                        "attributeDesignator"
                    })
                    public static class Match {

                        @XmlElement(name = "AttributeValue", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                        protected AttributeValue attributeValue;
                        @XmlElement(name = "AttributeDesignator", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                        protected AttributeDesignator attributeDesignator;
                        @XmlAttribute(name = "MatchId", required = true)
                        protected String matchId;

                        /**
                         * Gets the value of the attributeValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AttributeValue }
                         *     
                         */
                        public AttributeValue getAttributeValue() {
                            return attributeValue;
                        }

                        /**
                         * Sets the value of the attributeValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AttributeValue }
                         *     
                         */
                        public void setAttributeValue(AttributeValue value) {
                            this.attributeValue = value;
                        }

                        /**
                         * Gets the value of the attributeDesignator property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AttributeDesignator }
                         *     
                         */
                        public AttributeDesignator getAttributeDesignator() {
                            return attributeDesignator;
                        }

                        /**
                         * Sets the value of the attributeDesignator property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AttributeDesignator }
                         *     
                         */
                        public void setAttributeDesignator(AttributeDesignator value) {
                            this.attributeDesignator = value;
                        }

                        /**
                         * Gets the value of the matchId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMatchId() {
                            return matchId;
                        }

                        /**
                         * Sets the value of the matchId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMatchId(String value) {
                            this.matchId = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *       &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class AttributeDesignator {

                            @XmlAttribute(name = "Category", required = true)
                            protected String category;
                            @XmlAttribute(name = "AttributeId", required = true)
                            protected String attributeId;
                            @XmlAttribute(name = "DataType", required = true)
                            protected String dataType;
                            @XmlAttribute(name = "MustBePresent", required = true)
                            protected boolean mustBePresent;

                            /**
                             * Gets the value of the category property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCategory() {
                                return category;
                            }

                            /**
                             * Sets the value of the category property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCategory(String value) {
                                this.category = value;
                            }

                            /**
                             * Gets the value of the attributeId property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAttributeId() {
                                return attributeId;
                            }

                            /**
                             * Sets the value of the attributeId property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAttributeId(String value) {
                                this.attributeId = value;
                            }

                            /**
                             * Gets the value of the dataType property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDataType() {
                                return dataType;
                            }

                            /**
                             * Sets the value of the dataType property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDataType(String value) {
                                this.dataType = value;
                            }

                            /**
                             * Gets the value of the mustBePresent property.
                             * 
                             */
                            public boolean isMustBePresent() {
                                return mustBePresent;
                            }

                            /**
                             * Sets the value of the mustBePresent property.
                             * 
                             */
                            public void setMustBePresent(boolean value) {
                                this.mustBePresent = value;
                            }

                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;simpleContent&gt;
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                         *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                         *     &lt;/extension&gt;
                         *   &lt;/simpleContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class AttributeValue {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "DataType", required = true)
                            protected String dataType;

                            /**
                             * Gets the value of the value property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Sets the value of the value property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Gets the value of the dataType property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDataType() {
                                return dataType;
                            }

                            /**
                             * Sets the value of the dataType property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDataType(String value) {
                                this.dataType = value;
                            }

                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AnyOf" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AllOf" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Match" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="AttributeValue"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="AttributeDesignator"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                               &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anyOf"
    })
    public static class Target {

        @XmlElement(name = "AnyOf", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
        protected List<AnyOf> anyOf;

        /**
         * Gets the value of the anyOf property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the anyOf property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnyOf().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnyOf }
         * 
         * 
         */
        public List<AnyOf> getAnyOf() {
            if (anyOf == null) {
                anyOf = new ArrayList<AnyOf>();
            }
            return this.anyOf;
        }

        public void setAnyOf(List<AnyOf> value) {
            this.anyOf = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AllOf" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Match" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="AttributeValue"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="AttributeDesignator"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                                     &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "allOf"
        })
        public static class AnyOf {

            @XmlElement(name = "AllOf", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
            protected List<AllOf> allOf;

            /**
             * Gets the value of the allOf property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the allOf property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAllOf().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AllOf }
             * 
             * 
             */
            public List<AllOf> getAllOf() {
                if (allOf == null) {
                    allOf = new ArrayList<AllOf>();
                }
                return this.allOf;
            }

            public void setAllOf(List<AllOf> value) {
                this.allOf = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Match" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="AttributeValue"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="AttributeDesignator"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                           &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "match"
            })
            public static class AllOf {

                @XmlElement(name = "Match", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                protected List<Match> match;

                /**
                 * Gets the value of the match property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the match property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMatch().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Match }
                 * 
                 * 
                 */
                public List<Match> getMatch() {
                    if (match == null) {
                        match = new ArrayList<Match>();
                    }
                    return this.match;
                }

                public void setMatch(List<Match> value) {
                    this.match = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="AttributeValue"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="AttributeDesignator"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *                 &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "attributeValue",
                    "attributeDesignator"
                })
                public static class Match {

                    @XmlElement(name = "AttributeValue", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                    protected AttributeValue attributeValue;
                    @XmlElement(name = "AttributeDesignator", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", required = true)
                    protected AttributeDesignator attributeDesignator;
                    @XmlAttribute(name = "MatchId", required = true)
                    protected String matchId;

                    /**
                     * Gets the value of the attributeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AttributeValue }
                     *     
                     */
                    public AttributeValue getAttributeValue() {
                        return attributeValue;
                    }

                    /**
                     * Sets the value of the attributeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AttributeValue }
                     *     
                     */
                    public void setAttributeValue(AttributeValue value) {
                        this.attributeValue = value;
                    }

                    /**
                     * Gets the value of the attributeDesignator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AttributeDesignator }
                     *     
                     */
                    public AttributeDesignator getAttributeDesignator() {
                        return attributeDesignator;
                    }

                    /**
                     * Sets the value of the attributeDesignator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AttributeDesignator }
                     *     
                     */
                    public void setAttributeDesignator(AttributeDesignator value) {
                        this.attributeDesignator = value;
                    }

                    /**
                     * Gets the value of the matchId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatchId() {
                        return matchId;
                    }

                    /**
                     * Sets the value of the matchId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatchId(String value) {
                        this.matchId = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *       &lt;attribute name="MustBePresent" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AttributeDesignator {

                        @XmlAttribute(name = "Category", required = true)
                        protected String category;
                        @XmlAttribute(name = "AttributeId", required = true)
                        protected String attributeId;
                        @XmlAttribute(name = "DataType", required = true)
                        protected String dataType;
                        @XmlAttribute(name = "MustBePresent", required = true)
                        protected boolean mustBePresent;

                        /**
                         * Gets the value of the category property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCategory() {
                            return category;
                        }

                        /**
                         * Sets the value of the category property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCategory(String value) {
                            this.category = value;
                        }

                        /**
                         * Gets the value of the attributeId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAttributeId() {
                            return attributeId;
                        }

                        /**
                         * Sets the value of the attributeId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAttributeId(String value) {
                            this.attributeId = value;
                        }

                        /**
                         * Gets the value of the dataType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDataType() {
                            return dataType;
                        }

                        /**
                         * Sets the value of the dataType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDataType(String value) {
                            this.dataType = value;
                        }

                        /**
                         * Gets the value of the mustBePresent property.
                         * 
                         */
                        public boolean isMustBePresent() {
                            return mustBePresent;
                        }

                        /**
                         * Sets the value of the mustBePresent property.
                         * 
                         */
                        public void setMustBePresent(boolean value) {
                            this.mustBePresent = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;simpleContent&gt;
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                     *       &lt;attribute name="DataType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/simpleContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class AttributeValue {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "DataType", required = true)
                        protected String dataType;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the dataType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDataType() {
                            return dataType;
                        }

                        /**
                         * Sets the value of the dataType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDataType(String value) {
                            this.dataType = value;
                        }

                    }

                }

            }

        }

    }

}
