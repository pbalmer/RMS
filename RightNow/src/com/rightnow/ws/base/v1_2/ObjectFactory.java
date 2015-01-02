
package com.rightnow.ws.base.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.base.v1_2 package. 
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

    private final static QName _NamedIDWithParent_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDWithParent");
    private final static QName _NamedIDHierarchyList_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDHierarchyList");
    private final static QName _NamedIDList_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDList");
    private final static QName _ChainSourceID_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "ChainSourceID");
    private final static QName _NamedIDDelta_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDDelta");
    private final static QName _NamedIDHierarchy_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDHierarchy");
    private final static QName _NamedIDDeltaList_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedIDDeltaList");
    private final static QName _ChainDestinationID_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "ChainDestinationID");
    private final static QName _NamedReadOnlyID_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedReadOnlyID");
    private final static QName _ID_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "ID");
    private final static QName _RNObject_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "RNObject");
    private final static QName _NamedID_QNAME = new QName("urn:base.ws.rightnow.com/v1_2", "NamedID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.base.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChainSourceID }
     * 
     */
    public ChainSourceID createChainSourceID() {
        return new ChainSourceID();
    }

    /**
     * Create an instance of {@link NamedReadOnlyID }
     * 
     */
    public NamedReadOnlyID createNamedReadOnlyID() {
        return new NamedReadOnlyID();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link ChainDestinationID }
     * 
     */
    public ChainDestinationID createChainDestinationID() {
        return new ChainDestinationID();
    }

    /**
     * Create an instance of {@link NamedIDHierarchyList }
     * 
     */
    public NamedIDHierarchyList createNamedIDHierarchyList() {
        return new NamedIDHierarchyList();
    }

    /**
     * Create an instance of {@link NamedIDHierarchy }
     * 
     */
    public NamedIDHierarchy createNamedIDHierarchy() {
        return new NamedIDHierarchy();
    }

    /**
     * Create an instance of {@link NamedIDDeltaList }
     * 
     */
    public NamedIDDeltaList createNamedIDDeltaList() {
        return new NamedIDDeltaList();
    }

    /**
     * Create an instance of {@link RNObject }
     * 
     */
    public RNObject createRNObject() {
        return new RNObject();
    }

    /**
     * Create an instance of {@link NamedIDDelta }
     * 
     */
    public NamedIDDelta createNamedIDDelta() {
        return new NamedIDDelta();
    }

    /**
     * Create an instance of {@link NamedIDList }
     * 
     */
    public NamedIDList createNamedIDList() {
        return new NamedIDList();
    }

    /**
     * Create an instance of {@link NamedIDWithParent }
     * 
     */
    public NamedIDWithParent createNamedIDWithParent() {
        return new NamedIDWithParent();
    }

    /**
     * Create an instance of {@link NamedID }
     * 
     */
    public NamedID createNamedID() {
        return new NamedID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDWithParent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDWithParent")
    public JAXBElement<NamedIDWithParent> createNamedIDWithParent(NamedIDWithParent value) {
        return new JAXBElement<NamedIDWithParent>(_NamedIDWithParent_QNAME, NamedIDWithParent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDHierarchyList")
    public JAXBElement<NamedIDHierarchyList> createNamedIDHierarchyList(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_NamedIDHierarchyList_QNAME, NamedIDHierarchyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDList")
    public JAXBElement<NamedIDList> createNamedIDList(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_NamedIDList_QNAME, NamedIDList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChainSourceID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "ChainSourceID")
    public JAXBElement<ChainSourceID> createChainSourceID(ChainSourceID value) {
        return new JAXBElement<ChainSourceID>(_ChainSourceID_QNAME, ChainSourceID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDDelta")
    public JAXBElement<NamedIDDelta> createNamedIDDelta(NamedIDDelta value) {
        return new JAXBElement<NamedIDDelta>(_NamedIDDelta_QNAME, NamedIDDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDHierarchy")
    public JAXBElement<NamedIDHierarchy> createNamedIDHierarchy(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_NamedIDHierarchy_QNAME, NamedIDHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedIDDeltaList")
    public JAXBElement<NamedIDDeltaList> createNamedIDDeltaList(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_NamedIDDeltaList_QNAME, NamedIDDeltaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChainDestinationID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "ChainDestinationID")
    public JAXBElement<ChainDestinationID> createChainDestinationID(ChainDestinationID value) {
        return new JAXBElement<ChainDestinationID>(_ChainDestinationID_QNAME, ChainDestinationID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedReadOnlyID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedReadOnlyID")
    public JAXBElement<NamedReadOnlyID> createNamedReadOnlyID(NamedReadOnlyID value) {
        return new JAXBElement<NamedReadOnlyID>(_NamedReadOnlyID_QNAME, NamedReadOnlyID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RNObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "RNObject")
    public JAXBElement<RNObject> createRNObject(RNObject value) {
        return new JAXBElement<RNObject>(_RNObject_QNAME, RNObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1_2", name = "NamedID")
    public JAXBElement<NamedID> createNamedID(NamedID value) {
        return new JAXBElement<NamedID>(_NamedID_QNAME, NamedID.class, null, value);
    }

}
