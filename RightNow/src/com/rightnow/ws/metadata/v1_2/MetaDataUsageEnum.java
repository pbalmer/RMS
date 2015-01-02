
package com.rightnow.ws.metadata.v1_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="IGNORED"/>
 *     &lt;enumeration value="REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataUsageEnum")
@XmlEnum
public enum MetaDataUsageEnum {

    NOT_ALLOWED,
    ALLOWED,
    IGNORED,
    REQUIRED;

    public String value() {
        return name();
    }

    public static MetaDataUsageEnum fromValue(String v) {
        return valueOf(v);
    }

}
