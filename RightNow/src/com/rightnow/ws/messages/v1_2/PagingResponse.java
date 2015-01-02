
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingResponse", propOrder = {
    "returnedCount",
    "startIndex",
    "queryHandle"
})
public class PagingResponse {

    @XmlElement(name = "ReturnedCount")
    protected int returnedCount;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "QueryHandle", required = true)
    protected String queryHandle;

    /**
     * Gets the value of the returnedCount property.
     * 
     */
    public int getReturnedCount() {
        return returnedCount;
    }

    /**
     * Sets the value of the returnedCount property.
     * 
     */
    public void setReturnedCount(int value) {
        this.returnedCount = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the queryHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryHandle() {
        return queryHandle;
    }

    /**
     * Sets the value of the queryHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryHandle(String value) {
        this.queryHandle = value;
    }

}
