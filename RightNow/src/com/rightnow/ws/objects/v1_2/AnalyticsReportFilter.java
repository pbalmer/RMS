
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.NamedID;


/**
 * <p>Java class for AnalyticsReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsReportFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:objects.ws.rightnow.com/v1_2}AnalyticsReportSearchFilter">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:objects.ws.rightnow.com/v1_2}AnalyticsReportFilterAttributes" minOccurs="0"/>
 *         &lt;element name="DataType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticsReportFilter", propOrder = {
    "attributes",
    "dataType",
    "prompt"
})
public class AnalyticsReportFilter
    extends AnalyticsReportSearchFilter
{

    @XmlElement(name = "Attributes")
    protected AnalyticsReportFilterAttributes attributes;
    @XmlElement(name = "DataType")
    protected NamedID dataType;
    @XmlElement(name = "Prompt")
    protected String prompt;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReportFilterAttributes }
     *     
     */
    public AnalyticsReportFilterAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReportFilterAttributes }
     *     
     */
    public void setAttributes(AnalyticsReportFilterAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setDataType(NamedID value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

}
