
package com.rightnow.ws.messages.v1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.generic.v1_2.RNObjectType;


/**
 * <p>Java class for GetMetaDataForClassMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMetaDataForClassMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QualifiedClassName" type="{urn:generic.ws.rightnow.com/v1_2}RNObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetaDataLink" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMetaDataForClassMsg", propOrder = {
    "className",
    "qualifiedClassName",
    "metaDataLink"
})
public class GetMetaDataForClassMsg {

    @XmlElement(name = "ClassName")
    protected List<String> className;
    @XmlElement(name = "QualifiedClassName")
    protected List<RNObjectType> qualifiedClassName;
    @XmlElement(name = "MetaDataLink")
    protected List<String> metaDataLink;

    /**
     * Gets the value of the className property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the className property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassName() {
        if (className == null) {
            className = new ArrayList<String>();
        }
        return this.className;
    }

    /**
     * Gets the value of the qualifiedClassName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedClassName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedClassName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RNObjectType }
     * 
     * 
     */
    public List<RNObjectType> getQualifiedClassName() {
        if (qualifiedClassName == null) {
            qualifiedClassName = new ArrayList<RNObjectType>();
        }
        return this.qualifiedClassName;
    }

    /**
     * Gets the value of the metaDataLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetaDataLink() {
        if (metaDataLink == null) {
            metaDataLink = new ArrayList<String>();
        }
        return this.metaDataLink;
    }

}
