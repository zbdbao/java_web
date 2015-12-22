
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailDetailsType", propOrder = {
    "emailAddr",
    "emailStatus"
})
public class EmailDetailsType {

    @XmlElement(name = "EmailAddr", required = true)
    protected String emailAddr;
    @XmlElement(name = "EmailStatus")
    protected String emailStatus;

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

    /**
     * Gets the value of the emailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailStatus() {
        return emailStatus;
    }

    /**
     * Sets the value of the emailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailStatus(String value) {
        this.emailStatus = value;
    }

}
