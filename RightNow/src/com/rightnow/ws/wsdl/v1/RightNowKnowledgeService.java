
package com.rightnow.ws.wsdl.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RightNowKnowledgeService", targetNamespace = "urn:wsdl.ws.rightnow.com/v1", wsdlLocation = "http://ubankhelp--tst.custhelp.com/cgi-bin/ubankhelp--tst.cfg/services/kf_soap?wsdl")
public class RightNowKnowledgeService
    extends Service
{

    private final static URL RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION;
    private final static WebServiceException RIGHTNOWKNOWLEDGESERVICE_EXCEPTION;
    private final static QName RIGHTNOWKNOWLEDGESERVICE_QNAME = new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ubankhelp--tst.custhelp.com/cgi-bin/ubankhelp--tst.cfg/services/kf_soap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION = url;
        RIGHTNOWKNOWLEDGESERVICE_EXCEPTION = e;
    }

    public RightNowKnowledgeService() {
        super(__getWsdlLocation(), RIGHTNOWKNOWLEDGESERVICE_QNAME);
    }

    public RightNowKnowledgeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RIGHTNOWKNOWLEDGESERVICE_QNAME, features);
    }

    public RightNowKnowledgeService(URL wsdlLocation) {
        super(wsdlLocation, RIGHTNOWKNOWLEDGESERVICE_QNAME);
    }

    public RightNowKnowledgeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RIGHTNOWKNOWLEDGESERVICE_QNAME, features);
    }

    public RightNowKnowledgeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RightNowKnowledgeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RightNowKnowledgePort
     */
    @WebEndpoint(name = "RightNowKnowledgePort")
    public RightNowKnowledgePort getRightNowKnowledgePort() {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgePort"), RightNowKnowledgePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RightNowKnowledgePort
     */
    @WebEndpoint(name = "RightNowKnowledgePort")
    public RightNowKnowledgePort getRightNowKnowledgePort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:wsdl.ws.rightnow.com/v1", "RightNowKnowledgePort"), RightNowKnowledgePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RIGHTNOWKNOWLEDGESERVICE_EXCEPTION!= null) {
            throw RIGHTNOWKNOWLEDGESERVICE_EXCEPTION;
        }
        return RIGHTNOWKNOWLEDGESERVICE_WSDL_LOCATION;
    }

}
