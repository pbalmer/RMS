
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.nullfields.v1_2.TaskNullFields;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:base.ws.rightnow.com/v1_2}RNObject">
 *       &lt;sequence>
 *         &lt;element name="AssignedToAccount" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="CustomFields" type="{urn:generic.ws.rightnow.com/v1_2}GenericObject" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FileAttachments" type="{urn:objects.ws.rightnow.com/v1_2}FileAttachmentCommonList" minOccurs="0"/>
 *         &lt;element name="Inherit" type="{urn:objects.ws.rightnow.com/v1_2}InheritOptions" minOccurs="0"/>
 *         &lt;element name="MarketingSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskMarketingSettings" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:objects.ws.rightnow.com/v1_2}NoteList" minOccurs="0"/>
 *         &lt;element name="Organization" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PlannedCompletionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Priority" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="SalesSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskSalesSettings" minOccurs="0"/>
 *         &lt;element name="ServiceSettings" type="{urn:objects.ws.rightnow.com/v1_2}TaskServiceSettings" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusWithType" type="{urn:objects.ws.rightnow.com/v1_2}StatusWithType" minOccurs="0"/>
 *         &lt;element name="TaskTemplate" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="TaskType" type="{urn:base.ws.rightnow.com/v1_2}NamedID" minOccurs="0"/>
 *         &lt;element name="ValidNullFields" type="{urn:nullfields.ws.rightnow.com/v1_2}TaskNullFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "assignedToAccount",
    "comment",
    "completedTime",
    "contact",
    "customFields",
    "dueTime",
    "fileAttachments",
    "inherit",
    "marketingSettings",
    "name",
    "notes",
    "organization",
    "percentComplete",
    "plannedCompletionTime",
    "priority",
    "salesSettings",
    "serviceSettings",
    "startTime",
    "statusWithType",
    "taskTemplate",
    "taskType",
    "validNullFields"
})
public class Task
    extends RNObject
{

    @XmlElementRef(name = "AssignedToAccount", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> assignedToAccount;
    @XmlElementRef(name = "Comment", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "CompletedTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> completedTime;
    @XmlElementRef(name = "Contact", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> contact;
    @XmlElement(name = "CustomFields")
    protected GenericObject customFields;
    @XmlElementRef(name = "DueTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dueTime;
    @XmlElementRef(name = "FileAttachments", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<FileAttachmentCommonList> fileAttachments;
    @XmlElement(name = "Inherit")
    protected InheritOptions inherit;
    @XmlElement(name = "MarketingSettings")
    protected TaskMarketingSettings marketingSettings;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Notes", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NoteList> notes;
    @XmlElementRef(name = "Organization", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> organization;
    @XmlElementRef(name = "PercentComplete", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<Integer> percentComplete;
    @XmlElementRef(name = "PlannedCompletionTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> plannedCompletionTime;
    @XmlElementRef(name = "Priority", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> priority;
    @XmlElement(name = "SalesSettings")
    protected TaskSalesSettings salesSettings;
    @XmlElement(name = "ServiceSettings")
    protected TaskServiceSettings serviceSettings;
    @XmlElementRef(name = "StartTime", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "StatusWithType")
    protected StatusWithType statusWithType;
    @XmlElement(name = "TaskTemplate")
    protected NamedID taskTemplate;
    @XmlElementRef(name = "TaskType", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<NamedID> taskType;
    @XmlElementRef(name = "ValidNullFields", namespace = "urn:objects.ws.rightnow.com/v1_2", type = JAXBElement.class)
    protected JAXBElement<TaskNullFields> validNullFields;

    /**
     * Gets the value of the assignedToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getAssignedToAccount() {
        return assignedToAccount;
    }

    /**
     * Sets the value of the assignedToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setAssignedToAccount(JAXBElement<NamedID> value) {
        this.assignedToAccount = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the completedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCompletedTime() {
        return completedTime;
    }

    /**
     * Sets the value of the completedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCompletedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.completedTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setContact(JAXBElement<NamedID> value) {
        this.contact = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link GenericObject }
     *     
     */
    public GenericObject getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericObject }
     *     
     */
    public void setCustomFields(GenericObject value) {
        this.customFields = value;
    }

    /**
     * Gets the value of the dueTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueTime() {
        return dueTime;
    }

    /**
     * Sets the value of the dueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueTime(JAXBElement<XMLGregorianCalendar> value) {
        this.dueTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentCommonList> getFileAttachments() {
        return fileAttachments;
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}
     *     
     */
    public void setFileAttachments(JAXBElement<FileAttachmentCommonList> value) {
        this.fileAttachments = ((JAXBElement<FileAttachmentCommonList> ) value);
    }

    /**
     * Gets the value of the inherit property.
     * 
     * @return
     *     possible object is
     *     {@link InheritOptions }
     *     
     */
    public InheritOptions getInherit() {
        return inherit;
    }

    /**
     * Sets the value of the inherit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InheritOptions }
     *     
     */
    public void setInherit(InheritOptions value) {
        this.inherit = value;
    }

    /**
     * Gets the value of the marketingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TaskMarketingSettings }
     *     
     */
    public TaskMarketingSettings getMarketingSettings() {
        return marketingSettings;
    }

    /**
     * Sets the value of the marketingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskMarketingSettings }
     *     
     */
    public void setMarketingSettings(TaskMarketingSettings value) {
        this.marketingSettings = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public JAXBElement<NoteList> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteList }{@code >}
     *     
     */
    public void setNotes(JAXBElement<NoteList> value) {
        this.notes = ((JAXBElement<NoteList> ) value);
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<NamedID> value) {
        this.organization = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPercentComplete(JAXBElement<Integer> value) {
        this.percentComplete = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the plannedCompletionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedCompletionTime() {
        return plannedCompletionTime;
    }

    /**
     * Sets the value of the plannedCompletionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedCompletionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedCompletionTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setPriority(JAXBElement<NamedID> value) {
        this.priority = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the salesSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSalesSettings }
     *     
     */
    public TaskSalesSettings getSalesSettings() {
        return salesSettings;
    }

    /**
     * Sets the value of the salesSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSalesSettings }
     *     
     */
    public void setSalesSettings(TaskSalesSettings value) {
        this.salesSettings = value;
    }

    /**
     * Gets the value of the serviceSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TaskServiceSettings }
     *     
     */
    public TaskServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    /**
     * Sets the value of the serviceSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskServiceSettings }
     *     
     */
    public void setServiceSettings(TaskServiceSettings value) {
        this.serviceSettings = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the statusWithType property.
     * 
     * @return
     *     possible object is
     *     {@link StatusWithType }
     *     
     */
    public StatusWithType getStatusWithType() {
        return statusWithType;
    }

    /**
     * Sets the value of the statusWithType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusWithType }
     *     
     */
    public void setStatusWithType(StatusWithType value) {
        this.statusWithType = value;
    }

    /**
     * Gets the value of the taskTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link NamedID }
     *     
     */
    public NamedID getTaskTemplate() {
        return taskTemplate;
    }

    /**
     * Sets the value of the taskTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedID }
     *     
     */
    public void setTaskTemplate(NamedID value) {
        this.taskTemplate = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public JAXBElement<NamedID> getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NamedID }{@code >}
     *     
     */
    public void setTaskType(JAXBElement<NamedID> value) {
        this.taskType = ((JAXBElement<NamedID> ) value);
    }

    /**
     * Gets the value of the validNullFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public JAXBElement<TaskNullFields> getValidNullFields() {
        return validNullFields;
    }

    /**
     * Sets the value of the validNullFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}
     *     
     */
    public void setValidNullFields(JAXBElement<TaskNullFields> value) {
        this.validNullFields = ((JAXBElement<TaskNullFields> ) value);
    }

}
