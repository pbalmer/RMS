
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.RNObject;


/**
 * <p>Java class for GetFileDataMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFileDataMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNObject" type="{urn:base.ws.rightnow.com/v1_2}RNObject"/>
 *         &lt;element name="FileID" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="DisableMTOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileDataMsg", propOrder = {
    "rnObject",
    "fileID",
    "disableMTOM"
})
public class GetFileDataMsg {

    @XmlElement(name = "RNObject", required = true)
    protected RNObject rnObject;
    @XmlElement(name = "FileID", required = true)
    protected ID fileID;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * Gets the value of the rnObject property.
     * 
     * @return
     *     possible object is
     *     {@link RNObject }
     *     
     */
    public RNObject getRNObject() {
        return rnObject;
    }

    /**
     * Sets the value of the rnObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNObject }
     *     
     */
    public void setRNObject(RNObject value) {
        this.rnObject = value;
    }

    /**
     * Gets the value of the fileID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setFileID(ID value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the disableMTOM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMTOM() {
        return disableMTOM;
    }

    /**
     * Sets the value of the disableMTOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMTOM(Boolean value) {
        this.disableMTOM = value;
    }

}
