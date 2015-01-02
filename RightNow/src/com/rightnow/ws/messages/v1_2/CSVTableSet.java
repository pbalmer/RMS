
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSVTableSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSVTableSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVTables" type="{urn:messages.ws.rightnow.com/v1_2}CSVTables" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVTableSet", propOrder = {
    "csvTables"
})
public class CSVTableSet {

    @XmlElement(name = "CSVTables")
    protected CSVTables csvTables;

    /**
     * Gets the value of the csvTables property.
     * 
     * @return
     *     possible object is
     *     {@link CSVTables }
     *     
     */
    public CSVTables getCSVTables() {
        return csvTables;
    }

    /**
     * Sets the value of the csvTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVTables }
     *     
     */
    public void setCSVTables(CSVTables value) {
        this.csvTables = value;
    }

}
