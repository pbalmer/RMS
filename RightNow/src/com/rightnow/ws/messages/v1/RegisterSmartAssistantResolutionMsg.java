
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1.RNObject;
import com.rightnow.ws.knowledge.v1.SmartAssistantResolution;


/**
 * <p>Java class for RegisterSmartAssistantResolutionMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSmartAssistantResolutionMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SmartAssistantToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resolution" type="{urn:knowledge.ws.rightnow.com/v1}SmartAssistantResolution"/>
 *         &lt;element name="EscalationObject" type="{urn:base.ws.rightnow.com/v1}RNObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterSmartAssistantResolutionMsg", propOrder = {
    "sessionToken",
    "smartAssistantToken",
    "resolution",
    "escalationObject"
})
public class RegisterSmartAssistantResolutionMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "SmartAssistantToken", required = true)
    protected String smartAssistantToken;
    @XmlElement(name = "Resolution", required = true)
    protected SmartAssistantResolution resolution;
    @XmlElement(name = "EscalationObject")
    protected RNObject escalationObject;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the smartAssistantToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartAssistantToken() {
        return smartAssistantToken;
    }

    /**
     * Sets the value of the smartAssistantToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartAssistantToken(String value) {
        this.smartAssistantToken = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link SmartAssistantResolution }
     *     
     */
    public SmartAssistantResolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartAssistantResolution }
     *     
     */
    public void setResolution(SmartAssistantResolution value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the escalationObject property.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getEscalationObject() {
        return escalationObject;
    }

    /**
     * Sets the value of the escalationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setEscalationObject(RNObject value) {
        this.escalationObject = value;
    }

}
