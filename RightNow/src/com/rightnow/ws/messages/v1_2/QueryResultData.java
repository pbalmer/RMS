
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.faults.v1_2.RNFault;


/**
 * <p>Java class for QueryResultData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObjectsResult" type="{urn:messages.ws.rightnow.com/v1_2}RNObjectsResult"/>
 *         &lt;element name="Paging" type="{urn:messages.ws.rightnow.com/v1_2}PagingResponse"/>
 *         &lt;element name="Fault" type="{urn:faults.ws.rightnow.com/v1_2}RNFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResultData", propOrder = {
    "rnObjectsResult",
    "paging",
    "fault"
})
public class QueryResultData {

    @XmlElement(name = "RNObjectsResult", required = true)
    protected RNObjectsResult rnObjectsResult;
    @XmlElement(name = "Paging", required = true)
    protected PagingResponse paging;
    @XmlElement(name = "Fault")
    protected RNFault fault;

    /**
     * Gets the value of the rnObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RNObjectsResult }
     *     
     */
    public RNObjectsResult getRNObjectsResult() {
        return rnObjectsResult;
    }

    /**
     * Sets the value of the rnObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObjectsResult }
     *     
     */
    public void setRNObjectsResult(RNObjectsResult value) {
        this.rnObjectsResult = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link PagingResponse }
     *     
     */
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingResponse }
     *     
     */
    public void setPaging(PagingResponse value) {
        this.paging = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link RNFault }
     *     
     */
    public RNFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNFault }
     *     
     */
    public void setFault(RNFault value) {
        this.fault = value;
    }

}
