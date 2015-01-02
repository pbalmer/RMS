
package com.rightnow.ws.knowledge.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KnowledgeStandardContentContentValueList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnowledgeStandardContentContentValueList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KnowledgeStandardContentContentValueList" type="{urn:knowledge.ws.rightnow.com/v1}KnowledgeStandardContentContentValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnowledgeStandardContentContentValueList", propOrder = {
    "knowledgeStandardContentContentValueList"
})
public class KnowledgeStandardContentContentValueList {

    @XmlElement(name = "KnowledgeStandardContentContentValueList")
    protected List<KnowledgeStandardContentContentValue> knowledgeStandardContentContentValueList;

    /**
     * Gets the value of the knowledgeStandardContentContentValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knowledgeStandardContentContentValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnowledgeStandardContentContentValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnowledgeStandardContentContentValue }
     * 
     * 
     */
    public List<KnowledgeStandardContentContentValue> getKnowledgeStandardContentContentValueList() {
        if (knowledgeStandardContentContentValueList == null) {
            knowledgeStandardContentContentValueList = new ArrayList<KnowledgeStandardContentContentValue>();
        }
        return this.knowledgeStandardContentContentValueList;
    }

}
