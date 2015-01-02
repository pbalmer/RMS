
package com.rightnow.ws.metadata.v1_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataCardinalityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataCardinalityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZERO_OR_ONE"/>
 *     &lt;enumeration value="ZERO_OR_MORE"/>
 *     &lt;enumeration value="ONE"/>
 *     &lt;enumeration value="ONE_OR_MORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataCardinalityEnum")
@XmlEnum
public enum MetaDataCardinalityEnum {

    ZERO_OR_ONE,
    ZERO_OR_MORE,
    ONE,
    ONE_OR_MORE;

    public String value() {
        return name();
    }

    public static MetaDataCardinalityEnum fromValue(String v) {
        return valueOf(v);
    }

}
