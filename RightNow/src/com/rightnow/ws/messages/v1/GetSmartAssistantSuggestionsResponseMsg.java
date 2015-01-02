
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.SmartAssistantSuggestionsResponse;


/**
 * <p>Java class for GetSmartAssistantSuggestionsResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmartAssistantSuggestionsResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmartAssistantSuggestionsResponse" type="{urn:knowledge.ws.rightnow.com/v1}SmartAssistantSuggestionsResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmartAssistantSuggestionsResponseMsg", propOrder = {
    "smartAssistantSuggestionsResponse"
})
public class GetSmartAssistantSuggestionsResponseMsg {

    @XmlElement(name = "SmartAssistantSuggestionsResponse", required = true)
    protected SmartAssistantSuggestionsResponse smartAssistantSuggestionsResponse;

    /**
     * Gets the value of the smartAssistantSuggestionsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SmartAssistantSuggestionsResponse }
     *     
     */
    public SmartAssistantSuggestionsResponse getSmartAssistantSuggestionsResponse() {
        return smartAssistantSuggestionsResponse;
    }

    /**
     * Sets the value of the smartAssistantSuggestionsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartAssistantSuggestionsResponse }
     *     
     */
    public void setSmartAssistantSuggestionsResponse(SmartAssistantSuggestionsResponse value) {
        this.smartAssistantSuggestionsResponse = value;
    }

}
