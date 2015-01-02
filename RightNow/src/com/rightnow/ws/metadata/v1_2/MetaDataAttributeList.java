
package com.rightnow.ws.metadata.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataAttributeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttributeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaDataAttributeList" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttributeList", propOrder = {
    "metaDataAttributeList"
})
public class MetaDataAttributeList {

    @XmlElement(name = "MetaDataAttributeList")
    protected List<MetaDataAttribute> metaDataAttributeList;

    /**
     * Gets the value of the metaDataAttributeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataAttributeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataAttributeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataAttribute }
     * 
     * 
     */
    public List<MetaDataAttribute> getMetaDataAttributeList() {
        if (metaDataAttributeList == null) {
            metaDataAttributeList = new ArrayList<MetaDataAttribute>();
        }
        return this.metaDataAttributeList;
    }

}
