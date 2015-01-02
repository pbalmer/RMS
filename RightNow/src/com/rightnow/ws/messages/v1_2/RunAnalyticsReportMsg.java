
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.objects.v1_2.AnalyticsReport;


/**
 * <p>Java class for RunAnalyticsReportMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunAnalyticsReportMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalyticsReport" type="{urn:objects.ws.rightnow.com/v1_2}AnalyticsReport"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnRawResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "RunAnalyticsReportMsg", propOrder = {
    "analyticsReport",
    "limit",
    "start",
    "delimiter",
    "returnRawResult",
    "disableMTOM"
})
public class RunAnalyticsReportMsg {

    @XmlElement(name = "AnalyticsReport", required = true)
    protected AnalyticsReport analyticsReport;
    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "Start")
    protected Integer start;
    @XmlElement(name = "Delimiter")
    protected String delimiter;
    @XmlElement(name = "ReturnRawResult")
    protected Boolean returnRawResult;
    @XmlElement(name = "DisableMTOM")
    protected Boolean disableMTOM;

    /**
     * Gets the value of the analyticsReport property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsReport }
     *     
     */
    public AnalyticsReport getAnalyticsReport() {
        return analyticsReport;
    }

    /**
     * Sets the value of the analyticsReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsReport }
     *     
     */
    public void setAnalyticsReport(AnalyticsReport value) {
        this.analyticsReport = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the returnRawResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRawResult() {
        return returnRawResult;
    }

    /**
     * Sets the value of the returnRawResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRawResult(Boolean value) {
        this.returnRawResult = value;
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
