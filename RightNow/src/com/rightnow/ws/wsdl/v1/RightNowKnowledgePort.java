
package com.rightnow.ws.wsdl.v1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.rightnow.ws.base.v1.NamedID;
import com.rightnow.ws.base.v1.RNObject;
import com.rightnow.ws.knowledge.v1.Content;
import com.rightnow.ws.knowledge.v1.ContentFilterList;
import com.rightnow.ws.knowledge.v1.ContentListResponse;
import com.rightnow.ws.knowledge.v1.ContentRate;
import com.rightnow.ws.knowledge.v1.ContentRequestStatus;
import com.rightnow.ws.knowledge.v1.ContentSearch;
import com.rightnow.ws.knowledge.v1.ContentSearchOrigin;
import com.rightnow.ws.knowledge.v1.ContentSecurityOptions;
import com.rightnow.ws.knowledge.v1.ContentSortOptions;
import com.rightnow.ws.knowledge.v1.ContentViewOrigin;
import com.rightnow.ws.knowledge.v1.KeyValueItemList;
import com.rightnow.ws.knowledge.v1.SearchResponse;
import com.rightnow.ws.knowledge.v1.SmartAssistantResolution;
import com.rightnow.ws.knowledge.v1.SmartAssistantSuggestionsResponse;
import com.rightnow.ws.messages.v1.ClientInfoHeader;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RightNowKnowledgePort", targetNamespace = "urn:wsdl.ws.rightnow.com/v1")
@XmlSeeAlso({
    com.rightnow.ws.base.v1.ObjectFactory.class,
    com.rightnow.ws.faults.v1.ObjectFactory.class,
    com.rightnow.ws.knowledge.v1.ObjectFactory.class,
    com.rightnow.ws.messages.v1.ObjectFactory.class,
    com.rightnow.ws.nullfields.v1.ObjectFactory.class,
    com.rightnow.ws.objects.v1.ObjectFactory.class
})
public interface RightNowKnowledgePort {


    /**
     * 
     * @param userAgent
     * @param referrerURL
     * @param userIPAddress
     * @param appIdentifier
     * @param requestHeader
     * @return
     *     returns java.lang.String
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "StartInteraction", action = "StartInteraction")
    @WebResult(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "StartInteraction", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.StartInteractionMsg")
    @ResponseWrapper(localName = "StartInteractionResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.StartInteractionResponseMsg")
    public String startInteraction(
        @WebParam(name = "AppIdentifier", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String appIdentifier,
        @WebParam(name = "UserIPAddress", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String userIPAddress,
        @WebParam(name = "ReferrerURL", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String referrerURL,
        @WebParam(name = "UserAgent", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String userAgent,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param limit
     * @param sessionToken
     * @param contentSearch
     * @param sortOptions
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentListResponse
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetPopularContent", action = "GetPopularContent")
    @WebResult(name = "ContentListResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetPopularContent", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetPopularContentMsg")
    @ResponseWrapper(localName = "GetPopularContentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetPopularContentResponseMsg")
    public ContentListResponse getPopularContent(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "ContentSearch", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSearch contentSearch,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer limit,
        @WebParam(name = "SortOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSortOptions sortOptions,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param limit
     * @param body
     * @param sessionToken
     * @param contentSearch
     * @param subject
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentListResponse
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetSmartAssistantSearch", action = "GetSmartAssistantSearch")
    @WebResult(name = "ContentListResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetSmartAssistantSearch", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetSmartAssistantSearchMsg")
    @ResponseWrapper(localName = "GetSmartAssistantSearchResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetSmartAssistantSearchResponseMsg")
    public ContentListResponse getSmartAssistantSearch(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "Body", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String body,
        @WebParam(name = "Subject", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String subject,
        @WebParam(name = "ContentSearch", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSearch contentSearch,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer limit,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param limit
     * @param content
     * @param sessionToken
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentListResponse
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetRecommendedContent", action = "GetRecommendedContent")
    @WebResult(name = "ContentListResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetRecommendedContent", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetRecommendedContentMsg")
    @ResponseWrapper(localName = "GetRecommendedContentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetRecommendedContentResponseMsg")
    public ContentListResponse getRecommendedContent(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "Content", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Content content,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer limit,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param limit
     * @param sessionToken
     * @param securityOptions
     * @param includeSpellingSuggestions
     * @param searchTerms
     * @param start
     * @param sortOptions
     * @param origin
     * @param requestHeader
     * @param includeRelatedSearches
     * @param filters
     * @return
     *     returns com.rightnow.ws.knowledge.v1.SearchResponse
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "SearchContent", action = "SearchContent")
    @WebResult(name = "SearchResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "SearchContent", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.SearchContentMsg")
    @ResponseWrapper(localName = "SearchContentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.SearchContentResponseMsg")
    public SearchResponse searchContent(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "SearchTerms", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String searchTerms,
        @WebParam(name = "Filters", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentFilterList filters,
        @WebParam(name = "IncludeRelatedSearches", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Boolean includeRelatedSearches,
        @WebParam(name = "IncludeSpellingSuggestions", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Boolean includeSpellingSuggestions,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer limit,
        @WebParam(name = "Origin", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSearchOrigin origin,
        @WebParam(name = "SecurityOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSecurityOptions securityOptions,
        @WebParam(name = "SortOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSortOptions sortOptions,
        @WebParam(name = "Start", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer start,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param sessionToken
     * @param securityOptions
     * @param contentTemplate
     * @param viewOrigin
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.Content
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetContent", action = "GetContent")
    @WebResult(name = "Content", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetContent", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetContentMsg")
    @ResponseWrapper(localName = "GetContentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetContentResponseMsg")
    public Content getContent(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "ContentTemplate", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Content contentTemplate,
        @WebParam(name = "SecurityOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSecurityOptions securityOptions,
        @WebParam(name = "ViewOrigin", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentViewOrigin viewOrigin,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param content
     * @param sessionToken
     * @param viewOrigin
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentRequestStatus
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "MarkContentAsViewed", action = "MarkContentAsViewed")
    @WebResult(name = "ContentRequestStatus", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "MarkContentAsViewed", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.MarkContentAsViewedMsg")
    @ResponseWrapper(localName = "MarkContentAsViewedResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.MarkContentAsViewedResponseMsg")
    public ContentRequestStatus markContentAsViewed(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "Content", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Content content,
        @WebParam(name = "ViewOrigin", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentViewOrigin viewOrigin,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param content
     * @param scale
     * @param sessionToken
     * @param rate
     * @param requestHeader
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentRequestStatus
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "RateContent", action = "RateContent")
    @WebResult(name = "ContentRequestStatus", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "RateContent", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.RateContentMsg")
    @ResponseWrapper(localName = "RateContentResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.RateContentResponseMsg")
    public ContentRequestStatus rateContent(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "Content", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Content content,
        @WebParam(name = "Rate", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentRate rate,
        @WebParam(name = "Scale", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentRate scale,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param packageName
     * @param requestHeader
     * @param fieldName
     * @return
     *     returns java.util.List<com.rightnow.ws.base.v1.NamedID>
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetValuesForNamedID", action = "GetValuesForNamedID")
    @WebResult(name = "Entry", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetValuesForNamedID", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetValuesForNamedIDMsg")
    @ResponseWrapper(localName = "GetValuesForNamedIDResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetValuesForNamedIDResponseMsg")
    public List<NamedID> getValuesForNamedID(
        @WebParam(name = "PackageName", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String packageName,
        @WebParam(name = "FieldName", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String fieldName,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param limit
     * @param sessionToken
     * @param contentSearch
     * @param requestHeader
     * @param keyValueItems
     * @return
     *     returns com.rightnow.ws.knowledge.v1.SmartAssistantSuggestionsResponse
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "GetSmartAssistantSuggestions", action = "GetSmartAssistantSuggestions")
    @WebResult(name = "SmartAssistantSuggestionsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "GetSmartAssistantSuggestions", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetSmartAssistantSuggestionsMsg")
    @ResponseWrapper(localName = "GetSmartAssistantSuggestionsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.GetSmartAssistantSuggestionsResponseMsg")
    public SmartAssistantSuggestionsResponse getSmartAssistantSuggestions(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "ContentSearch", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        ContentSearch contentSearch,
        @WebParam(name = "KeyValueItems", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        KeyValueItemList keyValueItems,
        @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        Integer limit,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

    /**
     * 
     * @param smartAssistantToken
     * @param sessionToken
     * @param requestHeader
     * @param escalationObject
     * @param resolution
     * @return
     *     returns com.rightnow.ws.knowledge.v1.ContentRequestStatus
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    @WebMethod(operationName = "RegisterSmartAssistantResolution", action = "RegisterSmartAssistantResolution")
    @WebResult(name = "ContentRequestStatus", targetNamespace = "urn:messages.ws.rightnow.com/v1")
    @RequestWrapper(localName = "RegisterSmartAssistantResolution", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.RegisterSmartAssistantResolutionMsg")
    @ResponseWrapper(localName = "RegisterSmartAssistantResolutionResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1", className = "com.rightnow.ws.messages.v1.RegisterSmartAssistantResolutionResponseMsg")
    public ContentRequestStatus registerSmartAssistantResolution(
        @WebParam(name = "SessionToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String sessionToken,
        @WebParam(name = "SmartAssistantToken", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        String smartAssistantToken,
        @WebParam(name = "Resolution", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        SmartAssistantResolution resolution,
        @WebParam(name = "EscalationObject", targetNamespace = "urn:messages.ws.rightnow.com/v1")
        RNObject escalationObject,
        @WebParam(name = "ClientInfoHeader", targetNamespace = "urn:messages.ws.rightnow.com/v1", header = true, partName = "request_header")
        ClientInfoHeader requestHeader)
        throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault
    ;

}
