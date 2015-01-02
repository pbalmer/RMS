
package com.rightnow.ws.objects.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rightnow.ws.objects.v1 package. 
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

    private final static QName _LabelRequired_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "LabelRequired");
    private final static QName _FileAttachmentAnswerList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentAnswerList");
    private final static QName _FileAttachmentShared_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentShared");
    private final static QName _FileAttachmentAnswer_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentAnswer");
    private final static QName _FileAttachment_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachment");
    private final static QName _FileAttachmentSharedList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentSharedList");
    private final static QName _LabelRequiredList_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "LabelRequiredList");
    private final static QName _FileAttachmentCommon_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "FileAttachmentCommon");
    private final static QName _FileAttachmentUpdatedTime_QNAME = new QName("urn:objects.ws.rightnow.com/v1", "UpdatedTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rightnow.ws.objects.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileAttachmentAnswer }
     * 
     */
    public FileAttachmentAnswer createFileAttachmentAnswer() {
        return new FileAttachmentAnswer();
    }

    /**
     * Create an instance of {@link FileAttachment }
     * 
     */
    public FileAttachment createFileAttachment() {
        return new FileAttachment();
    }

    /**
     * Create an instance of {@link FileAttachmentAnswerList }
     * 
     */
    public FileAttachmentAnswerList createFileAttachmentAnswerList() {
        return new FileAttachmentAnswerList();
    }

    /**
     * Create an instance of {@link FileAttachmentCommon }
     * 
     */
    public FileAttachmentCommon createFileAttachmentCommon() {
        return new FileAttachmentCommon();
    }

    /**
     * Create an instance of {@link LabelRequiredList }
     * 
     */
    public LabelRequiredList createLabelRequiredList() {
        return new LabelRequiredList();
    }

    /**
     * Create an instance of {@link FileAttachmentSharedList }
     * 
     */
    public FileAttachmentSharedList createFileAttachmentSharedList() {
        return new FileAttachmentSharedList();
    }

    /**
     * Create an instance of {@link LabelRequired }
     * 
     */
    public LabelRequired createLabelRequired() {
        return new LabelRequired();
    }

    /**
     * Create an instance of {@link FileAttachmentShared }
     * 
     */
    public FileAttachmentShared createFileAttachmentShared() {
        return new FileAttachmentShared();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequired }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "LabelRequired")
    public JAXBElement<LabelRequired> createLabelRequired(LabelRequired value) {
        return new JAXBElement<LabelRequired>(_LabelRequired_QNAME, LabelRequired.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentAnswerList")
    public JAXBElement<FileAttachmentAnswerList> createFileAttachmentAnswerList(FileAttachmentAnswerList value) {
        return new JAXBElement<FileAttachmentAnswerList>(_FileAttachmentAnswerList_QNAME, FileAttachmentAnswerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentShared }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentShared")
    public JAXBElement<FileAttachmentShared> createFileAttachmentShared(FileAttachmentShared value) {
        return new JAXBElement<FileAttachmentShared>(_FileAttachmentShared_QNAME, FileAttachmentShared.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentAnswer")
    public JAXBElement<FileAttachmentAnswer> createFileAttachmentAnswer(FileAttachmentAnswer value) {
        return new JAXBElement<FileAttachmentAnswer>(_FileAttachmentAnswer_QNAME, FileAttachmentAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachment")
    public JAXBElement<FileAttachment> createFileAttachment(FileAttachment value) {
        return new JAXBElement<FileAttachment>(_FileAttachment_QNAME, FileAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentSharedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentSharedList")
    public JAXBElement<FileAttachmentSharedList> createFileAttachmentSharedList(FileAttachmentSharedList value) {
        return new JAXBElement<FileAttachmentSharedList>(_FileAttachmentSharedList_QNAME, FileAttachmentSharedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRequiredList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "LabelRequiredList")
    public JAXBElement<LabelRequiredList> createLabelRequiredList(LabelRequiredList value) {
        return new JAXBElement<LabelRequiredList>(_LabelRequiredList_QNAME, LabelRequiredList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAttachmentCommon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "FileAttachmentCommon")
    public JAXBElement<FileAttachmentCommon> createFileAttachmentCommon(FileAttachmentCommon value) {
        return new JAXBElement<FileAttachmentCommon>(_FileAttachmentCommon_QNAME, FileAttachmentCommon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:objects.ws.rightnow.com/v1", name = "UpdatedTime", scope = FileAttachment.class)
    public JAXBElement<XMLGregorianCalendar> createFileAttachmentUpdatedTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileAttachmentUpdatedTime_QNAME, XMLGregorianCalendar.class, FileAttachment.class, value);
    }

}
