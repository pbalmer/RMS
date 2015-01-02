
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunAnalyticsReportResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunAnalyticsReportResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTableSet" type="{urn:messages.ws.rightnow.com/v1_2}CSVTableSet" minOccurs="0"/>
 *         &lt;element name="FileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunAnalyticsReportResponseMsg", propOrder = {
    "csvTableSet",
    "fileData"
})
public class RunAnalyticsReportResponseMsg {

    @XmlElement(name = "CSVTableSet")
    protected CSVTableSet csvTableSet;
    @XmlElement(name = "FileData")
    protected byte[] fileData;

    /**
     * Gets the value of the csvTableSet property.
     * 
     * @return
     *     possible object is
     *     {@link CSVTableSet }
     *     
     */
    public CSVTableSet getCSVTableSet() {
        return csvTableSet;
    }

    /**
     * Sets the value of the csvTableSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTableSet }
     *     
     */
    public void setCSVTableSet(CSVTableSet value) {
        this.csvTableSet = value;
    }

    /**
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = ((byte[]) value);
    }

}
