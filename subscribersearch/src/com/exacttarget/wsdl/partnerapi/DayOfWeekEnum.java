
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sunday"/>
 *     &lt;enumeration value="Monday"/>
 *     &lt;enumeration value="Tuesday"/>
 *     &lt;enumeration value="Wednesday"/>
 *     &lt;enumeration value="Thursday"/>
 *     &lt;enumeration value="Friday"/>
 *     &lt;enumeration value="Saturday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekEnum")
@XmlEnum
public enum DayOfWeekEnum {

    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday");
    private final String value;

    DayOfWeekEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekEnum fromValue(String v) {
        for (DayOfWeekEnum c: DayOfWeekEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
