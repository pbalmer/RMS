
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.Content;
import com.rightnow.ws.knowledge.v1.ContentViewOrigin;


/**
 * <p>Java class for MarkContentAsViewedMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkContentAsViewedMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Content" type="{urn:knowledge.ws.rightnow.com/v1}Content"/>
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
@XmlType(name = "MarkContentAsViewedMsg", propOrder = {
    "sessionToken",
    "content",
    "viewOrigin"
})
public class MarkContentAsViewedMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "Content", required = true)
    protected Content content;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContent(Content value) {
        this.content = value;
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
