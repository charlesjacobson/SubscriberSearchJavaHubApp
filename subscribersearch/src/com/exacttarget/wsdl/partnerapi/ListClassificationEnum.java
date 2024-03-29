
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListClassificationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListClassificationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExactTargetList"/>
 *     &lt;enumeration value="PublicationList"/>
 *     &lt;enumeration value="SuppressionList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListClassificationEnum")
@XmlEnum
public enum ListClassificationEnum {

    @XmlEnumValue("ExactTargetList")
    EXACT_TARGET_LIST("ExactTargetList"),
    @XmlEnumValue("PublicationList")
    PUBLICATION_LIST("PublicationList"),
    @XmlEnumValue("SuppressionList")
    SUPPRESSION_LIST("SuppressionList");
    private final String value;

    ListClassificationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListClassificationEnum fromValue(String v) {
        for (ListClassificationEnum c: ListClassificationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
