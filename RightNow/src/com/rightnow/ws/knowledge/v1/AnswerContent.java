
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1.NamedID;
import com.rightnow.ws.base.v1.NamedIDHierarchyList;
import com.rightnow.ws.nullfields.v1.AnswerContentNullFields;
import com.rightnow.ws.objects.v1.FileAttachmentAnswerList;
import com.rightnow.ws.objects.v1.FileAttachmentSharedList;


/**
 * <p>Java class for AnswerContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerContent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:knowledge.ws.rightnow.com/v1}Content">
 *       &lt;sequence>
 *         &lt;element name="AnswerType" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Categories" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="CommonAttachments" type="{urn:objects.ws.rightnow.com/v1}FileAttachmentSharedList" minOccurs="0"/>
 *         &lt;element name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1}FileAttachmentAnswerList" minOccurs="0"/>
 *         &lt;element name="GuidedAssistance" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:base.ws.rightnow.com/v1}NamedID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Products" type="{urn:base.ws.rightnow.com/v1}NamedIDHierarchyList" minOccurs="0"/>
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1}AnswerContentNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerContent", propOrder = {
    "answerType",
    "categories",
    "commonAttachments",
    "expiresDate",
    "fileAttachments",
    "guidedAssistance",
    "keywords",
    "language",
    "name",
    "products",
    "question",
    "solution",
    "summary",
    "url",
    "validNullFields"
})
public class AnswerContent
    extends Content
{

    @XmlElement(name = "AnswerType")
    protected NamedID answerType;
    @XmlElementRef(name = "Categories", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> categories;
    @XmlElementRef(name = "CommonAttachments", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentSharedList> commonAttachments;
    @XmlElement(name = "ExpiresDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiresDate;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentAnswerList> fileAttachments;
    @XmlElementRef(name = "GuidedAssistance", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedID> guidedAssistance;
    @XmlElementRef(name = "Keywords", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keywords;
    @XmlElement(name = "Language")
    protected NamedID language;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Products", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<NamedIDHierarchyList> products;
    @XmlElementRef(name = "Question", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> question;
    @XmlElementRef(name = "Solution", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solution;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElementRef(name = "URL", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:knowledge.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<AnswerContentNullFields> validNullFields;

    /**
     * Gets the value of the answerType property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setAnswerType(NamedID value) {
        this.answerType = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setCategories(JAXBElement<NamedIDHierarchyList> value) {
        this.categories = value;
    }

    /**
     * Gets the value of the commonAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentSharedList> getCommonAttachments() {
        return commonAttachments;
    }

    /**
     * Sets the value of the commonAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}
     *     
     */
    public void setCommonAttachments(JAXBElement<FileAttachmentSharedList> value) {
        this.commonAttachments = value;
    }

    /**
     * Gets the value of the expiresDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresDate() {
        return expiresDate;
    }

    /**
     * Sets the value of the expiresDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresDate(XMLGregorianCalendar value) {
        this.expiresDate = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentAnswerList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentAnswerList> value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the guidedAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getGuidedAssistance() {
        return guidedAssistance;
    }

    /**
     * Sets the value of the guidedAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setGuidedAssistance(JAXBElement<NamedID> value) {
        this.guidedAssistance = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeywords(JAXBElement<String> value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setLanguage(NamedID value) {
        this.language = value;
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
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public JAXBElement<NamedIDHierarchyList> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}
     *     
     */
    public void setProducts(JAXBElement<NamedIDHierarchyList> value) {
        this.products = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestion(JAXBElement<String> value) {
        this.question = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolution(JAXBElement<String> value) {
        this.solution = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}
     *     
     */
    public JAXBElement<AnswerContentNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<AnswerContentNullFields> value) {
        this.validNullFields = value;
    }

}
