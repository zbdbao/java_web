package com.meme.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by zhangb on 20/11/2015.
 */
public class XMLUtilClass {

    public static void main(String[] args){
        try {
            System.out.println(XMLUtilClass.convertToXML());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    public static String convertToXML() throws JAXBException {
        Marshaller mashaller = null;
        mashaller =  JAXBContext.newInstance("com.meme.xml").createMarshaller();

        CISInternalIdType cisInternalId = new CISInternalIdType();
        CustInternalIdType custInternalId = new CustInternalIdType();
        CustDocType custDocId = new CustDocType();

        PhoneType phoneType = new PhoneType();
        ContactDetlType contactDetl = new ContactDetlType();

        XmlType xmlType = new XmlType();

        custDocId.setDocNum("CustomerRef2()");
        custDocId.setDocType("CustomerRef1()");
        phoneType.setPhoneCtryCode("BroadcastConstants.PHONE_COUNTRY_CODE_HK");
        xmlType.setAlertType("");
        cisInternalId.setCISCIN("CustomerRef1()");
        cisInternalId.setCISCINsfx("CustomerRef2()");
        custInternalId.setCustCIN("CustomerRef1()");
        custInternalId.setCustCINSfx("CustomerRef2()");

        phoneType.setPhoneCtryCode("BroadcastConstants.PHONE_COUNTRY_CODE_IN");
        xmlType.setAlertType("");

        phoneType.setPhoneAreaCode("");
        phoneType.setPhoneNum("MobileNumber()");

//			contactDetl.setEmailDetails(value);
        contactDetl.setPhone(phoneType);


        //xmlType.setAlertType("OFF");
        xmlType.setCISInternalId(cisInternalId);
        xmlType.setCustDoc(custDocId);
        xmlType.setCustInternalId(custInternalId);
        xmlType.setContactDetl(contactDetl);
        xmlType.setRqClientCtry("countryCode");
        xmlType.setContactMode("BroadcastConstants.MESSAGE_TYPE_SMS");
        xmlType.setMsgId("MessageId()");
        xmlType.setLanguageType("BroadcastConstants.LANGUAGE_TYPE_EN");
        xmlType.setUpdType("BroadcastConstants.CHANG_ID_ACTION_U");
        xmlType.setSubscribeInd("BroadcastConstants.VALUE_Y");
        xmlType.setVerifyStatus("status");

        ObjectFactory factory = new ObjectFactory();
        JAXBElement<XmlType> emailDetailsType = factory.createXml(xmlType);
        StringWriter sw =
                new StringWriter();
        System.out.println(emailDetailsType);
        mashaller.marshal(emailDetailsType, sw);
        return sw.toString();
    }
}
