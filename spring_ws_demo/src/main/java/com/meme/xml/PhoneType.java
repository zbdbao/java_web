
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneCtryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {
    "phoneCtryCode",
    "phoneAreaCode",
    "phoneNum"
})
public class PhoneType {

    @XmlElement(name = "PhoneCtryCode")
    protected String phoneCtryCode;
    @XmlElement(name = "PhoneAreaCode")
    protected String phoneAreaCode;
    @XmlElement(name = "PhoneNum", required = true)
    protected String phoneNum;

    /**
     * Gets the value of the phoneCtryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCtryCode() {
        return phoneCtryCode;
    }

    /**
     * Sets the value of the phoneCtryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCtryCode(String value) {
        this.phoneCtryCode = value;
    }

    /**
     * Gets the value of the phoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    /**
     * Sets the value of the phoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaCode(String value) {
        this.phoneAreaCode = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

}
