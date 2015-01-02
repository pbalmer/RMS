
package com.rightnow.ws.messages.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.ContentFilterList;
import com.rightnow.ws.knowledge.v1.ContentSearchOrigin;
import com.rightnow.ws.knowledge.v1.ContentSecurityOptions;
import com.rightnow.ws.knowledge.v1.ContentSortOptions;


/**
 * <p>Java class for SearchContentMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContentMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchTerms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Filters" type="{urn:knowledge.ws.rightnow.com/v1}ContentFilterList" minOccurs="0"/>
 *         &lt;element name="IncludeRelatedSearches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeSpellingSuggestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Origin" type="{urn:knowledge.ws.rightnow.com/v1}ContentSearchOrigin" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSecurityOptions" minOccurs="0"/>
 *         &lt;element name="SortOptions" type="{urn:knowledge.ws.rightnow.com/v1}ContentSortOptions" minOccurs="0"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchContentMsg", propOrder = {
    "sessionToken",
    "searchTerms",
    "filters",
    "includeRelatedSearches",
    "includeSpellingSuggestions",
    "limit",
    "origin",
    "securityOptions",
    "sortOptions",
    "start"
})
public class SearchContentMsg {

    @XmlElement(name = "SessionToken", required = true)
    protected String sessionToken;
    @XmlElement(name = "SearchTerms", required = true)
    protected String searchTerms;
    @XmlElementRef(name = "Filters", namespace = "urn:messages.ws.rightnow.com/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilterList> filters;
    @XmlElement(name = "IncludeRelatedSearches")
    protected Boolean includeRelatedSearches;
    @XmlElement(name = "IncludeSpellingSuggestions")
    protected Boolean includeSpellingSuggestions;
    @XmlElement(name = "Limit")
    protected Integer limit;
    @XmlElement(name = "Origin")
    protected ContentSearchOrigin origin;
    @XmlElement(name = "SecurityOptions")
    protected ContentSecurityOptions securityOptions;
    @XmlElement(name = "SortOptions")
    protected ContentSortOptions sortOptions;
    @XmlElement(name = "Start")
    protected Integer start;

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
     * Gets the value of the searchTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}
     *     
     */
    public JAXBElement<ContentFilterList> getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}
     *     
     */
    public void setFilters(JAXBElement<ContentFilterList> value) {
        this.filters = value;
    }

    /**
     * Gets the value of the includeRelatedSearches property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRelatedSearches() {
        return includeRelatedSearches;
    }

    /**
     * Sets the value of the includeRelatedSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRelatedSearches(Boolean value) {
        this.includeRelatedSearches = value;
    }

    /**
     * Gets the value of the includeSpellingSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSpellingSuggestions() {
        return includeSpellingSuggestions;
    }

    /**
     * Sets the value of the includeSpellingSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSpellingSuggestions(Boolean value) {
        this.includeSpellingSuggestions = value;
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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSearchOrigin }
     *     
     */
    public ContentSearchOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSearchOrigin }
     *     
     */
    public void setOrigin(ContentSearchOrigin value) {
        this.origin = value;
    }

    /**
     * Gets the value of the securityOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public ContentSecurityOptions getSecurityOptions() {
        return securityOptions;
    }

    /**
     * Sets the value of the securityOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSecurityOptions }
     *     
     */
    public void setSecurityOptions(ContentSecurityOptions value) {
        this.securityOptions = value;
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

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

}
