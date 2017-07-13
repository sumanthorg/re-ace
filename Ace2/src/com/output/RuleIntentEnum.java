//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleIntentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleIntentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Marketing"/>
 *     &lt;enumeration value="Engineering"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RuleIntentEnum", namespace = "http://schemas.configit.com/ace/import/v1/productrange")
@XmlEnum
public enum RuleIntentEnum {

    @XmlEnumValue("Marketing")
    MARKETING("Marketing"),
    @XmlEnumValue("Engineering")
    ENGINEERING("Engineering");
    private final String value;

    RuleIntentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleIntentEnum fromValue(String v) {
        for (RuleIntentEnum c: RuleIntentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}