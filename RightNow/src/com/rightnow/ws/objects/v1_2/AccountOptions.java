
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForcePasswordChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermanentlyDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StaffAssignmentDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ViewsReportsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOptions", propOrder = {
    "accountLocked",
    "forcePasswordChange",
    "passwordNeverExpires",
    "permanentlyDisabled",
    "staffAssignmentDisabled",
    "viewsReportsDisabled"
})
public class AccountOptions {

    @XmlElement(name = "AccountLocked")
    protected Boolean accountLocked;
    @XmlElement(name = "ForcePasswordChange")
    protected Boolean forcePasswordChange;
    @XmlElement(name = "PasswordNeverExpires")
    protected Boolean passwordNeverExpires;
    @XmlElement(name = "PermanentlyDisabled")
    protected Boolean permanentlyDisabled;
    @XmlElement(name = "StaffAssignmentDisabled")
    protected Boolean staffAssignmentDisabled;
    @XmlElement(name = "ViewsReportsDisabled")
    protected Boolean viewsReportsDisabled;

    /**
     * Gets the value of the accountLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLocked() {
        return accountLocked;
    }

    /**
     * Sets the value of the accountLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLocked(Boolean value) {
        this.accountLocked = value;
    }

    /**
     * Gets the value of the forcePasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcePasswordChange() {
        return forcePasswordChange;
    }

    /**
     * Sets the value of the forcePasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePasswordChange(Boolean value) {
        this.forcePasswordChange = value;
    }

    /**
     * Gets the value of the passwordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordNeverExpires() {
        return passwordNeverExpires;
    }

    /**
     * Sets the value of the passwordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordNeverExpires(Boolean value) {
        this.passwordNeverExpires = value;
    }

    /**
     * Gets the value of the permanentlyDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentlyDisabled() {
        return permanentlyDisabled;
    }

    /**
     * Sets the value of the permanentlyDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentlyDisabled(Boolean value) {
        this.permanentlyDisabled = value;
    }

    /**
     * Gets the value of the staffAssignmentDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaffAssignmentDisabled() {
        return staffAssignmentDisabled;
    }

    /**
     * Sets the value of the staffAssignmentDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaffAssignmentDisabled(Boolean value) {
        this.staffAssignmentDisabled = value;
    }

    /**
     * Gets the value of the viewsReportsDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewsReportsDisabled() {
        return viewsReportsDisabled;
    }

    /**
     * Sets the value of the viewsReportsDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewsReportsDisabled(Boolean value) {
        this.viewsReportsDisabled = value;
    }

}
