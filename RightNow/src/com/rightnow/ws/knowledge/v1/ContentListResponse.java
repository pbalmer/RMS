
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1.ContentListResponseNullFields;


/**
 * <p>Java class for ContentListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:knowledge.ws.rightnow.com/v1}ContentRequestStatus" minOccurs="0"/>
 *         &lt;element name="SummaryContents" type="{urn:knowledge.ws.rightnow.com/v1}SummaryContentList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}ContentListResponseNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentListResponse", propOrder = {
    "status",
    "summaryContents",
    "validNullFields"
})
@XmlSeeAlso({
    SearchResponse.class
})
public class ContentListResponse {

    @XmlElement(name = "Status")
    protected ContentRequestStatus status;
    @XmlElementRef(name = "SummaryContents", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<SummaryContentList> summaryContents;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentListResponseNullFields> validNullFields;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentRequestStatus }
     *     
     */
    public ContentRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentRequestStatus }
     *     
     */
    public void setStatus(ContentRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the summaryContents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}
     *     
     */
    public JAXBElement<SummaryContentList> getSummaryContents() {
        return summaryContents;
    }

    /**
     * Sets the value of the summaryContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}
     *     
     */
    public void setSummaryContents(JAXBElement<SummaryContentList> value) {
        this.summaryContents = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}
     *     
     */
    public JAXBElement<ContentListResponseNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<ContentListResponseNullFields> value) {
        this.validNullFields = value;
    }

}
