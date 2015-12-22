
package com.meme.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CISInternalIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CISInternalIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CISCIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CISCINsfx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CISInternalIdType", propOrder = {
    "ciscin",
    "cisciNsfx"
})
public class CISInternalIdType {

    @XmlElement(name = "CISCIN", required = true)
    protected String ciscin;
    @XmlElement(name = "CISCINsfx", required = true)
    protected String cisciNsfx;

    /**
     * Gets the value of the ciscin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCISCIN() {
        return ciscin;
    }

    /**
     * Sets the value of the ciscin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCISCIN(String value) {
        this.ciscin = value;
    }

    /**
     * Gets the value of the cisciNsfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCISCINsfx() {
        return cisciNsfx;
    }

    /**
     * Sets the value of the cisciNsfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCISCINsfx(String value) {
        this.cisciNsfx = value;
    }

}
