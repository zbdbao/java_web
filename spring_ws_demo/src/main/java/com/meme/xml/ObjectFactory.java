
package com.meme.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.meme.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Xml_QNAME = new QName("", "xml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.meme.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlType }
     * 
     */
    public XmlType createXmlType() {
        return new XmlType();
    }

    /**
     * Create an instance of {@link CISInternalIdType }
     * 
     */
    public CISInternalIdType createCISInternalIdType() {
        return new CISInternalIdType();
    }

    /**
     * Create an instance of {@link CustDocType }
     * 
     */
    public CustDocType createCustDocType() {
        return new CustDocType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link ContactDetlType }
     * 
     */
    public ContactDetlType createContactDetlType() {
        return new ContactDetlType();
    }

    /**
     * Create an instance of {@link CustInternalIdType }
     * 
     */
    public CustInternalIdType createCustInternalIdType() {
        return new CustInternalIdType();
    }

    /**
     * Create an instance of {@link EmailDetailsType }
     * 
     */
    public EmailDetailsType createEmailDetailsType() {
        return new EmailDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xml")
    public JAXBElement<XmlType> createXml(XmlType value) {
        return new JAXBElement<XmlType>(_Xml_QNAME, XmlType.class, null, value);
    }

}
