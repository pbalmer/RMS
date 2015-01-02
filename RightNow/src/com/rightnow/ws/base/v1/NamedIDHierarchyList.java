
package com.rightnow.ws.base.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedIDHierarchyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedIDHierarchyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamedIDHierarchyList" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedIDHierarchyList", propOrder = {
    "namedIDHierarchyList"
})
public class NamedIDHierarchyList {

    @XmlElement(name = "NamedIDHierarchyList")
    protected List<NamedIDHierarchy> namedIDHierarchyList;

    /**
     * Gets the value of the namedIDHierarchyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDHierarchyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDHierarchyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedIDHierarchy }
     * 
     * 
     */
    public List<NamedIDHierarchy> getNamedIDHierarchyList() {
        if (namedIDHierarchyList == null) {
            namedIDHierarchyList = new ArrayList<NamedIDHierarchy>();
        }
        return this.namedIDHierarchyList;
    }

}
