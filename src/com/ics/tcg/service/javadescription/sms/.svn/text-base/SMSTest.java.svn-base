package com.ics.tcg.service.javadescription.sms;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;



public class SMSTest 
{
	public Boolean smBuy(SMBuyRequest smBuyRequest,String serviceName,String url)
	{
		Boolean response = false;
		try
		{
			//String url = "http://localhost:8080/axis/services/SMS1";
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"SMBuyRequest");
//			QName qn2 = new QName("urn:SMS1","SMSendRequest");
			call.registerTypeMapping(SMBuyRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMBuyRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMBuyRequest.class, qn1));
//			call.registerTypeMapping(SMSendRequest.class, 
//					qn2, 
//					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMSendRequest.class, qn2), 
//					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMSendRequest.class, qn2));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"smBuy"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			//call.setReturnClass(WeatherForecastResponse.class);
			//call.setReturnType(qn2, WeatherForecastResponse.class);
			
			response = (Boolean)call.invoke(new Object[]{smBuyRequest});
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
	
	public Boolean smSend(SMSendRequest smSendRequest,String serviceName,String url)
	{
		Boolean response = false;
		try
		{
			//String url = "http://localhost:8080/axis/services/SMS1";
			Service service = new Service();
			Call call = (Call)service.createCall();
//			QName qn1 = new QName("urn:SMS1","SMBuyRequest");
			QName qn2 = new QName("urn:"+serviceName,"SMSendRequest");
//			call.registerTypeMapping(SMBuyRequest.class, 
//					qn1, 
//					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMBuyRequest.class, qn1), 
//					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMBuyRequest.class, qn1));
			call.registerTypeMapping(SMSendRequest.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMSendRequest.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMSendRequest.class, qn2));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"smSend"));
			call.addParameter("request",qn2,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			//call.setReturnClass(WeatherForecastResponse.class);
			//call.setReturnType(qn2, WeatherForecastResponse.class);
			
			response = (Boolean)call.invoke(new Object[]{smSendRequest});
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
		SMSTest tt = new SMSTest();
		
		SMBuyRequest buyRequest = new SMBuyRequest();
		buyRequest.setBuyerId("SMSBuyer1");
		buyRequest.setBuyerPassword("password1");
		buyRequest.setBuyerTelNum(10086);
		buyRequest.setSmCount(1);
		
		System.out.println("buy successful? :"+tt.smBuy(buyRequest,"sms1","http://localhost:8080/axis/services/SMS1"));
		
		SMSendRequest sendRequest = new SMSendRequest();
		sendRequest.setUserId("User1");
		
		System.out.println("send successful? :"+tt.smSend(sendRequest,"sms1","http://localhost:8080/axis/services/SMS1"));
		
		
		
	}
}
