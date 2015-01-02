
package com.rightnow.ws.generic.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.generic.v1_2 package. 
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

    private final static QName _RNObjectType_QNAME = new QName("urn:generic.ws.rightnow.com/v1_2", "RNObjectType");
    private final static QName _GenericField_QNAME = new QName("urn:generic.ws.rightnow.com/v1_2", "GenericField");
    private final static QName _GenericObject_QNAME = new QName("urn:generic.ws.rightnow.com/v1_2", "GenericObject");
    private final static QName _DataValue_QNAME = new QName("urn:generic.ws.rightnow.com/v1_2", "DataValue");
    private final static QName _RNObjectTypeNamespace_QNAME = new QName("urn:generic.ws.rightnow.com/v1_2", "Namespace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.generic.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericObject }
     * 
     */
    public GenericObject createGenericObject() {
        return new GenericObject();
    }

    /**
     * Create an instance of {@link RNObjectType }
     * 
     */
    public RNObjectType createRNObjectType() {
        return new RNObjectType();
    }

    /**
     * Create an instance of {@link DataValue }
     * 
     */
    public DataValue createDataValue() {
        return new DataValue();
    }

    /**
     * Create an instance of {@link GenericField }
     * 
     */
    public GenericField createGenericField() {
        return new GenericField();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RNObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1_2", name = "RNObjectType")
    public JAXBElement<RNObjectType> createRNObjectType(RNObjectType value) {
        return new JAXBElement<RNObjectType>(_RNObjectType_QNAME, RNObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1_2", name = "GenericField")
    public JAXBElement<GenericField> createGenericField(GenericField value) {
        return new JAXBElement<GenericField>(_GenericField_QNAME, GenericField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1_2", name = "GenericObject")
    public JAXBElement<GenericObject> createGenericObject(GenericObject value) {
        return new JAXBElement<GenericObject>(_GenericObject_QNAME, GenericObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1_2", name = "DataValue")
    public JAXBElement<DataValue> createDataValue(DataValue value) {
        return new JAXBElement<DataValue>(_DataValue_QNAME, DataValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:generic.ws.rightnow.com/v1_2", name = "Namespace", scope = RNObjectType.class)
    public JAXBElement<String> createRNObjectTypeNamespace(String value) {
        return new JAXBElement<String>(_RNObjectTypeNamespace_QNAME, String.class, RNObjectType.class, value);
    }

}
