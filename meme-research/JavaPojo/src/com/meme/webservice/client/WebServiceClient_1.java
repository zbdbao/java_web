//package com.meme.webservice.client;
//
//import javax.xml.namespace.QName;
//
//import org.apache.axis2.AxisFault;
//import org.apache.axis2.addressing.EndpointReference;
//import org.apache.axis2.client.Options;
//import org.apache.axis2.rpc.client.RPCServiceClient;
//
//public class WebServiceClient_1 {
//	public static void main(String[] args){
//
//		String testingURL =  "http://localhost:8080/axis2/services/CalculateService";
//
//		RPCServiceClient serviceClient;
//		try {
//			serviceClient = new RPCServiceClient();
//	        Options options = serviceClient.getOptions();
//
//	        EndpointReference targetEPR = new EndpointReference(testingURL);
//	        options.setTo(targetEPR);
//
////	        The parameters which used for invoke the service
//	        Object[] entryArgs = new Object[] {1, 2};
//
////	        The return type
//	        Class[] classes = new Class[] { float.class };
//
////	        The namespace and services.
////	        This is able to get from http://localhost:8080/axis2/services/CalculateService?wsdl
//	        QName opName = new QName("http://test.webservice.meme.com", "minus");
//
//	        Object result = serviceClient.invokeBlocking(opName, entryArgs, classes)[0];
////	        if there is no return value, use serviceClient.invokeRobust(opName, entryArgs)
//
//	        System.out.println(result);
//
//		} catch (AxisFault e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//	}
//}
