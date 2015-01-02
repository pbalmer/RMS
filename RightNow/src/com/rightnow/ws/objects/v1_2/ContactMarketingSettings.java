
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.nullfields.v1_2.ContactMarketingSettingsNullFields;


/**
 * <p>Java class for ContactMarketingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLists" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDeltaList" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactMarketingSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettings", propOrder = {
    "contactLists",
    "emailFormat",
    "marketingOptIn",
    "marketingOrganizationName",
    "marketingOrganizationNameAlt",
    "surveyOptIn",
    "validNullFields"
})
public class ContactMarketingSettings {

    @XmlElementRef(name = "ContactLists", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedIDDeltaList> contactLists;
    @XmlElementRef(name = "EmailFormat", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> emailFormat;
    @XmlElementRef(name = "MarketingOptIn", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<Boolean> marketingOptIn;
    @XmlElementRef(name = "MarketingOrganizationName", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> marketingOrganizationName;
    @XmlElementRef(name = "MarketingOrganizationNameAlt", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> marketingOrganizationNameAlt;
    @XmlElementRef(name = "SurveyOptIn", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<Boolean> surveyOptIn;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<ContactMarketingSettingsNullFields> validNullFields;

    /**
     * Gets the value of the contactLists property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public JAXBElement<NamedIDDeltaList> getContactLists() {
        return contactLists;
    }

    /**
     * Sets the value of the contactLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}
     *     
     */
    public void setContactLists(JAXBElement<NamedIDDeltaList> value) {
        this.contactLists = ((JAXBElement<NamedIDDeltaList> ) value);
    }

    /**
     * Gets the value of the emailFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getEmailFormat() {
        return emailFormat;
    }

    /**
     * Sets the value of the emailFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setEmailFormat(JAXBElement<NamedID> value) {
        this.emailFormat = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the marketingOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMarketingOptIn(JAXBElement<Boolean> value) {
        this.marketingOptIn = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the marketingOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOrganizationName() {
        return marketingOrganizationName;
    }

    /**
     * Sets the value of the marketingOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOrganizationName(JAXBElement<String> value) {
        this.marketingOrganizationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingOrganizationNameAlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOrganizationNameAlt() {
        return marketingOrganizationNameAlt;
    }

    /**
     * Sets the value of the marketingOrganizationNameAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOrganizationNameAlt(JAXBElement<String> value) {
        this.marketingOrganizationNameAlt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the surveyOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSurveyOptIn() {
        return surveyOptIn;
    }

    /**
     * Sets the value of the surveyOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSurveyOptIn(JAXBElement<Boolean> value) {
        this.surveyOptIn = ((JAXBElement<Boolean> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactMarketingSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactMarketingSettingsNullFields> value) {
        this.validNullFields = ((JAXBElement<ContactMarketingSettingsNullFields> ) value);
    }

}
