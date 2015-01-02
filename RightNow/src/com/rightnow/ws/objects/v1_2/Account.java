
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.AccountNullFields;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AccountHierarchy" type="{urn:base.ws.rightnow.com/v1_2}NamedIDList" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_2}AccountOptions" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmailNotification" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_2}EmailList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_2}PersonFullName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_2}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_2}PhoneList" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}AccountSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}AccountServiceSettings" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffGroup" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}AccountNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountHierarchy",
    "attributes",
    "country",
    "customFields",
    "displayName",
    "displayOrder",
    "emailNotification",
    "emails",
    "login",
    "manager",
    "name",
    "nameFurigana",
    "newPassword",
    "notificationPending",
    "passwordExpirationTime",
    "phones",
    "profile",
    "salesSettings",
    "serviceSettings",
    "signature",
    "staffGroup",
    "validNullFields"
})
public class Account
    extends RNObject
{

    @XmlElement(name = "AccountHierarchy")
    protected NamedIDList accountHierarchy;
    @XmlElement(name = "Attributes")
    protected AccountOptions attributes;
    @XmlElement(name = "Country")
    protected NamedID country;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DisplayName", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElementRef(name = "EmailNotification", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> emailNotification;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<EmailList> emails;
    @XmlElement(name = "Login")
    protected String login;
    @XmlElementRef(name = "Manager", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedIDHierarchy> manager;
    @XmlElement(name = "Name")
    protected PersonFullName name;
    @XmlElement(name = "NameFurigana")
    protected PersonName nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> newPassword;
    @XmlElement(name = "NotificationPending")
    protected Boolean notificationPending;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElementRef(name = "Phones", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<PhoneList> phones;
    @XmlElementRef(name = "Profile", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> profile;
    @XmlElement(name = "SalesSettings")
    protected AccountSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected AccountServiceSettings serviceSettings;
    @XmlElementRef(name = "Signature", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> signature;
    @XmlElement(name = "StaffGroup")
    protected NamedID staffGroup;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<AccountNullFields> validNullFields;

    /**
     * Gets the value of the accountHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDList }
     *     
     */
    public NamedIDList getAccountHierarchy() {
        return accountHierarchy;
    }

    /**
     * Sets the value of the accountHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDList }
     *     
     */
    public void setAccountHierarchy(NamedIDList value) {
        this.accountHierarchy = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOptions }
     *     
     */
    public AccountOptions getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOptions }
     *     
     */
    public void setAttributes(AccountOptions value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setCountry(NamedID value) {
        this.country = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the emailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getEmailNotification() {
        return emailNotification;
    }

    /**
     * Sets the value of the emailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setEmailNotification(JAXBElement<NamedID> value) {
        this.emailNotification = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailList }{@code >}
     *     
     */
    public JAXBElement<EmailList> getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailList }{@code >}
     *     
     */
    public void setEmails(JAXBElement<EmailList> value) {
        this.emails = ((JAXBElement<EmailList> ) value);
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchy> getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}
     *     
     */
    public void setManager(JAXBElement<NamedIDHierarchy> value) {
        this.manager = ((JAXBElement<NamedIDHierarchy> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonFullName }
     *     
     */
    public PersonFullName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonFullName }
     *     
     */
    public void setName(PersonFullName value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameFurigana property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getNameFurigana() {
        return nameFurigana;
    }

    /**
     * Sets the value of the nameFurigana property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setNameFurigana(PersonName value) {
        this.nameFurigana = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewPassword(JAXBElement<String> value) {
        this.newPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the notificationPending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationPending() {
        return notificationPending;
    }

    /**
     * Sets the value of the notificationPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationPending(Boolean value) {
        this.notificationPending = value;
    }

    /**
     * Gets the value of the passwordExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordExpirationTime() {
        return passwordExpirationTime;
    }

    /**
     * Sets the value of the passwordExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordExpirationTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneList }{@code >}
     *     
     */
    public JAXBElement<PhoneList> getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneList }{@code >}
     *     
     */
    public void setPhones(JAXBElement<PhoneList> value) {
        this.phones = ((JAXBElement<PhoneList> ) value);
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setProfile(JAXBElement<NamedID> value) {
        this.profile = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the salesSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSalesSettings }
     *     
     */
    public AccountSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSalesSettings }
     *     
     */
    public void setSalesSettings(AccountSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AccountServiceSettings }
     *     
     */
    public AccountServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountServiceSettings }
     *     
     */
    public void setServiceSettings(AccountServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignature(JAXBElement<String> value) {
        this.signature = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staffGroup property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getStaffGroup() {
        return staffGroup;
    }

    /**
     * Sets the value of the staffGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setStaffGroup(NamedID value) {
        this.staffGroup = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public JAXBElement<AccountNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AccountNullFields> value) {
        this.validNullFields = ((JAXBElement<AccountNullFields> ) value);
    }

}
