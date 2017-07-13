//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="TextRules" type="{http://schemas.configit.com/ace/import/v1/productrange}TextRuleCollection" minOccurs="0"/>
 *         &lt;element name="TableRules" type="{http://schemas.configit.com/ace/import/v1/productrange}TableRuleCollection" minOccurs="0"/>
 *         &lt;element name="PackRules" type="{http://schemas.configit.com/ace/import/v1/productrange}PackRuleCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "textRules",
    "tableRules",
    "packRules"
})
public class RuleType {

    @XmlElement(name = "TextRules")
    protected TextRuleCollection textRules;
    @XmlElement(name = "TableRules")
    protected TableRuleCollection tableRules;
    @XmlElement(name = "PackRules")
    protected PackRuleCollection packRules;

    /**
     * Gets the value of the textRules property.
     * 
     * @return
     *     possible object is
     *     {@link TextRuleCollection }
     *     
     */
    public TextRuleCollection getTextRules() {
        return textRules;
    }

    /**
     * Sets the value of the textRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextRuleCollection }
     *     
     */
    public void setTextRules(TextRuleCollection value) {
        this.textRules = value;
    }

    /**
     * Gets the value of the tableRules property.
     * 
     * @return
     *     possible object is
     *     {@link TableRuleCollection }
     *     
     */
    public TableRuleCollection getTableRules() {
        return tableRules;
    }

    /**
     * Sets the value of the tableRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableRuleCollection }
     *     
     */
    public void setTableRules(TableRuleCollection value) {
        this.tableRules = value;
    }

    /**
     * Gets the value of the packRules property.
     * 
     * @return
     *     possible object is
     *     {@link PackRuleCollection }
     *     
     */
    public PackRuleCollection getPackRules() {
        return packRules;
    }

    /**
     * Sets the value of the packRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackRuleCollection }
     *     
     */
    public void setPackRules(PackRuleCollection value) {
        this.packRules = value;
    }

}
