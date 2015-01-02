
package com.rightnow.ws.messages.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.RNObject;


/**
 * <p>Java class for TransferSubObjectsMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSubObjectsMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationRNObject" type="{urn:base.ws.rightnow.com/v1_2}RNObject"/>
 *         &lt;element name="SourceRNObjects" type="{urn:base.ws.rightnow.com/v1_2}RNObject" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferSubObjectsMsg", propOrder = {
    "destinationRNObject",
    "sourceRNObjects"
})
public class TransferSubObjectsMsg {

    @XmlElement(name = "DestinationRNObject", required = true)
    protected RNObject destinationRNObject;
    @XmlElement(name = "SourceRNObjects", required = true)
    protected List<RNObject> sourceRNObjects;

    /**
     * Gets the value of the destinationRNObject property.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getDestinationRNObject() {
        return destinationRNObject;
    }

    /**
     * Sets the value of the destinationRNObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setDestinationRNObject(RNObject value) {
        this.destinationRNObject = value;
    }

    /**
     * Gets the value of the sourceRNObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceRNObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceRNObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObject }
     * 
     * 
     */
    public List<RNObject> getSourceRNObjects() {
        if (sourceRNObjects == null) {
            sourceRNObjects = new ArrayList<RNObject>();
        }
        return this.sourceRNObjects;
    }

}
