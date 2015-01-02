
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestroyProcessingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestroyProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppressExternalEvents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SuppressRules" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestroyProcessingOptions", propOrder = {
    "suppressExternalEvents",
    "suppressRules"
})
public class DestroyProcessingOptions {

    @XmlElement(name = "SuppressExternalEvents")
    protected boolean suppressExternalEvents;
    @XmlElement(name = "SuppressRules")
    protected boolean suppressRules;

    /**
     * Gets the value of the suppressExternalEvents property.
     * 
     */
    public boolean isSuppressExternalEvents() {
        return suppressExternalEvents;
    }

    /**
     * Sets the value of the suppressExternalEvents property.
     * 
     */
    public void setSuppressExternalEvents(boolean value) {
        this.suppressExternalEvents = value;
    }

    /**
     * Gets the value of the suppressRules property.
     * 
     */
    public boolean isSuppressRules() {
        return suppressRules;
    }

    /**
     * Sets the value of the suppressRules property.
     * 
     */
    public void setSuppressRules(boolean value) {
        this.suppressRules = value;
    }

}
