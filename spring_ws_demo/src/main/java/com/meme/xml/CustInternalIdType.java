
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustInternalIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInternalIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustCIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustCINSfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInternalIdType", propOrder = {
    "custCIN",
    "custCINSfx"
})
public class CustInternalIdType {

    @XmlElement(name = "CustCIN", required = true)
    protected String custCIN;
    @XmlElement(name = "CustCINSfx", required = true)
    protected String custCINSfx;

    /**
     * Gets the value of the custCIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCIN() {
        return custCIN;
    }

    /**
     * Sets the value of the custCIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCIN(String value) {
        this.custCIN = value;
    }

    /**
     * Gets the value of the custCINSfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCINSfx() {
        return custCINSfx;
    }

    /**
     * Sets the value of the custCINSfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCINSfx(String value) {
        this.custCINSfx = value;
    }

}
