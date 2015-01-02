
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.ContentListResponse;


/**
 * <p>Java class for GetSmartAssistantSearchResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartAssistantSearchResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentListResponse" type="{urn:knowledge.ws.rightnow.com/v1}ContentListResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartAssistantSearchResponseMsg", propOrder = {
    "contentListResponse"
})
public class GetSmartAssistantSearchResponseMsg {

    @XmlElement(name = "ContentListResponse", required = true)
    protected ContentListResponse contentListResponse;

    /**
     * Gets the value of the contentListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContentListResponse }
     *     
     */
    public ContentListResponse getContentListResponse() {
        return contentListResponse;
    }

    /**
     * Sets the value of the contentListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentListResponse }
     *     
     */
    public void setContentListResponse(ContentListResponse value) {
        this.contentListResponse = value;
    }

}
