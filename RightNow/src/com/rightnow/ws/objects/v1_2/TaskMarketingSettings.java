
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.nullfields.v1_2.TaskMarketingSettingsNullFields;


/**
 * <p>Java class for TaskMarketingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskMarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Campaign" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Document" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Mailing" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Survey" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}TaskMarketingSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMarketingSettings", propOrder = {
    "campaign",
    "document",
    "mailing",
    "survey",
    "validNullFields"
})
public class TaskMarketingSettings {

    @XmlElementRef(name = "Campaign", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> campaign;
    @XmlElementRef(name = "Document", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> document;
    @XmlElementRef(name = "Mailing", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> mailing;
    @XmlElementRef(name = "Survey", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> survey;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<TaskMarketingSettingsNullFields> validNullFields;

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<NamedID> value) {
        this.campaign = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setDocument(JAXBElement<NamedID> value) {
        this.document = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the mailing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getMailing() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setMailing(JAXBElement<NamedID> value) {
        this.mailing = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the survey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getSurvey() {
        return survey;
    }

    /**
     * Sets the value of the survey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setSurvey(JAXBElement<NamedID> value) {
        this.survey = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskMarketingSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<TaskMarketingSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskMarketingSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<TaskMarketingSettingsNullFields> value) {
        this.validNullFields = ((JAXBElement<TaskMarketingSettingsNullFields> ) value);
    }

}
