
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocIssueCtry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDocType", propOrder = {
    "primaryDoc",
    "docType",
    "docTypeDesc",
    "docNum",
    "docIssuePlace",
    "docIssueCtry",
    "docIssueDate",
    "docExpiryDate"
})
public class CustDocType {

    @XmlElement(name = "PrimaryDoc")
    protected String primaryDoc;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "DocTypeDesc")
    protected String docTypeDesc;
    @XmlElement(name = "DocNum", required = true)
    protected String docNum;
    @XmlElement(name = "DocIssuePlace")
    protected String docIssuePlace;
    @XmlElement(name = "DocIssueCtry")
    protected String docIssueCtry;
    @XmlElement(name = "DocIssueDate")
    protected String docIssueDate;
    @XmlElement(name = "DocExpiryDate")
    protected String docExpiryDate;

    /**
     * Gets the value of the primaryDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDoc() {
        return primaryDoc;
    }

    /**
     * Sets the value of the primaryDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDoc(String value) {
        this.primaryDoc = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    /**
     * Sets the value of the docTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeDesc(String value) {
        this.docTypeDesc = value;
    }

    /**
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the docIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssuePlace() {
        return docIssuePlace;
    }

    /**
     * Sets the value of the docIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssuePlace(String value) {
        this.docIssuePlace = value;
    }

    /**
     * Gets the value of the docIssueCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueCtry() {
        return docIssueCtry;
    }

    /**
     * Sets the value of the docIssueCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueCtry(String value) {
        this.docIssueCtry = value;
    }

    /**
     * Gets the value of the docIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueDate() {
        return docIssueDate;
    }

    /**
     * Sets the value of the docIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueDate(String value) {
        this.docIssueDate = value;
    }

    /**
     * Gets the value of the docExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocExpiryDate() {
        return docExpiryDate;
    }

    /**
     * Sets the value of the docExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocExpiryDate(String value) {
        this.docExpiryDate = value;
    }

}
