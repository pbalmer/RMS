
package com.rightnow.ws.base.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedIDDeltaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedIDDeltaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamedIDDeltaList" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDelta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedIDDeltaList", propOrder = {
    "namedIDDeltaList"
})
public class NamedIDDeltaList {

    @XmlElement(name = "NamedIDDeltaList")
    protected List<NamedIDDelta> namedIDDeltaList;

    /**
     * Gets the value of the namedIDDeltaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDDeltaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDDeltaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedIDDelta }
     * 
     * 
     */
    public List<NamedIDDelta> getNamedIDDeltaList() {
        if (namedIDDeltaList == null) {
            namedIDDeltaList = new ArrayList<NamedIDDelta>();
        }
        return this.namedIDDeltaList;
    }

}
