
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <p>Java class for xmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RqClientCtry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustInternalId" type="{}CustInternalIdType" minOccurs="0"/>
 *         &lt;element name="CISInternalId" type="{}CISInternalIdType" minOccurs="0"/>
 *         &lt;element name="CustDoc" type="{}CustDocType" minOccurs="0"/>
 *         &lt;element name="ContactMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LanguageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactDetl" type="{}ContactDetlType"/>
 *         &lt;element name="UpdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AlertType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubscribeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name = "xmlType", propOrder = {
    "msgId",
    "rqClientCtry",
    "custInternalId",
    "cisInternalId",
    "custDoc",
    "contactMode",
    "languageType",
    "contactDetl",
    "updType",
    "alertType",
    "subscribeInd",
    "verifyStatus"
})
public class XmlType {

    @XmlElement(required = true)
    protected String msgId;
    @XmlElement(name = "RqClientCtry", required = true)
    protected String rqClientCtry;
    @XmlElement(name = "CustInternalId")
    protected CustInternalIdType custInternalId;
    @XmlElement(name = "CISInternalId")
    protected CISInternalIdType cisInternalId;
    @XmlElement(name = "CustDoc")
    protected CustDocType custDoc;
    @XmlElement(name = "ContactMode", required = true)
    protected String contactMode;
    @XmlElement(name = "LanguageType", required = true)
    protected String languageType;
    @XmlElement(name = "ContactDetl", required = true)
    protected ContactDetlType contactDetl;
    @XmlElement(name = "UpdType", required = true)
    protected String updType;
    @XmlElement(name = "AlertType", required = true)
    protected String alertType;
    @XmlElement(name = "SubscribeInd")
    protected String subscribeInd;
    @XmlElement(name = "VerifyStatus")
    protected String verifyStatus;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the rqClientCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqClientCtry() {
        return rqClientCtry;
    }

    /**
     * Sets the value of the rqClientCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqClientCtry(String value) {
        this.rqClientCtry = value;
    }

    /**
     * Gets the value of the custInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link CustInternalIdType }
     *     
     */
    public CustInternalIdType getCustInternalId() {
        return custInternalId;
    }

    /**
     * Sets the value of the custInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustInternalIdType }
     *     
     */
    public void setCustInternalId(CustInternalIdType value) {
        this.custInternalId = value;
    }

    /**
     * Gets the value of the cisInternalId property.
     * 
     * @return
     *     possible object is
     *     {@link CISInternalIdType }
     *     
     */
    public CISInternalIdType getCISInternalId() {
        return cisInternalId;
    }

    /**
     * Sets the value of the cisInternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISInternalIdType }
     *     
     */
    public void setCISInternalId(CISInternalIdType value) {
        this.cisInternalId = value;
    }

    /**
     * Gets the value of the custDoc property.
     * 
     * @return
     *     possible object is
     *     {@link CustDocType }
     *     
     */
    public CustDocType getCustDoc() {
        return custDoc;
    }

    /**
     * Sets the value of the custDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDocType }
     *     
     */
    public void setCustDoc(CustDocType value) {
        this.custDoc = value;
    }

    /**
     * Gets the value of the contactMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMode() {
        return contactMode;
    }

    /**
     * Sets the value of the contactMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMode(String value) {
        this.contactMode = value;
    }

    /**
     * Gets the value of the languageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageType() {
        return languageType;
    }

    /**
     * Sets the value of the languageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageType(String value) {
        this.languageType = value;
    }

    /**
     * Gets the value of the contactDetl property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetlType }
     *     
     */
    public ContactDetlType getContactDetl() {
        return contactDetl;
    }

    /**
     * Sets the value of the contactDetl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetlType }
     *     
     */
    public void setContactDetl(ContactDetlType value) {
        this.contactDetl = value;
    }

    /**
     * Gets the value of the updType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdType() {
        return updType;
    }

    /**
     * Sets the value of the updType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdType(String value) {
        this.updType = value;
    }

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the subscribeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeInd() {
        return subscribeInd;
    }

    /**
     * Sets the value of the subscribeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeInd(String value) {
        this.subscribeInd = value;
    }

    /**
     * Gets the value of the verifyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * Sets the value of the verifyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyStatus(String value) {
        this.verifyStatus = value;
    }

}
