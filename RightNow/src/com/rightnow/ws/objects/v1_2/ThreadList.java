
package com.rightnow.ws.objects.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreadList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreadList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThreadList" type="{urn:objects.ws.rightnow.com/v1_2}Thread" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadList", propOrder = {
    "threadList"
})
public class ThreadList {

    @XmlElement(name = "ThreadList")
    protected List<Thread> threadList;

    /**
     * Gets the value of the threadList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreadList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Thread }
     * 
     * 
     */
    public List<Thread> getThreadList() {
        if (threadList == null) {
            threadList = new ArrayList<Thread>();
        }
        return this.threadList;
    }

}
