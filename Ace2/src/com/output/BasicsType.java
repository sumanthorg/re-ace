//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="BrochureModelDefiningFeatureFamilies" type="{http://schemas.configit.com/ace/import/v1/library}FamilyCodeCollection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Description" use="required" type="{http://schemas.configit.com/ace/import/v1}LimitedDescriptionType" />
 *       &lt;attribute name="Brand" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *       &lt;attribute name="Feature" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *       &lt;attribute name="ProductGroup" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicsType", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "brochureModelDefiningFeatureFamilies"
})
public class BasicsType {

    @XmlElement(name = "BrochureModelDefiningFeatureFamilies")
    protected FamilyCodeCollection brochureModelDefiningFeatureFamilies;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "Brand", required = true)
    protected String brand;
    @XmlAttribute(name = "Feature", required = true)
    protected String feature;
    @XmlAttribute(name = "ProductGroup")
    protected String productGroup;

    /**
     * Gets the value of the brochureModelDefiningFeatureFamilies property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyCodeCollection }
     *     
     */
    public FamilyCodeCollection getBrochureModelDefiningFeatureFamilies() {
        return brochureModelDefiningFeatureFamilies;
    }

    /**
     * Sets the value of the brochureModelDefiningFeatureFamilies property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyCodeCollection }
     *     
     */
    public void setBrochureModelDefiningFeatureFamilies(FamilyCodeCollection value) {
        this.brochureModelDefiningFeatureFamilies = value;
    }

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
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the productGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroup() {
        return productGroup;
    }

    /**
     * Sets the value of the productGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroup(String value) {
        this.productGroup = value;
    }

}