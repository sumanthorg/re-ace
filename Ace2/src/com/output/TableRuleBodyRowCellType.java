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
 * <p>Java class for TableRuleBodyRowCellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableRuleBodyRowCellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Column" type="{http://schemas.configit.com/ace/import/v1/library}FeatureCodeCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableRuleBodyRowCellType", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "column"
})
public class TableRuleBodyRowCellType {

    @XmlElement(name = "Column")
    protected FeatureCodeCollection column;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureCodeCollection }
     *     
     */
    public FeatureCodeCollection getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureCodeCollection }
     *     
     */
    public void setColumn(FeatureCodeCollection value) {
        this.column = value;
    }

}
