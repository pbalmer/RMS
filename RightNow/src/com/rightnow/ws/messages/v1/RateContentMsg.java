
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.Content;
import com.rightnow.ws.knowledge.v1.ContentRate;


/**
 * <p>Java class for RateContentMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateContentMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Content" type="{urn:knowledge.ws.rightnow.com/v1}Content"/>
 *         &lt;element name="Rate" type="{urn:knowledge.ws.rightnow.com/v1}ContentRate"/>
 *         &lt;element name="Scale" type="{urn:knowledge.ws.rightnow.com/v1}ContentRate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateContentMsg", propOrder = {
    "sessionToken",
    "content",
    "rate",
    "scale"
})
public class RateContentMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "Content", required = true)
    protected Content content;
    @XmlElement(name = "Rate", required = true)
    protected ContentRate rate;
    @XmlElement(name = "Scale", required = true)
    protected ContentRate scale;

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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRate }
     *     
     */
    public ContentRate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRate }
     *     
     */
    public void setRate(ContentRate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRate }
     *     
     */
    public ContentRate getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRate }
     *     
     */
    public void setScale(ContentRate value) {
        this.scale = value;
    }

}
