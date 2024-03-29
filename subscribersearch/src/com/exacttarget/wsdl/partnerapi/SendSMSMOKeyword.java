
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendSMSMOKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendSMSMOKeyword">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}BaseMOKeyword">
 *       &lt;sequence>
 *         &lt;element name="NextMOKeyword" type="{http://exacttarget.com/wsdl/partnerAPI}BaseMOKeyword" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScriptErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSMSMOKeyword", propOrder = {
    "nextMOKeyword",
    "message",
    "scriptErrorMessage"
})
public class SendSMSMOKeyword
    extends BaseMOKeyword
{

    @XmlElement(name = "NextMOKeyword")
    protected BaseMOKeyword nextMOKeyword;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "ScriptErrorMessage")
    protected String scriptErrorMessage;

    /**
     * Gets the value of the nextMOKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link BaseMOKeyword }
     *     
     */
    public BaseMOKeyword getNextMOKeyword() {
        return nextMOKeyword;
    }

    /**
     * Sets the value of the nextMOKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseMOKeyword }
     *     
     */
    public void setNextMOKeyword(BaseMOKeyword value) {
        this.nextMOKeyword = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the scriptErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptErrorMessage() {
        return scriptErrorMessage;
    }

    /**
     * Sets the value of the scriptErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptErrorMessage(String value) {
        this.scriptErrorMessage = value;
    }

}
