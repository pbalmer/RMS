
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerLinkNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerLinkNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LearnedLinkStrength" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerLinkNullFields")
public class AnswerLinkNullFields {

    @XmlAttribute(name = "LearnedLinkStrength")
    protected Boolean learnedLinkStrength;

    /**
     * Gets the value of the learnedLinkStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLearnedLinkStrength() {
        if (learnedLinkStrength == null) {
            return false;
        } else {
            return learnedLinkStrength;
        }
    }

    /**
     * Sets the value of the learnedLinkStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLearnedLinkStrength(Boolean value) {
        this.learnedLinkStrength = value;
    }

}
