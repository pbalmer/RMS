
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.base.v1.NamedID;


/**
 * <p>Java class for AnswerSummaryContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerSummaryContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}SummaryContent">
 *       &lt;sequence>
 *         &lt;element name="ContentOrigin" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerSummaryContent", propOrder = {
    "contentOrigin"
})
public class AnswerSummaryContent
    extends SummaryContent
{

    @XmlElement(name = "ContentOrigin")
    protected NamedID contentOrigin;

    /**
     * Gets the value of the contentOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getContentOrigin() {
        return contentOrigin;
    }

    /**
     * Sets the value of the contentOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setContentOrigin(NamedID value) {
        this.contentOrigin = value;
    }

}
