
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthOfYearEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="January"/>
 *     &lt;enumeration value="February"/>
 *     &lt;enumeration value="March"/>
 *     &lt;enumeration value="April"/>
 *     &lt;enumeration value="May"/>
 *     &lt;enumeration value="June"/>
 *     &lt;enumeration value="July"/>
 *     &lt;enumeration value="August"/>
 *     &lt;enumeration value="September"/>
 *     &lt;enumeration value="October"/>
 *     &lt;enumeration value="November"/>
 *     &lt;enumeration value="December"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum {

    @XmlEnumValue("January")
    JANUARY("January"),
    @XmlEnumValue("February")
    FEBRUARY("February"),
    @XmlEnumValue("March")
    MARCH("March"),
    @XmlEnumValue("April")
    APRIL("April"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("June")
    JUNE("June"),
    @XmlEnumValue("July")
    JULY("July"),
    @XmlEnumValue("August")
    AUGUST("August"),
    @XmlEnumValue("September")
    SEPTEMBER("September"),
    @XmlEnumValue("October")
    OCTOBER("October"),
    @XmlEnumValue("November")
    NOVEMBER("November"),
    @XmlEnumValue("December")
    DECEMBER("December");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
