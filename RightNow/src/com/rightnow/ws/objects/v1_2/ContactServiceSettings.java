
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_2.ContactServiceSettingsNullFields;


/**
 * <p>Java class for ContactServiceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerNotifications" type="{urn:objects.ws.rightnow.com/v1_2}AnswerNotificationList" minOccurs="0"/>
 *         &lt;element name="CategoryNotifications" type="{urn:objects.ws.rightnow.com/v1_2}CategoryNotificationList" minOccurs="0"/>
 *         &lt;element name="ProductNotifications" type="{urn:objects.ws.rightnow.com/v1_2}ProductNotificationList" minOccurs="0"/>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_2}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}ContactServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettings", propOrder = {
    "answerNotifications",
    "categoryNotifications",
    "productNotifications",
    "slaInstances",
    "validNullFields"
})
public class ContactServiceSettings {

    @XmlElementRef(name = "AnswerNotifications", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<AnswerNotificationList> answerNotifications;
    @XmlElementRef(name = "CategoryNotifications", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<CategoryNotificationList> categoryNotifications;
    @XmlElementRef(name = "ProductNotifications", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<ProductNotificationList> productNotifications;
    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<SLAInstanceList> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<ContactServiceSettingsNullFields> validNullFields;

    /**
     * Gets the value of the answerNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}
     *     
     */
    public JAXBElement<AnswerNotificationList> getAnswerNotifications() {
        return answerNotifications;
    }

    /**
     * Sets the value of the answerNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}
     *     
     */
    public void setAnswerNotifications(JAXBElement<AnswerNotificationList> value) {
        this.answerNotifications = ((JAXBElement<AnswerNotificationList> ) value);
    }

    /**
     * Gets the value of the categoryNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}
     *     
     */
    public JAXBElement<CategoryNotificationList> getCategoryNotifications() {
        return categoryNotifications;
    }

    /**
     * Sets the value of the categoryNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}
     *     
     */
    public void setCategoryNotifications(JAXBElement<CategoryNotificationList> value) {
        this.categoryNotifications = ((JAXBElement<CategoryNotificationList> ) value);
    }

    /**
     * Gets the value of the productNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}
     *     
     */
    public JAXBElement<ProductNotificationList> getProductNotifications() {
        return productNotifications;
    }

    /**
     * Sets the value of the productNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}
     *     
     */
    public void setProductNotifications(JAXBElement<ProductNotificationList> value) {
        this.productNotifications = ((JAXBElement<ProductNotificationList> ) value);
    }

    /**
     * Gets the value of the slaInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}
     *     
     */
    public JAXBElement<SLAInstanceList> getSLAInstances() {
        return slaInstances;
    }

    /**
     * Sets the value of the slaInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}
     *     
     */
    public void setSLAInstances(JAXBElement<SLAInstanceList> value) {
        this.slaInstances = ((JAXBElement<SLAInstanceList> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<ContactServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContactServiceSettingsNullFields> value) {
        this.validNullFields = ((JAXBElement<ContactServiceSettingsNullFields> ) value);
    }

}
