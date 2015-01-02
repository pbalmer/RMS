
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AccessLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AssignedSibling" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Categories" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CommonAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CommonComment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ExpiresDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Keywords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Links" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NextNotificationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OriginalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Products" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PublishOnDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Question" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Solution" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerNullFields")
public class AnswerNullFields {

    @XmlAttribute(name = "AccessLevels")
    protected Boolean accessLevels;
    @XmlAttribute(name = "AssignedSibling")
    protected Boolean assignedSibling;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "Categories")
    protected Boolean categories;
    @XmlAttribute(name = "Comment")
    protected Boolean comment;
    @XmlAttribute(name = "CommonAttachments")
    protected Boolean commonAttachments;
    @XmlAttribute(name = "CommonComment")
    protected Boolean commonComment;
    @XmlAttribute(name = "ExpiresDate")
    protected Boolean expiresDate;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "Keywords")
    protected Boolean keywords;
    @XmlAttribute(name = "Links")
    protected Boolean links;
    @XmlAttribute(name = "NextNotificationTime")
    protected Boolean nextNotificationTime;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "OriginalReferenceNumber")
    protected Boolean originalReferenceNumber;
    @XmlAttribute(name = "Products")
    protected Boolean products;
    @XmlAttribute(name = "PublishOnDate")
    protected Boolean publishOnDate;
    @XmlAttribute(name = "Question")
    protected Boolean question;
    @XmlAttribute(name = "Solution")
    protected Boolean solution;
    @XmlAttribute(name = "URL")
    protected Boolean url;

    /**
     * Gets the value of the accessLevels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAccessLevels() {
        if (accessLevels == null) {
            return false;
        } else {
            return accessLevels;
        }
    }

    /**
     * Sets the value of the accessLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessLevels(Boolean value) {
        this.accessLevels = value;
    }

    /**
     * Gets the value of the assignedSibling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedSibling() {
        if (assignedSibling == null) {
            return false;
        } else {
            return assignedSibling;
        }
    }

    /**
     * Sets the value of the assignedSibling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedSibling(Boolean value) {
        this.assignedSibling = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBanner() {
        if (banner == null) {
            return false;
        } else {
            return banner;
        }
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanner(Boolean value) {
        this.banner = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCategories() {
        if (categories == null) {
            return false;
        } else {
            return categories;
        }
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategories(Boolean value) {
        this.categories = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isComment() {
        if (comment == null) {
            return false;
        } else {
            return comment;
        }
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComment(Boolean value) {
        this.comment = value;
    }

    /**
     * Gets the value of the commonAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommonAttachments() {
        if (commonAttachments == null) {
            return false;
        } else {
            return commonAttachments;
        }
    }

    /**
     * Sets the value of the commonAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonAttachments(Boolean value) {
        this.commonAttachments = value;
    }

    /**
     * Gets the value of the commonComment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommonComment() {
        if (commonComment == null) {
            return false;
        } else {
            return commonComment;
        }
    }

    /**
     * Sets the value of the commonComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonComment(Boolean value) {
        this.commonComment = value;
    }

    /**
     * Gets the value of the expiresDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExpiresDate() {
        if (expiresDate == null) {
            return false;
        } else {
            return expiresDate;
        }
    }

    /**
     * Sets the value of the expiresDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiresDate(Boolean value) {
        this.expiresDate = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeywords() {
        if (keywords == null) {
            return false;
        } else {
            return keywords;
        }
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeywords(Boolean value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLinks() {
        if (links == null) {
            return false;
        } else {
            return links;
        }
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinks(Boolean value) {
        this.links = value;
    }

    /**
     * Gets the value of the nextNotificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNextNotificationTime() {
        if (nextNotificationTime == null) {
            return false;
        } else {
            return nextNotificationTime;
        }
    }

    /**
     * Sets the value of the nextNotificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNextNotificationTime(Boolean value) {
        this.nextNotificationTime = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Gets the value of the originalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOriginalReferenceNumber() {
        if (originalReferenceNumber == null) {
            return false;
        } else {
            return originalReferenceNumber;
        }
    }

    /**
     * Sets the value of the originalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalReferenceNumber(Boolean value) {
        this.originalReferenceNumber = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProducts() {
        if (products == null) {
            return false;
        } else {
            return products;
        }
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducts(Boolean value) {
        this.products = value;
    }

    /**
     * Gets the value of the publishOnDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPublishOnDate() {
        if (publishOnDate == null) {
            return false;
        } else {
            return publishOnDate;
        }
    }

    /**
     * Sets the value of the publishOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishOnDate(Boolean value) {
        this.publishOnDate = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuestion() {
        if (question == null) {
            return false;
        } else {
            return question;
        }
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuestion(Boolean value) {
        this.question = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolution() {
        if (solution == null) {
            return false;
        } else {
            return solution;
        }
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolution(Boolean value) {
        this.solution = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isURL() {
        if (url == null) {
            return false;
        } else {
            return url;
        }
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setURL(Boolean value) {
        this.url = value;
    }

}
