
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1.NamedIDHierarchy;


/**
 * <p>Java class for ServiceProductContentFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProductContentFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}ContentFilter">
 *       &lt;sequence>
 *         &lt;element name="ServiceProduct" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProductContentFilter", propOrder = {
    "serviceProduct"
})
public class ServiceProductContentFilter
    extends ContentFilter
{

    @XmlElement(name = "ServiceProduct")
    protected NamedIDHierarchy serviceProduct;

    /**
     * Gets the value of the serviceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getServiceProduct() {
        return serviceProduct;
    }

    /**
     * Sets the value of the serviceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setServiceProduct(NamedIDHierarchy value) {
        this.serviceProduct = value;
    }

}
