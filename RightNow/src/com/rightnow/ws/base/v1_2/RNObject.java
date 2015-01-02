
package com.rightnow.ws.base.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.objects.v1_2.Account;
import com.rightnow.ws.objects.v1_2.AnalyticsReport;
import com.rightnow.ws.objects.v1_2.Answer;
import com.rightnow.ws.objects.v1_2.ChannelType;
import com.rightnow.ws.objects.v1_2.Contact;
import com.rightnow.ws.objects.v1_2.Country;
import com.rightnow.ws.objects.v1_2.Incident;
import com.rightnow.ws.objects.v1_2.Mailbox;
import com.rightnow.ws.objects.v1_2.Opportunity;
import com.rightnow.ws.objects.v1_2.Organization;
import com.rightnow.ws.objects.v1_2.PurchasedProduct;
import com.rightnow.ws.objects.v1_2.SalesProduct;
import com.rightnow.ws.objects.v1_2.SalesTerritory;
import com.rightnow.ws.objects.v1_2.ServiceCategory;
import com.rightnow.ws.objects.v1_2.ServiceDisposition;
import com.rightnow.ws.objects.v1_2.ServiceProduct;
import com.rightnow.ws.objects.v1_2.SiteInterface;
import com.rightnow.ws.objects.v1_2.StandardContent;
import com.rightnow.ws.objects.v1_2.Task;
import com.rightnow.ws.objects.v1_2.Variable;


/**
 * <p>Java class for RNObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RNObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="LookupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RNObject", propOrder = {
    "id",
    "lookupName",
    "createdTime",
    "updatedTime"
})
@XmlSeeAlso({
    Incident.class,
    Variable.class,
    Country.class,
    AnalyticsReport.class,
    Task.class,
    ServiceDisposition.class,
    SalesTerritory.class,
    Answer.class,
    ChannelType.class,
    Organization.class,
    SiteInterface.class,
    PurchasedProduct.class,
    SalesProduct.class,
    Mailbox.class,
    Account.class,
    ServiceProduct.class,
    Opportunity.class,
    StandardContent.class,
    ServiceCategory.class,
    Contact.class,
    GenericObject.class
})
public class RNObject {

    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "LookupName")
    protected String lookupName;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(name = "UpdatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the lookupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupName() {
        return lookupName;
    }

    /**
     * Sets the value of the lookupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupName(String value) {
        this.lookupName = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

}
