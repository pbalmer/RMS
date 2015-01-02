
package com.rightnow.ws.messages.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchRequestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchRequestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CreateMsg" type="{urn:messages.ws.rightnow.com/v1_2}CreateMsg"/>
 *           &lt;element name="GetMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMsg"/>
 *           &lt;element name="UpdateMsg" type="{urn:messages.ws.rightnow.com/v1_2}UpdateMsg"/>
 *           &lt;element name="DestroyMsg" type="{urn:messages.ws.rightnow.com/v1_2}DestroyMsg"/>
 *           &lt;element name="QueryCSVMsg" type="{urn:messages.ws.rightnow.com/v1_2}QueryMsg"/>
 *           &lt;element name="QueryObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_2}QueryObjectsMsg"/>
 *           &lt;element name="ExecuteMarketingFlowMsg" type="{urn:messages.ws.rightnow.com/v1_2}ExecuteMarketingFlowMsg"/>
 *           &lt;element name="GetFileDataMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetFileDataMsg"/>
 *           &lt;element name="ResetContactPasswordMsg" type="{urn:messages.ws.rightnow.com/v1_2}ResetContactPasswordMsg"/>
 *           &lt;element name="SendMailingToContactMsg" type="{urn:messages.ws.rightnow.com/v1_2}SendMailingToContactMsg"/>
 *           &lt;element name="TransferSubObjectsMsg" type="{urn:messages.ws.rightnow.com/v1_2}TransferSubObjectsMsg"/>
 *           &lt;element name="GetMetaDataMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataMsg"/>
 *           &lt;element name="GetMetaDataForClassMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataForClassMsg"/>
 *           &lt;element name="GetMetaDataLastChangeTimeMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetMetaDataLastChangeTimeMsg"/>
 *           &lt;element name="GetValuesForNamedIDMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetValuesForNamedIDMsg"/>
 *           &lt;element name="GetValuesForNamedIDHierarchyMsg" type="{urn:messages.ws.rightnow.com/v1_2}GetValuesForNamedIDHierarchyMsg"/>
 *           &lt;element name="RunAnalyticsReportMsg" type="{urn:messages.ws.rightnow.com/v1_2}RunAnalyticsReportMsg"/>
 *         &lt;/choice>
 *         &lt;element name="CommitAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreserveChainID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRequestItem", propOrder = {
    "createMsg",
    "getMsg",
    "updateMsg",
    "destroyMsg",
    "queryCSVMsg",
    "queryObjectsMsg",
    "executeMarketingFlowMsg",
    "getFileDataMsg",
    "resetContactPasswordMsg",
    "sendMailingToContactMsg",
    "transferSubObjectsMsg",
    "getMetaDataMsg",
    "getMetaDataForClassMsg",
    "getMetaDataLastChangeTimeMsg",
    "getValuesForNamedIDMsg",
    "getValuesForNamedIDHierarchyMsg",
    "runAnalyticsReportMsg",
    "commitAfter",
    "preserveChainID"
})
public class BatchRequestItem {

    @XmlElement(name = "CreateMsg")
    protected CreateMsg createMsg;
    @XmlElement(name = "GetMsg")
    protected GetMsg getMsg;
    @XmlElement(name = "UpdateMsg")
    protected UpdateMsg updateMsg;
    @XmlElement(name = "DestroyMsg")
    protected DestroyMsg destroyMsg;
    @XmlElement(name = "QueryCSVMsg")
    protected QueryMsg queryCSVMsg;
    @XmlElement(name = "QueryObjectsMsg")
    protected QueryObjectsMsg queryObjectsMsg;
    @XmlElement(name = "ExecuteMarketingFlowMsg")
    protected ExecuteMarketingFlowMsg executeMarketingFlowMsg;
    @XmlElement(name = "GetFileDataMsg")
    protected GetFileDataMsg getFileDataMsg;
    @XmlElement(name = "ResetContactPasswordMsg")
    protected ResetContactPasswordMsg resetContactPasswordMsg;
    @XmlElement(name = "SendMailingToContactMsg")
    protected SendMailingToContactMsg sendMailingToContactMsg;
    @XmlElement(name = "TransferSubObjectsMsg")
    protected TransferSubObjectsMsg transferSubObjectsMsg;
    @XmlElement(name = "GetMetaDataMsg")
    protected GetMetaDataMsg getMetaDataMsg;
    @XmlElement(name = "GetMetaDataForClassMsg")
    protected GetMetaDataForClassMsg getMetaDataForClassMsg;
    @XmlElement(name = "GetMetaDataLastChangeTimeMsg")
    protected GetMetaDataLastChangeTimeMsg getMetaDataLastChangeTimeMsg;
    @XmlElement(name = "GetValuesForNamedIDMsg")
    protected GetValuesForNamedIDMsg getValuesForNamedIDMsg;
    @XmlElement(name = "GetValuesForNamedIDHierarchyMsg")
    protected GetValuesForNamedIDHierarchyMsg getValuesForNamedIDHierarchyMsg;
    @XmlElement(name = "RunAnalyticsReportMsg")
    protected RunAnalyticsReportMsg runAnalyticsReportMsg;
    @XmlElement(name = "CommitAfter")
    protected Boolean commitAfter;
    @XmlElement(name = "PreserveChainID")
    protected Boolean preserveChainID;

    /**
     * Gets the value of the createMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMsg }
     *     
     */
    public CreateMsg getCreateMsg() {
        return createMsg;
    }

    /**
     * Sets the value of the createMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMsg }
     *     
     */
    public void setCreateMsg(CreateMsg value) {
        this.createMsg = value;
    }

    /**
     * Gets the value of the getMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMsg }
     *     
     */
    public GetMsg getGetMsg() {
        return getMsg;
    }

    /**
     * Sets the value of the getMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMsg }
     *     
     */
    public void setGetMsg(GetMsg value) {
        this.getMsg = value;
    }

    /**
     * Gets the value of the updateMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMsg }
     *     
     */
    public UpdateMsg getUpdateMsg() {
        return updateMsg;
    }

    /**
     * Sets the value of the updateMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMsg }
     *     
     */
    public void setUpdateMsg(UpdateMsg value) {
        this.updateMsg = value;
    }

    /**
     * Gets the value of the destroyMsg property.
     * 
     * @return
     *     possible object is
     *     {@link DestroyMsg }
     *     
     */
    public DestroyMsg getDestroyMsg() {
        return destroyMsg;
    }

    /**
     * Sets the value of the destroyMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestroyMsg }
     *     
     */
    public void setDestroyMsg(DestroyMsg value) {
        this.destroyMsg = value;
    }

    /**
     * Gets the value of the queryCSVMsg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryMsg }
     *     
     */
    public QueryMsg getQueryCSVMsg() {
        return queryCSVMsg;
    }

    /**
     * Sets the value of the queryCSVMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMsg }
     *     
     */
    public void setQueryCSVMsg(QueryMsg value) {
        this.queryCSVMsg = value;
    }

    /**
     * Gets the value of the queryObjectsMsg property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public QueryObjectsMsg getQueryObjectsMsg() {
        return queryObjectsMsg;
    }

    /**
     * Sets the value of the queryObjectsMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectsMsg }
     *     
     */
    public void setQueryObjectsMsg(QueryObjectsMsg value) {
        this.queryObjectsMsg = value;
    }

    /**
     * Gets the value of the executeMarketingFlowMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public ExecuteMarketingFlowMsg getExecuteMarketingFlowMsg() {
        return executeMarketingFlowMsg;
    }

    /**
     * Sets the value of the executeMarketingFlowMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteMarketingFlowMsg }
     *     
     */
    public void setExecuteMarketingFlowMsg(ExecuteMarketingFlowMsg value) {
        this.executeMarketingFlowMsg = value;
    }

    /**
     * Gets the value of the getFileDataMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetFileDataMsg }
     *     
     */
    public GetFileDataMsg getGetFileDataMsg() {
        return getFileDataMsg;
    }

    /**
     * Sets the value of the getFileDataMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFileDataMsg }
     *     
     */
    public void setGetFileDataMsg(GetFileDataMsg value) {
        this.getFileDataMsg = value;
    }

    /**
     * Gets the value of the resetContactPasswordMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public ResetContactPasswordMsg getResetContactPasswordMsg() {
        return resetContactPasswordMsg;
    }

    /**
     * Sets the value of the resetContactPasswordMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetContactPasswordMsg }
     *     
     */
    public void setResetContactPasswordMsg(ResetContactPasswordMsg value) {
        this.resetContactPasswordMsg = value;
    }

    /**
     * Gets the value of the sendMailingToContactMsg property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public SendMailingToContactMsg getSendMailingToContactMsg() {
        return sendMailingToContactMsg;
    }

    /**
     * Sets the value of the sendMailingToContactMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailingToContactMsg }
     *     
     */
    public void setSendMailingToContactMsg(SendMailingToContactMsg value) {
        this.sendMailingToContactMsg = value;
    }

    /**
     * Gets the value of the transferSubObjectsMsg property.
     * 
     * @return
     *     possible object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public TransferSubObjectsMsg getTransferSubObjectsMsg() {
        return transferSubObjectsMsg;
    }

    /**
     * Sets the value of the transferSubObjectsMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSubObjectsMsg }
     *     
     */
    public void setTransferSubObjectsMsg(TransferSubObjectsMsg value) {
        this.transferSubObjectsMsg = value;
    }

    /**
     * Gets the value of the getMetaDataMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public GetMetaDataMsg getGetMetaDataMsg() {
        return getMetaDataMsg;
    }

    /**
     * Sets the value of the getMetaDataMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataMsg }
     *     
     */
    public void setGetMetaDataMsg(GetMetaDataMsg value) {
        this.getMetaDataMsg = value;
    }

    /**
     * Gets the value of the getMetaDataForClassMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public GetMetaDataForClassMsg getGetMetaDataForClassMsg() {
        return getMetaDataForClassMsg;
    }

    /**
     * Sets the value of the getMetaDataForClassMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataForClassMsg }
     *     
     */
    public void setGetMetaDataForClassMsg(GetMetaDataForClassMsg value) {
        this.getMetaDataForClassMsg = value;
    }

    /**
     * Gets the value of the getMetaDataLastChangeTimeMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTimeMsg() {
        return getMetaDataLastChangeTimeMsg;
    }

    /**
     * Sets the value of the getMetaDataLastChangeTimeMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMetaDataLastChangeTimeMsg }
     *     
     */
    public void setGetMetaDataLastChangeTimeMsg(GetMetaDataLastChangeTimeMsg value) {
        this.getMetaDataLastChangeTimeMsg = value;
    }

    /**
     * Gets the value of the getValuesForNamedIDMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public GetValuesForNamedIDMsg getGetValuesForNamedIDMsg() {
        return getValuesForNamedIDMsg;
    }

    /**
     * Sets the value of the getValuesForNamedIDMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDMsg }
     *     
     */
    public void setGetValuesForNamedIDMsg(GetValuesForNamedIDMsg value) {
        this.getValuesForNamedIDMsg = value;
    }

    /**
     * Gets the value of the getValuesForNamedIDHierarchyMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchyMsg() {
        return getValuesForNamedIDHierarchyMsg;
    }

    /**
     * Sets the value of the getValuesForNamedIDHierarchyMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetValuesForNamedIDHierarchyMsg }
     *     
     */
    public void setGetValuesForNamedIDHierarchyMsg(GetValuesForNamedIDHierarchyMsg value) {
        this.getValuesForNamedIDHierarchyMsg = value;
    }

    /**
     * Gets the value of the runAnalyticsReportMsg property.
     * 
     * @return
     *     possible object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public RunAnalyticsReportMsg getRunAnalyticsReportMsg() {
        return runAnalyticsReportMsg;
    }

    /**
     * Sets the value of the runAnalyticsReportMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunAnalyticsReportMsg }
     *     
     */
    public void setRunAnalyticsReportMsg(RunAnalyticsReportMsg value) {
        this.runAnalyticsReportMsg = value;
    }

    /**
     * Gets the value of the commitAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitAfter() {
        return commitAfter;
    }

    /**
     * Sets the value of the commitAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitAfter(Boolean value) {
        this.commitAfter = value;
    }

    /**
     * Gets the value of the preserveChainID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreserveChainID() {
        return preserveChainID;
    }

    /**
     * Sets the value of the preserveChainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveChainID(Boolean value) {
        this.preserveChainID = value;
    }

}
