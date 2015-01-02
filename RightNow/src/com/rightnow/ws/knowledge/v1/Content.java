
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1.RNObject;


/**
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1}RNObject">
 *       &lt;sequence>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "securityOptions"
})
@XmlSeeAlso({
    AnswerContent.class,
    IncidentContent.class,
    SummaryContent.class,
    StandardContentContent.class
})
public class Content
    extends RNObject
{

    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;

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

}
