
package com.rightnow.ws.metadata.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_2.RNObjectType;


/**
 * <p>Java class for MetaDataClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataAttributeList" minOccurs="0"/>
 *         &lt;element name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanDestroy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanGet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DerivedFrom" type="{urn:generic.ws.rightnow.com/v1_2}RNObjectType" minOccurs="0"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{urn:generic.ws.rightnow.com/v1_2}RNObjectType"/>
 *         &lt;element name="Relationships" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataClass", propOrder = {
    "attributes",
    "canCreate",
    "canDestroy",
    "canGet",
    "canUpdate",
    "derivedFrom",
    "metaDataLink",
    "name",
    "relationships"
})
public class MetaDataClass {

    @XmlElement(name = "Attributes")
    protected MetaDataAttributeList attributes;
    @XmlElement(name = "CanCreate")
    protected boolean canCreate;
    @XmlElement(name = "CanDestroy")
    protected boolean canDestroy;
    @XmlElement(name = "CanGet")
    protected boolean canGet;
    @XmlElement(name = "CanUpdate")
    protected boolean canUpdate;
    @XmlElement(name = "DerivedFrom")
    protected RNObjectType derivedFrom;
    @XmlElement(name = "MetaDataLink", required = true)
    protected String metaDataLink;
    @XmlElement(name = "Name", required = true)
    protected RNObjectType name;
    @XmlElement(name = "Relationships")
    protected List<MetaDataRelationship> relationships;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public MetaDataAttributeList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataAttributeList }
     *     
     */
    public void setAttributes(MetaDataAttributeList value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the canCreate property.
     * 
     */
    public boolean isCanCreate() {
        return canCreate;
    }

    /**
     * Sets the value of the canCreate property.
     * 
     */
    public void setCanCreate(boolean value) {
        this.canCreate = value;
    }

    /**
     * Gets the value of the canDestroy property.
     * 
     */
    public boolean isCanDestroy() {
        return canDestroy;
    }

    /**
     * Sets the value of the canDestroy property.
     * 
     */
    public void setCanDestroy(boolean value) {
        this.canDestroy = value;
    }

    /**
     * Gets the value of the canGet property.
     * 
     */
    public boolean isCanGet() {
        return canGet;
    }

    /**
     * Sets the value of the canGet property.
     * 
     */
    public void setCanGet(boolean value) {
        this.canGet = value;
    }

    /**
     * Gets the value of the canUpdate property.
     * 
     */
    public boolean isCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     * 
     */
    public void setCanUpdate(boolean value) {
        this.canUpdate = value;
    }

    /**
     * Gets the value of the derivedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getDerivedFrom() {
        return derivedFrom;
    }

    /**
     * Sets the value of the derivedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setDerivedFrom(RNObjectType value) {
        this.derivedFrom = value;
    }

    /**
     * Gets the value of the metaDataLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataLink() {
        return metaDataLink;
    }

    /**
     * Sets the value of the metaDataLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataLink(String value) {
        this.metaDataLink = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectType }
     *     
     */
    public RNObjectType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectType }
     *     
     */
    public void setName(RNObjectType value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataRelationship }
     * 
     * 
     */
    public List<MetaDataRelationship> getRelationships() {
        if (relationships == null) {
            relationships = new ArrayList<MetaDataRelationship>();
        }
        return this.relationships;
    }

}
