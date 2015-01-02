
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;


/**
 * <p>Java class for SLAInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLAInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="NameOfSLA" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="RemainingFromChat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromCSR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromEmail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingFromWeb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SLASet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StateOfSLA" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_2}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLAInstance", propOrder = {
    "activeDate",
    "expireDate",
    "id",
    "nameOfSLA",
    "remainingFromChat",
    "remainingFromCSR",
    "remainingFromEmail",
    "remainingFromWeb",
    "remainingTotal",
    "slaSet",
    "stateOfSLA"
})
public class SLAInstance {

    @XmlElement(name = "ActiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElement(name = "NameOfSLA")
    protected NamedID nameOfSLA;
    @XmlElement(name = "RemainingFromChat")
    protected Integer remainingFromChat;
    @XmlElement(name = "RemainingFromCSR")
    protected Integer remainingFromCSR;
    @XmlElement(name = "RemainingFromEmail")
    protected Integer remainingFromEmail;
    @XmlElement(name = "RemainingFromWeb")
    protected Integer remainingFromWeb;
    @XmlElement(name = "RemainingTotal")
    protected Integer remainingTotal;
    @XmlElement(name = "SLASet")
    protected Integer slaSet;
    @XmlElement(name = "StateOfSLA")
    protected NamedID stateOfSLA;
    @XmlAttribute
    protected ActionEnum action;

    /**
     * Gets the value of the activeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

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
     * Gets the value of the nameOfSLA property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getNameOfSLA() {
        return nameOfSLA;
    }

    /**
     * Sets the value of the nameOfSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setNameOfSLA(NamedID value) {
        this.nameOfSLA = value;
    }

    /**
     * Gets the value of the remainingFromChat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromChat() {
        return remainingFromChat;
    }

    /**
     * Sets the value of the remainingFromChat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromChat(Integer value) {
        this.remainingFromChat = value;
    }

    /**
     * Gets the value of the remainingFromCSR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromCSR() {
        return remainingFromCSR;
    }

    /**
     * Sets the value of the remainingFromCSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromCSR(Integer value) {
        this.remainingFromCSR = value;
    }

    /**
     * Gets the value of the remainingFromEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromEmail() {
        return remainingFromEmail;
    }

    /**
     * Sets the value of the remainingFromEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromEmail(Integer value) {
        this.remainingFromEmail = value;
    }

    /**
     * Gets the value of the remainingFromWeb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingFromWeb() {
        return remainingFromWeb;
    }

    /**
     * Sets the value of the remainingFromWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingFromWeb(Integer value) {
        this.remainingFromWeb = value;
    }

    /**
     * Gets the value of the remainingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingTotal() {
        return remainingTotal;
    }

    /**
     * Sets the value of the remainingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingTotal(Integer value) {
        this.remainingTotal = value;
    }

    /**
     * Gets the value of the slaSet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSLASet() {
        return slaSet;
    }

    /**
     * Sets the value of the slaSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSLASet(Integer value) {
        this.slaSet = value;
    }

    /**
     * Gets the value of the stateOfSLA property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStateOfSLA() {
        return stateOfSLA;
    }

    /**
     * Sets the value of the stateOfSLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStateOfSLA(NamedID value) {
        this.stateOfSLA = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
