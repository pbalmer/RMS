
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1_2.OrganizationServiceSettingsNullFields;


/**
 * <p>Java class for OrganizationServiceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLAInstances" type="{urn:objects.ws.rightnow.com/v1_2}SLAInstanceList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}OrganizationServiceSettingsNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceSettings", propOrder = {
    "slaInstances",
    "validNullFields"
})
public class OrganizationServiceSettings {

    @XmlElementRef(name = "SLAInstances", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<SLAInstanceList> slaInstances;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<OrganizationServiceSettingsNullFields> validNullFields;

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
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public JAXBElement<OrganizationServiceSettingsNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<OrganizationServiceSettingsNullFields> value) {
        this.validNullFields = ((JAXBElement<OrganizationServiceSettingsNullFields> ) value);
    }

}
