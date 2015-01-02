
package com.rightnow.ws.generic.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.RNObject;


/**
 * <p>Java class for GenericObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericObject">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{urn:generic.ws.rightnow.com/v1_2}RNObjectType" minOccurs="0"/>
 *         &lt;element name="GenericFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericObject", propOrder = {
    "objectType",
    "genericFields"
})
public class GenericObject
    extends RNObject
{

    @XmlElement(name = "ObjectType")
    protected RNObjectType objectType;
    @XmlElement(name = "GenericFields")
    protected List<GenericField> genericFields;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setObjectType(RNObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the genericFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericField }
     * 
     * 
     */
    public List<GenericField> getGenericFields() {
        if (genericFields == null) {
            genericFields = new ArrayList<GenericField>();
        }
        return this.genericFields;
    }

}
