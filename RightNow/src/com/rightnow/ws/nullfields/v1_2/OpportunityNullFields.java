
package com.rightnow.ws.nullfields.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunityNullFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityNullFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AssignedToAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Banner" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ClosedValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CostOfSale" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FileAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForecastCloseDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="InitialContactDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LeadRejectReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LostTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ManagerValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Notes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Organization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OtherContacts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PrimaryContact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Quotes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RecallTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReturnValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SalesRepresentativeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Territory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="WinLossReason" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityNullFields")
public class OpportunityNullFields {

    @XmlAttribute(name = "AssignedToAccount")
    protected Boolean assignedToAccount;
    @XmlAttribute(name = "Banner")
    protected Boolean banner;
    @XmlAttribute(name = "ClosedTime")
    protected Boolean closedTime;
    @XmlAttribute(name = "ClosedValue")
    protected Boolean closedValue;
    @XmlAttribute(name = "CostOfSale")
    protected Boolean costOfSale;
    @XmlAttribute(name = "FileAttachments")
    protected Boolean fileAttachments;
    @XmlAttribute(name = "ForecastCloseDate")
    protected Boolean forecastCloseDate;
    @XmlAttribute(name = "InitialContactDate")
    protected Boolean initialContactDate;
    @XmlAttribute(name = "LeadRejectDateTime")
    protected Boolean leadRejectDateTime;
    @XmlAttribute(name = "LeadRejectDescription")
    protected Boolean leadRejectDescription;
    @XmlAttribute(name = "LeadRejectReason")
    protected Boolean leadRejectReason;
    @XmlAttribute(name = "LostTime")
    protected Boolean lostTime;
    @XmlAttribute(name = "ManagerValue")
    protected Boolean managerValue;
    @XmlAttribute(name = "Name")
    protected Boolean name;
    @XmlAttribute(name = "Notes")
    protected Boolean notes;
    @XmlAttribute(name = "Organization")
    protected Boolean organization;
    @XmlAttribute(name = "OtherContacts")
    protected Boolean otherContacts;
    @XmlAttribute(name = "PrimaryContact")
    protected Boolean primaryContact;
    @XmlAttribute(name = "Quotes")
    protected Boolean quotes;
    @XmlAttribute(name = "RecallTime")
    protected Boolean recallTime;
    @XmlAttribute(name = "ReturnValue")
    protected Boolean returnValue;
    @XmlAttribute(name = "SalesRepresentativeValue")
    protected Boolean salesRepresentativeValue;
    @XmlAttribute(name = "Summary")
    protected Boolean summary;
    @XmlAttribute(name = "Territory")
    protected Boolean territory;
    @XmlAttribute(name = "WinLossDescription")
    protected Boolean winLossDescription;
    @XmlAttribute(name = "WinLossReason")
    protected Boolean winLossReason;

    /**
     * Gets the value of the assignedToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAssignedToAccount() {
        if (assignedToAccount == null) {
            return false;
        } else {
            return assignedToAccount;
        }
    }

    /**
     * Sets the value of the assignedToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedToAccount(Boolean value) {
        this.assignedToAccount = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBanner() {
        if (banner == null) {
            return false;
        } else {
            return banner;
        }
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBanner(Boolean value) {
        this.banner = value;
    }

    /**
     * Gets the value of the closedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedTime() {
        if (closedTime == null) {
            return false;
        } else {
            return closedTime;
        }
    }

    /**
     * Sets the value of the closedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedTime(Boolean value) {
        this.closedTime = value;
    }

    /**
     * Gets the value of the closedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedValue() {
        if (closedValue == null) {
            return false;
        } else {
            return closedValue;
        }
    }

    /**
     * Sets the value of the closedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedValue(Boolean value) {
        this.closedValue = value;
    }

    /**
     * Gets the value of the costOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCostOfSale() {
        if (costOfSale == null) {
            return false;
        } else {
            return costOfSale;
        }
    }

    /**
     * Sets the value of the costOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostOfSale(Boolean value) {
        this.costOfSale = value;
    }

    /**
     * Gets the value of the fileAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFileAttachments() {
        if (fileAttachments == null) {
            return false;
        } else {
            return fileAttachments;
        }
    }

    /**
     * Sets the value of the fileAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFileAttachments(Boolean value) {
        this.fileAttachments = value;
    }

    /**
     * Gets the value of the forecastCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForecastCloseDate() {
        if (forecastCloseDate == null) {
            return false;
        } else {
            return forecastCloseDate;
        }
    }

    /**
     * Sets the value of the forecastCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastCloseDate(Boolean value) {
        this.forecastCloseDate = value;
    }

    /**
     * Gets the value of the initialContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInitialContactDate() {
        if (initialContactDate == null) {
            return false;
        } else {
            return initialContactDate;
        }
    }

    /**
     * Sets the value of the initialContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitialContactDate(Boolean value) {
        this.initialContactDate = value;
    }

    /**
     * Gets the value of the leadRejectDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDateTime() {
        if (leadRejectDateTime == null) {
            return false;
        } else {
            return leadRejectDateTime;
        }
    }

    /**
     * Sets the value of the leadRejectDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDateTime(Boolean value) {
        this.leadRejectDateTime = value;
    }

    /**
     * Gets the value of the leadRejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectDescription() {
        if (leadRejectDescription == null) {
            return false;
        } else {
            return leadRejectDescription;
        }
    }

    /**
     * Sets the value of the leadRejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectDescription(Boolean value) {
        this.leadRejectDescription = value;
    }

    /**
     * Gets the value of the leadRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLeadRejectReason() {
        if (leadRejectReason == null) {
            return false;
        } else {
            return leadRejectReason;
        }
    }

    /**
     * Sets the value of the leadRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadRejectReason(Boolean value) {
        this.leadRejectReason = value;
    }

    /**
     * Gets the value of the lostTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLostTime() {
        if (lostTime == null) {
            return false;
        } else {
            return lostTime;
        }
    }

    /**
     * Sets the value of the lostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLostTime(Boolean value) {
        this.lostTime = value;
    }

    /**
     * Gets the value of the managerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManagerValue() {
        if (managerValue == null) {
            return false;
        } else {
            return managerValue;
        }
    }

    /**
     * Sets the value of the managerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerValue(Boolean value) {
        this.managerValue = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isName() {
        if (name == null) {
            return false;
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotes() {
        if (notes == null) {
            return false;
        } else {
            return notes;
        }
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotes(Boolean value) {
        this.notes = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOrganization() {
        if (organization == null) {
            return false;
        } else {
            return organization;
        }
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganization(Boolean value) {
        this.organization = value;
    }

    /**
     * Gets the value of the otherContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOtherContacts() {
        if (otherContacts == null) {
            return false;
        } else {
            return otherContacts;
        }
    }

    /**
     * Sets the value of the otherContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherContacts(Boolean value) {
        this.otherContacts = value;
    }

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrimaryContact() {
        if (primaryContact == null) {
            return false;
        } else {
            return primaryContact;
        }
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryContact(Boolean value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the quotes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQuotes() {
        if (quotes == null) {
            return false;
        } else {
            return quotes;
        }
    }

    /**
     * Sets the value of the quotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuotes(Boolean value) {
        this.quotes = value;
    }

    /**
     * Gets the value of the recallTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecallTime() {
        if (recallTime == null) {
            return false;
        } else {
            return recallTime;
        }
    }

    /**
     * Sets the value of the recallTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallTime(Boolean value) {
        this.recallTime = value;
    }

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnValue() {
        if (returnValue == null) {
            return false;
        } else {
            return returnValue;
        }
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnValue(Boolean value) {
        this.returnValue = value;
    }

    /**
     * Gets the value of the salesRepresentativeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSalesRepresentativeValue() {
        if (salesRepresentativeValue == null) {
            return false;
        } else {
            return salesRepresentativeValue;
        }
    }

    /**
     * Sets the value of the salesRepresentativeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesRepresentativeValue(Boolean value) {
        this.salesRepresentativeValue = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSummary() {
        if (summary == null) {
            return false;
        } else {
            return summary;
        }
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummary(Boolean value) {
        this.summary = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTerritory() {
        if (territory == null) {
            return false;
        } else {
            return territory;
        }
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerritory(Boolean value) {
        this.territory = value;
    }

    /**
     * Gets the value of the winLossDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossDescription() {
        if (winLossDescription == null) {
            return false;
        } else {
            return winLossDescription;
        }
    }

    /**
     * Sets the value of the winLossDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossDescription(Boolean value) {
        this.winLossDescription = value;
    }

    /**
     * Gets the value of the winLossReason property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWinLossReason() {
        if (winLossReason == null) {
            return false;
        } else {
            return winLossReason;
        }
    }

    /**
     * Sets the value of the winLossReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLossReason(Boolean value) {
        this.winLossReason = value;
    }

}
