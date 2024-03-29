
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinutelyRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinutelyRecurrence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Recurrence">
 *       &lt;sequence>
 *         &lt;element name="MinutelyRecurrencePatternType" type="{http://exacttarget.com/wsdl/partnerAPI}MinutelyRecurrencePatternTypeEnum" minOccurs="0"/>
 *         &lt;element name="MinuteInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinutelyRecurrence", propOrder = {
    "minutelyRecurrencePatternType",
    "minuteInterval"
})
public class MinutelyRecurrence
    extends Recurrence
{

    @XmlElement(name = "MinutelyRecurrencePatternType")
    protected MinutelyRecurrencePatternTypeEnum minutelyRecurrencePatternType;
    @XmlElement(name = "MinuteInterval")
    protected Integer minuteInterval;

    /**
     * Gets the value of the minutelyRecurrencePatternType property.
     * 
     * @return
     *     possible object is
     *     {@link MinutelyRecurrencePatternTypeEnum }
     *     
     */
    public MinutelyRecurrencePatternTypeEnum getMinutelyRecurrencePatternType() {
        return minutelyRecurrencePatternType;
    }

    /**
     * Sets the value of the minutelyRecurrencePatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinutelyRecurrencePatternTypeEnum }
     *     
     */
    public void setMinutelyRecurrencePatternType(MinutelyRecurrencePatternTypeEnum value) {
        this.minutelyRecurrencePatternType = value;
    }

    /**
     * Gets the value of the minuteInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinuteInterval() {
        return minuteInterval;
    }

    /**
     * Sets the value of the minuteInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinuteInterval(Integer value) {
        this.minuteInterval = value;
    }

}
