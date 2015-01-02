
package com.rightnow.ws.objects.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelRequiredList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelRequiredList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelList" type="{urn:objects.ws.rightnow.com/v1}LabelRequired" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelRequiredList", propOrder = {
    "labelList"
})
public class LabelRequiredList {

    @XmlElement(name = "LabelList")
    protected List<LabelRequired> labelList;

    /**
     * Gets the value of the labelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelRequired }
     * 
     * 
     */
    public List<LabelRequired> getLabelList() {
        if (labelList == null) {
            labelList = new ArrayList<LabelRequired>();
        }
        return this.labelList;
    }

}
