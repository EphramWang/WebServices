package com.ics.tcg.service.javadescription.sms;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class SMSTest2 {

	public Boolean send()
	{
		try
		{
			String url = "http://vip.mston.com/smsapi/smsws.asmx";
			Service service = new Service();
			Call call = (Call)service.createCall();
//			QName qn1 = new QName("urn:"+serviceName,"SMBuyRequest");
////			QName qn2 = new QName("urn:SMS1","SMSendRequest");
//			call.registerTypeMapping(SMBuyRequest.class, 
//					qn1, 
//					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMBuyRequest.class, qn1), 
//					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMBuyRequest.class, qn1));
//			call.registerTypeMapping(SMSendRequest.class, 
//					qn2, 
//					new org.apache.axis.encoding.ser.BeanSerializerFactory(SMSendRequest.class, qn2), 
//					new org.apache.axis.encoding.ser.BeanDeserializerFactory(SMSendRequest.class, qn2));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName("SendSMS");
//			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			//call.setReturnClass(WeatherForecastResponse.class);
			//call.setReturnType(qn2, WeatherForecastResponse.class);
			String Command = "SendSMS";
			String UserName = "ephram1987";
			String Password = "112233";
			String Mobiles = "13951025150";
			String Msg = "Webservice success!";
			
			call.addParameter("Command", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("UserName", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("Password", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("Mobiles", XMLType.XSD_STRING, ParameterMode.IN);
			call.addParameter("Msg", XMLType.XSD_STRING, ParameterMode.IN);
			
			call.invoke(new Object[]{Command,UserName,Password,Mobiles,Msg});
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
		
		return true;
	}
	public static void main(String[] args) {
		SMSTest2 tt = new SMSTest2();
		tt.send();

	}

}
