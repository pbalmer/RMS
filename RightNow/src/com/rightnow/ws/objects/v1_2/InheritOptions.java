
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InheritOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InheritContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InheritStaffAssignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritOptions", propOrder = {
    "inheritContact",
    "inheritOrganization",
    "inheritStaffAssignment"
})
public class InheritOptions {

    @XmlElement(name = "InheritContact")
    protected Boolean inheritContact;
    @XmlElement(name = "InheritOrganization")
    protected Boolean inheritOrganization;
    @XmlElement(name = "InheritStaffAssignment")
    protected Boolean inheritStaffAssignment;

    /**
     * Gets the value of the inheritContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritContact() {
        return inheritContact;
    }

    /**
     * Sets the value of the inheritContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritContact(Boolean value) {
        this.inheritContact = value;
    }

    /**
     * Gets the value of the inheritOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritOrganization() {
        return inheritOrganization;
    }

    /**
     * Sets the value of the inheritOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritOrganization(Boolean value) {
        this.inheritOrganization = value;
    }

    /**
     * Gets the value of the inheritStaffAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritStaffAssignment() {
        return inheritStaffAssignment;
    }

    /**
     * Sets the value of the inheritStaffAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritStaffAssignment(Boolean value) {
        this.inheritStaffAssignment = value;
    }

}
