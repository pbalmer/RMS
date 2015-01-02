
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.ID;


/**
 * <p>Java class for SendMailingToContactMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMailingToContactMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="MailingID" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IncidentID" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="OpportunityID" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="ChatID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMailingToContactMsg", propOrder = {
    "contactID",
    "mailingID",
    "scheduledTime",
    "incidentID",
    "opportunityID",
    "chatID"
})
public class SendMailingToContactMsg {

    @XmlElement(name = "ContactID", required = true)
    protected ID contactID;
    @XmlElement(name = "MailingID", required = true)
    protected ID mailingID;
    @XmlElement(name = "ScheduledTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "IncidentID", required = true, nillable = true)
    protected ID incidentID;
    @XmlElement(name = "OpportunityID", required = true, nillable = true)
    protected ID opportunityID;
    @XmlElement(name = "ChatID")
    protected ID chatID;

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setContactID(ID value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the mailingID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getMailingID() {
        return mailingID;
    }

    /**
     * Sets the value of the mailingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setMailingID(ID value) {
        this.mailingID = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the incidentID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getIncidentID() {
        return incidentID;
    }

    /**
     * Sets the value of the incidentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setIncidentID(ID value) {
        this.incidentID = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setOpportunityID(ID value) {
        this.opportunityID = value;
    }

    /**
     * Gets the value of the chatID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getChatID() {
        return chatID;
    }

    /**
     * Sets the value of the chatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setChatID(ID value) {
        this.chatID = value;
    }

}
