
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1.NamedIDHierarchy;


/**
 * <p>Java class for ServiceCategoryContentFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCategoryContentFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}ContentFilter">
 *       &lt;sequence>
 *         &lt;element name="ServiceCategory" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategoryContentFilter", propOrder = {
    "serviceCategory"
})
public class ServiceCategoryContentFilter
    extends ContentFilter
{

    @XmlElement(name = "ServiceCategory")
    protected NamedIDHierarchy serviceCategory;

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setServiceCategory(NamedIDHierarchy value) {
        this.serviceCategory = value;
    }

}
