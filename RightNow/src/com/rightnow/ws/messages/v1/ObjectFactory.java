
package com.rightnow.ws.messages.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rightnow.ws.knowledge.v1.ContentFilterList;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.messages.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterSmartAssistantResolutionResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RegisterSmartAssistantResolutionResponse");
    private final static QName _MarkContentAsViewed_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "MarkContentAsViewed");
    private final static QName _GetPopularContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetPopularContent");
    private final static QName _RateContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RateContentResponse");
    private final static QName _GetContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetContentResponse");
    private final static QName _RateContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RateContent");
    private final static QName _GetPopularContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetPopularContentResponse");
    private final static QName _StartInteraction_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "StartInteraction");
    private final static QName _GetContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetContent");
    private final static QName _GetRecommendedContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetRecommendedContentResponse");
    private final static QName _StartInteractionResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "StartInteractionResponse");
    private final static QName _GetSmartAssistantSuggestionsResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestionsResponse");
    private final static QName _SearchContentResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchContentResponse");
    private final static QName _GetValuesForNamedID_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetValuesForNamedID");
    private final static QName _GetSmartAssistantSuggestions_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSuggestions");
    private final static QName _GetSmartAssistantSearchResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearchResponse");
    private final static QName _SearchContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "SearchContent");
    private final static QName _GetValuesForNamedIDResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetValuesForNamedIDResponse");
    private final static QName _MarkContentAsViewedResponse_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "MarkContentAsViewedResponse");
    private final static QName _RegisterSmartAssistantResolution_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "RegisterSmartAssistantResolution");
    private final static QName _GetSmartAssistantSearch_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetSmartAssistantSearch");
    private final static QName _GetRecommendedContent_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "GetRecommendedContent");
    private final static QName _SearchContentMsgFilters_QNAME = new QName("urn:messages.ws.rightnow.com/v1", "Filters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.messages.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartInteractionMsg }
     * 
     */
    public StartInteractionMsg createStartInteractionMsg() {
        return new StartInteractionMsg();
    }

    /**
     * Create an instance of {@link GetContentMsg }
     * 
     */
    public GetContentMsg createGetContentMsg() {
        return new GetContentMsg();
    }

    /**
     * Create an instance of {@link SearchContentMsg }
     * 
     */
    public SearchContentMsg createSearchContentMsg() {
        return new SearchContentMsg();
    }

    /**
     * Create an instance of {@link MarkContentAsViewedMsg }
     * 
     */
    public MarkContentAsViewedMsg createMarkContentAsViewedMsg() {
        return new MarkContentAsViewedMsg();
    }

    /**
     * Create an instance of {@link RegisterSmartAssistantResolutionResponseMsg }
     * 
     */
    public RegisterSmartAssistantResolutionResponseMsg createRegisterSmartAssistantResolutionResponseMsg() {
        return new RegisterSmartAssistantResolutionResponseMsg();
    }

    /**
     * Create an instance of {@link GetRecommendedContentResponseMsg }
     * 
     */
    public GetRecommendedContentResponseMsg createGetRecommendedContentResponseMsg() {
        return new GetRecommendedContentResponseMsg();
    }

    /**
     * Create an instance of {@link GetValuesForNamedIDResponseMsg }
     * 
     */
    public GetValuesForNamedIDResponseMsg createGetValuesForNamedIDResponseMsg() {
        return new GetValuesForNamedIDResponseMsg();
    }

    /**
     * Create an instance of {@link GetPopularContentMsg }
     * 
     */
    public GetPopularContentMsg createGetPopularContentMsg() {
        return new GetPopularContentMsg();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsResponseMsg }
     * 
     */
    public GetSmartAssistantSuggestionsResponseMsg createGetSmartAssistantSuggestionsResponseMsg() {
        return new GetSmartAssistantSuggestionsResponseMsg();
    }

    /**
     * Create an instance of {@link StartInteractionResponseMsg }
     * 
     */
    public StartInteractionResponseMsg createStartInteractionResponseMsg() {
        return new StartInteractionResponseMsg();
    }

    /**
     * Create an instance of {@link GetRecommendedContentMsg }
     * 
     */
    public GetRecommendedContentMsg createGetRecommendedContentMsg() {
        return new GetRecommendedContentMsg();
    }

    /**
     * Create an instance of {@link RegisterSmartAssistantResolutionMsg }
     * 
     */
    public RegisterSmartAssistantResolutionMsg createRegisterSmartAssistantResolutionMsg() {
        return new RegisterSmartAssistantResolutionMsg();
    }

    /**
     * Create an instance of {@link GetValuesForNamedIDMsg }
     * 
     */
    public GetValuesForNamedIDMsg createGetValuesForNamedIDMsg() {
        return new GetValuesForNamedIDMsg();
    }

    /**
     * Create an instance of {@link MarkContentAsViewedResponseMsg }
     * 
     */
    public MarkContentAsViewedResponseMsg createMarkContentAsViewedResponseMsg() {
        return new MarkContentAsViewedResponseMsg();
    }

    /**
     * Create an instance of {@link SearchContentResponseMsg }
     * 
     */
    public SearchContentResponseMsg createSearchContentResponseMsg() {
        return new SearchContentResponseMsg();
    }

    /**
     * Create an instance of {@link ClientInfoHeader }
     * 
     */
    public ClientInfoHeader createClientInfoHeader() {
        return new ClientInfoHeader();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSuggestionsMsg }
     * 
     */
    public GetSmartAssistantSuggestionsMsg createGetSmartAssistantSuggestionsMsg() {
        return new GetSmartAssistantSuggestionsMsg();
    }

    /**
     * Create an instance of {@link RateContentMsg }
     * 
     */
    public RateContentMsg createRateContentMsg() {
        return new RateContentMsg();
    }

    /**
     * Create an instance of {@link RateContentResponseMsg }
     * 
     */
    public RateContentResponseMsg createRateContentResponseMsg() {
        return new RateContentResponseMsg();
    }

    /**
     * Create an instance of {@link GetContentResponseMsg }
     * 
     */
    public GetContentResponseMsg createGetContentResponseMsg() {
        return new GetContentResponseMsg();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchMsg }
     * 
     */
    public GetSmartAssistantSearchMsg createGetSmartAssistantSearchMsg() {
        return new GetSmartAssistantSearchMsg();
    }

    /**
     * Create an instance of {@link GetSmartAssistantSearchResponseMsg }
     * 
     */
    public GetSmartAssistantSearchResponseMsg createGetSmartAssistantSearchResponseMsg() {
        return new GetSmartAssistantSearchResponseMsg();
    }

    /**
     * Create an instance of {@link GetPopularContentResponseMsg }
     * 
     */
    public GetPopularContentResponseMsg createGetPopularContentResponseMsg() {
        return new GetPopularContentResponseMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartAssistantResolutionResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RegisterSmartAssistantResolutionResponse")
    public JAXBElement<RegisterSmartAssistantResolutionResponseMsg> createRegisterSmartAssistantResolutionResponse(RegisterSmartAssistantResolutionResponseMsg value) {
        return new JAXBElement<RegisterSmartAssistantResolutionResponseMsg>(_RegisterSmartAssistantResolutionResponse_QNAME, RegisterSmartAssistantResolutionResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkContentAsViewedMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "MarkContentAsViewed")
    public JAXBElement<MarkContentAsViewedMsg> createMarkContentAsViewed(MarkContentAsViewedMsg value) {
        return new JAXBElement<MarkContentAsViewedMsg>(_MarkContentAsViewed_QNAME, MarkContentAsViewedMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopularContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetPopularContent")
    public JAXBElement<GetPopularContentMsg> createGetPopularContent(GetPopularContentMsg value) {
        return new JAXBElement<GetPopularContentMsg>(_GetPopularContent_QNAME, GetPopularContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RateContentResponse")
    public JAXBElement<RateContentResponseMsg> createRateContentResponse(RateContentResponseMsg value) {
        return new JAXBElement<RateContentResponseMsg>(_RateContentResponse_QNAME, RateContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetContentResponse")
    public JAXBElement<GetContentResponseMsg> createGetContentResponse(GetContentResponseMsg value) {
        return new JAXBElement<GetContentResponseMsg>(_GetContentResponse_QNAME, GetContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RateContent")
    public JAXBElement<RateContentMsg> createRateContent(RateContentMsg value) {
        return new JAXBElement<RateContentMsg>(_RateContent_QNAME, RateContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopularContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetPopularContentResponse")
    public JAXBElement<GetPopularContentResponseMsg> createGetPopularContentResponse(GetPopularContentResponseMsg value) {
        return new JAXBElement<GetPopularContentResponseMsg>(_GetPopularContentResponse_QNAME, GetPopularContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartInteractionMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "StartInteraction")
    public JAXBElement<StartInteractionMsg> createStartInteraction(StartInteractionMsg value) {
        return new JAXBElement<StartInteractionMsg>(_StartInteraction_QNAME, StartInteractionMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetContent")
    public JAXBElement<GetContentMsg> createGetContent(GetContentMsg value) {
        return new JAXBElement<GetContentMsg>(_GetContent_QNAME, GetContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetRecommendedContentResponse")
    public JAXBElement<GetRecommendedContentResponseMsg> createGetRecommendedContentResponse(GetRecommendedContentResponseMsg value) {
        return new JAXBElement<GetRecommendedContentResponseMsg>(_GetRecommendedContentResponse_QNAME, GetRecommendedContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartInteractionResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "StartInteractionResponse")
    public JAXBElement<StartInteractionResponseMsg> createStartInteractionResponse(StartInteractionResponseMsg value) {
        return new JAXBElement<StartInteractionResponseMsg>(_StartInteractionResponse_QNAME, StartInteractionResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestionsResponse")
    public JAXBElement<GetSmartAssistantSuggestionsResponseMsg> createGetSmartAssistantSuggestionsResponse(GetSmartAssistantSuggestionsResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsResponseMsg>(_GetSmartAssistantSuggestionsResponse_QNAME, GetSmartAssistantSuggestionsResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContentResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchContentResponse")
    public JAXBElement<SearchContentResponseMsg> createSearchContentResponse(SearchContentResponseMsg value) {
        return new JAXBElement<SearchContentResponseMsg>(_SearchContentResponse_QNAME, SearchContentResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuesForNamedIDMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetValuesForNamedID")
    public JAXBElement<GetValuesForNamedIDMsg> createGetValuesForNamedID(GetValuesForNamedIDMsg value) {
        return new JAXBElement<GetValuesForNamedIDMsg>(_GetValuesForNamedID_QNAME, GetValuesForNamedIDMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSuggestionsMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSuggestions")
    public JAXBElement<GetSmartAssistantSuggestionsMsg> createGetSmartAssistantSuggestions(GetSmartAssistantSuggestionsMsg value) {
        return new JAXBElement<GetSmartAssistantSuggestionsMsg>(_GetSmartAssistantSuggestions_QNAME, GetSmartAssistantSuggestionsMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearchResponse")
    public JAXBElement<GetSmartAssistantSearchResponseMsg> createGetSmartAssistantSearchResponse(GetSmartAssistantSearchResponseMsg value) {
        return new JAXBElement<GetSmartAssistantSearchResponseMsg>(_GetSmartAssistantSearchResponse_QNAME, GetSmartAssistantSearchResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "SearchContent")
    public JAXBElement<SearchContentMsg> createSearchContent(SearchContentMsg value) {
        return new JAXBElement<SearchContentMsg>(_SearchContent_QNAME, SearchContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuesForNamedIDResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetValuesForNamedIDResponse")
    public JAXBElement<GetValuesForNamedIDResponseMsg> createGetValuesForNamedIDResponse(GetValuesForNamedIDResponseMsg value) {
        return new JAXBElement<GetValuesForNamedIDResponseMsg>(_GetValuesForNamedIDResponse_QNAME, GetValuesForNamedIDResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkContentAsViewedResponseMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "MarkContentAsViewedResponse")
    public JAXBElement<MarkContentAsViewedResponseMsg> createMarkContentAsViewedResponse(MarkContentAsViewedResponseMsg value) {
        return new JAXBElement<MarkContentAsViewedResponseMsg>(_MarkContentAsViewedResponse_QNAME, MarkContentAsViewedResponseMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartAssistantResolutionMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "RegisterSmartAssistantResolution")
    public JAXBElement<RegisterSmartAssistantResolutionMsg> createRegisterSmartAssistantResolution(RegisterSmartAssistantResolutionMsg value) {
        return new JAXBElement<RegisterSmartAssistantResolutionMsg>(_RegisterSmartAssistantResolution_QNAME, RegisterSmartAssistantResolutionMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmartAssistantSearchMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetSmartAssistantSearch")
    public JAXBElement<GetSmartAssistantSearchMsg> createGetSmartAssistantSearch(GetSmartAssistantSearchMsg value) {
        return new JAXBElement<GetSmartAssistantSearchMsg>(_GetSmartAssistantSearch_QNAME, GetSmartAssistantSearchMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendedContentMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "GetRecommendedContent")
    public JAXBElement<GetRecommendedContentMsg> createGetRecommendedContent(GetRecommendedContentMsg value) {
        return new JAXBElement<GetRecommendedContentMsg>(_GetRecommendedContent_QNAME, GetRecommendedContentMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:messages.ws.rightnow.com/v1", name = "Filters", scope = SearchContentMsg.class)
    public JAXBElement<ContentFilterList> createSearchContentMsgFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_SearchContentMsgFilters_QNAME, ContentFilterList.class, SearchContentMsg.class, value);
    }

}
