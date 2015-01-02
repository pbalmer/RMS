
package com.rightnow.ws.base.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.base.v1 package. 
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

    private final static QName _ID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "ID");
    private final static QName _NamedID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedID");
    private final static QName _RNObject_QNAME = new QName("urn:base.ws.rightnow.com/v1", "RNObject");
    private final static QName _NamedIDHierarchy_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDHierarchy");
    private final static QName _NamedIDHierarchyList_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedIDHierarchyList");
    private final static QName _NamedReadOnlyID_QNAME = new QName("urn:base.ws.rightnow.com/v1", "NamedReadOnlyID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.base.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NamedReadOnlyID }
     * 
     */
    public NamedReadOnlyID createNamedReadOnlyID() {
        return new NamedReadOnlyID();
    }

    /**
     * Create an instance of {@link NamedID }
     * 
     */
    public NamedID createNamedID() {
        return new NamedID();
    }

    /**
     * Create an instance of {@link NamedIDHierarchy }
     * 
     */
    public NamedIDHierarchy createNamedIDHierarchy() {
        return new NamedIDHierarchy();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link RNObject }
     * 
     */
    public RNObject createRNObject() {
        return new RNObject();
    }

    /**
     * Create an instance of {@link NamedIDHierarchyList }
     * 
     */
    public NamedIDHierarchyList createNamedIDHierarchyList() {
        return new NamedIDHierarchyList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedID")
    public JAXBElement<NamedID> createNamedID(NamedID value) {
        return new JAXBElement<NamedID>(_NamedID_QNAME, NamedID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RNObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "RNObject")
    public JAXBElement<RNObject> createRNObject(RNObject value) {
        return new JAXBElement<RNObject>(_RNObject_QNAME, RNObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDHierarchy")
    public JAXBElement<NamedIDHierarchy> createNamedIDHierarchy(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_NamedIDHierarchy_QNAME, NamedIDHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedIDHierarchyList")
    public JAXBElement<NamedIDHierarchyList> createNamedIDHierarchyList(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_NamedIDHierarchyList_QNAME, NamedIDHierarchyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedReadOnlyID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:base.ws.rightnow.com/v1", name = "NamedReadOnlyID")
    public JAXBElement<NamedReadOnlyID> createNamedReadOnlyID(NamedReadOnlyID value) {
        return new JAXBElement<NamedReadOnlyID>(_NamedReadOnlyID_QNAME, NamedReadOnlyID.class, null, value);
    }

}
