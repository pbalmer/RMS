
package com.rightnow.ws.generic.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDDelta;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;


/**
 * <p>Java class for DataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Base64BinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BooleanValueList" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateTimeValueList" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DateValueList" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DecimalValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DecimalValueList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IDValue" type="{urn:base.ws.rightnow.com/v1_2}ID"/>
 *         &lt;element name="IDValueList" type="{urn:base.ws.rightnow.com/v1_2}ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntegerValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntegerValueList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LongValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LongValueList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NamedIDDeltaValueList" type="{urn:base.ws.rightnow.com/v1_2}NamedIDDelta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NamedIDHierarchyValue" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy"/>
 *         &lt;element name="NamedIDHierarchyValueList" type="{urn:base.ws.rightnow.com/v1_2}NamedIDHierarchy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NamedIDValue" type="{urn:base.ws.rightnow.com/v1_2}NamedID"/>
 *         &lt;element name="NamedIDValueList" type="{urn:base.ws.rightnow.com/v1_2}NamedID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObjectValue" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject"/>
 *         &lt;element name="ObjectValueList" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StringValueList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValue", propOrder = {
    "base64BinaryValue",
    "booleanValue",
    "booleanValueList",
    "dateTimeValue",
    "dateTimeValueList",
    "dateValue",
    "dateValueList",
    "decimalValue",
    "decimalValueList",
    "idValue",
    "idValueList",
    "integerValue",
    "integerValueList",
    "longValue",
    "longValueList",
    "namedIDDeltaValueList",
    "namedIDHierarchyValue",
    "namedIDHierarchyValueList",
    "namedIDValue",
    "namedIDValueList",
    "objectValue",
    "objectValueList",
    "stringValue",
    "stringValueList"
})
public class DataValue {

    @XmlElement(name = "Base64BinaryValue")
    protected byte[] base64BinaryValue;
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;
    @XmlElement(name = "BooleanValueList", type = Boolean.class)
    protected List<Boolean> booleanValueList;
    @XmlElement(name = "DateTimeValue")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeValue;
    @XmlElement(name = "DateTimeValueList")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dateTimeValueList;
    @XmlElement(name = "DateValue")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    @XmlElement(name = "DateValueList")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> dateValueList;
    @XmlElement(name = "DecimalValue")
    protected Double decimalValue;
    @XmlElement(name = "DecimalValueList", type = Double.class)
    protected List<Double> decimalValueList;
    @XmlElement(name = "IDValue")
    protected ID idValue;
    @XmlElement(name = "IDValueList")
    protected List<ID> idValueList;
    @XmlElement(name = "IntegerValue")
    protected Integer integerValue;
    @XmlElement(name = "IntegerValueList", type = Integer.class)
    protected List<Integer> integerValueList;
    @XmlElement(name = "LongValue")
    protected Long longValue;
    @XmlElement(name = "LongValueList", type = Long.class)
    protected List<Long> longValueList;
    @XmlElement(name = "NamedIDDeltaValueList")
    protected List<NamedIDDelta> namedIDDeltaValueList;
    @XmlElement(name = "NamedIDHierarchyValue")
    protected NamedIDHierarchy namedIDHierarchyValue;
    @XmlElement(name = "NamedIDHierarchyValueList")
    protected List<NamedIDHierarchy> namedIDHierarchyValueList;
    @XmlElement(name = "NamedIDValue")
    protected NamedID namedIDValue;
    @XmlElement(name = "NamedIDValueList")
    protected List<NamedID> namedIDValueList;
    @XmlElement(name = "ObjectValue")
    protected GenericObject objectValue;
    @XmlElement(name = "ObjectValueList")
    protected List<GenericObject> objectValueList;
    @XmlElement(name = "StringValue")
    protected String stringValue;
    @XmlElement(name = "StringValueList")
    protected List<String> stringValueList;

    /**
     * Gets the value of the base64BinaryValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64BinaryValue() {
        return base64BinaryValue;
    }

    /**
     * Sets the value of the base64BinaryValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64BinaryValue(byte[] value) {
        this.base64BinaryValue = ((byte[]) value);
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the booleanValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getBooleanValueList() {
        if (booleanValueList == null) {
            booleanValueList = new ArrayList<Boolean>();
        }
        return this.booleanValueList;
    }

    /**
     * Gets the value of the dateTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeValue(XMLGregorianCalendar value) {
        this.dateTimeValue = value;
    }

    /**
     * Gets the value of the dateTimeValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDateTimeValueList() {
        if (dateTimeValueList == null) {
            dateTimeValueList = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dateTimeValueList;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the dateValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDateValueList() {
        if (dateValueList == null) {
            dateValueList = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dateValueList;
    }

    /**
     * Gets the value of the decimalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDecimalValue() {
        return decimalValue;
    }

    /**
     * Sets the value of the decimalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDecimalValue(Double value) {
        this.decimalValue = value;
    }

    /**
     * Gets the value of the decimalValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decimalValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecimalValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDecimalValueList() {
        if (decimalValueList == null) {
            decimalValueList = new ArrayList<Double>();
        }
        return this.decimalValueList;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getIDValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setIDValue(ID value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the idValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ID }
     * 
     * 
     */
    public List<ID> getIDValueList() {
        if (idValueList == null) {
            idValueList = new ArrayList<ID>();
        }
        return this.idValueList;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegerValue(Integer value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the integerValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIntegerValueList() {
        if (integerValueList == null) {
            integerValueList = new ArrayList<Integer>();
        }
        return this.integerValueList;
    }

    /**
     * Gets the value of the longValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * Sets the value of the longValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongValue(Long value) {
        this.longValue = value;
    }

    /**
     * Gets the value of the longValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLongValueList() {
        if (longValueList == null) {
            longValueList = new ArrayList<Long>();
        }
        return this.longValueList;
    }

    /**
     * Gets the value of the namedIDDeltaValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDDeltaValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDDeltaValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedIDDelta }
     * 
     * 
     */
    public List<NamedIDDelta> getNamedIDDeltaValueList() {
        if (namedIDDeltaValueList == null) {
            namedIDDeltaValueList = new ArrayList<NamedIDDelta>();
        }
        return this.namedIDDeltaValueList;
    }

    /**
     * Gets the value of the namedIDHierarchyValue property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public NamedIDHierarchy getNamedIDHierarchyValue() {
        return namedIDHierarchyValue;
    }

    /**
     * Sets the value of the namedIDHierarchyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDHierarchy }
     *     
     */
    public void setNamedIDHierarchyValue(NamedIDHierarchy value) {
        this.namedIDHierarchyValue = value;
    }

    /**
     * Gets the value of the namedIDHierarchyValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDHierarchyValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDHierarchyValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedIDHierarchy }
     * 
     * 
     */
    public List<NamedIDHierarchy> getNamedIDHierarchyValueList() {
        if (namedIDHierarchyValueList == null) {
            namedIDHierarchyValueList = new ArrayList<NamedIDHierarchy>();
        }
        return this.namedIDHierarchyValueList;
    }

    /**
     * Gets the value of the namedIDValue property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getNamedIDValue() {
        return namedIDValue;
    }

    /**
     * Sets the value of the namedIDValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setNamedIDValue(NamedID value) {
        this.namedIDValue = value;
    }

    /**
     * Gets the value of the namedIDValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedIDValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedIDValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedID }
     * 
     * 
     */
    public List<NamedID> getNamedIDValueList() {
        if (namedIDValueList == null) {
            namedIDValueList = new ArrayList<NamedID>();
        }
        return this.namedIDValueList;
    }

    /**
     * Gets the value of the objectValue property.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getObjectValue() {
        return objectValue;
    }

    /**
     * Sets the value of the objectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setObjectValue(GenericObject value) {
        this.objectValue = value;
    }

    /**
     * Gets the value of the objectValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericObject }
     * 
     * 
     */
    public List<GenericObject> getObjectValueList() {
        if (objectValueList == null) {
            objectValueList = new ArrayList<GenericObject>();
        }
        return this.objectValueList;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the stringValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStringValueList() {
        if (stringValueList == null) {
            stringValueList = new ArrayList<String>();
        }
        return this.stringValueList;
    }

}
