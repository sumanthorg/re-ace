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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelYearMappingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelYearMappingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ModelYearMapping" type="{http://schemas.configit.com/ace/import/v1/productrange}ModelYearMappingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelYearMappingCollection", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "modelYearMapping"
})
public class ModelYearMappingCollection {

    @XmlElement(name = "ModelYearMapping")
    protected List<ModelYearMappingType> modelYearMapping;

    /**
     * Gets the value of the modelYearMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelYearMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelYearMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelYearMappingType }
     * 
     * 
     */
    public List<ModelYearMappingType> getModelYearMapping() {
        if (modelYearMapping == null) {
            modelYearMapping = new ArrayList<ModelYearMappingType>();
        }
        return this.modelYearMapping;
    }

}