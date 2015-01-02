
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.QuoteLineItemNullFields;


/**
 * <p>Java class for QuoteLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedPrice" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="AdjustedTotal" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:base.ws.rightnow.com/v1_2}ID" minOccurs="0"/>
 *         &lt;element name="OriginalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPrice" type="{urn:objects.ws.rightnow.com/v1_2}MonetaryValue" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}QuoteLineItemNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{urn:base.ws.rightnow.com/v1_2}ActionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteLineItem", propOrder = {
    "adjustedDescription",
    "adjustedName",
    "adjustedPartNumber",
    "adjustedPrice",
    "adjustedTotal",
    "comment",
    "customFields",
    "discountPercent",
    "displayOrder",
    "id",
    "originalDescription",
    "originalName",
    "originalPartNumber",
    "originalPrice",
    "product",
    "quantity",
    "validNullFields"
})
public class QuoteLineItem {

    @XmlElementRef(name = "AdjustedDescription", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> adjustedDescription;
    @XmlElementRef(name = "AdjustedName", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> adjustedName;
    @XmlElementRef(name = "AdjustedPartNumber", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> adjustedPartNumber;
    @XmlElementRef(name = "AdjustedPrice", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<MonetaryValue> adjustedPrice;
    @XmlElementRef(name = "AdjustedTotal", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<MonetaryValue> adjustedTotal;
    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElement(name = "DiscountPercent")
    protected Integer discountPercent;
    @XmlElement(name = "DisplayOrder")
    protected Integer displayOrder;
    @XmlElement(name = "ID")
    protected ID id;
    @XmlElementRef(name = "OriginalDescription", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> originalDescription;
    @XmlElementRef(name = "OriginalName", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> originalName;
    @XmlElementRef(name = "OriginalPartNumber", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> originalPartNumber;
    @XmlElement(name = "OriginalPrice")
    protected MonetaryValue originalPrice;
    @XmlElementRef(name = "Product", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> product;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<QuoteLineItemNullFields> validNullFields;
    @XmlAttribute
    protected ActionEnum action;

    /**
     * Gets the value of the adjustedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedDescription() {
        return adjustedDescription;
    }

    /**
     * Sets the value of the adjustedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedDescription(JAXBElement<String> value) {
        this.adjustedDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adjustedName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedName() {
        return adjustedName;
    }

    /**
     * Sets the value of the adjustedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedName(JAXBElement<String> value) {
        this.adjustedName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adjustedPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustedPartNumber() {
        return adjustedPartNumber;
    }

    /**
     * Sets the value of the adjustedPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustedPartNumber(JAXBElement<String> value) {
        this.adjustedPartNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adjustedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getAdjustedPrice() {
        return adjustedPrice;
    }

    /**
     * Sets the value of the adjustedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setAdjustedPrice(JAXBElement<MonetaryValue> value) {
        this.adjustedPrice = ((JAXBElement<MonetaryValue> ) value);
    }

    /**
     * Gets the value of the adjustedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public JAXBElement<MonetaryValue> getAdjustedTotal() {
        return adjustedTotal;
    }

    /**
     * Sets the value of the adjustedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}
     *     
     */
    public void setAdjustedTotal(JAXBElement<MonetaryValue> value) {
        this.adjustedTotal = ((JAXBElement<MonetaryValue> ) value);
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountPercent(Integer value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the originalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Sets the value of the originalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalDescription(JAXBElement<String> value) {
        this.originalDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalName(JAXBElement<String> value) {
        this.originalName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalPartNumber() {
        return originalPartNumber;
    }

    /**
     * Sets the value of the originalPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalPartNumber(JAXBElement<String> value) {
        this.originalPartNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryValue }
     *     
     */
    public MonetaryValue getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryValue }
     *     
     */
    public void setOriginalPrice(MonetaryValue value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setProduct(JAXBElement<NamedID> value) {
        this.product = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}
     *     
     */
    public JAXBElement<QuoteLineItemNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<QuoteLineItemNullFields> value) {
        this.validNullFields = ((JAXBElement<QuoteLineItemNullFields> ) value);
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEnum }
     *     
     */
    public ActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEnum }
     *     
     */
    public void setAction(ActionEnum value) {
        this.action = value;
    }

}
