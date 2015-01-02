
package com.rightnow.ws.objects.v1_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDDeltaList;
import com.rightnow.ws.base.v1_2.NamedIDHierarchy;
import com.rightnow.ws.base.v1_2.NamedIDHierarchyList;
import com.rightnow.ws.base.v1_2.NamedIDList;
import com.rightnow.ws.nullfields.v1_2.AccountNullFields;
import com.rightnow.ws.nullfields.v1_2.AccountSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.AddressNullFields;
import com.rightnow.ws.nullfields.v1_2.AnswerLinkNullFields;
import com.rightnow.ws.nullfields.v1_2.AnswerNotificationNullFields;
import com.rightnow.ws.nullfields.v1_2.AnswerNullFields;
import com.rightnow.ws.nullfields.v1_2.BannerNullFields;
import com.rightnow.ws.nullfields.v1_2.ChannelUsernameNullFields;
import com.rightnow.ws.nullfields.v1_2.ContactMarketingSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.ContactNullFields;
import com.rightnow.ws.nullfields.v1_2.ContactSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.ContactServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.GroupAccountNullFields;
import com.rightnow.ws.nullfields.v1_2.IncidentNullFields;
import com.rightnow.ws.nullfields.v1_2.LabelNullFields;
import com.rightnow.ws.nullfields.v1_2.MonetaryValueNullFields;
import com.rightnow.ws.nullfields.v1_2.NoteNullFields;
import com.rightnow.ws.nullfields.v1_2.OpportunityContactNullFields;
import com.rightnow.ws.nullfields.v1_2.OpportunityNullFields;
import com.rightnow.ws.nullfields.v1_2.OrganizationNullFields;
import com.rightnow.ws.nullfields.v1_2.OrganizationSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.OrganizationServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.PersonNameNullFields;
import com.rightnow.ws.nullfields.v1_2.PurchasedProductNullFields;
import com.rightnow.ws.nullfields.v1_2.QuoteLineItemNullFields;
import com.rightnow.ws.nullfields.v1_2.QuoteNullFields;
import com.rightnow.ws.nullfields.v1_2.SalesProductNullFields;
import com.rightnow.ws.nullfields.v1_2.SalesProductScheduleNullFields;
import com.rightnow.ws.nullfields.v1_2.SalesTerritoryNullFields;
import com.rightnow.ws.nullfields.v1_2.ServiceCategoryNullFields;
import com.rightnow.ws.nullfields.v1_2.ServiceDispositionNullFields;
import com.rightnow.ws.nullfields.v1_2.ServiceProductNullFields;
import com.rightnow.ws.nullfields.v1_2.StageWithStrategyNullFields;
import com.rightnow.ws.nullfields.v1_2.StandardContentContentValueNullFields;
import com.rightnow.ws.nullfields.v1_2.StandardContentNullFields;
import com.rightnow.ws.nullfields.v1_2.TaskMarketingSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.TaskNullFields;
import com.rightnow.ws.nullfields.v1_2.TaskSalesSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.TaskServiceSettingsNullFields;
import com.rightnow.ws.nullfields.v1_2.ThreadNullFields;
import com.rightnow.ws.nullfields.v1_2.TimeBilledNullFields;
import com.rightnow.ws.nullfields.v1_2.VariableNullFields;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.objects.v1_2 package. 
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

    private final static QName _AccountServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AccountServiceSettings");
    private final static QName _PersonName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PersonName");
    private final static QName _IncidentContactList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "IncidentContactList");
    private final static QName _ContactSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactSalesSettings");
    private final static QName _Thread_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Thread");
    private final static QName _AnswerNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnswerNotificationList");
    private final static QName _Country_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Country");
    private final static QName _Email_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Email");
    private final static QName _Task_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Task");
    private final static QName _AnswerLink_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnswerLink");
    private final static QName _LabelList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LabelList");
    private final static QName _TimeBilledList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TimeBilledList");
    private final static QName _FileAttachmentList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentList");
    private final static QName _AnalyticsReportFilterAttributes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnalyticsReportFilterAttributes");
    private final static QName _ThreadList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ThreadList");
    private final static QName _FileAttachment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachment");
    private final static QName _StandardContentContentValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StandardContentContentValue");
    private final static QName _ProvinceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ProvinceList");
    private final static QName _StandardContentUsage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StandardContentUsage");
    private final static QName _TaskMarketingSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TaskMarketingSettings");
    private final static QName _FileAttachmentIncident_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentIncident");
    private final static QName _TaskServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TaskServiceSettings");
    private final static QName _SalesProductSchedule_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesProductSchedule");
    private final static QName _Note_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Note");
    private final static QName _LabelRequiredList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LabelRequiredList");
    private final static QName _ServiceDispositionList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceDispositionList");
    private final static QName _FileAttachmentIncidentList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentIncidentList");
    private final static QName _StatusWithType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StatusWithType");
    private final static QName _Banner_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Banner");
    private final static QName _CategoryNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CategoryNotificationList");
    private final static QName _Label_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Label");
    private final static QName _AccountSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AccountSalesSettings");
    private final static QName _ContactOpenIDAccountList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactOpenIDAccountList");
    private final static QName _FileAttachmentAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentAnswerList");
    private final static QName _Quote_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Quote");
    private final static QName _OrganizationServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OrganizationServiceSettings");
    private final static QName _SiteInterface_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SiteInterface");
    private final static QName _AccountOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AccountOptions");
    private final static QName _LabelRequired_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LabelRequired");
    private final static QName _PurchasedProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PurchasedProduct");
    private final static QName _ChannelTypeOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChannelTypeOptions");
    private final static QName _TaskSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TaskSalesSettings");
    private final static QName _InterfaceValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InterfaceValue");
    private final static QName _OrganizationSalesSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OrganizationSalesSettings");
    private final static QName _AnalyticsReportSearchFilter_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnalyticsReportSearchFilter");
    private final static QName _FileAttachmentShared_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentShared");
    private final static QName _AnalyticsReportColumn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnalyticsReportColumn");
    private final static QName _ServiceMailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceMailbox");
    private final static QName _Phone_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Phone");
    private final static QName _Opportunity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Opportunity");
    private final static QName _ServiceProductList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceProductList");
    private final static QName _FileAttachmentAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentAnswer");
    private final static QName _PersonFullName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PersonFullName");
    private final static QName _TypedAddressList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TypedAddressList");
    private final static QName _SalesProductScheduleList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesProductScheduleList");
    private final static QName _SLAInstance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SLAInstance");
    private final static QName _Province_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Province");
    private final static QName _FileAttachmentCommon_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentCommon");
    private final static QName _FileAttachmentCommonList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentCommonList");
    private final static QName _ProductNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ProductNotification");
    private final static QName _IncidentContactDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "IncidentContactDelta");
    private final static QName _OpportunityContactDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OpportunityContactDelta");
    private final static QName _Incident_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Incident");
    private final static QName _EmailList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "EmailList");
    private final static QName _GroupAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "GroupAccount");
    private final static QName _CategoryNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CategoryNotification");
    private final static QName _QuoteList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "QuoteList");
    private final static QName _ServiceProductDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceProductDelta");
    private final static QName _Variable_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Variable");
    private final static QName _AnalyticsReport_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnalyticsReport");
    private final static QName _TypedAddress_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TypedAddress");
    private final static QName _ContactMarketingSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactMarketingSettings");
    private final static QName _ServiceDisposition_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceDisposition");
    private final static QName _Mailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Mailbox");
    private final static QName _MarketingMailbox_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MarketingMailbox");
    private final static QName _SLAInstanceList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SLAInstanceList");
    private final static QName _AnswerLinkList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnswerLinkList");
    private final static QName _QuoteLineItem_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "QuoteLineItem");
    private final static QName _Answer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Answer");
    private final static QName _ContactServiceSettings_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactServiceSettings");
    private final static QName _SalesTerritory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesTerritory");
    private final static QName _IncidentContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "IncidentContact");
    private final static QName _MonetaryValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MonetaryValue");
    private final static QName _Address_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Address");
    private final static QName _ServiceDispositionDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceDispositionDelta");
    private final static QName _ChannelType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChannelType");
    private final static QName _StandardContentContentValueList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StandardContentContentValueList");
    private final static QName _OpportunityContactList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OpportunityContactList");
    private final static QName _ServiceCategoryList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceCategoryList");
    private final static QName _AnswerNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnswerNotification");
    private final static QName _Organization_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Organization");
    private final static QName _InterfaceValueList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InterfaceValueList");
    private final static QName _NoteList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "NoteList");
    private final static QName _ChannelUsernameList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChannelUsernameList");
    private final static QName _SalesProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesProduct");
    private final static QName _AnalyticsReportFilter_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnalyticsReportFilter");
    private final static QName _OpportunityContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OpportunityContact");
    private final static QName _ChannelUsername_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChannelUsername");
    private final static QName _StageWithStrategy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StageWithStrategy");
    private final static QName _QuoteLineItemList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "QuoteLineItemList");
    private final static QName _CRMModules_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CRMModules");
    private final static QName _InheritOptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InheritOptions");
    private final static QName _ServiceProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceProduct");
    private final static QName _TimeBilled_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TimeBilled");
    private final static QName _ProductNotificationList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ProductNotificationList");
    private final static QName _Account_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Account");
    private final static QName _PhoneList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PhoneList");
    private final static QName _ServiceCategory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceCategory");
    private final static QName _StandardContent_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StandardContent");
    private final static QName _Contact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Contact");
    private final static QName _ContactOpenIDAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactOpenIDAccount");
    private final static QName _FileAttachmentSharedList_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachmentSharedList");
    private final static QName _ServiceCategoryDelta_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ServiceCategoryDelta");
    private final static QName _TaskMarketingSettingsValidNullFields_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ValidNullFields");
    private final static QName _TaskMarketingSettingsMailing_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Mailing");
    private final static QName _TaskMarketingSettingsSurvey_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Survey");
    private final static QName _TaskMarketingSettingsCampaign_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Campaign");
    private final static QName _TaskMarketingSettingsDocument_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Document");
    private final static QName _ContactPasswordEmailExpirationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PasswordEmailExpirationTime");
    private final static QName _ContactLogin_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Login");
    private final static QName _ContactNewPassword_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "NewPassword");
    private final static QName _ContactEmails_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Emails");
    private final static QName _ContactTitle_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Title");
    private final static QName _ContactFileAttachments_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FileAttachments");
    private final static QName _ContactChannelUsernames_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChannelUsernames");
    private final static QName _ContactNotes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Notes");
    private final static QName _ContactPasswordExpirationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PasswordExpirationTime");
    private final static QName _ContactContactType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactType");
    private final static QName _PurchasedProductFinalizedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "FinalizedByAccount");
    private final static QName _PurchasedProductComment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Comment");
    private final static QName _PurchasedProductPrice_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Price");
    private final static QName _PurchasedProductSerialNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SerialNumber");
    private final static QName _PurchasedProductPurchaseTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PurchaseTime");
    private final static QName _PurchasedProductLicenseStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LicenseStartTime");
    private final static QName _PurchasedProductLicenseEndTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LicenseEndTime");
    private final static QName _LabelLabelText_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LabelText");
    private final static QName _ServiceDispositionProductLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ProductLinks");
    private final static QName _ServiceDispositionParent_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Parent");
    private final static QName _ServiceDispositionDescriptions_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Descriptions");
    private final static QName _ServiceDispositionAdminVisibleInterfaces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdminVisibleInterfaces");
    private final static QName _AccountSalesSettingsTerritory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Territory");
    private final static QName _QuoteLineItemAdjustedDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdjustedDescription");
    private final static QName _QuoteLineItemProduct_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Product");
    private final static QName _QuoteLineItemAdjustedName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdjustedName");
    private final static QName _QuoteLineItemAdjustedTotal_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdjustedTotal");
    private final static QName _QuoteLineItemOriginalPartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OriginalPartNumber");
    private final static QName _QuoteLineItemAdjustedPartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdjustedPartNumber");
    private final static QName _QuoteLineItemOriginalName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OriginalName");
    private final static QName _QuoteLineItemOriginalDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OriginalDescription");
    private final static QName _QuoteLineItemAdjustedPrice_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdjustedPrice");
    private final static QName _NoteChannel_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Channel");
    private final static QName _SalesTerritoryTerritoryHierarchy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TerritoryHierarchy");
    private final static QName _SalesProductScheduleScheduleEndDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ScheduleEndDate");
    private final static QName _StandardContentHotKey_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "HotKey");
    private final static QName _StandardContentFolder_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Folder");
    private final static QName _StandardContentContentValues_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContentValues");
    private final static QName _AnswerNotificationInterface_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Interface");
    private final static QName _AnswerNotificationStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StartTime");
    private final static QName _ServiceProductCategoryLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CategoryLinks");
    private final static QName _ServiceProductDispositionLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "DispositionLinks");
    private final static QName _ServiceProductEndUserVisibleInterfaces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "EndUserVisibleInterfaces");
    private final static QName _TaskAssignedToAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AssignedToAccount");
    private final static QName _TaskPercentComplete_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PercentComplete");
    private final static QName _TaskPriority_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Priority");
    private final static QName _TaskPlannedCompletionTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PlannedCompletionTime");
    private final static QName _TaskCompletedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CompletedTime");
    private final static QName _TaskTaskType_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TaskType");
    private final static QName _TaskDueTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "DueTime");
    private final static QName _SalesProductSchedules_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Schedules");
    private final static QName _SalesProductPartNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PartNumber");
    private final static QName _VariableInterfaceValues_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InterfaceValues");
    private final static QName _TimeBilledBillableTask_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "BillableTask");
    private final static QName _OpportunityWinLossDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "WinLossDescription");
    private final static QName _OpportunityClosedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ClosedTime");
    private final static QName _OpportunityInitialContactDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InitialContactDate");
    private final static QName _OpportunityClosedValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ClosedValue");
    private final static QName _OpportunityLeadRejectDateTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDateTime");
    private final static QName _OpportunityManagerValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ManagerValue");
    private final static QName _OpportunityWinLossReason_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "WinLossReason");
    private final static QName _OpportunityReturnValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ReturnValue");
    private final static QName _OpportunityLeadRejectDescription_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectDescription");
    private final static QName _OpportunityOtherContacts_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OtherContacts");
    private final static QName _OpportunitySummary_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Summary");
    private final static QName _OpportunityQuotes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Quotes");
    private final static QName _OpportunityForecastCloseDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ForecastCloseDate");
    private final static QName _OpportunitySalesRepresentativeValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesRepresentativeValue");
    private final static QName _OpportunityRecallTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "RecallTime");
    private final static QName _OpportunityAccountHierarchy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AccountHierarchy");
    private final static QName _OpportunityLostTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LostTime");
    private final static QName _OpportunityName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Name");
    private final static QName _OpportunityCostOfSale_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CostOfSale");
    private final static QName _OpportunityPrimaryContact_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PrimaryContact");
    private final static QName _OpportunityLeadRejectReason_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LeadRejectReason");
    private final static QName _OpportunityContactContactRole_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactRole");
    private final static QName _StageWithStrategyStrategy_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Strategy");
    private final static QName _StageWithStrategyStage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Stage");
    private final static QName _OrganizationSalesSettingsTotalRevenue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "TotalRevenue");
    private final static QName _OrganizationSalesSettingsSalesAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SalesAccount");
    private final static QName _OrganizationSalesSettingsAcquiredDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AcquiredDate");
    private final static QName _CountryProvinces_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Provinces");
    private final static QName _StandardContentContentValueValue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Value");
    private final static QName _FileAttachmentUpdatedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "UpdatedTime");
    private final static QName _PersonNameLast_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Last");
    private final static QName _PersonNameFirst_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "First");
    private final static QName _ContactServiceSettingsProductNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ProductNotifications");
    private final static QName _ContactServiceSettingsSLAInstances_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SLAInstances");
    private final static QName _ContactServiceSettingsCategoryNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CategoryNotifications");
    private final static QName _ContactServiceSettingsAnswerNotifications_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AnswerNotifications");
    private final static QName _ThreadMailHeader_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MailHeader");
    private final static QName _BannerUpdatedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "UpdatedByAccount");
    private final static QName _BannerText_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Text");
    private final static QName _BannerImportanceFlag_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ImportanceFlag");
    private final static QName _QuoteTemplate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Template");
    private final static QName _QuoteOfferStartTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OfferStartTime");
    private final static QName _QuoteSentTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SentTime");
    private final static QName _QuoteStatus_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Status");
    private final static QName _QuoteOfferEndTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OfferEndTime");
    private final static QName _QuotePriceSchedule_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PriceSchedule");
    private final static QName _QuoteSentTo_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SentTo");
    private final static QName _QuoteTotal_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Total");
    private final static QName _QuoteLineItems_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LineItems");
    private final static QName _OrganizationNumberOfEmployees_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "NumberOfEmployees");
    private final static QName _OrganizationAddresses_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Addresses");
    private final static QName _OrganizationIndustry_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Industry");
    private final static QName _OrganizationNameFurigana_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "NameFurigana");
    private final static QName _IncidentInitialResponseDueTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InitialResponseDueTime");
    private final static QName _IncidentResponseInterval_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ResponseInterval");
    private final static QName _IncidentLastResponseTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LastResponseTime");
    private final static QName _IncidentSmartSenseStaff_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SmartSenseStaff");
    private final static QName _IncidentSeverity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Severity");
    private final static QName _IncidentCreatedByAccount_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CreatedByAccount");
    private final static QName _IncidentInitialSolutionTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "InitialSolutionTime");
    private final static QName _IncidentSmartSenseCustomer_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SmartSenseCustomer");
    private final static QName _IncidentQueue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Queue");
    private final static QName _IncidentSubject_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Subject");
    private final static QName _IncidentChatQueue_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ChatQueue");
    private final static QName _IncidentBilledMinutes_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "BilledMinutes");
    private final static QName _IncidentDisposition_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Disposition");
    private final static QName _IncidentResolutionInterval_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ResolutionInterval");
    private final static QName _IncidentCategory_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Category");
    private final static QName _IncidentLanguage_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Language");
    private final static QName _EmailCertificate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Certificate");
    private final static QName _MonetaryValueExchangeRate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ExchangeRate");
    private final static QName _GroupAccountStaffGroup_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StaffGroup");
    private final static QName _ContactMarketingSettingsMarketingOrganizationNameAlt_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MarketingOrganizationNameAlt");
    private final static QName _ContactMarketingSettingsContactLists_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ContactLists");
    private final static QName _ContactMarketingSettingsEmailFormat_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "EmailFormat");
    private final static QName _ContactMarketingSettingsMarketingOptIn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MarketingOptIn");
    private final static QName _ContactMarketingSettingsSurveyOptIn_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SurveyOptIn");
    private final static QName _ContactMarketingSettingsMarketingOrganizationName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "MarketingOrganizationName");
    private final static QName _AddressPostalCode_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PostalCode");
    private final static QName _AddressStreet_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Street");
    private final static QName _AddressStateOrProvince_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "StateOrProvince");
    private final static QName _AddressCity_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "City");
    private final static QName _AnswerLinkLearnedLinkStrength_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LearnedLinkStrength");
    private final static QName _AnswerProducts_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Products");
    private final static QName _AnswerAdminLastAccessTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AdminLastAccessTime");
    private final static QName _AnswerCategories_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Categories");
    private final static QName _AnswerNextNotificationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "NextNotificationTime");
    private final static QName _AnswerQuestion_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Question");
    private final static QName _AnswerSolution_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Solution");
    private final static QName _AnswerURL_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "URL");
    private final static QName _AnswerKeywords_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Keywords");
    private final static QName _AnswerExpiresDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "ExpiresDate");
    private final static QName _AnswerCommonAttachments_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CommonAttachments");
    private final static QName _AnswerAssignedSibling_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AssignedSibling");
    private final static QName _AnswerGuidedAssistance_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "GuidedAssistance");
    private final static QName _AnswerCommonComment_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "CommonComment");
    private final static QName _AnswerLastAccessTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LastAccessTime");
    private final static QName _AnswerPublishOnDate_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "PublishOnDate");
    private final static QName _AnswerLinks_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Links");
    private final static QName _AnswerAccessLevels_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "AccessLevels");
    private final static QName _AnswerSiblingAnswers_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "SiblingAnswers");
    private final static QName _AnswerLastNotificationTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "LastNotificationTime");
    private final static QName _AnswerOriginalReferenceNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "OriginalReferenceNumber");
    private final static QName _ChannelUsernameUsername_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Username");
    private final static QName _ChannelUsernameUserNumber_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "UserNumber");
    private final static QName _AccountManager_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Manager");
    private final static QName _AccountPhones_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Phones");
    private final static QName _AccountEmailNotification_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "EmailNotification");
    private final static QName _AccountDisplayName_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "DisplayName");
    private final static QName _AccountSignature_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Signature");
    private final static QName _AccountProfile_QNAME = new QName("urn:objects.ws.rightnow.com/v1_2", "Profile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.objects.v1_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InheritOptions }
     * 
     */
    public InheritOptions createInheritOptions() {
        return new InheritOptions();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link AccountServiceSettings }
     * 
     */
    public AccountServiceSettings createAccountServiceSettings() {
        return new AccountServiceSettings();
    }

    /**
     * Create an instance of {@link StandardContentContentValueList }
     * 
     */
    public StandardContentContentValueList createStandardContentContentValueList() {
        return new StandardContentContentValueList();
    }

    /**
     * Create an instance of {@link ServiceCategoryDelta }
     * 
     */
    public ServiceCategoryDelta createServiceCategoryDelta() {
        return new ServiceCategoryDelta();
    }

    /**
     * Create an instance of {@link AnswerLinkList }
     * 
     */
    public AnswerLinkList createAnswerLinkList() {
        return new AnswerLinkList();
    }

    /**
     * Create an instance of {@link ContactServiceSettings }
     * 
     */
    public ContactServiceSettings createContactServiceSettings() {
        return new ContactServiceSettings();
    }

    /**
     * Create an instance of {@link MonetaryValue }
     * 
     */
    public MonetaryValue createMonetaryValue() {
        return new MonetaryValue();
    }

    /**
     * Create an instance of {@link IncidentContactDelta }
     * 
     */
    public IncidentContactDelta createIncidentContactDelta() {
        return new IncidentContactDelta();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link TypedAddressList }
     * 
     */
    public TypedAddressList createTypedAddressList() {
        return new TypedAddressList();
    }

    /**
     * Create an instance of {@link IncidentContact }
     * 
     */
    public IncidentContact createIncidentContact() {
        return new IncidentContact();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswer }
     * 
     */
    public FileAttachmentAnswer createFileAttachmentAnswer() {
        return new FileAttachmentAnswer();
    }

    /**
     * Create an instance of {@link OpportunityContact }
     * 
     */
    public OpportunityContact createOpportunityContact() {
        return new OpportunityContact();
    }

    /**
     * Create an instance of {@link TypedAddress }
     * 
     */
    public TypedAddress createTypedAddress() {
        return new TypedAddress();
    }

    /**
     * Create an instance of {@link LabelRequired }
     * 
     */
    public LabelRequired createLabelRequired() {
        return new LabelRequired();
    }

    /**
     * Create an instance of {@link Incident }
     * 
     */
    public Incident createIncident() {
        return new Incident();
    }

    /**
     * Create an instance of {@link AnswerLink }
     * 
     */
    public AnswerLink createAnswerLink() {
        return new AnswerLink();
    }

    /**
     * Create an instance of {@link OpportunityContactList }
     * 
     */
    public OpportunityContactList createOpportunityContactList() {
        return new OpportunityContactList();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link FileAttachmentSharedList }
     * 
     */
    public FileAttachmentSharedList createFileAttachmentSharedList() {
        return new FileAttachmentSharedList();
    }

    /**
     * Create an instance of {@link ChannelUsernameList }
     * 
     */
    public ChannelUsernameList createChannelUsernameList() {
        return new ChannelUsernameList();
    }

    /**
     * Create an instance of {@link CategoryNotification }
     * 
     */
    public CategoryNotification createCategoryNotification() {
        return new CategoryNotification();
    }

    /**
     * Create an instance of {@link Province }
     * 
     */
    public Province createProvince() {
        return new Province();
    }

    /**
     * Create an instance of {@link ChannelTypeOptions }
     * 
     */
    public ChannelTypeOptions createChannelTypeOptions() {
        return new ChannelTypeOptions();
    }

    /**
     * Create an instance of {@link QuoteLineItem }
     * 
     */
    public QuoteLineItem createQuoteLineItem() {
        return new QuoteLineItem();
    }

    /**
     * Create an instance of {@link ProductNotification }
     * 
     */
    public ProductNotification createProductNotification() {
        return new ProductNotification();
    }

    /**
     * Create an instance of {@link OpportunityContactDelta }
     * 
     */
    public OpportunityContactDelta createOpportunityContactDelta() {
        return new OpportunityContactDelta();
    }

    /**
     * Create an instance of {@link FileAttachmentIncidentList }
     * 
     */
    public FileAttachmentIncidentList createFileAttachmentIncidentList() {
        return new FileAttachmentIncidentList();
    }

    /**
     * Create an instance of {@link StandardContentContentValue }
     * 
     */
    public StandardContentContentValue createStandardContentContentValue() {
        return new StandardContentContentValue();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link Thread }
     * 
     */
    public Thread createThread() {
        return new Thread();
    }

    /**
     * Create an instance of {@link TaskServiceSettings }
     * 
     */
    public TaskServiceSettings createTaskServiceSettings() {
        return new TaskServiceSettings();
    }

    /**
     * Create an instance of {@link ContactMarketingSettings }
     * 
     */
    public ContactMarketingSettings createContactMarketingSettings() {
        return new ContactMarketingSettings();
    }

    /**
     * Create an instance of {@link QuoteList }
     * 
     */
    public QuoteList createQuoteList() {
        return new QuoteList();
    }

    /**
     * Create an instance of {@link Mailbox }
     * 
     */
    public Mailbox createMailbox() {
        return new Mailbox();
    }

    /**
     * Create an instance of {@link OrganizationServiceSettings }
     * 
     */
    public OrganizationServiceSettings createOrganizationServiceSettings() {
        return new OrganizationServiceSettings();
    }

    /**
     * Create an instance of {@link TaskMarketingSettings }
     * 
     */
    public TaskMarketingSettings createTaskMarketingSettings() {
        return new TaskMarketingSettings();
    }

    /**
     * Create an instance of {@link ServiceDispositionList }
     * 
     */
    public ServiceDispositionList createServiceDispositionList() {
        return new ServiceDispositionList();
    }

    /**
     * Create an instance of {@link AccountSalesSettings }
     * 
     */
    public AccountSalesSettings createAccountSalesSettings() {
        return new AccountSalesSettings();
    }

    /**
     * Create an instance of {@link FileAttachmentCommonList }
     * 
     */
    public FileAttachmentCommonList createFileAttachmentCommonList() {
        return new FileAttachmentCommonList();
    }

    /**
     * Create an instance of {@link MarketingMailbox }
     * 
     */
    public MarketingMailbox createMarketingMailbox() {
        return new MarketingMailbox();
    }

    /**
     * Create an instance of {@link AnswerNotificationList }
     * 
     */
    public AnswerNotificationList createAnswerNotificationList() {
        return new AnswerNotificationList();
    }

    /**
     * Create an instance of {@link SalesProductScheduleList }
     * 
     */
    public SalesProductScheduleList createSalesProductScheduleList() {
        return new SalesProductScheduleList();
    }

    /**
     * Create an instance of {@link SalesProductSchedule }
     * 
     */
    public SalesProductSchedule createSalesProductSchedule() {
        return new SalesProductSchedule();
    }

    /**
     * Create an instance of {@link ServiceProduct }
     * 
     */
    public ServiceProduct createServiceProduct() {
        return new ServiceProduct();
    }

    /**
     * Create an instance of {@link ContactOpenIDAccountList }
     * 
     */
    public ContactOpenIDAccountList createContactOpenIDAccountList() {
        return new ContactOpenIDAccountList();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link FileAttachmentIncident }
     * 
     */
    public FileAttachmentIncident createFileAttachmentIncident() {
        return new FileAttachmentIncident();
    }

    /**
     * Create an instance of {@link OrganizationSalesSettings }
     * 
     */
    public OrganizationSalesSettings createOrganizationSalesSettings() {
        return new OrganizationSalesSettings();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link StandardContentUsage }
     * 
     */
    public StandardContentUsage createStandardContentUsage() {
        return new StandardContentUsage();
    }

    /**
     * Create an instance of {@link FileAttachmentCommon }
     * 
     */
    public FileAttachmentCommon createFileAttachmentCommon() {
        return new FileAttachmentCommon();
    }

    /**
     * Create an instance of {@link ServiceDispositionDelta }
     * 
     */
    public ServiceDispositionDelta createServiceDispositionDelta() {
        return new ServiceDispositionDelta();
    }

    /**
     * Create an instance of {@link LabelList }
     * 
     */
    public LabelList createLabelList() {
        return new LabelList();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ChannelUsername }
     * 
     */
    public ChannelUsername createChannelUsername() {
        return new ChannelUsername();
    }

    /**
     * Create an instance of {@link ServiceProductList }
     * 
     */
    public ServiceProductList createServiceProductList() {
        return new ServiceProductList();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswerList }
     * 
     */
    public FileAttachmentAnswerList createFileAttachmentAnswerList() {
        return new FileAttachmentAnswerList();
    }

    /**
     * Create an instance of {@link TimeBilledList }
     * 
     */
    public TimeBilledList createTimeBilledList() {
        return new TimeBilledList();
    }

    /**
     * Create an instance of {@link ServiceMailbox }
     * 
     */
    public ServiceMailbox createServiceMailbox() {
        return new ServiceMailbox();
    }

    /**
     * Create an instance of {@link CRMModules }
     * 
     */
    public CRMModules createCRMModules() {
        return new CRMModules();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link SalesProduct }
     * 
     */
    public SalesProduct createSalesProduct() {
        return new SalesProduct();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link FileAttachmentList }
     * 
     */
    public FileAttachmentList createFileAttachmentList() {
        return new FileAttachmentList();
    }

    /**
     * Create an instance of {@link NoteList }
     * 
     */
    public NoteList createNoteList() {
        return new NoteList();
    }

    /**
     * Create an instance of {@link FileAttachmentShared }
     * 
     */
    public FileAttachmentShared createFileAttachmentShared() {
        return new FileAttachmentShared();
    }

    /**
     * Create an instance of {@link Banner }
     * 
     */
    public Banner createBanner() {
        return new Banner();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link SiteInterface }
     * 
     */
    public SiteInterface createSiteInterface() {
        return new SiteInterface();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link ProductNotificationList }
     * 
     */
    public ProductNotificationList createProductNotificationList() {
        return new ProductNotificationList();
    }

    /**
     * Create an instance of {@link ContactSalesSettings }
     * 
     */
    public ContactSalesSettings createContactSalesSettings() {
        return new ContactSalesSettings();
    }

    /**
     * Create an instance of {@link CategoryNotificationList }
     * 
     */
    public CategoryNotificationList createCategoryNotificationList() {
        return new CategoryNotificationList();
    }

    /**
     * Create an instance of {@link ServiceDisposition }
     * 
     */
    public ServiceDisposition createServiceDisposition() {
        return new ServiceDisposition();
    }

    /**
     * Create an instance of {@link ProvinceList }
     * 
     */
    public ProvinceList createProvinceList() {
        return new ProvinceList();
    }

    /**
     * Create an instance of {@link PhoneList }
     * 
     */
    public PhoneList createPhoneList() {
        return new PhoneList();
    }

    /**
     * Create an instance of {@link AnswerNotification }
     * 
     */
    public AnswerNotification createAnswerNotification() {
        return new AnswerNotification();
    }

    /**
     * Create an instance of {@link ContactOpenIDAccount }
     * 
     */
    public ContactOpenIDAccount createContactOpenIDAccount() {
        return new ContactOpenIDAccount();
    }

    /**
     * Create an instance of {@link StageWithStrategy }
     * 
     */
    public StageWithStrategy createStageWithStrategy() {
        return new StageWithStrategy();
    }

    /**
     * Create an instance of {@link ServiceCategory }
     * 
     */
    public ServiceCategory createServiceCategory() {
        return new ServiceCategory();
    }

    /**
     * Create an instance of {@link SLAInstance }
     * 
     */
    public SLAInstance createSLAInstance() {
        return new SLAInstance();
    }

    /**
     * Create an instance of {@link AccountOptions }
     * 
     */
    public AccountOptions createAccountOptions() {
        return new AccountOptions();
    }

    /**
     * Create an instance of {@link IncidentContactList }
     * 
     */
    public IncidentContactList createIncidentContactList() {
        return new IncidentContactList();
    }

    /**
     * Create an instance of {@link InterfaceValueList }
     * 
     */
    public InterfaceValueList createInterfaceValueList() {
        return new InterfaceValueList();
    }

    /**
     * Create an instance of {@link StatusWithType }
     * 
     */
    public StatusWithType createStatusWithType() {
        return new StatusWithType();
    }

    /**
     * Create an instance of {@link StandardContent }
     * 
     */
    public StandardContent createStandardContent() {
        return new StandardContent();
    }

    /**
     * Create an instance of {@link AnalyticsReportSearchFilter }
     * 
     */
    public AnalyticsReportSearchFilter createAnalyticsReportSearchFilter() {
        return new AnalyticsReportSearchFilter();
    }

    /**
     * Create an instance of {@link ThreadList }
     * 
     */
    public ThreadList createThreadList() {
        return new ThreadList();
    }

    /**
     * Create an instance of {@link QuoteLineItemList }
     * 
     */
    public QuoteLineItemList createQuoteLineItemList() {
        return new QuoteLineItemList();
    }

    /**
     * Create an instance of {@link ServiceProductDelta }
     * 
     */
    public ServiceProductDelta createServiceProductDelta() {
        return new ServiceProductDelta();
    }

    /**
     * Create an instance of {@link SLAInstanceList }
     * 
     */
    public SLAInstanceList createSLAInstanceList() {
        return new SLAInstanceList();
    }

    /**
     * Create an instance of {@link AnalyticsReport }
     * 
     */
    public AnalyticsReport createAnalyticsReport() {
        return new AnalyticsReport();
    }

    /**
     * Create an instance of {@link InterfaceValue }
     * 
     */
    public InterfaceValue createInterfaceValue() {
        return new InterfaceValue();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link LabelRequiredList }
     * 
     */
    public LabelRequiredList createLabelRequiredList() {
        return new LabelRequiredList();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link PurchasedProduct }
     * 
     */
    public PurchasedProduct createPurchasedProduct() {
        return new PurchasedProduct();
    }

    /**
     * Create an instance of {@link AnalyticsReportFilter }
     * 
     */
    public AnalyticsReportFilter createAnalyticsReportFilter() {
        return new AnalyticsReportFilter();
    }

    /**
     * Create an instance of {@link SalesTerritory }
     * 
     */
    public SalesTerritory createSalesTerritory() {
        return new SalesTerritory();
    }

    /**
     * Create an instance of {@link TimeBilled }
     * 
     */
    public TimeBilled createTimeBilled() {
        return new TimeBilled();
    }

    /**
     * Create an instance of {@link ServiceCategoryList }
     * 
     */
    public ServiceCategoryList createServiceCategoryList() {
        return new ServiceCategoryList();
    }

    /**
     * Create an instance of {@link AnalyticsReportFilterAttributes }
     * 
     */
    public AnalyticsReportFilterAttributes createAnalyticsReportFilterAttributes() {
        return new AnalyticsReportFilterAttributes();
    }

    /**
     * Create an instance of {@link EmailList }
     * 
     */
    public EmailList createEmailList() {
        return new EmailList();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link AnalyticsReportColumn }
     * 
     */
    public AnalyticsReportColumn createAnalyticsReportColumn() {
        return new AnalyticsReportColumn();
    }

    /**
     * Create an instance of {@link GroupAccount }
     * 
     */
    public GroupAccount createGroupAccount() {
        return new GroupAccount();
    }

    /**
     * Create an instance of {@link TaskSalesSettings }
     * 
     */
    public TaskSalesSettings createTaskSalesSettings() {
        return new TaskSalesSettings();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link PersonFullName }
     * 
     */
    public PersonFullName createPersonFullName() {
        return new PersonFullName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountServiceSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AccountServiceSettings")
    public JAXBElement<AccountServiceSettings> createAccountServiceSettings(AccountServiceSettings value) {
        return new JAXBElement<AccountServiceSettings>(_AccountServiceSettings_QNAME, AccountServiceSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PersonName")
    public JAXBElement<PersonName> createPersonName(PersonName value) {
        return new JAXBElement<PersonName>(_PersonName_QNAME, PersonName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "IncidentContactList")
    public JAXBElement<IncidentContactList> createIncidentContactList(IncidentContactList value) {
        return new JAXBElement<IncidentContactList>(_IncidentContactList_QNAME, IncidentContactList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactSalesSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactSalesSettings")
    public JAXBElement<ContactSalesSettings> createContactSalesSettings(ContactSalesSettings value) {
        return new JAXBElement<ContactSalesSettings>(_ContactSalesSettings_QNAME, ContactSalesSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Thread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Thread")
    public JAXBElement<Thread> createThread(Thread value) {
        return new JAXBElement<Thread>(_Thread_QNAME, Thread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnswerNotificationList")
    public JAXBElement<AnswerNotificationList> createAnswerNotificationList(AnswerNotificationList value) {
        return new JAXBElement<AnswerNotificationList>(_AnswerNotificationList_QNAME, AnswerNotificationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Country")
    public JAXBElement<Country> createCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Email }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Email")
    public JAXBElement<Email> createEmail(Email value) {
        return new JAXBElement<Email>(_Email_QNAME, Email.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Task")
    public JAXBElement<Task> createTask(Task value) {
        return new JAXBElement<Task>(_Task_QNAME, Task.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnswerLink")
    public JAXBElement<AnswerLink> createAnswerLink(AnswerLink value) {
        return new JAXBElement<AnswerLink>(_AnswerLink_QNAME, AnswerLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LabelList")
    public JAXBElement<LabelList> createLabelList(LabelList value) {
        return new JAXBElement<LabelList>(_LabelList_QNAME, LabelList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TimeBilledList")
    public JAXBElement<TimeBilledList> createTimeBilledList(TimeBilledList value) {
        return new JAXBElement<TimeBilledList>(_TimeBilledList_QNAME, TimeBilledList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentList")
    public JAXBElement<FileAttachmentList> createFileAttachmentList(FileAttachmentList value) {
        return new JAXBElement<FileAttachmentList>(_FileAttachmentList_QNAME, FileAttachmentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportFilterAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnalyticsReportFilterAttributes")
    public JAXBElement<AnalyticsReportFilterAttributes> createAnalyticsReportFilterAttributes(AnalyticsReportFilterAttributes value) {
        return new JAXBElement<AnalyticsReportFilterAttributes>(_AnalyticsReportFilterAttributes_QNAME, AnalyticsReportFilterAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ThreadList")
    public JAXBElement<ThreadList> createThreadList(ThreadList value) {
        return new JAXBElement<ThreadList>(_ThreadList_QNAME, ThreadList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachment")
    public JAXBElement<FileAttachment> createFileAttachment(FileAttachment value) {
        return new JAXBElement<FileAttachment>(_FileAttachment_QNAME, FileAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StandardContentContentValue")
    public JAXBElement<StandardContentContentValue> createStandardContentContentValue(StandardContentContentValue value) {
        return new JAXBElement<StandardContentContentValue>(_StandardContentContentValue_QNAME, StandardContentContentValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProvinceList")
    public JAXBElement<ProvinceList> createProvinceList(ProvinceList value) {
        return new JAXBElement<ProvinceList>(_ProvinceList_QNAME, ProvinceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StandardContentUsage")
    public JAXBElement<StandardContentUsage> createStandardContentUsage(StandardContentUsage value) {
        return new JAXBElement<StandardContentUsage>(_StandardContentUsage_QNAME, StandardContentUsage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMarketingSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TaskMarketingSettings")
    public JAXBElement<TaskMarketingSettings> createTaskMarketingSettings(TaskMarketingSettings value) {
        return new JAXBElement<TaskMarketingSettings>(_TaskMarketingSettings_QNAME, TaskMarketingSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentIncident")
    public JAXBElement<FileAttachmentIncident> createFileAttachmentIncident(FileAttachmentIncident value) {
        return new JAXBElement<FileAttachmentIncident>(_FileAttachmentIncident_QNAME, FileAttachmentIncident.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TaskServiceSettings")
    public JAXBElement<TaskServiceSettings> createTaskServiceSettings(TaskServiceSettings value) {
        return new JAXBElement<TaskServiceSettings>(_TaskServiceSettings_QNAME, TaskServiceSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesProductSchedule")
    public JAXBElement<SalesProductSchedule> createSalesProductSchedule(SalesProductSchedule value) {
        return new JAXBElement<SalesProductSchedule>(_SalesProductSchedule_QNAME, SalesProductSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequiredList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LabelRequiredList")
    public JAXBElement<LabelRequiredList> createLabelRequiredList(LabelRequiredList value) {
        return new JAXBElement<LabelRequiredList>(_LabelRequiredList_QNAME, LabelRequiredList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceDispositionList")
    public JAXBElement<ServiceDispositionList> createServiceDispositionList(ServiceDispositionList value) {
        return new JAXBElement<ServiceDispositionList>(_ServiceDispositionList_QNAME, ServiceDispositionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncidentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentIncidentList")
    public JAXBElement<FileAttachmentIncidentList> createFileAttachmentIncidentList(FileAttachmentIncidentList value) {
        return new JAXBElement<FileAttachmentIncidentList>(_FileAttachmentIncidentList_QNAME, FileAttachmentIncidentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusWithType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StatusWithType")
    public JAXBElement<StatusWithType> createStatusWithType(StatusWithType value) {
        return new JAXBElement<StatusWithType>(_StatusWithType_QNAME, StatusWithType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Banner")
    public JAXBElement<Banner> createBanner(Banner value) {
        return new JAXBElement<Banner>(_Banner_QNAME, Banner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CategoryNotificationList")
    public JAXBElement<CategoryNotificationList> createCategoryNotificationList(CategoryNotificationList value) {
        return new JAXBElement<CategoryNotificationList>(_CategoryNotificationList_QNAME, CategoryNotificationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Label }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Label")
    public JAXBElement<Label> createLabel(Label value) {
        return new JAXBElement<Label>(_Label_QNAME, Label.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSalesSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AccountSalesSettings")
    public JAXBElement<AccountSalesSettings> createAccountSalesSettings(AccountSalesSettings value) {
        return new JAXBElement<AccountSalesSettings>(_AccountSalesSettings_QNAME, AccountSalesSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactOpenIDAccountList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactOpenIDAccountList")
    public JAXBElement<ContactOpenIDAccountList> createContactOpenIDAccountList(ContactOpenIDAccountList value) {
        return new JAXBElement<ContactOpenIDAccountList>(_ContactOpenIDAccountList_QNAME, ContactOpenIDAccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentAnswerList")
    public JAXBElement<FileAttachmentAnswerList> createFileAttachmentAnswerList(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_FileAttachmentAnswerList_QNAME, FileAttachmentAnswerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Quote")
    public JAXBElement<Quote> createQuote(Quote value) {
        return new JAXBElement<Quote>(_Quote_QNAME, Quote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationServiceSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OrganizationServiceSettings")
    public JAXBElement<OrganizationServiceSettings> createOrganizationServiceSettings(OrganizationServiceSettings value) {
        return new JAXBElement<OrganizationServiceSettings>(_OrganizationServiceSettings_QNAME, OrganizationServiceSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SiteInterface")
    public JAXBElement<SiteInterface> createSiteInterface(SiteInterface value) {
        return new JAXBElement<SiteInterface>(_SiteInterface_QNAME, SiteInterface.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AccountOptions")
    public JAXBElement<AccountOptions> createAccountOptions(AccountOptions value) {
        return new JAXBElement<AccountOptions>(_AccountOptions_QNAME, AccountOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequired }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LabelRequired")
    public JAXBElement<LabelRequired> createLabelRequired(LabelRequired value) {
        return new JAXBElement<LabelRequired>(_LabelRequired_QNAME, LabelRequired.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchasedProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PurchasedProduct")
    public JAXBElement<PurchasedProduct> createPurchasedProduct(PurchasedProduct value) {
        return new JAXBElement<PurchasedProduct>(_PurchasedProduct_QNAME, PurchasedProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelTypeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChannelTypeOptions")
    public JAXBElement<ChannelTypeOptions> createChannelTypeOptions(ChannelTypeOptions value) {
        return new JAXBElement<ChannelTypeOptions>(_ChannelTypeOptions_QNAME, ChannelTypeOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSalesSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TaskSalesSettings")
    public JAXBElement<TaskSalesSettings> createTaskSalesSettings(TaskSalesSettings value) {
        return new JAXBElement<TaskSalesSettings>(_TaskSalesSettings_QNAME, TaskSalesSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InterfaceValue")
    public JAXBElement<InterfaceValue> createInterfaceValue(InterfaceValue value) {
        return new JAXBElement<InterfaceValue>(_InterfaceValue_QNAME, InterfaceValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSalesSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OrganizationSalesSettings")
    public JAXBElement<OrganizationSalesSettings> createOrganizationSalesSettings(OrganizationSalesSettings value) {
        return new JAXBElement<OrganizationSalesSettings>(_OrganizationSalesSettings_QNAME, OrganizationSalesSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportSearchFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnalyticsReportSearchFilter")
    public JAXBElement<AnalyticsReportSearchFilter> createAnalyticsReportSearchFilter(AnalyticsReportSearchFilter value) {
        return new JAXBElement<AnalyticsReportSearchFilter>(_AnalyticsReportSearchFilter_QNAME, AnalyticsReportSearchFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentShared }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentShared")
    public JAXBElement<FileAttachmentShared> createFileAttachmentShared(FileAttachmentShared value) {
        return new JAXBElement<FileAttachmentShared>(_FileAttachmentShared_QNAME, FileAttachmentShared.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportColumn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnalyticsReportColumn")
    public JAXBElement<AnalyticsReportColumn> createAnalyticsReportColumn(AnalyticsReportColumn value) {
        return new JAXBElement<AnalyticsReportColumn>(_AnalyticsReportColumn_QNAME, AnalyticsReportColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMailbox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceMailbox")
    public JAXBElement<ServiceMailbox> createServiceMailbox(ServiceMailbox value) {
        return new JAXBElement<ServiceMailbox>(_ServiceMailbox_QNAME, ServiceMailbox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Phone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Phone")
    public JAXBElement<Phone> createPhone(Phone value) {
        return new JAXBElement<Phone>(_Phone_QNAME, Phone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceProductList")
    public JAXBElement<ServiceProductList> createServiceProductList(ServiceProductList value) {
        return new JAXBElement<ServiceProductList>(_ServiceProductList_QNAME, ServiceProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentAnswer")
    public JAXBElement<FileAttachmentAnswer> createFileAttachmentAnswer(FileAttachmentAnswer value) {
        return new JAXBElement<FileAttachmentAnswer>(_FileAttachmentAnswer_QNAME, FileAttachmentAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFullName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PersonFullName")
    public JAXBElement<PersonFullName> createPersonFullName(PersonFullName value) {
        return new JAXBElement<PersonFullName>(_PersonFullName_QNAME, PersonFullName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddressList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TypedAddressList")
    public JAXBElement<TypedAddressList> createTypedAddressList(TypedAddressList value) {
        return new JAXBElement<TypedAddressList>(_TypedAddressList_QNAME, TypedAddressList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesProductScheduleList")
    public JAXBElement<SalesProductScheduleList> createSalesProductScheduleList(SalesProductScheduleList value) {
        return new JAXBElement<SalesProductScheduleList>(_SalesProductScheduleList_QNAME, SalesProductScheduleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SLAInstance")
    public JAXBElement<SLAInstance> createSLAInstance(SLAInstance value) {
        return new JAXBElement<SLAInstance>(_SLAInstance_QNAME, SLAInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Province }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Province")
    public JAXBElement<Province> createProvince(Province value) {
        return new JAXBElement<Province>(_Province_QNAME, Province.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentCommon")
    public JAXBElement<FileAttachmentCommon> createFileAttachmentCommon(FileAttachmentCommon value) {
        return new JAXBElement<FileAttachmentCommon>(_FileAttachmentCommon_QNAME, FileAttachmentCommon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentCommonList")
    public JAXBElement<FileAttachmentCommonList> createFileAttachmentCommonList(FileAttachmentCommonList value) {
        return new JAXBElement<FileAttachmentCommonList>(_FileAttachmentCommonList_QNAME, FileAttachmentCommonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProductNotification")
    public JAXBElement<ProductNotification> createProductNotification(ProductNotification value) {
        return new JAXBElement<ProductNotification>(_ProductNotification_QNAME, ProductNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "IncidentContactDelta")
    public JAXBElement<IncidentContactDelta> createIncidentContactDelta(IncidentContactDelta value) {
        return new JAXBElement<IncidentContactDelta>(_IncidentContactDelta_QNAME, IncidentContactDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OpportunityContactDelta")
    public JAXBElement<OpportunityContactDelta> createOpportunityContactDelta(OpportunityContactDelta value) {
        return new JAXBElement<OpportunityContactDelta>(_OpportunityContactDelta_QNAME, OpportunityContactDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Incident }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Incident")
    public JAXBElement<Incident> createIncident(Incident value) {
        return new JAXBElement<Incident>(_Incident_QNAME, Incident.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "EmailList")
    public JAXBElement<EmailList> createEmailList(EmailList value) {
        return new JAXBElement<EmailList>(_EmailList_QNAME, EmailList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "GroupAccount")
    public JAXBElement<GroupAccount> createGroupAccount(GroupAccount value) {
        return new JAXBElement<GroupAccount>(_GroupAccount_QNAME, GroupAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CategoryNotification")
    public JAXBElement<CategoryNotification> createCategoryNotification(CategoryNotification value) {
        return new JAXBElement<CategoryNotification>(_CategoryNotification_QNAME, CategoryNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "QuoteList")
    public JAXBElement<QuoteList> createQuoteList(QuoteList value) {
        return new JAXBElement<QuoteList>(_QuoteList_QNAME, QuoteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceProductDelta")
    public JAXBElement<ServiceProductDelta> createServiceProductDelta(ServiceProductDelta value) {
        return new JAXBElement<ServiceProductDelta>(_ServiceProductDelta_QNAME, ServiceProductDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Variable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Variable")
    public JAXBElement<Variable> createVariable(Variable value) {
        return new JAXBElement<Variable>(_Variable_QNAME, Variable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnalyticsReport")
    public JAXBElement<AnalyticsReport> createAnalyticsReport(AnalyticsReport value) {
        return new JAXBElement<AnalyticsReport>(_AnalyticsReport_QNAME, AnalyticsReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TypedAddress")
    public JAXBElement<TypedAddress> createTypedAddress(TypedAddress value) {
        return new JAXBElement<TypedAddress>(_TypedAddress_QNAME, TypedAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMarketingSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactMarketingSettings")
    public JAXBElement<ContactMarketingSettings> createContactMarketingSettings(ContactMarketingSettings value) {
        return new JAXBElement<ContactMarketingSettings>(_ContactMarketingSettings_QNAME, ContactMarketingSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDisposition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceDisposition")
    public JAXBElement<ServiceDisposition> createServiceDisposition(ServiceDisposition value) {
        return new JAXBElement<ServiceDisposition>(_ServiceDisposition_QNAME, ServiceDisposition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mailbox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Mailbox")
    public JAXBElement<Mailbox> createMailbox(Mailbox value) {
        return new JAXBElement<Mailbox>(_Mailbox_QNAME, Mailbox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingMailbox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MarketingMailbox")
    public JAXBElement<MarketingMailbox> createMarketingMailbox(MarketingMailbox value) {
        return new JAXBElement<MarketingMailbox>(_MarketingMailbox_QNAME, MarketingMailbox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SLAInstanceList")
    public JAXBElement<SLAInstanceList> createSLAInstanceList(SLAInstanceList value) {
        return new JAXBElement<SLAInstanceList>(_SLAInstanceList_QNAME, SLAInstanceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerLinkList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnswerLinkList")
    public JAXBElement<AnswerLinkList> createAnswerLinkList(AnswerLinkList value) {
        return new JAXBElement<AnswerLinkList>(_AnswerLinkList_QNAME, AnswerLinkList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "QuoteLineItem")
    public JAXBElement<QuoteLineItem> createQuoteLineItem(QuoteLineItem value) {
        return new JAXBElement<QuoteLineItem>(_QuoteLineItem_QNAME, QuoteLineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Answer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Answer")
    public JAXBElement<Answer> createAnswer(Answer value) {
        return new JAXBElement<Answer>(_Answer_QNAME, Answer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactServiceSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactServiceSettings")
    public JAXBElement<ContactServiceSettings> createContactServiceSettings(ContactServiceSettings value) {
        return new JAXBElement<ContactServiceSettings>(_ContactServiceSettings_QNAME, ContactServiceSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesTerritory")
    public JAXBElement<SalesTerritory> createSalesTerritory(SalesTerritory value) {
        return new JAXBElement<SalesTerritory>(_SalesTerritory_QNAME, SalesTerritory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "IncidentContact")
    public JAXBElement<IncidentContact> createIncidentContact(IncidentContact value) {
        return new JAXBElement<IncidentContact>(_IncidentContact_QNAME, IncidentContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MonetaryValue")
    public JAXBElement<MonetaryValue> createMonetaryValue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_MonetaryValue_QNAME, MonetaryValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceDispositionDelta")
    public JAXBElement<ServiceDispositionDelta> createServiceDispositionDelta(ServiceDispositionDelta value) {
        return new JAXBElement<ServiceDispositionDelta>(_ServiceDispositionDelta_QNAME, ServiceDispositionDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChannelType")
    public JAXBElement<ChannelType> createChannelType(ChannelType value) {
        return new JAXBElement<ChannelType>(_ChannelType_QNAME, ChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StandardContentContentValueList")
    public JAXBElement<StandardContentContentValueList> createStandardContentContentValueList(StandardContentContentValueList value) {
        return new JAXBElement<StandardContentContentValueList>(_StandardContentContentValueList_QNAME, StandardContentContentValueList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OpportunityContactList")
    public JAXBElement<OpportunityContactList> createOpportunityContactList(OpportunityContactList value) {
        return new JAXBElement<OpportunityContactList>(_OpportunityContactList_QNAME, OpportunityContactList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceCategoryList")
    public JAXBElement<ServiceCategoryList> createServiceCategoryList(ServiceCategoryList value) {
        return new JAXBElement<ServiceCategoryList>(_ServiceCategoryList_QNAME, ServiceCategoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnswerNotification")
    public JAXBElement<AnswerNotification> createAnswerNotification(AnswerNotification value) {
        return new JAXBElement<AnswerNotification>(_AnswerNotification_QNAME, AnswerNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InterfaceValueList")
    public JAXBElement<InterfaceValueList> createInterfaceValueList(InterfaceValueList value) {
        return new JAXBElement<InterfaceValueList>(_InterfaceValueList_QNAME, InterfaceValueList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NoteList")
    public JAXBElement<NoteList> createNoteList(NoteList value) {
        return new JAXBElement<NoteList>(_NoteList_QNAME, NoteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChannelUsernameList")
    public JAXBElement<ChannelUsernameList> createChannelUsernameList(ChannelUsernameList value) {
        return new JAXBElement<ChannelUsernameList>(_ChannelUsernameList_QNAME, ChannelUsernameList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesProduct")
    public JAXBElement<SalesProduct> createSalesProduct(SalesProduct value) {
        return new JAXBElement<SalesProduct>(_SalesProduct_QNAME, SalesProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyticsReportFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnalyticsReportFilter")
    public JAXBElement<AnalyticsReportFilter> createAnalyticsReportFilter(AnalyticsReportFilter value) {
        return new JAXBElement<AnalyticsReportFilter>(_AnalyticsReportFilter_QNAME, AnalyticsReportFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OpportunityContact")
    public JAXBElement<OpportunityContact> createOpportunityContact(OpportunityContact value) {
        return new JAXBElement<OpportunityContact>(_OpportunityContact_QNAME, OpportunityContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChannelUsername")
    public JAXBElement<ChannelUsername> createChannelUsername(ChannelUsername value) {
        return new JAXBElement<ChannelUsername>(_ChannelUsername_QNAME, ChannelUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StageWithStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StageWithStrategy")
    public JAXBElement<StageWithStrategy> createStageWithStrategy(StageWithStrategy value) {
        return new JAXBElement<StageWithStrategy>(_StageWithStrategy_QNAME, StageWithStrategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "QuoteLineItemList")
    public JAXBElement<QuoteLineItemList> createQuoteLineItemList(QuoteLineItemList value) {
        return new JAXBElement<QuoteLineItemList>(_QuoteLineItemList_QNAME, QuoteLineItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMModules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CRMModules")
    public JAXBElement<CRMModules> createCRMModules(CRMModules value) {
        return new JAXBElement<CRMModules>(_CRMModules_QNAME, CRMModules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InheritOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InheritOptions")
    public JAXBElement<InheritOptions> createInheritOptions(InheritOptions value) {
        return new JAXBElement<InheritOptions>(_InheritOptions_QNAME, InheritOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceProduct")
    public JAXBElement<ServiceProduct> createServiceProduct(ServiceProduct value) {
        return new JAXBElement<ServiceProduct>(_ServiceProduct_QNAME, ServiceProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TimeBilled")
    public JAXBElement<TimeBilled> createTimeBilled(TimeBilled value) {
        return new JAXBElement<TimeBilled>(_TimeBilled_QNAME, TimeBilled.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProductNotificationList")
    public JAXBElement<ProductNotificationList> createProductNotificationList(ProductNotificationList value) {
        return new JAXBElement<ProductNotificationList>(_ProductNotificationList_QNAME, ProductNotificationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PhoneList")
    public JAXBElement<PhoneList> createPhoneList(PhoneList value) {
        return new JAXBElement<PhoneList>(_PhoneList_QNAME, PhoneList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceCategory")
    public JAXBElement<ServiceCategory> createServiceCategory(ServiceCategory value) {
        return new JAXBElement<ServiceCategory>(_ServiceCategory_QNAME, ServiceCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StandardContent")
    public JAXBElement<StandardContent> createStandardContent(StandardContent value) {
        return new JAXBElement<StandardContent>(_StandardContent_QNAME, StandardContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactOpenIDAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactOpenIDAccount")
    public JAXBElement<ContactOpenIDAccount> createContactOpenIDAccount(ContactOpenIDAccount value) {
        return new JAXBElement<ContactOpenIDAccount>(_ContactOpenIDAccount_QNAME, ContactOpenIDAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachmentSharedList")
    public JAXBElement<FileAttachmentSharedList> createFileAttachmentSharedList(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_FileAttachmentSharedList_QNAME, FileAttachmentSharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryDelta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ServiceCategoryDelta")
    public JAXBElement<ServiceCategoryDelta> createServiceCategoryDelta(ServiceCategoryDelta value) {
        return new JAXBElement<ServiceCategoryDelta>(_ServiceCategoryDelta_QNAME, ServiceCategoryDelta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskMarketingSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = TaskMarketingSettings.class)
    public JAXBElement<TaskMarketingSettingsNullFields> createTaskMarketingSettingsValidNullFields(TaskMarketingSettingsNullFields value) {
        return new JAXBElement<TaskMarketingSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, TaskMarketingSettingsNullFields.class, TaskMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Mailing", scope = TaskMarketingSettings.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsMailing(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsMailing_QNAME, NamedID.class, TaskMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Survey", scope = TaskMarketingSettings.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsSurvey(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsSurvey_QNAME, NamedID.class, TaskMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Campaign", scope = TaskMarketingSettings.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsCampaign_QNAME, NamedID.class, TaskMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Document", scope = TaskMarketingSettings.class)
    public JAXBElement<NamedID> createTaskMarketingSettingsDocument(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsDocument_QNAME, NamedID.class, TaskMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PasswordEmailExpirationTime", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactPasswordEmailExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPasswordEmailExpirationTime_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Login", scope = Contact.class)
    public JAXBElement<String> createContactLogin(String value) {
        return new JAXBElement<String>(_ContactLogin_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NewPassword", scope = Contact.class)
    public JAXBElement<String> createContactNewPassword(String value) {
        return new JAXBElement<String>(_ContactNewPassword_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Emails", scope = Contact.class)
    public JAXBElement<EmailList> createContactEmails(EmailList value) {
        return new JAXBElement<EmailList>(_ContactEmails_QNAME, EmailList.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Title", scope = Contact.class)
    public JAXBElement<String> createContactTitle(String value) {
        return new JAXBElement<String>(_ContactTitle_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization", scope = Contact.class)
    public JAXBElement<NamedID> createContactOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Contact.class)
    public JAXBElement<FileAttachmentCommonList> createContactFileAttachments(FileAttachmentCommonList value) {
        return new JAXBElement<FileAttachmentCommonList>(_ContactFileAttachments_QNAME, FileAttachmentCommonList.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Contact.class)
    public JAXBElement<ContactNullFields> createContactValidNullFields(ContactNullFields value) {
        return new JAXBElement<ContactNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ContactNullFields.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Address", scope = Contact.class)
    public JAXBElement<Address> createContactAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChannelUsernames", scope = Contact.class)
    public JAXBElement<ChannelUsernameList> createContactChannelUsernames(ChannelUsernameList value) {
        return new JAXBElement<ChannelUsernameList>(_ContactChannelUsernames_QNAME, ChannelUsernameList.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Notes", scope = Contact.class)
    public JAXBElement<NoteList> createContactNotes(NoteList value) {
        return new JAXBElement<NoteList>(_ContactNotes_QNAME, NoteList.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PasswordExpirationTime", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactPasswordExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPasswordExpirationTime_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Banner", scope = Contact.class)
    public JAXBElement<Banner> createContactBanner(Banner value) {
        return new JAXBElement<Banner>(_Banner_QNAME, Banner.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactType", scope = Contact.class)
    public JAXBElement<NamedID> createContactContactType(NamedID value) {
        return new JAXBElement<NamedID>(_ContactContactType_QNAME, NamedID.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Mailing", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductMailing(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsMailing_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Contact", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FinalizedByAccount", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductFinalizedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_PurchasedProductFinalizedByAccount_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = PurchasedProduct.class)
    public JAXBElement<String> createPurchasedProductComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchasedProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = PurchasedProduct.class)
    public JAXBElement<PurchasedProductNullFields> createPurchasedProductValidNullFields(PurchasedProductNullFields value) {
        return new JAXBElement<PurchasedProductNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, PurchasedProductNullFields.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesProduct", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductSalesProduct(NamedID value) {
        return new JAXBElement<NamedID>(_SalesProduct_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Opportunity", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductOpportunity(NamedID value) {
        return new JAXBElement<NamedID>(_Opportunity_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Price", scope = PurchasedProduct.class)
    public JAXBElement<MonetaryValue> createPurchasedProductPrice(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_PurchasedProductPrice_QNAME, MonetaryValue.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Campaign", scope = PurchasedProduct.class)
    public JAXBElement<NamedID> createPurchasedProductCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsCampaign_QNAME, NamedID.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SerialNumber", scope = PurchasedProduct.class)
    public JAXBElement<String> createPurchasedProductSerialNumber(String value) {
        return new JAXBElement<String>(_PurchasedProductSerialNumber_QNAME, String.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PurchaseTime", scope = PurchasedProduct.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductPurchaseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductPurchaseTime_QNAME, XMLGregorianCalendar.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LicenseStartTime", scope = PurchasedProduct.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductLicenseStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductLicenseStartTime_QNAME, XMLGregorianCalendar.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LicenseEndTime", scope = PurchasedProduct.class)
    public JAXBElement<XMLGregorianCalendar> createPurchasedProductLicenseEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PurchasedProductLicenseEndTime_QNAME, XMLGregorianCalendar.class, PurchasedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Label.class)
    public JAXBElement<LabelNullFields> createLabelValidNullFields(LabelNullFields value) {
        return new JAXBElement<LabelNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, LabelNullFields.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LabelText", scope = Label.class)
    public JAXBElement<String> createLabelLabelText(String value) {
        return new JAXBElement<String>(_LabelLabelText_QNAME, String.class, Label.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ServiceDisposition.class)
    public JAXBElement<ServiceDispositionNullFields> createServiceDispositionValidNullFields(ServiceDispositionNullFields value) {
        return new JAXBElement<ServiceDispositionNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ServiceDispositionNullFields.class, ServiceDisposition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProductLinks", scope = ServiceDisposition.class)
    public JAXBElement<ServiceProductList> createServiceDispositionProductLinks(ServiceProductList value) {
        return new JAXBElement<ServiceProductList>(_ServiceDispositionProductLinks_QNAME, ServiceProductList.class, ServiceDisposition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Parent", scope = ServiceDisposition.class)
    public JAXBElement<NamedIDHierarchy> createServiceDispositionParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceDispositionParent_QNAME, NamedIDHierarchy.class, ServiceDisposition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Descriptions", scope = ServiceDisposition.class)
    public JAXBElement<LabelList> createServiceDispositionDescriptions(LabelList value) {
        return new JAXBElement<LabelList>(_ServiceDispositionDescriptions_QNAME, LabelList.class, ServiceDisposition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = ServiceDisposition.class)
    public JAXBElement<NamedIDDeltaList> createServiceDispositionAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceDisposition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = AccountSalesSettings.class)
    public JAXBElement<AccountSalesSettingsNullFields> createAccountSalesSettingsValidNullFields(AccountSalesSettingsNullFields value) {
        return new JAXBElement<AccountSalesSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AccountSalesSettingsNullFields.class, AccountSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Territory", scope = AccountSalesSettings.class)
    public JAXBElement<NamedIDHierarchy> createAccountSalesSettingsTerritory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountSalesSettingsTerritory_QNAME, NamedIDHierarchy.class, AccountSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = QuoteLineItem.class)
    public JAXBElement<QuoteLineItemNullFields> createQuoteLineItemValidNullFields(QuoteLineItemNullFields value) {
        return new JAXBElement<QuoteLineItemNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, QuoteLineItemNullFields.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedDescription", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemAdjustedDescription(String value) {
        return new JAXBElement<String>(_QuoteLineItemAdjustedDescription_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Product", scope = QuoteLineItem.class)
    public JAXBElement<NamedID> createQuoteLineItemProduct(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteLineItemProduct_QNAME, NamedID.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedName", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemAdjustedName(String value) {
        return new JAXBElement<String>(_QuoteLineItemAdjustedName_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedTotal", scope = QuoteLineItem.class)
    public JAXBElement<MonetaryValue> createQuoteLineItemAdjustedTotal(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_QuoteLineItemAdjustedTotal_QNAME, MonetaryValue.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OriginalPartNumber", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemOriginalPartNumber(String value) {
        return new JAXBElement<String>(_QuoteLineItemOriginalPartNumber_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedPartNumber", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemAdjustedPartNumber(String value) {
        return new JAXBElement<String>(_QuoteLineItemAdjustedPartNumber_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OriginalName", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemOriginalName(String value) {
        return new JAXBElement<String>(_QuoteLineItemOriginalName_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OriginalDescription", scope = QuoteLineItem.class)
    public JAXBElement<String> createQuoteLineItemOriginalDescription(String value) {
        return new JAXBElement<String>(_QuoteLineItemOriginalDescription_QNAME, String.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedPrice", scope = QuoteLineItem.class)
    public JAXBElement<MonetaryValue> createQuoteLineItemAdjustedPrice(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_QuoteLineItemAdjustedPrice_QNAME, MonetaryValue.class, QuoteLineItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Note.class)
    public JAXBElement<NoteNullFields> createNoteValidNullFields(NoteNullFields value) {
        return new JAXBElement<NoteNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, NoteNullFields.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Channel", scope = Note.class)
    public JAXBElement<NamedID> createNoteChannel(NamedID value) {
        return new JAXBElement<NamedID>(_NoteChannel_QNAME, NamedID.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTerritoryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = SalesTerritory.class)
    public JAXBElement<SalesTerritoryNullFields> createSalesTerritoryValidNullFields(SalesTerritoryNullFields value) {
        return new JAXBElement<SalesTerritoryNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, SalesTerritoryNullFields.class, SalesTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TerritoryHierarchy", scope = SalesTerritory.class)
    public JAXBElement<NamedIDList> createSalesTerritoryTerritoryHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_SalesTerritoryTerritoryHierarchy_QNAME, NamedIDList.class, SalesTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Parent", scope = SalesTerritory.class)
    public JAXBElement<NamedIDHierarchy> createSalesTerritoryParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceDispositionParent_QNAME, NamedIDHierarchy.class, SalesTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = SalesTerritory.class)
    public JAXBElement<NamedIDDeltaList> createSalesTerritoryAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, SalesTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = SalesTerritory.class)
    public JAXBElement<String> createSalesTerritoryComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, SalesTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = SalesProductSchedule.class)
    public JAXBElement<SalesProductScheduleNullFields> createSalesProductScheduleValidNullFields(SalesProductScheduleNullFields value) {
        return new JAXBElement<SalesProductScheduleNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, SalesProductScheduleNullFields.class, SalesProductSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ScheduleEndDate", scope = SalesProductSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createSalesProductScheduleScheduleEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesProductScheduleScheduleEndDate_QNAME, XMLGregorianCalendar.class, SalesProductSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = SalesProductSchedule.class)
    public JAXBElement<String> createSalesProductScheduleComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, SalesProductSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = StandardContent.class)
    public JAXBElement<StandardContentNullFields> createStandardContentValidNullFields(StandardContentNullFields value) {
        return new JAXBElement<StandardContentNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, StandardContentNullFields.class, StandardContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "HotKey", scope = StandardContent.class)
    public JAXBElement<String> createStandardContentHotKey(String value) {
        return new JAXBElement<String>(_StandardContentHotKey_QNAME, String.class, StandardContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Folder", scope = StandardContent.class)
    public JAXBElement<NamedIDHierarchy> createStandardContentFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_StandardContentFolder_QNAME, NamedIDHierarchy.class, StandardContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContentValues", scope = StandardContent.class)
    public JAXBElement<StandardContentContentValueList> createStandardContentContentValues(StandardContentContentValueList value) {
        return new JAXBElement<StandardContentContentValueList>(_StandardContentContentValues_QNAME, StandardContentContentValueList.class, StandardContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = StandardContent.class)
    public JAXBElement<NamedIDDeltaList> createStandardContentAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, StandardContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = AnswerNotification.class)
    public JAXBElement<AnswerNotificationNullFields> createAnswerNotificationValidNullFields(AnswerNotificationNullFields value) {
        return new JAXBElement<AnswerNotificationNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AnswerNotificationNullFields.class, AnswerNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Interface", scope = AnswerNotification.class)
    public JAXBElement<NamedID> createAnswerNotificationInterface(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerNotificationInterface_QNAME, NamedID.class, AnswerNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StartTime", scope = AnswerNotification.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerNotificationStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerNotificationStartTime_QNAME, XMLGregorianCalendar.class, AnswerNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ServiceProduct.class)
    public JAXBElement<ServiceProductNullFields> createServiceProductValidNullFields(ServiceProductNullFields value) {
        return new JAXBElement<ServiceProductNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ServiceProductNullFields.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Parent", scope = ServiceProduct.class)
    public JAXBElement<NamedIDHierarchy> createServiceProductParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceDispositionParent_QNAME, NamedIDHierarchy.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CategoryLinks", scope = ServiceProduct.class)
    public JAXBElement<ServiceCategoryList> createServiceProductCategoryLinks(ServiceCategoryList value) {
        return new JAXBElement<ServiceCategoryList>(_ServiceProductCategoryLinks_QNAME, ServiceCategoryList.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDispositionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "DispositionLinks", scope = ServiceProduct.class)
    public JAXBElement<ServiceDispositionList> createServiceProductDispositionLinks(ServiceDispositionList value) {
        return new JAXBElement<ServiceDispositionList>(_ServiceProductDispositionLinks_QNAME, ServiceDispositionList.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "EndUserVisibleInterfaces", scope = ServiceProduct.class)
    public JAXBElement<NamedIDDeltaList> createServiceProductEndUserVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceProductEndUserVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Descriptions", scope = ServiceProduct.class)
    public JAXBElement<LabelList> createServiceProductDescriptions(LabelList value) {
        return new JAXBElement<LabelList>(_ServiceDispositionDescriptions_QNAME, LabelList.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = ServiceProduct.class)
    public JAXBElement<NamedIDDeltaList> createServiceProductAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AssignedToAccount", scope = Task.class)
    public JAXBElement<NamedID> createTaskAssignedToAccount(NamedID value) {
        return new JAXBElement<NamedID>(_TaskAssignedToAccount_QNAME, NamedID.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Contact", scope = Task.class)
    public JAXBElement<NamedID> createTaskContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PercentComplete", scope = Task.class)
    public JAXBElement<Integer> createTaskPercentComplete(Integer value) {
        return new JAXBElement<Integer>(_TaskPercentComplete_QNAME, Integer.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Priority", scope = Task.class)
    public JAXBElement<NamedID> createTaskPriority(NamedID value) {
        return new JAXBElement<NamedID>(_TaskPriority_QNAME, NamedID.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization", scope = Task.class)
    public JAXBElement<NamedID> createTaskOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PlannedCompletionTime", scope = Task.class)
    public JAXBElement<XMLGregorianCalendar> createTaskPlannedCompletionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskPlannedCompletionTime_QNAME, XMLGregorianCalendar.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = Task.class)
    public JAXBElement<String> createTaskComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Task.class)
    public JAXBElement<FileAttachmentCommonList> createTaskFileAttachments(FileAttachmentCommonList value) {
        return new JAXBElement<FileAttachmentCommonList>(_ContactFileAttachments_QNAME, FileAttachmentCommonList.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Task.class)
    public JAXBElement<TaskNullFields> createTaskValidNullFields(TaskNullFields value) {
        return new JAXBElement<TaskNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, TaskNullFields.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CompletedTime", scope = Task.class)
    public JAXBElement<XMLGregorianCalendar> createTaskCompletedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskCompletedTime_QNAME, XMLGregorianCalendar.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Notes", scope = Task.class)
    public JAXBElement<NoteList> createTaskNotes(NoteList value) {
        return new JAXBElement<NoteList>(_ContactNotes_QNAME, NoteList.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TaskType", scope = Task.class)
    public JAXBElement<NamedID> createTaskTaskType(NamedID value) {
        return new JAXBElement<NamedID>(_TaskTaskType_QNAME, NamedID.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "DueTime", scope = Task.class)
    public JAXBElement<XMLGregorianCalendar> createTaskDueTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TaskDueTime_QNAME, XMLGregorianCalendar.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StartTime", scope = Task.class)
    public JAXBElement<XMLGregorianCalendar> createTaskStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerNotificationStartTime_QNAME, XMLGregorianCalendar.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = SalesProduct.class)
    public JAXBElement<SalesProductNullFields> createSalesProductValidNullFields(SalesProductNullFields value) {
        return new JAXBElement<SalesProductNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, SalesProductNullFields.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesProductScheduleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Schedules", scope = SalesProduct.class)
    public JAXBElement<SalesProductScheduleList> createSalesProductSchedules(SalesProductScheduleList value) {
        return new JAXBElement<SalesProductScheduleList>(_SalesProductSchedules_QNAME, SalesProductScheduleList.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Folder", scope = SalesProduct.class)
    public JAXBElement<NamedIDHierarchy> createSalesProductFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_StandardContentFolder_QNAME, NamedIDHierarchy.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Descriptions", scope = SalesProduct.class)
    public JAXBElement<LabelList> createSalesProductDescriptions(LabelList value) {
        return new JAXBElement<LabelList>(_ServiceDispositionDescriptions_QNAME, LabelList.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = SalesProduct.class)
    public JAXBElement<NamedIDDeltaList> createSalesProductAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PartNumber", scope = SalesProduct.class)
    public JAXBElement<String> createSalesProductPartNumber(String value) {
        return new JAXBElement<String>(_SalesProductPartNumber_QNAME, String.class, SalesProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Variable.class)
    public JAXBElement<VariableNullFields> createVariableValidNullFields(VariableNullFields value) {
        return new JAXBElement<VariableNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, VariableNullFields.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Folder", scope = Variable.class)
    public JAXBElement<NamedIDHierarchy> createVariableFolder(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_StandardContentFolder_QNAME, NamedIDHierarchy.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InterfaceValues", scope = Variable.class)
    public JAXBElement<InterfaceValueList> createVariableInterfaceValues(InterfaceValueList value) {
        return new JAXBElement<InterfaceValueList>(_VariableInterfaceValues_QNAME, InterfaceValueList.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = TimeBilled.class)
    public JAXBElement<TimeBilledNullFields> createTimeBilledValidNullFields(TimeBilledNullFields value) {
        return new JAXBElement<TimeBilledNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, TimeBilledNullFields.class, TimeBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "BillableTask", scope = TimeBilled.class)
    public JAXBElement<NamedID> createTimeBilledBillableTask(NamedID value) {
        return new JAXBElement<NamedID>(_TimeBilledBillableTask_QNAME, NamedID.class, TimeBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = TimeBilled.class)
    public JAXBElement<String> createTimeBilledComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, TimeBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Account", scope = TimeBilled.class)
    public JAXBElement<NamedID> createTimeBilledAccount(NamedID value) {
        return new JAXBElement<NamedID>(_Account_QNAME, NamedID.class, TimeBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "WinLossDescription", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityWinLossDescription(String value) {
        return new JAXBElement<String>(_OpportunityWinLossDescription_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ClosedTime", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityClosedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityClosedTime_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InitialContactDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityInitialContactDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityInitialContactDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization", scope = Opportunity.class)
    public JAXBElement<NamedID> createOpportunityOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Opportunity.class)
    public JAXBElement<FileAttachmentCommonList> createOpportunityFileAttachments(FileAttachmentCommonList value) {
        return new JAXBElement<FileAttachmentCommonList>(_ContactFileAttachments_QNAME, FileAttachmentCommonList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Territory", scope = Opportunity.class)
    public JAXBElement<NamedIDHierarchy> createOpportunityTerritory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountSalesSettingsTerritory_QNAME, NamedIDHierarchy.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Opportunity.class)
    public JAXBElement<OpportunityNullFields> createOpportunityValidNullFields(OpportunityNullFields value) {
        return new JAXBElement<OpportunityNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, OpportunityNullFields.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ClosedValue", scope = Opportunity.class)
    public JAXBElement<MonetaryValue> createOpportunityClosedValue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OpportunityClosedValue_QNAME, MonetaryValue.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TerritoryHierarchy", scope = Opportunity.class)
    public JAXBElement<NamedIDList> createOpportunityTerritoryHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_SalesTerritoryTerritoryHierarchy_QNAME, NamedIDList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LeadRejectDateTime", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadRejectDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadRejectDateTime_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ManagerValue", scope = Opportunity.class)
    public JAXBElement<MonetaryValue> createOpportunityManagerValue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OpportunityManagerValue_QNAME, MonetaryValue.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "WinLossReason", scope = Opportunity.class)
    public JAXBElement<NamedID> createOpportunityWinLossReason(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityWinLossReason_QNAME, NamedID.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ReturnValue", scope = Opportunity.class)
    public JAXBElement<MonetaryValue> createOpportunityReturnValue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OpportunityReturnValue_QNAME, MonetaryValue.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AssignedToAccount", scope = Opportunity.class)
    public JAXBElement<NamedIDHierarchy> createOpportunityAssignedToAccount(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_TaskAssignedToAccount_QNAME, NamedIDHierarchy.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Survey", scope = Opportunity.class)
    public JAXBElement<NamedID> createOpportunitySurvey(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsSurvey_QNAME, NamedID.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LeadRejectDescription", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLeadRejectDescription(String value) {
        return new JAXBElement<String>(_OpportunityLeadRejectDescription_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OtherContacts", scope = Opportunity.class)
    public JAXBElement<OpportunityContactList> createOpportunityOtherContacts(OpportunityContactList value) {
        return new JAXBElement<OpportunityContactList>(_OpportunityOtherContacts_QNAME, OpportunityContactList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Summary", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySummary(String value) {
        return new JAXBElement<String>(_OpportunitySummary_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Quotes", scope = Opportunity.class)
    public JAXBElement<QuoteList> createOpportunityQuotes(QuoteList value) {
        return new JAXBElement<QuoteList>(_OpportunityQuotes_QNAME, QuoteList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ForecastCloseDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityForecastCloseDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesRepresentativeValue", scope = Opportunity.class)
    public JAXBElement<MonetaryValue> createOpportunitySalesRepresentativeValue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OpportunitySalesRepresentativeValue_QNAME, MonetaryValue.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "RecallTime", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityRecallTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityRecallTime_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AccountHierarchy", scope = Opportunity.class)
    public JAXBElement<NamedIDList> createOpportunityAccountHierarchy(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_OpportunityAccountHierarchy_QNAME, NamedIDList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Campaign", scope = Opportunity.class)
    public JAXBElement<NamedID> createOpportunityCampaign(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsCampaign_QNAME, NamedID.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LostTime", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLostTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLostTime_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Name", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityName(String value) {
        return new JAXBElement<String>(_OpportunityName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Notes", scope = Opportunity.class)
    public JAXBElement<NoteList> createOpportunityNotes(NoteList value) {
        return new JAXBElement<NoteList>(_ContactNotes_QNAME, NoteList.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CostOfSale", scope = Opportunity.class)
    public JAXBElement<MonetaryValue> createOpportunityCostOfSale(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OpportunityCostOfSale_QNAME, MonetaryValue.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Banner", scope = Opportunity.class)
    public JAXBElement<Banner> createOpportunityBanner(Banner value) {
        return new JAXBElement<Banner>(_Banner_QNAME, Banner.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PrimaryContact", scope = Opportunity.class)
    public JAXBElement<OpportunityContact> createOpportunityPrimaryContact(OpportunityContact value) {
        return new JAXBElement<OpportunityContact>(_OpportunityPrimaryContact_QNAME, OpportunityContact.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LeadRejectReason", scope = Opportunity.class)
    public JAXBElement<NamedID> createOpportunityLeadRejectReason(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityLeadRejectReason_QNAME, NamedID.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContactNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = OpportunityContact.class)
    public JAXBElement<OpportunityContactNullFields> createOpportunityContactValidNullFields(OpportunityContactNullFields value) {
        return new JAXBElement<OpportunityContactNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, OpportunityContactNullFields.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactRole", scope = OpportunityContact.class)
    public JAXBElement<NamedID> createOpportunityContactContactRole(NamedID value) {
        return new JAXBElement<NamedID>(_OpportunityContactContactRole_QNAME, NamedID.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StageWithStrategyNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = StageWithStrategy.class)
    public JAXBElement<StageWithStrategyNullFields> createStageWithStrategyValidNullFields(StageWithStrategyNullFields value) {
        return new JAXBElement<StageWithStrategyNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, StageWithStrategyNullFields.class, StageWithStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Strategy", scope = StageWithStrategy.class)
    public JAXBElement<NamedID> createStageWithStrategyStrategy(NamedID value) {
        return new JAXBElement<NamedID>(_StageWithStrategyStrategy_QNAME, NamedID.class, StageWithStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Stage", scope = StageWithStrategy.class)
    public JAXBElement<NamedID> createStageWithStrategyStage(NamedID value) {
        return new JAXBElement<NamedID>(_StageWithStrategyStage_QNAME, NamedID.class, StageWithStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = OrganizationSalesSettings.class)
    public JAXBElement<OrganizationSalesSettingsNullFields> createOrganizationSalesSettingsValidNullFields(OrganizationSalesSettingsNullFields value) {
        return new JAXBElement<OrganizationSalesSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, OrganizationSalesSettingsNullFields.class, OrganizationSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "TotalRevenue", scope = OrganizationSalesSettings.class)
    public JAXBElement<MonetaryValue> createOrganizationSalesSettingsTotalRevenue(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_OrganizationSalesSettingsTotalRevenue_QNAME, MonetaryValue.class, OrganizationSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesAccount", scope = OrganizationSalesSettings.class)
    public JAXBElement<NamedID> createOrganizationSalesSettingsSalesAccount(NamedID value) {
        return new JAXBElement<NamedID>(_OrganizationSalesSettingsSalesAccount_QNAME, NamedID.class, OrganizationSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AcquiredDate", scope = OrganizationSalesSettings.class)
    public JAXBElement<XMLGregorianCalendar> createOrganizationSalesSettingsAcquiredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationSalesSettingsAcquiredDate_QNAME, XMLGregorianCalendar.class, OrganizationSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Provinces", scope = Country.class)
    public JAXBElement<ProvinceList> createCountryProvinces(ProvinceList value) {
        return new JAXBElement<ProvinceList>(_CountryProvinces_QNAME, ProvinceList.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardContentContentValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = StandardContentContentValue.class)
    public JAXBElement<StandardContentContentValueNullFields> createStandardContentContentValueValidNullFields(StandardContentContentValueNullFields value) {
        return new JAXBElement<StandardContentContentValueNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, StandardContentContentValueNullFields.class, StandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Value", scope = StandardContentContentValue.class)
    public JAXBElement<String> createStandardContentContentValueValue(String value) {
        return new JAXBElement<String>(_StandardContentContentValueValue_QNAME, String.class, StandardContentContentValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "UpdatedTime", scope = FileAttachment.class)
    public JAXBElement<XMLGregorianCalendar> createFileAttachmentUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileAttachmentUpdatedTime_QNAME, XMLGregorianCalendar.class, FileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = PersonName.class)
    public JAXBElement<PersonNameNullFields> createPersonNameValidNullFields(PersonNameNullFields value) {
        return new JAXBElement<PersonNameNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, PersonNameNullFields.class, PersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Last", scope = PersonName.class)
    public JAXBElement<String> createPersonNameLast(String value) {
        return new JAXBElement<String>(_PersonNameLast_QNAME, String.class, PersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "First", scope = PersonName.class)
    public JAXBElement<String> createPersonNameFirst(String value) {
        return new JAXBElement<String>(_PersonNameFirst_QNAME, String.class, PersonName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ContactServiceSettings.class)
    public JAXBElement<ContactServiceSettingsNullFields> createContactServiceSettingsValidNullFields(ContactServiceSettingsNullFields value) {
        return new JAXBElement<ContactServiceSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ContactServiceSettingsNullFields.class, ContactServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProductNotifications", scope = ContactServiceSettings.class)
    public JAXBElement<ProductNotificationList> createContactServiceSettingsProductNotifications(ProductNotificationList value) {
        return new JAXBElement<ProductNotificationList>(_ContactServiceSettingsProductNotifications_QNAME, ProductNotificationList.class, ContactServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SLAInstances", scope = ContactServiceSettings.class)
    public JAXBElement<SLAInstanceList> createContactServiceSettingsSLAInstances(SLAInstanceList value) {
        return new JAXBElement<SLAInstanceList>(_ContactServiceSettingsSLAInstances_QNAME, SLAInstanceList.class, ContactServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CategoryNotifications", scope = ContactServiceSettings.class)
    public JAXBElement<CategoryNotificationList> createContactServiceSettingsCategoryNotifications(CategoryNotificationList value) {
        return new JAXBElement<CategoryNotificationList>(_ContactServiceSettingsCategoryNotifications_QNAME, CategoryNotificationList.class, ContactServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNotificationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AnswerNotifications", scope = ContactServiceSettings.class)
    public JAXBElement<AnswerNotificationList> createContactServiceSettingsAnswerNotifications(AnswerNotificationList value) {
        return new JAXBElement<AnswerNotificationList>(_ContactServiceSettingsAnswerNotifications_QNAME, AnswerNotificationList.class, ContactServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Thread.class)
    public JAXBElement<ThreadNullFields> createThreadValidNullFields(ThreadNullFields value) {
        return new JAXBElement<ThreadNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ThreadNullFields.class, Thread.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Contact", scope = Thread.class)
    public JAXBElement<NamedID> createThreadContact(NamedID value) {
        return new JAXBElement<NamedID>(_Contact_QNAME, NamedID.class, Thread.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Channel", scope = Thread.class)
    public JAXBElement<NamedID> createThreadChannel(NamedID value) {
        return new JAXBElement<NamedID>(_NoteChannel_QNAME, NamedID.class, Thread.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MailHeader", scope = Thread.class)
    public JAXBElement<String> createThreadMailHeader(String value) {
        return new JAXBElement<String>(_ThreadMailHeader_QNAME, String.class, Thread.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Account", scope = Thread.class)
    public JAXBElement<NamedID> createThreadAccount(NamedID value) {
        return new JAXBElement<NamedID>(_Account_QNAME, NamedID.class, Thread.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Banner.class)
    public JAXBElement<BannerNullFields> createBannerValidNullFields(BannerNullFields value) {
        return new JAXBElement<BannerNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, BannerNullFields.class, Banner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "UpdatedByAccount", scope = Banner.class)
    public JAXBElement<NamedID> createBannerUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerUpdatedByAccount_QNAME, NamedID.class, Banner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Text", scope = Banner.class)
    public JAXBElement<String> createBannerText(String value) {
        return new JAXBElement<String>(_BannerText_QNAME, String.class, Banner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ImportanceFlag", scope = Banner.class)
    public JAXBElement<NamedID> createBannerImportanceFlag(NamedID value) {
        return new JAXBElement<NamedID>(_BannerImportanceFlag_QNAME, NamedID.class, Banner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "UpdatedTime", scope = Banner.class)
    public JAXBElement<XMLGregorianCalendar> createBannerUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileAttachmentUpdatedTime_QNAME, XMLGregorianCalendar.class, Banner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Template", scope = Quote.class)
    public JAXBElement<NamedID> createQuoteTemplate(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteTemplate_QNAME, NamedID.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OfferStartTime", scope = Quote.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteOfferStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteOfferStartTime_QNAME, XMLGregorianCalendar.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = Quote.class)
    public JAXBElement<String> createQuoteComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Quote.class)
    public JAXBElement<FileAttachmentList> createQuoteFileAttachments(FileAttachmentList value) {
        return new JAXBElement<FileAttachmentList>(_ContactFileAttachments_QNAME, FileAttachmentList.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Quote.class)
    public JAXBElement<QuoteNullFields> createQuoteValidNullFields(QuoteNullFields value) {
        return new JAXBElement<QuoteNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, QuoteNullFields.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SentTime", scope = Quote.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteSentTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteSentTime_QNAME, XMLGregorianCalendar.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Status", scope = Quote.class)
    public JAXBElement<NamedID> createQuoteStatus(NamedID value) {
        return new JAXBElement<NamedID>(_QuoteStatus_QNAME, NamedID.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OfferEndTime", scope = Quote.class)
    public JAXBElement<XMLGregorianCalendar> createQuoteOfferEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QuoteOfferEndTime_QNAME, XMLGregorianCalendar.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PriceSchedule", scope = Quote.class)
    public JAXBElement<NamedID> createQuotePriceSchedule(NamedID value) {
        return new JAXBElement<NamedID>(_QuotePriceSchedule_QNAME, NamedID.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SentTo", scope = Quote.class)
    public JAXBElement<String> createQuoteSentTo(String value) {
        return new JAXBElement<String>(_QuoteSentTo_QNAME, String.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdjustedTotal", scope = Quote.class)
    public JAXBElement<MonetaryValue> createQuoteAdjustedTotal(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_QuoteLineItemAdjustedTotal_QNAME, MonetaryValue.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Total", scope = Quote.class)
    public JAXBElement<MonetaryValue> createQuoteTotal(MonetaryValue value) {
        return new JAXBElement<MonetaryValue>(_QuoteTotal_QNAME, MonetaryValue.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLineItemList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LineItems", scope = Quote.class)
    public JAXBElement<QuoteLineItemList> createQuoteLineItems(QuoteLineItemList value) {
        return new JAXBElement<QuoteLineItemList>(_QuoteLineItems_QNAME, QuoteLineItemList.class, Quote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = TaskServiceSettings.class)
    public JAXBElement<TaskServiceSettingsNullFields> createTaskServiceSettingsValidNullFields(TaskServiceSettingsNullFields value) {
        return new JAXBElement<TaskServiceSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, TaskServiceSettingsNullFields.class, TaskServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Answer", scope = TaskServiceSettings.class)
    public JAXBElement<NamedID> createTaskServiceSettingsAnswer(NamedID value) {
        return new JAXBElement<NamedID>(_Answer_QNAME, NamedID.class, TaskServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Incident", scope = TaskServiceSettings.class)
    public JAXBElement<NamedID> createTaskServiceSettingsIncident(NamedID value) {
        return new JAXBElement<NamedID>(_Incident_QNAME, NamedID.class, TaskServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Organization.class)
    public JAXBElement<OrganizationNullFields> createOrganizationValidNullFields(OrganizationNullFields value) {
        return new JAXBElement<OrganizationNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, OrganizationNullFields.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Parent", scope = Organization.class)
    public JAXBElement<NamedIDHierarchy> createOrganizationParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceDispositionParent_QNAME, NamedIDHierarchy.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NumberOfEmployees", scope = Organization.class)
    public JAXBElement<Integer> createOrganizationNumberOfEmployees(Integer value) {
        return new JAXBElement<Integer>(_OrganizationNumberOfEmployees_QNAME, Integer.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Notes", scope = Organization.class)
    public JAXBElement<NoteList> createOrganizationNotes(NoteList value) {
        return new JAXBElement<NoteList>(_ContactNotes_QNAME, NoteList.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NewPassword", scope = Organization.class)
    public JAXBElement<String> createOrganizationNewPassword(String value) {
        return new JAXBElement<String>(_ContactNewPassword_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Login", scope = Organization.class)
    public JAXBElement<String> createOrganizationLogin(String value) {
        return new JAXBElement<String>(_ContactLogin_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypedAddressList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Addresses", scope = Organization.class)
    public JAXBElement<TypedAddressList> createOrganizationAddresses(TypedAddressList value) {
        return new JAXBElement<TypedAddressList>(_OrganizationAddresses_QNAME, TypedAddressList.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Banner", scope = Organization.class)
    public JAXBElement<Banner> createOrganizationBanner(Banner value) {
        return new JAXBElement<Banner>(_Banner_QNAME, Banner.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Industry", scope = Organization.class)
    public JAXBElement<NamedID> createOrganizationIndustry(NamedID value) {
        return new JAXBElement<NamedID>(_OrganizationIndustry_QNAME, NamedID.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Organization.class)
    public JAXBElement<FileAttachmentCommonList> createOrganizationFileAttachments(FileAttachmentCommonList value) {
        return new JAXBElement<FileAttachmentCommonList>(_ContactFileAttachments_QNAME, FileAttachmentCommonList.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NameFurigana", scope = Organization.class)
    public JAXBElement<String> createOrganizationNameFurigana(String value) {
        return new JAXBElement<String>(_OrganizationNameFurigana_QNAME, String.class, Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InitialResponseDueTime", scope = Incident.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentInitialResponseDueTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentInitialResponseDueTime_QNAME, XMLGregorianCalendar.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ResponseInterval", scope = Incident.class)
    public JAXBElement<Integer> createIncidentResponseInterval(Integer value) {
        return new JAXBElement<Integer>(_IncidentResponseInterval_QNAME, Integer.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ClosedTime", scope = Incident.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentClosedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityClosedTime_QNAME, XMLGregorianCalendar.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Channel", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentChannel(NamedID value) {
        return new JAXBElement<NamedID>(_NoteChannel_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Mailbox", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentMailbox(NamedID value) {
        return new JAXBElement<NamedID>(_Mailbox_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LastResponseTime", scope = Incident.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentLastResponseTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentLastResponseTime_QNAME, XMLGregorianCalendar.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Organization", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentOrganization(NamedID value) {
        return new JAXBElement<NamedID>(_Organization_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentIncidentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Incident.class)
    public JAXBElement<FileAttachmentIncidentList> createIncidentFileAttachments(FileAttachmentIncidentList value) {
        return new JAXBElement<FileAttachmentIncidentList>(_ContactFileAttachments_QNAME, FileAttachmentIncidentList.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SmartSenseStaff", scope = Incident.class)
    public JAXBElement<Integer> createIncidentSmartSenseStaff(Integer value) {
        return new JAXBElement<Integer>(_IncidentSmartSenseStaff_QNAME, Integer.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Incident.class)
    public JAXBElement<IncidentNullFields> createIncidentValidNullFields(IncidentNullFields value) {
        return new JAXBElement<IncidentNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, IncidentNullFields.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Severity", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentSeverity(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentSeverity_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CreatedByAccount", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentCreatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentCreatedByAccount_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "InitialSolutionTime", scope = Incident.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentInitialSolutionTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentInitialSolutionTime_QNAME, XMLGregorianCalendar.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SmartSenseCustomer", scope = Incident.class)
    public JAXBElement<Integer> createIncidentSmartSenseCustomer(Integer value) {
        return new JAXBElement<Integer>(_IncidentSmartSenseCustomer_QNAME, Integer.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Queue", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentQueue(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentQueue_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Mailing", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentMailing(NamedID value) {
        return new JAXBElement<NamedID>(_TaskMarketingSettingsMailing_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Subject", scope = Incident.class)
    public JAXBElement<String> createIncidentSubject(String value) {
        return new JAXBElement<String>(_IncidentSubject_QNAME, String.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Product", scope = Incident.class)
    public JAXBElement<NamedIDHierarchy> createIncidentProduct(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_QuoteLineItemProduct_QNAME, NamedIDHierarchy.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ChatQueue", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentChatQueue(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentChatQueue_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBilledList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "BilledMinutes", scope = Incident.class)
    public JAXBElement<TimeBilledList> createIncidentBilledMinutes(TimeBilledList value) {
        return new JAXBElement<TimeBilledList>(_IncidentBilledMinutes_QNAME, TimeBilledList.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentContactList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OtherContacts", scope = Incident.class)
    public JAXBElement<IncidentContactList> createIncidentOtherContacts(IncidentContactList value) {
        return new JAXBElement<IncidentContactList>(_OpportunityOtherContacts_QNAME, IncidentContactList.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Disposition", scope = Incident.class)
    public JAXBElement<NamedIDHierarchy> createIncidentDisposition(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_IncidentDisposition_QNAME, NamedIDHierarchy.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ResolutionInterval", scope = Incident.class)
    public JAXBElement<Integer> createIncidentResolutionInterval(Integer value) {
        return new JAXBElement<Integer>(_IncidentResolutionInterval_QNAME, Integer.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Category", scope = Incident.class)
    public JAXBElement<NamedIDHierarchy> createIncidentCategory(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_IncidentCategory_QNAME, NamedIDHierarchy.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Language", scope = Incident.class)
    public JAXBElement<NamedID> createIncidentLanguage(NamedID value) {
        return new JAXBElement<NamedID>(_IncidentLanguage_QNAME, NamedID.class, Incident.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Certificate", scope = Email.class)
    public JAXBElement<String> createEmailCertificate(String value) {
        return new JAXBElement<String>(_EmailCertificate_QNAME, String.class, Email.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = MonetaryValue.class)
    public JAXBElement<MonetaryValueNullFields> createMonetaryValueValidNullFields(MonetaryValueNullFields value) {
        return new JAXBElement<MonetaryValueNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, MonetaryValueNullFields.class, MonetaryValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ExchangeRate", scope = MonetaryValue.class)
    public JAXBElement<NamedID> createMonetaryValueExchangeRate(NamedID value) {
        return new JAXBElement<NamedID>(_MonetaryValueExchangeRate_QNAME, NamedID.class, MonetaryValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCategoryNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ServiceCategory.class)
    public JAXBElement<ServiceCategoryNullFields> createServiceCategoryValidNullFields(ServiceCategoryNullFields value) {
        return new JAXBElement<ServiceCategoryNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ServiceCategoryNullFields.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ProductLinks", scope = ServiceCategory.class)
    public JAXBElement<ServiceProductList> createServiceCategoryProductLinks(ServiceProductList value) {
        return new JAXBElement<ServiceProductList>(_ServiceDispositionProductLinks_QNAME, ServiceProductList.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Parent", scope = ServiceCategory.class)
    public JAXBElement<NamedIDHierarchy> createServiceCategoryParent(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_ServiceDispositionParent_QNAME, NamedIDHierarchy.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "EndUserVisibleInterfaces", scope = ServiceCategory.class)
    public JAXBElement<NamedIDDeltaList> createServiceCategoryEndUserVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceProductEndUserVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Descriptions", scope = ServiceCategory.class)
    public JAXBElement<LabelList> createServiceCategoryDescriptions(LabelList value) {
        return new JAXBElement<LabelList>(_ServiceDispositionDescriptions_QNAME, LabelList.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminVisibleInterfaces", scope = ServiceCategory.class)
    public JAXBElement<NamedIDDeltaList> createServiceCategoryAdminVisibleInterfaces(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ServiceDispositionAdminVisibleInterfaces_QNAME, NamedIDDeltaList.class, ServiceCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ContactSalesSettings.class)
    public JAXBElement<ContactSalesSettingsNullFields> createContactSalesSettingsValidNullFields(ContactSalesSettingsNullFields value) {
        return new JAXBElement<ContactSalesSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ContactSalesSettingsNullFields.class, ContactSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SalesAccount", scope = ContactSalesSettings.class)
    public JAXBElement<NamedID> createContactSalesSettingsSalesAccount(NamedID value) {
        return new JAXBElement<NamedID>(_OrganizationSalesSettingsSalesAccount_QNAME, NamedID.class, ContactSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AcquiredDate", scope = ContactSalesSettings.class)
    public JAXBElement<XMLGregorianCalendar> createContactSalesSettingsAcquiredDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OrganizationSalesSettingsAcquiredDate_QNAME, XMLGregorianCalendar.class, ContactSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccountNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = GroupAccount.class)
    public JAXBElement<GroupAccountNullFields> createGroupAccountValidNullFields(GroupAccountNullFields value) {
        return new JAXBElement<GroupAccountNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, GroupAccountNullFields.class, GroupAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StaffGroup", scope = GroupAccount.class)
    public JAXBElement<NamedID> createGroupAccountStaffGroup(NamedID value) {
        return new JAXBElement<NamedID>(_GroupAccountStaffGroup_QNAME, NamedID.class, GroupAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Account", scope = GroupAccount.class)
    public JAXBElement<NamedID> createGroupAccountAccount(NamedID value) {
        return new JAXBElement<NamedID>(_Account_QNAME, NamedID.class, GroupAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskSalesSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = TaskSalesSettings.class)
    public JAXBElement<TaskSalesSettingsNullFields> createTaskSalesSettingsValidNullFields(TaskSalesSettingsNullFields value) {
        return new JAXBElement<TaskSalesSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, TaskSalesSettingsNullFields.class, TaskSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Opportunity", scope = TaskSalesSettings.class)
    public JAXBElement<NamedID> createTaskSalesSettingsOpportunity(NamedID value) {
        return new JAXBElement<NamedID>(_Opportunity_QNAME, NamedID.class, TaskSalesSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMarketingSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ContactMarketingSettings.class)
    public JAXBElement<ContactMarketingSettingsNullFields> createContactMarketingSettingsValidNullFields(ContactMarketingSettingsNullFields value) {
        return new JAXBElement<ContactMarketingSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ContactMarketingSettingsNullFields.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MarketingOrganizationNameAlt", scope = ContactMarketingSettings.class)
    public JAXBElement<String> createContactMarketingSettingsMarketingOrganizationNameAlt(String value) {
        return new JAXBElement<String>(_ContactMarketingSettingsMarketingOrganizationNameAlt_QNAME, String.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ContactLists", scope = ContactMarketingSettings.class)
    public JAXBElement<NamedIDDeltaList> createContactMarketingSettingsContactLists(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_ContactMarketingSettingsContactLists_QNAME, NamedIDDeltaList.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "EmailFormat", scope = ContactMarketingSettings.class)
    public JAXBElement<NamedID> createContactMarketingSettingsEmailFormat(NamedID value) {
        return new JAXBElement<NamedID>(_ContactMarketingSettingsEmailFormat_QNAME, NamedID.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MarketingOptIn", scope = ContactMarketingSettings.class)
    public JAXBElement<Boolean> createContactMarketingSettingsMarketingOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ContactMarketingSettingsMarketingOptIn_QNAME, Boolean.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SurveyOptIn", scope = ContactMarketingSettings.class)
    public JAXBElement<Boolean> createContactMarketingSettingsSurveyOptIn(Boolean value) {
        return new JAXBElement<Boolean>(_ContactMarketingSettingsSurveyOptIn_QNAME, Boolean.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "MarketingOrganizationName", scope = ContactMarketingSettings.class)
    public JAXBElement<String> createContactMarketingSettingsMarketingOrganizationName(String value) {
        return new JAXBElement<String>(_ContactMarketingSettingsMarketingOrganizationName_QNAME, String.class, ContactMarketingSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Address.class)
    public JAXBElement<AddressNullFields> createAddressValidNullFields(AddressNullFields value) {
        return new JAXBElement<AddressNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AddressNullFields.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PostalCode", scope = Address.class)
    public JAXBElement<String> createAddressPostalCode(String value) {
        return new JAXBElement<String>(_AddressPostalCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Street", scope = Address.class)
    public JAXBElement<String> createAddressStreet(String value) {
        return new JAXBElement<String>(_AddressStreet_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Country", scope = Address.class)
    public JAXBElement<NamedID> createAddressCountry(NamedID value) {
        return new JAXBElement<NamedID>(_Country_QNAME, NamedID.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "StateOrProvince", scope = Address.class)
    public JAXBElement<NamedID> createAddressStateOrProvince(NamedID value) {
        return new JAXBElement<NamedID>(_AddressStateOrProvince_QNAME, NamedID.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "City", scope = Address.class)
    public JAXBElement<String> createAddressCity(String value) {
        return new JAXBElement<String>(_AddressCity_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerLinkNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = AnswerLink.class)
    public JAXBElement<AnswerLinkNullFields> createAnswerLinkValidNullFields(AnswerLinkNullFields value) {
        return new JAXBElement<AnswerLinkNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AnswerLinkNullFields.class, AnswerLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LearnedLinkStrength", scope = AnswerLink.class)
    public JAXBElement<Integer> createAnswerLinkLearnedLinkStrength(Integer value) {
        return new JAXBElement<Integer>(_AnswerLinkLearnedLinkStrength_QNAME, Integer.class, AnswerLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Products", scope = Answer.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerProducts(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerProducts_QNAME, NamedIDHierarchyList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AdminLastAccessTime", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerAdminLastAccessTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerAdminLastAccessTime_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Categories", scope = Answer.class)
    public JAXBElement<NamedIDHierarchyList> createAnswerCategories(NamedIDHierarchyList value) {
        return new JAXBElement<NamedIDHierarchyList>(_AnswerCategories_QNAME, NamedIDHierarchyList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NextNotificationTime", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerNextNotificationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerNextNotificationTime_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "FileAttachments", scope = Answer.class)
    public JAXBElement<FileAttachmentAnswerList> createAnswerFileAttachments(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_ContactFileAttachments_QNAME, FileAttachmentAnswerList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Answer.class)
    public JAXBElement<AnswerNullFields> createAnswerValidNullFields(AnswerNullFields value) {
        return new JAXBElement<AnswerNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AnswerNullFields.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Question", scope = Answer.class)
    public JAXBElement<String> createAnswerQuestion(String value) {
        return new JAXBElement<String>(_AnswerQuestion_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Solution", scope = Answer.class)
    public JAXBElement<String> createAnswerSolution(String value) {
        return new JAXBElement<String>(_AnswerSolution_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "URL", scope = Answer.class)
    public JAXBElement<String> createAnswerURL(String value) {
        return new JAXBElement<String>(_AnswerURL_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Keywords", scope = Answer.class)
    public JAXBElement<String> createAnswerKeywords(String value) {
        return new JAXBElement<String>(_AnswerKeywords_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ExpiresDate", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerExpiresDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerExpiresDate_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CommonAttachments", scope = Answer.class)
    public JAXBElement<FileAttachmentSharedList> createAnswerCommonAttachments(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_AnswerCommonAttachments_QNAME, FileAttachmentSharedList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AssignedSibling", scope = Answer.class)
    public JAXBElement<NamedID> createAnswerAssignedSibling(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerAssignedSibling_QNAME, NamedID.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "GuidedAssistance", scope = Answer.class)
    public JAXBElement<NamedID> createAnswerGuidedAssistance(NamedID value) {
        return new JAXBElement<NamedID>(_AnswerGuidedAssistance_QNAME, NamedID.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "CommonComment", scope = Answer.class)
    public JAXBElement<String> createAnswerCommonComment(String value) {
        return new JAXBElement<String>(_AnswerCommonComment_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LastAccessTime", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerLastAccessTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerLastAccessTime_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PublishOnDate", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerPublishOnDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerPublishOnDate_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Comment", scope = Answer.class)
    public JAXBElement<String> createAnswerComment(String value) {
        return new JAXBElement<String>(_PurchasedProductComment_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerLinkList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Links", scope = Answer.class)
    public JAXBElement<AnswerLinkList> createAnswerLinks(AnswerLinkList value) {
        return new JAXBElement<AnswerLinkList>(_AnswerLinks_QNAME, AnswerLinkList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "UpdatedByAccount", scope = Answer.class)
    public JAXBElement<NamedID> createAnswerUpdatedByAccount(NamedID value) {
        return new JAXBElement<NamedID>(_BannerUpdatedByAccount_QNAME, NamedID.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDDeltaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "AccessLevels", scope = Answer.class)
    public JAXBElement<NamedIDDeltaList> createAnswerAccessLevels(NamedIDDeltaList value) {
        return new JAXBElement<NamedIDDeltaList>(_AnswerAccessLevels_QNAME, NamedIDDeltaList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Notes", scope = Answer.class)
    public JAXBElement<NoteList> createAnswerNotes(NoteList value) {
        return new JAXBElement<NoteList>(_ContactNotes_QNAME, NoteList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SiblingAnswers", scope = Answer.class)
    public JAXBElement<NamedIDList> createAnswerSiblingAnswers(NamedIDList value) {
        return new JAXBElement<NamedIDList>(_AnswerSiblingAnswers_QNAME, NamedIDList.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Banner", scope = Answer.class)
    public JAXBElement<Banner> createAnswerBanner(Banner value) {
        return new JAXBElement<Banner>(_Banner_QNAME, Banner.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "LastNotificationTime", scope = Answer.class)
    public JAXBElement<XMLGregorianCalendar> createAnswerLastNotificationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AnswerLastNotificationTime_QNAME, XMLGregorianCalendar.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "OriginalReferenceNumber", scope = Answer.class)
    public JAXBElement<String> createAnswerOriginalReferenceNumber(String value) {
        return new JAXBElement<String>(_AnswerOriginalReferenceNumber_QNAME, String.class, Answer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelUsernameNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = ChannelUsername.class)
    public JAXBElement<ChannelUsernameNullFields> createChannelUsernameValidNullFields(ChannelUsernameNullFields value) {
        return new JAXBElement<ChannelUsernameNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, ChannelUsernameNullFields.class, ChannelUsername.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Username", scope = ChannelUsername.class)
    public JAXBElement<String> createChannelUsernameUsername(String value) {
        return new JAXBElement<String>(_ChannelUsernameUsername_QNAME, String.class, ChannelUsername.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "UserNumber", scope = ChannelUsername.class)
    public JAXBElement<String> createChannelUsernameUserNumber(String value) {
        return new JAXBElement<String>(_ChannelUsernameUserNumber_QNAME, String.class, ChannelUsername.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = Account.class)
    public JAXBElement<AccountNullFields> createAccountValidNullFields(AccountNullFields value) {
        return new JAXBElement<AccountNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, AccountNullFields.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedIDHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Manager", scope = Account.class)
    public JAXBElement<NamedIDHierarchy> createAccountManager(NamedIDHierarchy value) {
        return new JAXBElement<NamedIDHierarchy>(_AccountManager_QNAME, NamedIDHierarchy.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Phones", scope = Account.class)
    public JAXBElement<PhoneList> createAccountPhones(PhoneList value) {
        return new JAXBElement<PhoneList>(_AccountPhones_QNAME, PhoneList.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "PasswordExpirationTime", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountPasswordExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPasswordExpirationTime_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "NewPassword", scope = Account.class)
    public JAXBElement<String> createAccountNewPassword(String value) {
        return new JAXBElement<String>(_ContactNewPassword_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "EmailNotification", scope = Account.class)
    public JAXBElement<NamedID> createAccountEmailNotification(NamedID value) {
        return new JAXBElement<NamedID>(_AccountEmailNotification_QNAME, NamedID.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Emails", scope = Account.class)
    public JAXBElement<EmailList> createAccountEmails(EmailList value) {
        return new JAXBElement<EmailList>(_ContactEmails_QNAME, EmailList.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "DisplayName", scope = Account.class)
    public JAXBElement<String> createAccountDisplayName(String value) {
        return new JAXBElement<String>(_AccountDisplayName_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Signature", scope = Account.class)
    public JAXBElement<String> createAccountSignature(String value) {
        return new JAXBElement<String>(_AccountSignature_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "Profile", scope = Account.class)
    public JAXBElement<NamedID> createAccountProfile(NamedID value) {
        return new JAXBElement<NamedID>(_AccountProfile_QNAME, NamedID.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationServiceSettingsNullFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "ValidNullFields", scope = OrganizationServiceSettings.class)
    public JAXBElement<OrganizationServiceSettingsNullFields> createOrganizationServiceSettingsValidNullFields(OrganizationServiceSettingsNullFields value) {
        return new JAXBElement<OrganizationServiceSettingsNullFields>(_TaskMarketingSettingsValidNullFields_QNAME, OrganizationServiceSettingsNullFields.class, OrganizationServiceSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAInstanceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1_2", name = "SLAInstances", scope = OrganizationServiceSettings.class)
    public JAXBElement<SLAInstanceList> createOrganizationServiceSettingsSLAInstances(SLAInstanceList value) {
        return new JAXBElement<SLAInstanceList>(_ContactServiceSettingsSLAInstances_QNAME, SLAInstanceList.class, OrganizationServiceSettings.class, value);
    }

}
