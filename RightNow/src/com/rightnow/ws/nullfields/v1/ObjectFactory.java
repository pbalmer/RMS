
package com.rightnow.ws.nullfields.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.nullfields.v1 package. 
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

    private final static QName _ContentSearchNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentSearchNullFields");
    private final static QName _StandardContentContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "StandardContentContentNullFields");
    private final static QName _AnswerContentNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "AnswerContentNullFields");
    private final static QName _ContentListResponseNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "ContentListResponseNullFields");
    private final static QName _KnowledgeStandardContentContentValueNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "KnowledgeStandardContentContentValueNullFields");
    private final static QName _SmartAssistantSuggestionsResponseNullFields_QNAME = new QName("urn:nullfields.ws.rightnow.com/v1", "SmartAssistantSuggestionsResponseNullFields");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.nullfields.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentSearchNullFields }
     * 
     */
    public ContentSearchNullFields createContentSearchNullFields() {
        return new ContentSearchNullFields();
    }

    /**
     * Create an instance of {@link AnswerContentNullFields }
     * 
     */
    public AnswerContentNullFields createAnswerContentNullFields() {
        return new AnswerContentNullFields();
    }

    /**
     * Create an instance of {@link ContentListResponseNullFields }
     * 
     */
    public ContentListResponseNullFields createContentListResponseNullFields() {
        return new ContentListResponseNullFields();
    }

    /**
     * Create an instance of {@link KnowledgeStandardContentContentValueNullFields }
     * 
     */
    public KnowledgeStandardContentContentValueNullFields createKnowledgeStandardContentContentValueNullFields() {
        return new KnowledgeStandardContentContentValueNullFields();
    }

    /**
     * Create an instance of {@link StandardContentContentNullFields }
     * 
     */
    public StandardContentContentNullFields createStandardContentContentNullFields() {
        return new StandardContentContentNullFields();
    }

    /**
     * Create an instance of {@link SmartAssistantSuggestionsResponseNullFields }
     * 
     */
    public SmartAssistantSuggestionsResponseNullFields createSmartAssistantSuggestionsResponseNullFields() {
        return new SmartAssistantSuggestionsResponseNullFields();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentSearchNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentSearchNullFields")
    public JAXBElement<ContentSearchNullFields> createContentSearchNullFields(ContentSearchNullFields value) {
        return new JAXBElement<ContentSearchNullFields>(_ContentSearchNullFields_QNAME, ContentSearchNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "StandardContentContentNullFields")
    public JAXBElement<StandardContentContentNullFields> createStandardContentContentNullFields(StandardContentContentNullFields value) {
        return new JAXBElement<StandardContentContentNullFields>(_StandardContentContentNullFields_QNAME, StandardContentContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "AnswerContentNullFields")
    public JAXBElement<AnswerContentNullFields> createAnswerContentNullFields(AnswerContentNullFields value) {
        return new JAXBElement<AnswerContentNullFields>(_AnswerContentNullFields_QNAME, AnswerContentNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentListResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "ContentListResponseNullFields")
    public JAXBElement<ContentListResponseNullFields> createContentListResponseNullFields(ContentListResponseNullFields value) {
        return new JAXBElement<ContentListResponseNullFields>(_ContentListResponseNullFields_QNAME, ContentListResponseNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeStandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "KnowledgeStandardContentContentValueNullFields")
    public JAXBElement<KnowledgeStandardContentContentValueNullFields> createKnowledgeStandardContentContentValueNullFields(KnowledgeStandardContentContentValueNullFields value) {
        return new JAXBElement<KnowledgeStandardContentContentValueNullFields>(_KnowledgeStandardContentContentValueNullFields_QNAME, KnowledgeStandardContentContentValueNullFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmartAssistantSuggestionsResponseNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nullfields.ws.rightnow.com/v1", name = "SmartAssistantSuggestionsResponseNullFields")
    public JAXBElement<SmartAssistantSuggestionsResponseNullFields> createSmartAssistantSuggestionsResponseNullFields(SmartAssistantSuggestionsResponseNullFields value) {
        return new JAXBElement<SmartAssistantSuggestionsResponseNullFields>(_SmartAssistantSuggestionsResponseNullFields_QNAME, SmartAssistantSuggestionsResponseNullFields.class, null, value);
    }

}
