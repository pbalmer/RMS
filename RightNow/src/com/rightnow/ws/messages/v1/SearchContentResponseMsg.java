
package com.rightnow.ws.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.knowledge.v1.SearchResponse;


/**
 * <p>Java class for SearchContentResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContentResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResponse" type="{urn:knowledge.ws.rightnow.com/v1}SearchResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchContentResponseMsg", propOrder = {
    "searchResponse"
})
public class SearchContentResponseMsg {

    @XmlElement(name = "SearchResponse", required = true)
    protected SearchResponse searchResponse;

    /**
     * Gets the value of the searchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse }
     *     
     */
    public SearchResponse getSearchResponse() {
        return searchResponse;
    }

    /**
     * Sets the value of the searchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse }
     *     
     */
    public void setSearchResponse(SearchResponse value) {
        this.searchResponse = value;
    }

}
