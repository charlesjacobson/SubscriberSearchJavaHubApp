
package com.exacttarget.wsdl.partnerapi;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Send complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Send">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/>
 *         &lt;element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duplicates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvalidAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExistingUndeliverables" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExistingUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HardBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SoftBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtherBounces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ForwardedEmails" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UniqueOpens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDelivered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Unsubscribes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MissingAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviewURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Links" type="{http://exacttarget.com/wsdl/partnerAPI}Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMultipart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendWindowOpen" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="SendWindowClose" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IsAlwaysOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Source" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NumberTargeted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberErrored" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberExcluded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Additional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSendDefinition" type="{http://exacttarget.com/wsdl/partnerAPI}EmailSendDefinition" minOccurs="0"/>
 *         &lt;element name="SuppressionLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SuppressionList" type="{http://exacttarget.com/wsdl/partnerAPI}AudienceItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Send", propOrder = {
    "email",
    "list",
    "sendDate",
    "fromAddress",
    "fromName",
    "duplicates",
    "invalidAddresses",
    "existingUndeliverables",
    "existingUnsubscribes",
    "hardBounces",
    "softBounces",
    "otherBounces",
    "forwardedEmails",
    "uniqueClicks",
    "uniqueOpens",
    "numberSent",
    "numberDelivered",
    "unsubscribes",
    "missingAddresses",
    "subject",
    "previewURL",
    "links",
    "events",
    "sentDate",
    "emailName",
    "status",
    "isMultipart",
    "sendLimit",
    "sendWindowOpen",
    "sendWindowClose",
    "isAlwaysOn",
    "sources",
    "numberTargeted",
    "numberErrored",
    "numberExcluded",
    "additional",
    "bccEmail",
    "emailSendDefinition",
    "suppressionLists"
})
public class Send
    extends APIObject
{

    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "List")
    protected java.util.List<com.exacttarget.wsdl.partnerapi.List> list;
    @XmlElement(name = "SendDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    @XmlElement(name = "FromAddress")
    protected String fromAddress;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "Duplicates")
    protected Integer duplicates;
    @XmlElement(name = "InvalidAddresses")
    protected Integer invalidAddresses;
    @XmlElement(name = "ExistingUndeliverables")
    protected Integer existingUndeliverables;
    @XmlElement(name = "ExistingUnsubscribes")
    protected Integer existingUnsubscribes;
    @XmlElement(name = "HardBounces")
    protected Integer hardBounces;
    @XmlElement(name = "SoftBounces")
    protected Integer softBounces;
    @XmlElement(name = "OtherBounces")
    protected Integer otherBounces;
    @XmlElement(name = "ForwardedEmails")
    protected Integer forwardedEmails;
    @XmlElement(name = "UniqueClicks")
    protected Integer uniqueClicks;
    @XmlElement(name = "UniqueOpens")
    protected Integer uniqueOpens;
    @XmlElementRef(name = "NumberSent", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> numberSent;
    @XmlElementRef(name = "NumberDelivered", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<Integer> numberDelivered;
    @XmlElement(name = "Unsubscribes")
    protected Integer unsubscribes;
    @XmlElement(name = "MissingAddresses")
    protected Integer missingAddresses;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "PreviewURL")
    protected String previewURL;
    @XmlElement(name = "Links")
    protected java.util.List<Link> links;
    @XmlElement(name = "Events")
    protected java.util.List<TrackingEvent> events;
    @XmlElementRef(name = "SentDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> sentDate;
    @XmlElement(name = "EmailName")
    protected String emailName;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "IsMultipart")
    protected Boolean isMultipart;
    @XmlElement(name = "SendLimit")
    protected Integer sendLimit;
    @XmlElement(name = "SendWindowOpen")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowOpen;
    @XmlElement(name = "SendWindowClose")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowClose;
    @XmlElement(name = "IsAlwaysOn")
    protected Boolean isAlwaysOn;
    @XmlElement(name = "Sources")
    protected Send.Sources sources;
    @XmlElement(name = "NumberTargeted")
    protected Integer numberTargeted;
    @XmlElement(name = "NumberErrored")
    protected Integer numberErrored;
    @XmlElement(name = "NumberExcluded")
    protected Integer numberExcluded;
    @XmlElement(name = "Additional")
    protected String additional;
    @XmlElement(name = "BccEmail")
    protected String bccEmail;
    @XmlElement(name = "EmailSendDefinition")
    protected EmailSendDefinition emailSendDefinition;
    @XmlElement(name = "SuppressionLists")
    protected Send.SuppressionLists suppressionLists;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.exacttarget.wsdl.partnerapi.List }
     * 
     * 
     */
    public java.util.List<com.exacttarget.wsdl.partnerapi.List> getList() {
        if (list == null) {
            list = new ArrayList<com.exacttarget.wsdl.partnerapi.List>();
        }
        return this.list;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the duplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuplicates() {
        return duplicates;
    }

    /**
     * Sets the value of the duplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuplicates(Integer value) {
        this.duplicates = value;
    }

    /**
     * Gets the value of the invalidAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvalidAddresses() {
        return invalidAddresses;
    }

    /**
     * Sets the value of the invalidAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvalidAddresses(Integer value) {
        this.invalidAddresses = value;
    }

    /**
     * Gets the value of the existingUndeliverables property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUndeliverables() {
        return existingUndeliverables;
    }

    /**
     * Sets the value of the existingUndeliverables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUndeliverables(Integer value) {
        this.existingUndeliverables = value;
    }

    /**
     * Gets the value of the existingUnsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExistingUnsubscribes() {
        return existingUnsubscribes;
    }

    /**
     * Sets the value of the existingUnsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExistingUnsubscribes(Integer value) {
        this.existingUnsubscribes = value;
    }

    /**
     * Gets the value of the hardBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardBounces() {
        return hardBounces;
    }

    /**
     * Sets the value of the hardBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardBounces(Integer value) {
        this.hardBounces = value;
    }

    /**
     * Gets the value of the softBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoftBounces() {
        return softBounces;
    }

    /**
     * Sets the value of the softBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoftBounces(Integer value) {
        this.softBounces = value;
    }

    /**
     * Gets the value of the otherBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherBounces() {
        return otherBounces;
    }

    /**
     * Sets the value of the otherBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherBounces(Integer value) {
        this.otherBounces = value;
    }

    /**
     * Gets the value of the forwardedEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForwardedEmails() {
        return forwardedEmails;
    }

    /**
     * Sets the value of the forwardedEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForwardedEmails(Integer value) {
        this.forwardedEmails = value;
    }

    /**
     * Gets the value of the uniqueClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueClicks() {
        return uniqueClicks;
    }

    /**
     * Sets the value of the uniqueClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueClicks(Integer value) {
        this.uniqueClicks = value;
    }

    /**
     * Gets the value of the uniqueOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueOpens() {
        return uniqueOpens;
    }

    /**
     * Sets the value of the uniqueOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueOpens(Integer value) {
        this.uniqueOpens = value;
    }

    /**
     * Gets the value of the numberSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberSent() {
        return numberSent;
    }

    /**
     * Sets the value of the numberSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberSent(JAXBElement<Integer> value) {
        this.numberSent = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the numberDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberDelivered() {
        return numberDelivered;
    }

    /**
     * Sets the value of the numberDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberDelivered(JAXBElement<Integer> value) {
        this.numberDelivered = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the unsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnsubscribes() {
        return unsubscribes;
    }

    /**
     * Sets the value of the unsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnsubscribes(Integer value) {
        this.unsubscribes = value;
    }

    /**
     * Gets the value of the missingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissingAddresses() {
        return missingAddresses;
    }

    /**
     * Sets the value of the missingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissingAddresses(Integer value) {
        this.missingAddresses = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the previewURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewURL() {
        return previewURL;
    }

    /**
     * Sets the value of the previewURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewURL(String value) {
        this.previewURL = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public java.util.List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<Link>();
        }
        return this.links;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEvent }
     * 
     * 
     */
    public java.util.List<TrackingEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<TrackingEvent>();
        }
        return this.events;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.sentDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the emailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailName() {
        return emailName;
    }

    /**
     * Sets the value of the emailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailName(String value) {
        this.emailName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the isMultipart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipart() {
        return isMultipart;
    }

    /**
     * Sets the value of the isMultipart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipart(Boolean value) {
        this.isMultipart = value;
    }

    /**
     * Gets the value of the sendLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendLimit() {
        return sendLimit;
    }

    /**
     * Sets the value of the sendLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendLimit(Integer value) {
        this.sendLimit = value;
    }

    /**
     * Gets the value of the sendWindowOpen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowOpen() {
        return sendWindowOpen;
    }

    /**
     * Sets the value of the sendWindowOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowOpen(XMLGregorianCalendar value) {
        this.sendWindowOpen = value;
    }

    /**
     * Gets the value of the sendWindowClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowClose() {
        return sendWindowClose;
    }

    /**
     * Sets the value of the sendWindowClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowClose(XMLGregorianCalendar value) {
        this.sendWindowClose = value;
    }

    /**
     * Gets the value of the isAlwaysOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlwaysOn() {
        return isAlwaysOn;
    }

    /**
     * Sets the value of the isAlwaysOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlwaysOn(Boolean value) {
        this.isAlwaysOn = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link Send.Sources }
     *     
     */
    public Send.Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Send.Sources }
     *     
     */
    public void setSources(Send.Sources value) {
        this.sources = value;
    }

    /**
     * Gets the value of the numberTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberTargeted() {
        return numberTargeted;
    }

    /**
     * Sets the value of the numberTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberTargeted(Integer value) {
        this.numberTargeted = value;
    }

    /**
     * Gets the value of the numberErrored property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberErrored() {
        return numberErrored;
    }

    /**
     * Sets the value of the numberErrored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberErrored(Integer value) {
        this.numberErrored = value;
    }

    /**
     * Gets the value of the numberExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberExcluded() {
        return numberExcluded;
    }

    /**
     * Sets the value of the numberExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberExcluded(Integer value) {
        this.numberExcluded = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional(String value) {
        this.additional = value;
    }

    /**
     * Gets the value of the bccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBccEmail() {
        return bccEmail;
    }

    /**
     * Sets the value of the bccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBccEmail(String value) {
        this.bccEmail = value;
    }

    /**
     * Gets the value of the emailSendDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSendDefinition }
     *     
     */
    public EmailSendDefinition getEmailSendDefinition() {
        return emailSendDefinition;
    }

    /**
     * Sets the value of the emailSendDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSendDefinition }
     *     
     */
    public void setEmailSendDefinition(EmailSendDefinition value) {
        this.emailSendDefinition = value;
    }

    /**
     * Gets the value of the suppressionLists property.
     * 
     * @return
     *     possible object is
     *     {@link Send.SuppressionLists }
     *     
     */
    public Send.SuppressionLists getSuppressionLists() {
        return suppressionLists;
    }

    /**
     * Sets the value of the suppressionLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Send.SuppressionLists }
     *     
     */
    public void setSuppressionLists(Send.SuppressionLists value) {
        this.suppressionLists = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Source" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source"
    })
    public static class Sources {

        @XmlElement(name = "Source")
        protected java.util.List<APIObject> source;

        /**
         * Gets the value of the source property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the source property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIObject }
         * 
         * 
         */
        public java.util.List<APIObject> getSource() {
            if (source == null) {
                source = new ArrayList<APIObject>();
            }
            return this.source;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SuppressionList" type="{http://exacttarget.com/wsdl/partnerAPI}AudienceItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "suppressionList"
    })
    public static class SuppressionLists {

        @XmlElement(name = "SuppressionList")
        protected java.util.List<AudienceItem> suppressionList;

        /**
         * Gets the value of the suppressionList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suppressionList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuppressionList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AudienceItem }
         * 
         * 
         */
        public java.util.List<AudienceItem> getSuppressionList() {
            if (suppressionList == null) {
                suppressionList = new ArrayList<AudienceItem>();
            }
            return this.suppressionList;
        }

    }

}
