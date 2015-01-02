
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartInteractionMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartInteractionMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReferrerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartInteractionMsg", propOrder = {
    "appIdentifier",
    "userIPAddress",
    "referrerURL",
    "userAgent"
})
public class StartInteractionMsg {

    @XmlElement(name = "AppIdentifier", required = true)
    protected String appIdentifier;
    @XmlElement(name = "UserIPAddress", required = true)
    protected String userIPAddress;
    @XmlElement(name = "ReferrerURL")
    protected String referrerURL;
    @XmlElement(name = "UserAgent")
    protected String userAgent;

    /**
     * Gets the value of the appIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppIdentifier() {
        return appIdentifier;
    }

    /**
     * Sets the value of the appIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppIdentifier(String value) {
        this.appIdentifier = value;
    }

    /**
     * Gets the value of the userIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIPAddress() {
        return userIPAddress;
    }

    /**
     * Sets the value of the userIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIPAddress(String value) {
        this.userIPAddress = value;
    }

    /**
     * Gets the value of the referrerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferrerURL() {
        return referrerURL;
    }

    /**
     * Sets the value of the referrerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferrerURL(String value) {
        this.referrerURL = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

}
