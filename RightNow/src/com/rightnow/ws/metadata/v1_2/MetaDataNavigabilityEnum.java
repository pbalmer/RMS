
package com.rightnow.ws.metadata.v1_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataNavigabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetaDataNavigabilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMING"/>
 *     &lt;enumeration value="OUTGOING"/>
 *     &lt;enumeration value="BIDIRECTIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetaDataNavigabilityEnum")
@XmlEnum
public enum MetaDataNavigabilityEnum {

    INCOMING,
    OUTGOING,
    BIDIRECTIONAL;

    public String value() {
        return name();
    }

    public static MetaDataNavigabilityEnum fromValue(String v) {
        return valueOf(v);
    }

}
