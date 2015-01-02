
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProcessingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FetchAllNames" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProcessingOptions", propOrder = {
    "fetchAllNames"
})
public class GetProcessingOptions {

    @XmlElement(name = "FetchAllNames")
    protected boolean fetchAllNames;

    /**
     * Gets the value of the fetchAllNames property.
     * 
     */
    public boolean isFetchAllNames() {
        return fetchAllNames;
    }

    /**
     * Sets the value of the fetchAllNames property.
     * 
     */
    public void setFetchAllNames(boolean value) {
        this.fetchAllNames = value;
    }

}
