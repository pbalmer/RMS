
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardContentUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardContentUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChatText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChatURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncidentText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RuleText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardContentUsage", propOrder = {
    "chatText",
    "chatURL",
    "incidentText",
    "ruleText"
})
public class StandardContentUsage {

    @XmlElement(name = "ChatText")
    protected Boolean chatText;
    @XmlElement(name = "ChatURL")
    protected Boolean chatURL;
    @XmlElement(name = "IncidentText")
    protected Boolean incidentText;
    @XmlElement(name = "RuleText")
    protected Boolean ruleText;

    /**
     * Gets the value of the chatText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatText() {
        return chatText;
    }

    /**
     * Sets the value of the chatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatText(Boolean value) {
        this.chatText = value;
    }

    /**
     * Gets the value of the chatURL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChatURL() {
        return chatURL;
    }

    /**
     * Sets the value of the chatURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChatURL(Boolean value) {
        this.chatURL = value;
    }

    /**
     * Gets the value of the incidentText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncidentText() {
        return incidentText;
    }

    /**
     * Sets the value of the incidentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncidentText(Boolean value) {
        this.incidentText = value;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuleText() {
        return ruleText;
    }

    /**
     * Sets the value of the ruleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuleText(Boolean value) {
        this.ruleText = value;
    }

}
