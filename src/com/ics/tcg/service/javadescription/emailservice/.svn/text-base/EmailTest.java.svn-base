package com.ics.tcg.service.javadescription.emailservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;



public class EmailTest 
{
	public Boolean emailSend(EmailSendRequest emailSendRequest,String serviceName,String url)
	{
		Boolean response = false;
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"EmailSendRequest");
			call.registerTypeMapping(EmailSendRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(EmailSendRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(EmailSendRequest.class, qn1));

			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"emailSend"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			//call.setReturnClass(WeatherForecastResponse.class);
			//call.setReturnType(qn2, WeatherForecastResponse.class);
			
			response = (Boolean)call.invoke(new Object[]{emailSendRequest});
		}
		catch(ServiceException e)
		{
			e.printStackTrace();
		}
		catch(RemoteException e)
		{
			e.printStackTrace();
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		
		return response;
	}
	
	public static void main(String[] args)
	{
		EmailTest tt = new EmailTest();
		
		EmailSendRequest request = new EmailSendRequest();
		request.setEmailContent("EmailContent");
		request.setEmailSender("emailSender");
		
		
		System.out.println("Email send successful? :"+tt.emailSend(request,"EmailService1","http://localhost:8080/axis/services/EmailService1"));
		
		
		
	}
}
