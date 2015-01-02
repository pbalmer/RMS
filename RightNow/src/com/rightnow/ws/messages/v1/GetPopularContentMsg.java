
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.ContentSearch;
import com.rightnow.ws.knowledge.v1.ContentSortOptions;


/**
 * <p>Java class for GetPopularContentMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPopularContentMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContentSearch" type="{urn:knowledge.ws.rightnow.com/v1}ContentSearch" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SortOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSortOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPopularContentMsg", propOrder = {
    "sessionToken",
    "contentSearch",
    "limit",
    "sortOptions"
})
public class GetPopularContentMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "ContentSearch")
    protected ContentSearch contentSearch;
    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "SortOptions")
    protected ContentSortOptions sortOptions;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the contentSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSearch }
     *     
     */
    public ContentSearch getContentSearch() {
        return contentSearch;
    }

    /**
     * Sets the value of the contentSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSearch }
     *     
     */
    public void setContentSearch(ContentSearch value) {
        this.contentSearch = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSortOptions }
     *     
     */
    public ContentSortOptions getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSortOptions }
     *     
     */
    public void setSortOptions(ContentSortOptions value) {
        this.sortOptions = value;
    }

}
