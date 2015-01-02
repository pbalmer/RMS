
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.Content;
import com.rightnow.ws.knowledge.v1.ContentSecurityOptions;
import com.rightnow.ws.knowledge.v1.ContentViewOrigin;


/**
 * <p>Java class for GetContentMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContentMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContentTemplate" type="{urn:knowledge.ws.rightnow.com/v1}Content"/>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *         &lt;element name="ViewOrigin" type="{urn:knowledge.ws.rightnow.com/v1}ContentViewOrigin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContentMsg", propOrder = {
    "sessionToken",
    "contentTemplate",
    "securityOptions",
    "viewOrigin"
})
public class GetContentMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "ContentTemplate", required = true)
    protected Content contentTemplate;
    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;
    @XmlElement(name = "ViewOrigin")
    protected ContentViewOrigin viewOrigin;

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
     * Gets the value of the contentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContentTemplate() {
        return contentTemplate;
    }

    /**
     * Sets the value of the contentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContentTemplate(Content value) {
        this.contentTemplate = value;
    }

    /**
     * Gets the value of the securityOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public ContentSecurityOptions getSecurityOptions() {
        return securityOptions;
    }

    /**
     * Sets the value of the securityOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public void setSecurityOptions(ContentSecurityOptions value) {
        this.securityOptions = value;
    }

    /**
     * Gets the value of the viewOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link ContentViewOrigin }
     *     
     */
    public ContentViewOrigin getViewOrigin() {
        return viewOrigin;
    }

    /**
     * Sets the value of the viewOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentViewOrigin }
     *     
     */
    public void setViewOrigin(ContentViewOrigin value) {
        this.viewOrigin = value;
    }

}
