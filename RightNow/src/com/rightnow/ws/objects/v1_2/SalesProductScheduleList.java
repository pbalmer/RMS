
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesProductScheduleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesProductScheduleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesProductScheduleList" type="{urn:objects.ws.rightnow.com/v1_2}SalesProductSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesProductScheduleList", propOrder = {
    "salesProductScheduleList"
})
public class SalesProductScheduleList {

    @XmlElement(name = "SalesProductScheduleList")
    protected List<SalesProductSchedule> salesProductScheduleList;

    /**
     * Gets the value of the salesProductScheduleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesProductScheduleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesProductScheduleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesProductSchedule }
     * 
     * 
     */
    public List<SalesProductSchedule> getSalesProductScheduleList() {
        if (salesProductScheduleList == null) {
            salesProductScheduleList = new ArrayList<SalesProductSchedule>();
        }
        return this.salesProductScheduleList;
    }

}
