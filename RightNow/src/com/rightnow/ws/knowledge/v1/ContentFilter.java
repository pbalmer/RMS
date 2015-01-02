
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceholderDoNotUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentFilter", propOrder = {
    "placeholderDoNotUse"
})
@XmlSeeAlso({
    ServiceCategoryContentFilter.class,
    ServiceProductContentFilter.class
})
public class ContentFilter {

    @XmlElement(name = "PlaceholderDoNotUse")
    protected String placeholderDoNotUse;

    /**
     * Gets the value of the placeholderDoNotUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceholderDoNotUse() {
        return placeholderDoNotUse;
    }

    /**
     * Sets the value of the placeholderDoNotUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceholderDoNotUse(String value) {
        this.placeholderDoNotUse = value;
    }

}
