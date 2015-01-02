
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDispositionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDispositionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDispositionList" type="{urn:objects.ws.rightnow.com/v1_2}ServiceDispositionDelta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDispositionList", propOrder = {
    "serviceDispositionList"
})
public class ServiceDispositionList {

    @XmlElement(name = "ServiceDispositionList")
    protected List<ServiceDispositionDelta> serviceDispositionList;

    /**
     * Gets the value of the serviceDispositionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDispositionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDispositionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDispositionDelta }
     * 
     * 
     */
    public List<ServiceDispositionDelta> getServiceDispositionList() {
        if (serviceDispositionList == null) {
            serviceDispositionList = new ArrayList<ServiceDispositionDelta>();
        }
        return this.serviceDispositionList;
    }

}
