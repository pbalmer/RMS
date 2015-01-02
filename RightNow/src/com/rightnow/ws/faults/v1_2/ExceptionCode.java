
package com.rightnow.ws.faults.v1_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESS_DENIED"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_LOGIN"/>
 *     &lt;enumeration value="BAD_ID"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionCode")
@XmlEnum
public enum ExceptionCode {

    ACCESS_DENIED,
    INVALID_FIELD,
    INVALID_LOGIN,
    BAD_ID,
    MISSING_ARGUMENT,
    QUERY_TIMEOUT,
    UNKNOWN_EXCEPTION,
    INVALID_REQUEST;

    public String value() {
        return name();
    }

    public static ExceptionCode fromValue(String v) {
        return valueOf(v);
    }

}
