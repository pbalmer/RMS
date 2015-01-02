
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.nullfields.v1.StandardContentContentNullFields;


/**
 * <p>Java class for StandardContentContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardContentContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}Content">
 *       &lt;sequence>
 *         &lt;element name="ContentValues" type="{urn:knowledge.ws.rightnow.com/v1}KnowledgeStandardContentContentValueList" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}StandardContentContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContentContent", propOrder = {
    "contentValues",
    "validNullFields"
})
public class StandardContentContent
    extends Content
{

    @XmlElementRef(name = "ContentValues", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<KnowledgeStandardContentContentValueList> contentValues;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardContentContentNullFields> validNullFields;

    /**
     * Gets the value of the contentValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}
     *     
     */
    public JAXBElement<KnowledgeStandardContentContentValueList> getContentValues() {
        return contentValues;
    }

    /**
     * Sets the value of the contentValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}
     *     
     */
    public void setContentValues(JAXBElement<KnowledgeStandardContentContentValueList> value) {
        this.contentValues = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}
     *     
     */
    public JAXBElement<StandardContentContentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<StandardContentContentNullFields> value) {
        this.validNullFields = value;
    }

}
