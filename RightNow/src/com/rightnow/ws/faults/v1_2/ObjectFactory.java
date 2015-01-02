
package com.rightnow.ws.faults.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.faults.v1_2 package. 
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

    private final static QName _RequestErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1_2", "RequestErrorFault");
    private final static QName _ServerErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1_2", "ServerErrorFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:faults.ws.rightnow.com/v1_2", "UnexpectedErrorFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.faults.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestErrorFaultType }
     * 
     */
    public RequestErrorFaultType createRequestErrorFaultType() {
        return new RequestErrorFaultType();
    }

    /**
     * Create an instance of {@link RNFault }
     * 
     */
    public RNFault createRNFault() {
        return new RNFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFaultType }
     * 
     */
    public UnexpectedErrorFaultType createUnexpectedErrorFaultType() {
        return new UnexpectedErrorFaultType();
    }

    /**
     * Create an instance of {@link ServerErrorFaultType }
     * 
     */
    public ServerErrorFaultType createServerErrorFaultType() {
        return new ServerErrorFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1_2", name = "RequestErrorFault")
    public JAXBElement<RequestErrorFaultType> createRequestErrorFault(RequestErrorFaultType value) {
        return new JAXBElement<RequestErrorFaultType>(_RequestErrorFault_QNAME, RequestErrorFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1_2", name = "ServerErrorFault")
    public JAXBElement<ServerErrorFaultType> createServerErrorFault(ServerErrorFaultType value) {
        return new JAXBElement<ServerErrorFaultType>(_ServerErrorFault_QNAME, ServerErrorFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:faults.ws.rightnow.com/v1_2", name = "UnexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFaultType> createUnexpectedErrorFault(UnexpectedErrorFaultType value) {
        return new JAXBElement<UnexpectedErrorFaultType>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFaultType.class, null, value);
    }

}
