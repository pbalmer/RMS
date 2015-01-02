
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactServiceSettingsNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactServiceSettingsNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AnswerNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CategoryNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProductNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SLAInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactServiceSettingsNullFields")
public class ContactServiceSettingsNullFields {

    @XmlAttribute(name = "AnswerNotifications")
    protected Boolean answerNotifications;
    @XmlAttribute(name = "CategoryNotifications")
    protected Boolean categoryNotifications;
    @XmlAttribute(name = "ProductNotifications")
    protected Boolean productNotifications;
    @XmlAttribute(name = "SLAInstances")
    protected Boolean slaInstances;

    /**
     * Gets the value of the answerNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAnswerNotifications() {
        if (answerNotifications == null) {
            return false;
        } else {
            return answerNotifications;
        }
    }

    /**
     * Sets the value of the answerNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerNotifications(Boolean value) {
        this.answerNotifications = value;
    }

    /**
     * Gets the value of the categoryNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategoryNotifications() {
        if (categoryNotifications == null) {
            return false;
        } else {
            return categoryNotifications;
        }
    }

    /**
     * Sets the value of the categoryNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryNotifications(Boolean value) {
        this.categoryNotifications = value;
    }

    /**
     * Gets the value of the productNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProductNotifications() {
        if (productNotifications == null) {
            return false;
        } else {
            return productNotifications;
        }
    }

    /**
     * Sets the value of the productNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductNotifications(Boolean value) {
        this.productNotifications = value;
    }

    /**
     * Gets the value of the slaInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSLAInstances() {
        if (slaInstances == null) {
            return false;
        } else {
            return slaInstances;
        }
    }

    /**
     * Sets the value of the slaInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSLAInstances(Boolean value) {
        this.slaInstances = value;
    }

}
