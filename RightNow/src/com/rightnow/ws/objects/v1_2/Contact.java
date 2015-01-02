
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
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.ContactNullFields;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:objects.ws.rightnow.com/v1_2}Address" minOccurs="0"/>
 *         &lt;element name="Banner" type="{urn:objects.ws.rightnow.com/v1_2}Banner" minOccurs="0"/>
 *         &lt;element name="ChannelUsernames" type="{urn:objects.ws.rightnow.com/v1_2}ChannelUsernameList" minOccurs="0"/>
 *         &lt;element name="ContactType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CRMModules" type="{urn:objects.ws.rightnow.com/v1_2}CRMModules" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emails" type="{urn:objects.ws.rightnow.com/v1_2}EmailList" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:objects.ws.rightnow.com/v1_2}PersonName" minOccurs="0"/>
 *         &lt;element name="NameFurigana" type="{urn:objects.ws.rightnow.com/v1_2}PersonName" minOccurs="0"/>
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="OpenIDAccounts" type="{urn:objects.ws.rightnow.com/v1_2}ContactOpenIDAccountList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PasswordEmailExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Phones" type="{urn:objects.ws.rightnow.com/v1_2}PhoneList" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}ContactServiceSettings" minOccurs="0"/>
 *         &lt;element name="Source" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "address",
    "banner",
    "channelUsernames",
    "contactType",
    "crmModules",
    "customFields",
    "disabled",
    "emails",
    "fileAttachments",
    "login",
    "marketingSettings",
    "name",
    "nameFurigana",
    "newPassword",
    "notes",
    "openIDAccounts",
    "organization",
    "passwordEmailExpirationTime",
    "passwordExpirationTime",
    "phones",
    "salesSettings",
    "serviceSettings",
    "source",
    "title",
    "validNullFields"
})
public class Contact
    extends RNObject
{

    @XmlElementRef(name = "Address", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "Banner", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<Banner> banner;
    @XmlElementRef(name = "ChannelUsernames", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<ChannelUsernameList> channelUsernames;
    @XmlElementRef(name = "ContactType", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> contactType;
    @XmlElement(name = "CRMModules")
    protected CRMModules crmModules;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElementRef(name = "Emails", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<EmailList> emails;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElementRef(name = "Login", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> login;
    @XmlElement(name = "MarketingSettings")
    protected ContactMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected PersonName name;
    @XmlElement(name = "NameFurigana")
    protected PersonName nameFurigana;
    @XmlElementRef(name = "NewPassword", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> newPassword;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NoteList> notes;
    @XmlElement(name = "OpenIDAccounts")
    protected ContactOpenIDAccountList openIDAccounts;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PasswordEmailExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> passwordEmailExpirationTime;
    @XmlElementRef(name = "PasswordExpirationTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> passwordExpirationTime;
    @XmlElement(name = "Phones")
    protected PhoneList phones;
    @XmlElement(name = "SalesSettings")
    protected ContactSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected ContactServiceSettings serviceSettings;
    @XmlElement(name = "Source")
    protected NamedIDHierarchy source;
    @XmlElementRef(name = "Title", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<ContactNullFields> validNullFields;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = ((JAXBElement<Address> ) value);
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public JAXBElement<Banner> getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Banner }{@code >}
     *     
     */
    public void setBanner(JAXBElement<Banner> value) {
        this.banner = ((JAXBElement<Banner> ) value);
    }

    /**
     * Gets the value of the channelUsernames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}
     *     
     */
    public JAXBElement<ChannelUsernameList> getChannelUsernames() {
        return channelUsernames;
    }

    /**
     * Sets the value of the channelUsernames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}
     *     
     */
    public void setChannelUsernames(JAXBElement<ChannelUsernameList> value) {
        this.channelUsernames = ((JAXBElement<ChannelUsernameList> ) value);
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContactType(JAXBElement<NamedID> value) {
        this.contactType = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the crmModules property.
     * 
     * @return
     *     possible object is
     *     {@link CRMModules }
     *     
     */
    public CRMModules getCRMModules() {
        return crmModules;
    }

    /**
     * Sets the value of the crmModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMModules }
     *     
     */
    public void setCRMModules(CRMModules value) {
        this.crmModules = value;
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
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
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
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonList> value) {
        this.fileAttachments = ((JAXBElement<FileAttachmentCommonList> ) value);
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the marketingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMarketingSettings }
     *     
     */
    public ContactMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Sets the value of the marketingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMarketingSettings }
     *     
     */
    public void setMarketingSettings(ContactMarketingSettings value) {
        this.marketingSettings = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public JAXBElement<NoteList> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteList> value) {
        this.notes = ((JAXBElement<NoteList> ) value);
    }

    /**
     * Gets the value of the openIDAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactOpenIDAccountList }
     *     
     */
    public ContactOpenIDAccountList getOpenIDAccounts() {
        return openIDAccounts;
    }

    /**
     * Sets the value of the openIDAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactOpenIDAccountList }
     *     
     */
    public void setOpenIDAccounts(ContactOpenIDAccountList value) {
        this.openIDAccounts = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the passwordEmailExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPasswordEmailExpirationTime() {
        return passwordEmailExpirationTime;
    }

    /**
     * Sets the value of the passwordEmailExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPasswordEmailExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.passwordEmailExpirationTime = ((JAXBElement<XMLGregorianCalendar> ) value);
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
     *     {@link PhoneList }
     *     
     */
    public PhoneList getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneList }
     *     
     */
    public void setPhones(PhoneList value) {
        this.phones = value;
    }

    /**
     * Gets the value of the salesSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSalesSettings }
     *     
     */
    public ContactSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSalesSettings }
     *     
     */
    public void setSalesSettings(ContactSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ContactServiceSettings }
     *     
     */
    public ContactServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactServiceSettings }
     *     
     */
    public void setServiceSettings(ContactServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setSource(NamedIDHierarchy value) {
        this.source = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactNullFields> value) {
        this.validNullFields = ((JAXBElement<ContactNullFields> ) value);
    }

}
