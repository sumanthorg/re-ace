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
 * <p>Java class for SecurityLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Proprietary"/>
 *     &lt;enumeration value="Confidential"/>
 *     &lt;enumeration value="Secret"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityLevelEnum", namespace = "http://schemas.configit.com/ace/import/v1")
@XmlEnum
public enum SecurityLevelEnum {

    @XmlEnumValue("Proprietary")
    PROPRIETARY("Proprietary"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),
    @XmlEnumValue("Secret")
    SECRET("Secret");
    private final String value;

    SecurityLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecurityLevelEnum fromValue(String v) {
        for (SecurityLevelEnum c: SecurityLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
