
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.ContentRequestStatus;


/**
 * <p>Java class for RateContentResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateContentResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentRequestStatus" type="{urn:knowledge.ws.rightnow.com/v1}ContentRequestStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateContentResponseMsg", propOrder = {
    "contentRequestStatus"
})
public class RateContentResponseMsg {

    @XmlElement(name = "ContentRequestStatus", required = true)
    protected ContentRequestStatus contentRequestStatus;

    /**
     * Gets the value of the contentRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRequestStatus }
     *     
     */
    public ContentRequestStatus getContentRequestStatus() {
        return contentRequestStatus;
    }

    /**
     * Sets the value of the contentRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRequestStatus }
     *     
     */
    public void setContentRequestStatus(ContentRequestStatus value) {
        this.contentRequestStatus = value;
    }

}
