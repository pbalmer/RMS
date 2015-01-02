
package com.rightnow.ws.base.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedIDList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedIDList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamedIDList" type="{urn:base.ws.rightnow.com/v1_2}NamedID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedIDList", propOrder = {
    "namedIDList"
})
public class NamedIDList {

    @XmlElement(name = "NamedIDList")
    protected List<NamedID> namedIDList;

    /**
     * Gets the value of the namedIDList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedID }
     * 
     * 
     */
    public List<NamedID> getNamedIDList() {
        if (namedIDList == null) {
            namedIDList = new ArrayList<NamedID>();
        }
        return this.namedIDList;
    }

}
