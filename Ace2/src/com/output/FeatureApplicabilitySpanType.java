//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureApplicabilitySpanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureApplicabilitySpanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.configit.com/ace/import/v1/productrange}EffectivityType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Markets" type="{http://schemas.configit.com/ace/import/v1/library}MarketCodeCollection"/>
 *         &lt;element name="BrochureModelDerivatives" type="{http://schemas.configit.com/ace/import/v1/productrange}BrochureModelDerivativeCollection"/>
 *         &lt;element name="Features" type="{http://schemas.configit.com/ace/import/v1/productrange}FeatureApplicabilityInfoCollection"/>
 *       &lt;/choice>
 *       &lt;attribute name="Family" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureApplicabilitySpanType", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "markets","brochureModelDerivatives","features"
})
public class FeatureApplicabilitySpanType
    extends EffectivityType
{

    /*@XmlElements({
        @XmlElement(name = "Markets", type = MarketCodeCollection.class),
        @XmlElement(name = "BrochureModelDerivatives", type = BrochureModelDerivativeCollection.class),
        @XmlElement(name = "Features", type = FeatureApplicabilityInfoCollection.class)
    })
    protected List<Object> marketsOrBrochureModelDerivativesOrFeatures;
    */
    @XmlElement(name = "Markets", type = MarketCodeCollection.class)
    protected MarketCodeCollection markets;
    
    public MarketCodeCollection getMarkets() {
		return markets;
	}

	public void setMarkets(MarketCodeCollection markets) {
		this.markets = markets;
	}

	public BrochureModelDerivativeCollection getBrochureModelDerivatives() {
		return brochureModelDerivatives;
	}

	public void setBrochureModelDerivatives(BrochureModelDerivativeCollection brochureModelDerivatives) {
		this.brochureModelDerivatives = brochureModelDerivatives;
	}

	public FeatureApplicabilityInfoCollection getFeatures() {
		return features;
	}

	public void setFeatures(FeatureApplicabilityInfoCollection features) {
		this.features = features;
	}

	@XmlElement(name = "BrochureModelDerivatives", type = BrochureModelDerivativeCollection.class)
    protected BrochureModelDerivativeCollection brochureModelDerivatives;
    
    @XmlElement(name = "Features", type = FeatureApplicabilityInfoCollection.class)
    protected FeatureApplicabilityInfoCollection features;
    
    @XmlAttribute(name = "Family", required = true)
    protected String family;

    /**
     * Gets the value of the marketsOrBrochureModelDerivativesOrFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketsOrBrochureModelDerivativesOrFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketsOrBrochureModelDerivativesOrFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketCodeCollection }
     * {@link BrochureModelDerivativeCollection }
     * {@link FeatureApplicabilityInfoCollection }
     * 
     * 
     */
    /*public List<Object> getMarketsOrBrochureModelDerivativesOrFeatures() {
        if (marketsOrBrochureModelDerivativesOrFeatures == null) {
            marketsOrBrochureModelDerivativesOrFeatures = new ArrayList<Object>();
        }
        return this.marketsOrBrochureModelDerivativesOrFeatures;
    }*/

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

}
