
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1.SmartAssistantSuggestionsResponseNullFields;


/**
 * <p>Java class for SmartAssistantSuggestionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartAssistantSuggestionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:knowledge.ws.rightnow.com/v1}ContentRequestStatus" minOccurs="0"/>
 *         &lt;element name="CanEscalate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RulesMatched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Suggestions" type="{urn:knowledge.ws.rightnow.com/v1}ContentList" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}SmartAssistantSuggestionsResponseNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartAssistantSuggestionsResponse", propOrder = {
    "status",
    "canEscalate",
    "rulesMatched",
    "suggestions",
    "token",
    "validNullFields"
})
public class SmartAssistantSuggestionsResponse {

    @XmlElement(name = "Status")
    protected ContentRequestStatus status;
    @XmlElement(name = "CanEscalate")
    protected Boolean canEscalate;
    @XmlElement(name = "RulesMatched")
    protected Boolean rulesMatched;
    @XmlElementRef(name = "Suggestions", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentList> suggestions;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<SmartAssistantSuggestionsResponseNullFields> validNullFields;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRequestStatus }
     *     
     */
    public ContentRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRequestStatus }
     *     
     */
    public void setStatus(ContentRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the canEscalate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanEscalate() {
        return canEscalate;
    }

    /**
     * Sets the value of the canEscalate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanEscalate(Boolean value) {
        this.canEscalate = value;
    }

    /**
     * Gets the value of the rulesMatched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRulesMatched() {
        return rulesMatched;
    }

    /**
     * Sets the value of the rulesMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRulesMatched(Boolean value) {
        this.rulesMatched = value;
    }

    /**
     * Gets the value of the suggestions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentList }{@code >}
     *     
     */
    public JAXBElement<ContentList> getSuggestions() {
        return suggestions;
    }

    /**
     * Sets the value of the suggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentList }{@code >}
     *     
     */
    public void setSuggestions(JAXBElement<ContentList> value) {
        this.suggestions = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}
     *     
     */
    public JAXBElement<SmartAssistantSuggestionsResponseNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<SmartAssistantSuggestionsResponseNullFields> value) {
        this.validNullFields = value;
    }

}
