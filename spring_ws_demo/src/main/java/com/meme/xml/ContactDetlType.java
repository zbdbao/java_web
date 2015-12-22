
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailDetails" type="{}EmailDetailsType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{}PhoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetlType", propOrder = {
    "emailDetails",
    "phone"
})
public class ContactDetlType {

    @XmlElement(name = "EmailDetails")
    protected EmailDetailsType emailDetails;
    @XmlElement(name = "Phone")
    protected PhoneType phone;

    /**
     * Gets the value of the emailDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDetailsType }
     *     
     */
    public EmailDetailsType getEmailDetails() {
        return emailDetails;
    }

    /**
     * Sets the value of the emailDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDetailsType }
     *     
     */
    public void setEmailDetails(EmailDetailsType value) {
        this.emailDetails = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
    }

}
