
package com.rightnow.ws.metadata.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_2.DataTypeEnum;


/**
 * <p>Java class for MetaDataAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{urn:generic.ws.rightnow.com/v1_2}DataTypeEnum"/>
 *         &lt;element name="DataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageOnCreate" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnDestroy" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnGet" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataUsageEnum"/>
 *         &lt;element name="UsageOnUpdate" type="{urn:metadata.ws.rightnow.com/v1_2}MetaDataUsageEnum"/>
 *         &lt;element name="UsedAsName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataAttribute", propOrder = {
    "dataType",
    "dataTypeName",
    "metaDataLink",
    "isDeprecated",
    "description",
    "maxLength",
    "maxValue",
    "minValue",
    "name",
    "nullable",
    "pattern",
    "usageOnCreate",
    "usageOnDestroy",
    "usageOnGet",
    "usageOnUpdate",
    "usedAsName"
})
public class MetaDataAttribute {

    @XmlElement(name = "DataType", required = true)
    protected DataTypeEnum dataType;
    @XmlElement(name = "DataTypeName")
    protected String dataTypeName;
    @XmlElement(name = "MetaDataLink")
    protected String metaDataLink;
    @XmlElement(name = "IsDeprecated")
    protected boolean isDeprecated;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "MaxLength")
    protected Integer maxLength;
    @XmlElement(name = "MaxValue")
    protected Integer maxValue;
    @XmlElement(name = "MinValue")
    protected Integer minValue;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Nullable")
    protected boolean nullable;
    @XmlElement(name = "Pattern")
    protected String pattern;
    @XmlElement(name = "UsageOnCreate", required = true)
    protected MetaDataUsageEnum usageOnCreate;
    @XmlElement(name = "UsageOnDestroy", required = true)
    protected MetaDataUsageEnum usageOnDestroy;
    @XmlElement(name = "UsageOnGet", required = true)
    protected MetaDataUsageEnum usageOnGet;
    @XmlElement(name = "UsageOnUpdate", required = true)
    protected MetaDataUsageEnum usageOnUpdate;
    @XmlElement(name = "UsedAsName")
    protected boolean usedAsName;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeEnum }
     *     
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeEnum }
     *     
     */
    public void setDataType(DataTypeEnum value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * Sets the value of the dataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataTypeName(String value) {
        this.dataTypeName = value;
    }

    /**
     * Gets the value of the metaDataLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDataLink() {
        return metaDataLink;
    }

    /**
     * Sets the value of the metaDataLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDataLink(String value) {
        this.metaDataLink = value;
    }

    /**
     * Gets the value of the isDeprecated property.
     * 
     */
    public boolean isIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Sets the value of the isDeprecated property.
     * 
     */
    public void setIsDeprecated(boolean value) {
        this.isDeprecated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValue(Integer value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinValue(Integer value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the usageOnCreate property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnCreate() {
        return usageOnCreate;
    }

    /**
     * Sets the value of the usageOnCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnCreate(MetaDataUsageEnum value) {
        this.usageOnCreate = value;
    }

    /**
     * Gets the value of the usageOnDestroy property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnDestroy() {
        return usageOnDestroy;
    }

    /**
     * Sets the value of the usageOnDestroy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnDestroy(MetaDataUsageEnum value) {
        this.usageOnDestroy = value;
    }

    /**
     * Gets the value of the usageOnGet property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnGet() {
        return usageOnGet;
    }

    /**
     * Sets the value of the usageOnGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnGet(MetaDataUsageEnum value) {
        this.usageOnGet = value;
    }

    /**
     * Gets the value of the usageOnUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public MetaDataUsageEnum getUsageOnUpdate() {
        return usageOnUpdate;
    }

    /**
     * Sets the value of the usageOnUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataUsageEnum }
     *     
     */
    public void setUsageOnUpdate(MetaDataUsageEnum value) {
        this.usageOnUpdate = value;
    }

    /**
     * Gets the value of the usedAsName property.
     * 
     */
    public boolean isUsedAsName() {
        return usedAsName;
    }

    /**
     * Sets the value of the usedAsName property.
     * 
     */
    public void setUsedAsName(boolean value) {
        this.usedAsName = value;
    }

}
