
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Synchronous"/>
 *     &lt;enumeration value="Asynchronous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {

    @XmlEnumValue("Synchronous")
    SYNCHRONOUS("Synchronous"),
    @XmlEnumValue("Asynchronous")
    ASYNCHRONOUS("Asynchronous");
    private final String value;

    RequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType fromValue(String v) {
        for (RequestType c: RequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
