
package com.rightnow.ws.knowledge.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rightnow.ws.base.v1.NamedID;
import com.rightnow.ws.base.v1.NamedIDHierarchyList;
import com.rightnow.ws.nullfields.v1.AnswerContentNullFields;
import com.rightnow.ws.nullfields.v1.ContentListResponseNullFields;
import com.rightnow.ws.nullfields.v1.ContentSearchNullFields;
import com.rightnow.ws.nullfields.v1.KnowledgeStandardContentContentValueNullFields;
import com.rightnow.ws.nullfields.v1.SmartAssistantSuggestionsResponseNullFields;
import com.rightnow.ws.nullfields.v1.StandardContentContentNullFields;
import com.rightnow.ws.objects.v1.FileAttachmentAnswerList;
import com.rightnow.ws.objects.v1.FileAttachmentSharedList;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.knowledge.v1 package. 
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

    private final static QName _KeyValueItem_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KeyValueItem");
    private final static QName _ContentRate_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentRate");
    private final static QName _ContentRequestStatus_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentRequestStatus");
    private final static QName _IncidentContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "IncidentContent");
    private final static QName _SummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContent");
    private final static QName _AnswerContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AnswerContent");
    private final static QName _ContentSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearch");
    private final static QName _ServiceProductContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ServiceProductContentFilter");
    private final static QName _Content_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Content");
    private final static QName _SummaryContentList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContentList");
    private final static QName _SearchResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SearchResponse");
    private final static QName _StandardContentContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "StandardContentContent");
    private final static QName _SmartAssistantContentSearch_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantContentSearch");
    private final static QName _ContentSortOptions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSortOptions");
    private final static QName _KnowledgeStandardContentContentValue_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KnowledgeStandardContentContentValue");
    private final static QName _ContentListResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentListResponse");
    private final static QName _KnowledgeStandardContentContentValueList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KnowledgeStandardContentContentValueList");
    private final static QName _AnswerSummaryContent_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "AnswerSummaryContent");
    private final static QName _ContentFilterList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentFilterList");
    private final static QName _ContentSearchOrigin_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSearchOrigin");
    private final static QName _ContentViewOrigin_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentViewOrigin");
    private final static QName _ContentSecurityOptions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentSecurityOptions");
    private final static QName _ContentList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentList");
    private final static QName _KeyValueItemList_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "KeyValueItemList");
    private final static QName _SmartAssistantResolution_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantResolution");
    private final static QName _ContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentFilter");
    private final static QName _ServiceCategoryContentFilter_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ServiceCategoryContentFilter");
    private final static QName _SmartAssistantSuggestionsResponse_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SmartAssistantSuggestionsResponse");
    private final static QName _StandardContentContentContentValues_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ContentValues");
    private final static QName _StandardContentContentValidNullFields_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "ValidNullFields");
    private final static QName _AnswerContentFileAttachments_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "FileAttachments");
    private final static QName _AnswerContentURL_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "URL");
    private final static QName _AnswerContentSolution_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Solution");
    private final static QName _AnswerContentKeywords_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Keywords");
    private final static QName _AnswerContentCategories_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Categories");
    private final static QName _AnswerContentGuidedAssistance_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "GuidedAssistance");
    private final static QName _AnswerContentProducts_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Products");
    private final static QName _AnswerContentQuestion_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Question");
    private final static QName _AnswerContentCommonAttachments_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "CommonAttachments");
    private final static QName _ContentListResponseSummaryContents_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "SummaryContents");
    private final static QName _ContentSearchFilters_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Filters");
    private final static QName _KnowledgeStandardContentContentValueValue_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Value");
    private final static QName _SmartAssistantSuggestionsResponseSuggestions_QNAME = new QName("urn:knowledge.ws.rightnow.com/v1", "Suggestions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.knowledge.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestionsResponse }
     * 
     */
    public SmartAssistantSuggestionsResponse createSmartAssistantSuggestionsResponse() {
        return new SmartAssistantSuggestionsResponse();
    }

    /**
     * Create an instance of {@link ServiceCategoryContentFilter }
     * 
     */
    public ServiceCategoryContentFilter createServiceCategoryContentFilter() {
        return new ServiceCategoryContentFilter();
    }

    /**
     * Create an instance of {@link ContentFilter }
     * 
     */
    public ContentFilter createContentFilter() {
        return new ContentFilter();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ContentList }
     * 
     */
    public ContentList createContentList() {
        return new ContentList();
    }

    /**
     * Create an instance of {@link KeyValueItemList }
     * 
     */
    public KeyValueItemList createKeyValueItemList() {
        return new KeyValueItemList();
    }

    /**
     * Create an instance of {@link SmartAssistantResolution }
     * 
     */
    public SmartAssistantResolution createSmartAssistantResolution() {
        return new SmartAssistantResolution();
    }

    /**
     * Create an instance of {@link ContentViewOrigin }
     * 
     */
    public ContentViewOrigin createContentViewOrigin() {
        return new ContentViewOrigin();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link ContentSecurityOptions }
     * 
     */
    public ContentSecurityOptions createContentSecurityOptions() {
        return new ContentSecurityOptions();
    }

    /**
     * Create an instance of {@link SummaryContentList }
     * 
     */
    public SummaryContentList createSummaryContentList() {
        return new SummaryContentList();
    }

    /**
     * Create an instance of {@link ContentSearch }
     * 
     */
    public ContentSearch createContentSearch() {
        return new ContentSearch();
    }

    /**
     * Create an instance of {@link ServiceProductContentFilter }
     * 
     */
    public ServiceProductContentFilter createServiceProductContentFilter() {
        return new ServiceProductContentFilter();
    }

    /**
     * Create an instance of {@link ContentListResponse }
     * 
     */
    public ContentListResponse createContentListResponse() {
        return new ContentListResponse();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValue }
     * 
     */
    public KnowledgeStandardContentContentValue createKnowledgeStandardContentContentValue() {
        return new KnowledgeStandardContentContentValue();
    }

    /**
     * Create an instance of {@link AnswerContent }
     * 
     */
    public AnswerContent createAnswerContent() {
        return new AnswerContent();
    }

    /**
     * Create an instance of {@link ContentFilterList }
     * 
     */
    public ContentFilterList createContentFilterList() {
        return new ContentFilterList();
    }

    /**
     * Create an instance of {@link AnswerSummaryContent }
     * 
     */
    public AnswerSummaryContent createAnswerSummaryContent() {
        return new AnswerSummaryContent();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValueList }
     * 
     */
    public KnowledgeStandardContentContentValueList createKnowledgeStandardContentContentValueList() {
        return new KnowledgeStandardContentContentValueList();
    }

    /**
     * Create an instance of {@link ContentSearchOrigin }
     * 
     */
    public ContentSearchOrigin createContentSearchOrigin() {
        return new ContentSearchOrigin();
    }

    /**
     * Create an instance of {@link ContentRequestStatus }
     * 
     */
    public ContentRequestStatus createContentRequestStatus() {
        return new ContentRequestStatus();
    }

    /**
     * Create an instance of {@link IncidentContent }
     * 
     */
    public IncidentContent createIncidentContent() {
        return new IncidentContent();
    }

    /**
     * Create an instance of {@link SmartAssistantContentSearch }
     * 
     */
    public SmartAssistantContentSearch createSmartAssistantContentSearch() {
        return new SmartAssistantContentSearch();
    }

    /**
     * Create an instance of {@link SummaryContent }
     * 
     */
    public SummaryContent createSummaryContent() {
        return new SummaryContent();
    }

    /**
     * Create an instance of {@link ContentSortOptions }
     * 
     */
    public ContentSortOptions createContentSortOptions() {
        return new ContentSortOptions();
    }

    /**
     * Create an instance of {@link ContentRate }
     * 
     */
    public ContentRate createContentRate() {
        return new ContentRate();
    }

    /**
     * Create an instance of {@link KeyValueItem }
     * 
     */
    public KeyValueItem createKeyValueItem() {
        return new KeyValueItem();
    }

    /**
     * Create an instance of {@link StandardContentContent }
     * 
     */
    public StandardContentContent createStandardContentContent() {
        return new StandardContentContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KeyValueItem")
    public JAXBElement<KeyValueItem> createKeyValueItem(KeyValueItem value) {
        return new JAXBElement<KeyValueItem>(_KeyValueItem_QNAME, KeyValueItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentRate")
    public JAXBElement<ContentRate> createContentRate(ContentRate value) {
        return new JAXBElement<ContentRate>(_ContentRate_QNAME, ContentRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentRequestStatus")
    public JAXBElement<ContentRequestStatus> createContentRequestStatus(ContentRequestStatus value) {
        return new JAXBElement<ContentRequestStatus>(_ContentRequestStatus_QNAME, ContentRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "IncidentContent")
    public JAXBElement<IncidentContent> createIncidentContent(IncidentContent value) {
        return new JAXBElement<IncidentContent>(_IncidentContent_QNAME, IncidentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContent")
    public JAXBElement<SummaryContent> createSummaryContent(SummaryContent value) {
        return new JAXBElement<SummaryContent>(_SummaryContent_QNAME, SummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AnswerContent")
    public JAXBElement<AnswerContent> createAnswerContent(AnswerContent value) {
        return new JAXBElement<AnswerContent>(_AnswerContent_QNAME, AnswerContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearch")
    public JAXBElement<ContentSearch> createContentSearch(ContentSearch value) {
        return new JAXBElement<ContentSearch>(_ContentSearch_QNAME, ContentSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ServiceProductContentFilter")
    public JAXBElement<ServiceProductContentFilter> createServiceProductContentFilter(ServiceProductContentFilter value) {
        return new JAXBElement<ServiceProductContentFilter>(_ServiceProductContentFilter_QNAME, ServiceProductContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Content }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Content")
    public JAXBElement<Content> createContent(Content value) {
        return new JAXBElement<Content>(_Content_QNAME, Content.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContentList")
    public JAXBElement<SummaryContentList> createSummaryContentList(SummaryContentList value) {
        return new JAXBElement<SummaryContentList>(_SummaryContentList_QNAME, SummaryContentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SearchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "StandardContentContent")
    public JAXBElement<StandardContentContent> createStandardContentContent(StandardContentContent value) {
        return new JAXBElement<StandardContentContent>(_StandardContentContent_QNAME, StandardContentContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantContentSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantContentSearch")
    public JAXBElement<SmartAssistantContentSearch> createSmartAssistantContentSearch(SmartAssistantContentSearch value) {
        return new JAXBElement<SmartAssistantContentSearch>(_SmartAssistantContentSearch_QNAME, SmartAssistantContentSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSortOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSortOptions")
    public JAXBElement<ContentSortOptions> createContentSortOptions(ContentSortOptions value) {
        return new JAXBElement<ContentSortOptions>(_ContentSortOptions_QNAME, ContentSortOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValue")
    public JAXBElement<KnowledgeStandardContentContentValue> createKnowledgeStandardContentContentValue(KnowledgeStandardContentContentValue value) {
        return new JAXBElement<KnowledgeStandardContentContentValue>(_KnowledgeStandardContentContentValue_QNAME, KnowledgeStandardContentContentValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentListResponse")
    public JAXBElement<ContentListResponse> createContentListResponse(ContentListResponse value) {
        return new JAXBElement<ContentListResponse>(_ContentListResponse_QNAME, ContentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValueList")
    public JAXBElement<KnowledgeStandardContentContentValueList> createKnowledgeStandardContentContentValueList(KnowledgeStandardContentContentValueList value) {
        return new JAXBElement<KnowledgeStandardContentContentValueList>(_KnowledgeStandardContentContentValueList_QNAME, KnowledgeStandardContentContentValueList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerSummaryContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "AnswerSummaryContent")
    public JAXBElement<AnswerSummaryContent> createAnswerSummaryContent(AnswerSummaryContent value) {
        return new JAXBElement<AnswerSummaryContent>(_AnswerSummaryContent_QNAME, AnswerSummaryContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentFilterList")
    public JAXBElement<ContentFilterList> createContentFilterList(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentFilterList_QNAME, ContentFilterList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchOrigin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSearchOrigin")
    public JAXBElement<ContentSearchOrigin> createContentSearchOrigin(ContentSearchOrigin value) {
        return new JAXBElement<ContentSearchOrigin>(_ContentSearchOrigin_QNAME, ContentSearchOrigin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentViewOrigin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentViewOrigin")
    public JAXBElement<ContentViewOrigin> createContentViewOrigin(ContentViewOrigin value) {
        return new JAXBElement<ContentViewOrigin>(_ContentViewOrigin_QNAME, ContentViewOrigin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSecurityOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentSecurityOptions")
    public JAXBElement<ContentSecurityOptions> createContentSecurityOptions(ContentSecurityOptions value) {
        return new JAXBElement<ContentSecurityOptions>(_ContentSecurityOptions_QNAME, ContentSecurityOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentList")
    public JAXBElement<ContentList> createContentList(ContentList value) {
        return new JAXBElement<ContentList>(_ContentList_QNAME, ContentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "KeyValueItemList")
    public JAXBElement<KeyValueItemList> createKeyValueItemList(KeyValueItemList value) {
        return new JAXBElement<KeyValueItemList>(_KeyValueItemList_QNAME, KeyValueItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantResolution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantResolution")
    public JAXBElement<SmartAssistantResolution> createSmartAssistantResolution(SmartAssistantResolution value) {
        return new JAXBElement<SmartAssistantResolution>(_SmartAssistantResolution_QNAME, SmartAssistantResolution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentFilter")
    public JAXBElement<ContentFilter> createContentFilter(ContentFilter value) {
        return new JAXBElement<ContentFilter>(_ContentFilter_QNAME, ContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryContentFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ServiceCategoryContentFilter")
    public JAXBElement<ServiceCategoryContentFilter> createServiceCategoryContentFilter(ServiceCategoryContentFilter value) {
        return new JAXBElement<ServiceCategoryContentFilter>(_ServiceCategoryContentFilter_QNAME, ServiceCategoryContentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SmartAssistantSuggestionsResponse")
    public JAXBElement<SmartAssistantSuggestionsResponse> createSmartAssistantSuggestionsResponse(SmartAssistantSuggestionsResponse value) {
        return new JAXBElement<SmartAssistantSuggestionsResponse>(_SmartAssistantSuggestionsResponse_QNAME, SmartAssistantSuggestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ContentValues", scope = StandardContentContent.class)
    public JAXBElement<KnowledgeStandardContentContentValueList> createStandardContentContentContentValues(KnowledgeStandardContentContentValueList value) {
        return new JAXBElement<KnowledgeStandardContentContentValueList>(_StandardContentContentContentValues_QNAME, KnowledgeStandardContentContentValueList.class, StandardContentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = StandardContentContent.class)
    public JAXBElement<StandardContentContentNullFields> createStandardContentContentValidNullFields(StandardContentContentNullFields value) {
        return new JAXBElement<StandardContentContentNullFields>(_StandardContentContentValidNullFields_QNAME, StandardContentContentNullFields.class, StandardContentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "FileAttachments", scope = AnswerContent.class)
    public JAXBElement<FileAttachmentAnswerList> createAnswerContentFileAttachments(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_AnswerContentFileAttachments_QNAME, FileAttachmentAnswerList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "URL", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentURL(String value) {
        return new JAXBElement<String>(_AnswerContentURL_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Solution", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentSolution(String value) {
        return new JAXBElement<String>(_AnswerContentSolution_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Keywords", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentKeywords(String value) {
        return new JAXBElement<String>(_AnswerContentKeywords_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Categories", scope = AnswerContent.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerContentCategories(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerContentCategories_QNAME, NamedIDHierarchyList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "GuidedAssistance", scope = AnswerContent.class)
    public JAXBElement<NamedID> createAnswerContentGuidedAssistance(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerContentGuidedAssistance_QNAME, NamedID.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Products", scope = AnswerContent.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerContentProducts(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerContentProducts_QNAME, NamedIDHierarchyList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = AnswerContent.class)
    public JAXBElement<AnswerContentNullFields> createAnswerContentValidNullFields(AnswerContentNullFields value) {
        return new JAXBElement<AnswerContentNullFields>(_StandardContentContentValidNullFields_QNAME, AnswerContentNullFields.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Question", scope = AnswerContent.class)
    public JAXBElement<String> createAnswerContentQuestion(String value) {
        return new JAXBElement<String>(_AnswerContentQuestion_QNAME, String.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "CommonAttachments", scope = AnswerContent.class)
    public JAXBElement<FileAttachmentSharedList> createAnswerContentCommonAttachments(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_AnswerContentCommonAttachments_QNAME, FileAttachmentSharedList.class, AnswerContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "SummaryContents", scope = ContentListResponse.class)
    public JAXBElement<SummaryContentList> createContentListResponseSummaryContents(SummaryContentList value) {
        return new JAXBElement<SummaryContentList>(_ContentListResponseSummaryContents_QNAME, SummaryContentList.class, ContentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentListResponse.class)
    public JAXBElement<ContentListResponseNullFields> createContentListResponseValidNullFields(ContentListResponseNullFields value) {
        return new JAXBElement<ContentListResponseNullFields>(_StandardContentContentValidNullFields_QNAME, ContentListResponseNullFields.class, ContentListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentFilterList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Filters", scope = ContentSearch.class)
    public JAXBElement<ContentFilterList> createContentSearchFilters(ContentFilterList value) {
        return new JAXBElement<ContentFilterList>(_ContentSearchFilters_QNAME, ContentFilterList.class, ContentSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = ContentSearch.class)
    public JAXBElement<ContentSearchNullFields> createContentSearchValidNullFields(ContentSearchNullFields value) {
        return new JAXBElement<ContentSearchNullFields>(_StandardContentContentValidNullFields_QNAME, ContentSearchNullFields.class, ContentSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Value", scope = KnowledgeStandardContentContentValue.class)
    public JAXBElement<String> createKnowledgeStandardContentContentValueValue(String value) {
        return new JAXBElement<String>(_KnowledgeStandardContentContentValueValue_QNAME, String.class, KnowledgeStandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = KnowledgeStandardContentContentValue.class)
    public JAXBElement<KnowledgeStandardContentContentValueNullFields> createKnowledgeStandardContentContentValueValidNullFields(KnowledgeStandardContentContentValueNullFields value) {
        return new JAXBElement<KnowledgeStandardContentContentValueNullFields>(_StandardContentContentValidNullFields_QNAME, KnowledgeStandardContentContentValueNullFields.class, KnowledgeStandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "Suggestions", scope = SmartAssistantSuggestionsResponse.class)
    public JAXBElement<ContentList> createSmartAssistantSuggestionsResponseSuggestions(ContentList value) {
        return new JAXBElement<ContentList>(_SmartAssistantSuggestionsResponseSuggestions_QNAME, ContentList.class, SmartAssistantSuggestionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:knowledge.ws.rightnow.com/v1", name = "ValidNullFields", scope = SmartAssistantSuggestionsResponse.class)
    public JAXBElement<SmartAssistantSuggestionsResponseNullFields> createSmartAssistantSuggestionsResponseValidNullFields(SmartAssistantSuggestionsResponseNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsResponseNullFields>(_StandardContentContentValidNullFields_QNAME, SmartAssistantSuggestionsResponseNullFields.class, SmartAssistantSuggestionsResponse.class, value);
    }

}
