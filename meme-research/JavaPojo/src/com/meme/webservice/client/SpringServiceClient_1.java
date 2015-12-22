//package com.meme.webservice.client;
//
//import org.apache.axis2.AxisFault;
//import org.apache.axis2.addressing.EndpointReference;
//import org.apache.axis2.client.Options;
//import org.apache.axis2.rpc.client.RPCServiceClient;
//
//import javax.xml.namespace.QName;
//
//public class SpringServiceClient_1 {
//	public static void main(String[] args){
//
//		String testingURL =  "http://localhost:8080/axis2/services/springService";
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
////	        Object[] entryArgs = new Object[] {1, 2};
//
////	        The return type
//	        Class[] classes = new Class[] { float.class };
//
////	        The namespace and services.
//			QName qname = new QName("http://test.webservice.meme.com", "toString");
//			Object[] result = serviceClient.invokeBlocking(qname, new Object[] { null }, new Class[] { String.class });
//			System.out.println(result[0]);
//
////	        System.out.println(result);
//
//		} catch (AxisFault e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//	}
//}
