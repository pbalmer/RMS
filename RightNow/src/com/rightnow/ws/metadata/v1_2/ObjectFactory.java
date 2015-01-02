
package com.rightnow.ws.metadata.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.metadata.v1_2 package. 
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

    private final static QName _MetaDataRelationship_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_2", "MetaDataRelationship");
    private final static QName _MetaDataClass_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_2", "MetaDataClass");
    private final static QName _MetaDataAttribute_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_2", "MetaDataAttribute");
    private final static QName _MetaDataAttributeList_QNAME = new QName("urn:metadata.ws.rightnow.com/v1_2", "MetaDataAttributeList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.metadata.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetaDataAttributeList }
     * 
     */
    public MetaDataAttributeList createMetaDataAttributeList() {
        return new MetaDataAttributeList();
    }

    /**
     * Create an instance of {@link MetaDataAttribute }
     * 
     */
    public MetaDataAttribute createMetaDataAttribute() {
        return new MetaDataAttribute();
    }

    /**
     * Create an instance of {@link MetaDataRelationship }
     * 
     */
    public MetaDataRelationship createMetaDataRelationship() {
        return new MetaDataRelationship();
    }

    /**
     * Create an instance of {@link MetaDataClass }
     * 
     */
    public MetaDataClass createMetaDataClass() {
        return new MetaDataClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_2", name = "MetaDataRelationship")
    public JAXBElement<MetaDataRelationship> createMetaDataRelationship(MetaDataRelationship value) {
        return new JAXBElement<MetaDataRelationship>(_MetaDataRelationship_QNAME, MetaDataRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_2", name = "MetaDataClass")
    public JAXBElement<MetaDataClass> createMetaDataClass(MetaDataClass value) {
        return new JAXBElement<MetaDataClass>(_MetaDataClass_QNAME, MetaDataClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_2", name = "MetaDataAttribute")
    public JAXBElement<MetaDataAttribute> createMetaDataAttribute(MetaDataAttribute value) {
        return new JAXBElement<MetaDataAttribute>(_MetaDataAttribute_QNAME, MetaDataAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataAttributeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:metadata.ws.rightnow.com/v1_2", name = "MetaDataAttributeList")
    public JAXBElement<MetaDataAttributeList> createMetaDataAttributeList(MetaDataAttributeList value) {
        return new JAXBElement<MetaDataAttributeList>(_MetaDataAttributeList_QNAME, MetaDataAttributeList.class, null, value);
    }

}
