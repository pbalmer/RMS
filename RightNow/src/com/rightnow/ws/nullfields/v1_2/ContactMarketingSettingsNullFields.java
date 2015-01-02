
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactMarketingSettingsNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactMarketingSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ContactLists" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MarketingOrganizationNameAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SurveyOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMarketingSettingsNullFields")
public class ContactMarketingSettingsNullFields {

    @XmlAttribute(name = "ContactLists")
    protected Boolean contactLists;
    @XmlAttribute(name = "EmailFormat")
    protected Boolean emailFormat;
    @XmlAttribute(name = "MarketingOptIn")
    protected Boolean marketingOptIn;
    @XmlAttribute(name = "MarketingOrganizationName")
    protected Boolean marketingOrganizationName;
    @XmlAttribute(name = "MarketingOrganizationNameAlt")
    protected Boolean marketingOrganizationNameAlt;
    @XmlAttribute(name = "SurveyOptIn")
    protected Boolean surveyOptIn;

    /**
     * Gets the value of the contactLists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContactLists() {
        if (contactLists == null) {
            return false;
        } else {
            return contactLists;
        }
    }

    /**
     * Sets the value of the contactLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactLists(Boolean value) {
        this.contactLists = value;
    }

    /**
     * Gets the value of the emailFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmailFormat() {
        if (emailFormat == null) {
            return false;
        } else {
            return emailFormat;
        }
    }

    /**
     * Sets the value of the emailFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFormat(Boolean value) {
        this.emailFormat = value;
    }

    /**
     * Gets the value of the marketingOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOptIn() {
        if (marketingOptIn == null) {
            return false;
        } else {
            return marketingOptIn;
        }
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * Gets the value of the marketingOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationName() {
        if (marketingOrganizationName == null) {
            return false;
        } else {
            return marketingOrganizationName;
        }
    }

    /**
     * Sets the value of the marketingOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationName(Boolean value) {
        this.marketingOrganizationName = value;
    }

    /**
     * Gets the value of the marketingOrganizationNameAlt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarketingOrganizationNameAlt() {
        if (marketingOrganizationNameAlt == null) {
            return false;
        } else {
            return marketingOrganizationNameAlt;
        }
    }

    /**
     * Sets the value of the marketingOrganizationNameAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOrganizationNameAlt(Boolean value) {
        this.marketingOrganizationNameAlt = value;
    }

    /**
     * Gets the value of the surveyOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSurveyOptIn() {
        if (surveyOptIn == null) {
            return false;
        } else {
            return surveyOptIn;
        }
    }

    /**
     * Sets the value of the surveyOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurveyOptIn(Boolean value) {
        this.surveyOptIn = value;
    }

}
