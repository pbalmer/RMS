
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.rightnow.ws.faults.v1_2.RequestErrorFaultType;
import com.rightnow.ws.faults.v1_2.ServerErrorFaultType;
import com.rightnow.ws.faults.v1_2.UnexpectedErrorFaultType;


/**
 * <p>Java class for BatchResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}CreateResponseMsg"/>
 *         &lt;element name="GetResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetResponseMsg"/>
 *         &lt;element name="UpdateResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}UpdateResponseMsg"/>
 *         &lt;element name="DestroyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}DestroyResponseMsg"/>
 *         &lt;element name="QueryCSVResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}QueryCSVResponseMsg"/>
 *         &lt;element name="QueryObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}QueryObjectsResponseMsg"/>
 *         &lt;element name="ExecuteMarketingFlowResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}ExecuteMarketingFlowResponseMsg"/>
 *         &lt;element name="GetFileDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetFileDataResponseMsg"/>
 *         &lt;element name="ResetContactPasswordResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}ResetContactPasswordResponseMsg"/>
 *         &lt;element name="SendMailingToContactResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}SendMailingToContactResponseMsg"/>
 *         &lt;element name="GetMetaDataResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataResponseMsg"/>
 *         &lt;element name="TransferSubObjectsResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}TransferSubObjectsResponseMsg"/>
 *         &lt;element name="GetMetaDataForClassResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataForClassResponseMsg"/>
 *         &lt;element name="GetMetaDataLastChangeTimeResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataLastChangeTimeResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetValuesForNamedIDResponseMsg"/>
 *         &lt;element name="GetValuesForNamedIDHierarchyResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetValuesForNamedIDHierarchyResponseMsg"/>
 *         &lt;element name="RunAnalyticsReportResponseMsg" type="{urn:messages.ws.rightnow.com/v1_2}RunAnalyticsReportResponseMsg"/>
 *         &lt;element name="RequestErrorFault" type="{urn:faults.ws.rightnow.com/v1_2}RequestErrorFaultType"/>
 *         &lt;element name="ServerErrorFault" type="{urn:faults.ws.rightnow.com/v1_2}ServerErrorFaultType"/>
 *         &lt;element name="UnexpectedErrorFault" type="{urn:faults.ws.rightnow.com/v1_2}UnexpectedErrorFaultType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponseItem", propOrder = {
    "createResponseMsg",
    "getResponseMsg",
    "updateResponseMsg",
    "destroyResponseMsg",
    "queryCSVResponseMsg",
    "queryObjectsResponseMsg",
    "executeMarketingFlowResponseMsg",
    "getFileDataResponseMsg",
    "resetContactPasswordResponseMsg",
    "sendMailingToContactResponseMsg",
    "getMetaDataResponseMsg",
    "transferSubObjectsResponseMsg",
    "getMetaDataForClassResponseMsg",
    "getMetaDataLastChangeTimeResponseMsg",
    "getValuesForNamedIDResponseMsg",
    "getValuesForNamedIDHierarchyResponseMsg",
    "runAnalyticsReportResponseMsg",
    "requestErrorFault",
    "serverErrorFault",
    "unexpectedErrorFault"
})
public class BatchResponseItem {

    @XmlElement(name = "CreateResponseMsg")
    protected CreateResponseMsg createResponseMsg;
    @XmlElement(name = "GetResponseMsg")
    protected GetResponseMsg getResponseMsg;
    @XmlElement(name = "UpdateResponseMsg")
    protected UpdateResponseMsg updateResponseMsg;
    @XmlElement(name = "DestroyResponseMsg")
    protected DestroyResponseMsg destroyResponseMsg;
    @XmlElement(name = "QueryCSVResponseMsg")
    protected QueryCSVResponseMsg queryCSVResponseMsg;
    @XmlElement(name = "QueryObjectsResponseMsg")
    protected QueryObjectsResponseMsg queryObjectsResponseMsg;
    @XmlElement(name = "ExecuteMarketingFlowResponseMsg")
    protected ExecuteMarketingFlowResponseMsg executeMarketingFlowResponseMsg;
    @XmlElement(name = "GetFileDataResponseMsg")
    protected GetFileDataResponseMsg getFileDataResponseMsg;
    @XmlElement(name = "ResetContactPasswordResponseMsg")
    protected ResetContactPasswordResponseMsg resetContactPasswordResponseMsg;
    @XmlElement(name = "SendMailingToContactResponseMsg")
    protected SendMailingToContactResponseMsg sendMailingToContactResponseMsg;
    @XmlElement(name = "GetMetaDataResponseMsg")
    protected GetMetaDataResponseMsg getMetaDataResponseMsg;
    @XmlElement(name = "TransferSubObjectsResponseMsg")
    protected TransferSubObjectsResponseMsg transferSubObjectsResponseMsg;
    @XmlElement(name = "GetMetaDataForClassResponseMsg")
    protected GetMetaDataForClassResponseMsg getMetaDataForClassResponseMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeResponseMsg")
    protected GetMetaDataLastChangeTimeResponseMsg getMetaDataLastChangeTimeResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDResponseMsg")
    protected GetValuesForNamedIDResponseMsg getValuesForNamedIDResponseMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyResponseMsg")
    protected GetValuesForNamedIDHierarchyResponseMsg getValuesForNamedIDHierarchyResponseMsg;
    @XmlElement(name = "RunAnalyticsReportResponseMsg")
    protected RunAnalyticsReportResponseMsg runAnalyticsReportResponseMsg;
    @XmlElement(name = "RequestErrorFault")
    protected RequestErrorFaultType requestErrorFault;
    @XmlElement(name = "ServerErrorFault")
    protected ServerErrorFaultType serverErrorFault;
    @XmlElement(name = "UnexpectedErrorFault")
    protected UnexpectedErrorFaultType unexpectedErrorFault;

    /**
     * Gets the value of the createResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CreateResponseMsg }
     *     
     */
    public CreateResponseMsg getCreateResponseMsg() {
        return createResponseMsg;
    }

    /**
     * Sets the value of the createResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateResponseMsg }
     *     
     */
    public void setCreateResponseMsg(CreateResponseMsg value) {
        this.createResponseMsg = value;
    }

    /**
     * Gets the value of the getResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseMsg }
     *     
     */
    public GetResponseMsg getGetResponseMsg() {
        return getResponseMsg;
    }

    /**
     * Sets the value of the getResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseMsg }
     *     
     */
    public void setGetResponseMsg(GetResponseMsg value) {
        this.getResponseMsg = value;
    }

    /**
     * Gets the value of the updateResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public UpdateResponseMsg getUpdateResponseMsg() {
        return updateResponseMsg;
    }

    /**
     * Sets the value of the updateResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateResponseMsg }
     *     
     */
    public void setUpdateResponseMsg(UpdateResponseMsg value) {
        this.updateResponseMsg = value;
    }

    /**
     * Gets the value of the destroyResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public DestroyResponseMsg getDestroyResponseMsg() {
        return destroyResponseMsg;
    }

    /**
     * Sets the value of the destroyResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyResponseMsg }
     *     
     */
    public void setDestroyResponseMsg(DestroyResponseMsg value) {
        this.destroyResponseMsg = value;
    }

    /**
     * Gets the value of the queryCSVResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public QueryCSVResponseMsg getQueryCSVResponseMsg() {
        return queryCSVResponseMsg;
    }

    /**
     * Sets the value of the queryCSVResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCSVResponseMsg }
     *     
     */
    public void setQueryCSVResponseMsg(QueryCSVResponseMsg value) {
        this.queryCSVResponseMsg = value;
    }

    /**
     * Gets the value of the queryObjectsResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public QueryObjectsResponseMsg getQueryObjectsResponseMsg() {
        return queryObjectsResponseMsg;
    }

    /**
     * Sets the value of the queryObjectsResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsResponseMsg }
     *     
     */
    public void setQueryObjectsResponseMsg(QueryObjectsResponseMsg value) {
        this.queryObjectsResponseMsg = value;
    }

    /**
     * Gets the value of the executeMarketingFlowResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public ExecuteMarketingFlowResponseMsg getExecuteMarketingFlowResponseMsg() {
        return executeMarketingFlowResponseMsg;
    }

    /**
     * Sets the value of the executeMarketingFlowResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowResponseMsg }
     *     
     */
    public void setExecuteMarketingFlowResponseMsg(ExecuteMarketingFlowResponseMsg value) {
        this.executeMarketingFlowResponseMsg = value;
    }

    /**
     * Gets the value of the getFileDataResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public GetFileDataResponseMsg getGetFileDataResponseMsg() {
        return getFileDataResponseMsg;
    }

    /**
     * Sets the value of the getFileDataResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataResponseMsg }
     *     
     */
    public void setGetFileDataResponseMsg(GetFileDataResponseMsg value) {
        this.getFileDataResponseMsg = value;
    }

    /**
     * Gets the value of the resetContactPasswordResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public ResetContactPasswordResponseMsg getResetContactPasswordResponseMsg() {
        return resetContactPasswordResponseMsg;
    }

    /**
     * Sets the value of the resetContactPasswordResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordResponseMsg }
     *     
     */
    public void setResetContactPasswordResponseMsg(ResetContactPasswordResponseMsg value) {
        this.resetContactPasswordResponseMsg = value;
    }

    /**
     * Gets the value of the sendMailingToContactResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public SendMailingToContactResponseMsg getSendMailingToContactResponseMsg() {
        return sendMailingToContactResponseMsg;
    }

    /**
     * Sets the value of the sendMailingToContactResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactResponseMsg }
     *     
     */
    public void setSendMailingToContactResponseMsg(SendMailingToContactResponseMsg value) {
        this.sendMailingToContactResponseMsg = value;
    }

    /**
     * Gets the value of the getMetaDataResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public GetMetaDataResponseMsg getGetMetaDataResponseMsg() {
        return getMetaDataResponseMsg;
    }

    /**
     * Sets the value of the getMetaDataResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataResponseMsg }
     *     
     */
    public void setGetMetaDataResponseMsg(GetMetaDataResponseMsg value) {
        this.getMetaDataResponseMsg = value;
    }

    /**
     * Gets the value of the transferSubObjectsResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public TransferSubObjectsResponseMsg getTransferSubObjectsResponseMsg() {
        return transferSubObjectsResponseMsg;
    }

    /**
     * Sets the value of the transferSubObjectsResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsResponseMsg }
     *     
     */
    public void setTransferSubObjectsResponseMsg(TransferSubObjectsResponseMsg value) {
        this.transferSubObjectsResponseMsg = value;
    }

    /**
     * Gets the value of the getMetaDataForClassResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public GetMetaDataForClassResponseMsg getGetMetaDataForClassResponseMsg() {
        return getMetaDataForClassResponseMsg;
    }

    /**
     * Sets the value of the getMetaDataForClassResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassResponseMsg }
     *     
     */
    public void setGetMetaDataForClassResponseMsg(GetMetaDataForClassResponseMsg value) {
        this.getMetaDataForClassResponseMsg = value;
    }

    /**
     * Gets the value of the getMetaDataLastChangeTimeResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTimeResponseMsg() {
        return getMetaDataLastChangeTimeResponseMsg;
    }

    /**
     * Sets the value of the getMetaDataLastChangeTimeResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeResponseMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeResponseMsg(GetMetaDataLastChangeTimeResponseMsg value) {
        this.getMetaDataLastChangeTimeResponseMsg = value;
    }

    /**
     * Gets the value of the getValuesForNamedIDResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public GetValuesForNamedIDResponseMsg getGetValuesForNamedIDResponseMsg() {
        return getValuesForNamedIDResponseMsg;
    }

    /**
     * Sets the value of the getValuesForNamedIDResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDResponseMsg(GetValuesForNamedIDResponseMsg value) {
        this.getValuesForNamedIDResponseMsg = value;
    }

    /**
     * Gets the value of the getValuesForNamedIDHierarchyResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchyResponseMsg() {
        return getValuesForNamedIDHierarchyResponseMsg;
    }

    /**
     * Sets the value of the getValuesForNamedIDHierarchyResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyResponseMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyResponseMsg(GetValuesForNamedIDHierarchyResponseMsg value) {
        this.getValuesForNamedIDHierarchyResponseMsg = value;
    }

    /**
     * Gets the value of the runAnalyticsReportResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public RunAnalyticsReportResponseMsg getRunAnalyticsReportResponseMsg() {
        return runAnalyticsReportResponseMsg;
    }

    /**
     * Sets the value of the runAnalyticsReportResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportResponseMsg }
     *     
     */
    public void setRunAnalyticsReportResponseMsg(RunAnalyticsReportResponseMsg value) {
        this.runAnalyticsReportResponseMsg = value;
    }

    /**
     * Gets the value of the requestErrorFault property.
     * 
     * @return
     *     possible object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public RequestErrorFaultType getRequestErrorFault() {
        return requestErrorFault;
    }

    /**
     * Sets the value of the requestErrorFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestErrorFaultType }
     *     
     */
    public void setRequestErrorFault(RequestErrorFaultType value) {
        this.requestErrorFault = value;
    }

    /**
     * Gets the value of the serverErrorFault property.
     * 
     * @return
     *     possible object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public ServerErrorFaultType getServerErrorFault() {
        return serverErrorFault;
    }

    /**
     * Sets the value of the serverErrorFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerErrorFaultType }
     *     
     */
    public void setServerErrorFault(ServerErrorFaultType value) {
        this.serverErrorFault = value;
    }

    /**
     * Gets the value of the unexpectedErrorFault property.
     * 
     * @return
     *     possible object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public UnexpectedErrorFaultType getUnexpectedErrorFault() {
        return unexpectedErrorFault;
    }

    /**
     * Sets the value of the unexpectedErrorFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnexpectedErrorFaultType }
     *     
     */
    public void setUnexpectedErrorFault(UnexpectedErrorFaultType value) {
        this.unexpectedErrorFault = value;
    }

}
