package com.ics.tcg.service.javadescription.weatherforecastservice;

import java.io.Serializable;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class WeatherForecastTest implements Serializable
{
	private static final long serialVersionUID = -6664606388269152920L;
    
	public WeatherForecastResponse getWeatherForecast(WeatherForecastRequest weatherForecastRequest, String serviceName, String url)
	{
		WeatherForecastResponse response = new WeatherForecastResponse();
		try
		{
			
			//String url = "http://localhost:8080/axis/services/WeatherForecastService1";
			Service service = new Service();
			Call call = (Call)service.createCall();
//			QName qn1 = new QName("urn:WeatherForecastService1","WeatherForcastRequest");
//			QName qn2 = new QName("urn:WeatherForecastService1","WeatherForcastResponse");
//			QName qn3 = new QName("urn:WeatherForecastService1","WeatherInfo"); 
			QName qn1 = new QName("urn:"+serviceName,"WeatherForcastRequest");
			QName qn2 = new QName("urn:"+serviceName,"WeatherForcastResponse");
			QName qn3 = new QName("urn:"+serviceName,"WeatherInfo"); 
			call.registerTypeMapping(WeatherForecastRequest.class, qn1, new org.apache.axis.encoding.ser.BeanSerializerFactory(WeatherForecastRequest.class, qn1), new org.apache.axis.encoding.ser.BeanDeserializerFactory(WeatherForecastRequest.class, qn1));
			call.registerTypeMapping(WeatherForecastResponse.class, qn2, new org.apache.axis.encoding.ser.BeanSerializerFactory(WeatherForecastResponse.class, qn2), new org.apache.axis.encoding.ser.BeanDeserializerFactory(WeatherForecastResponse.class, qn2));
			call.registerTypeMapping(WeatherInfo.class, qn3, new org.apache.axis.encoding.ser.BeanSerializerFactory(WeatherInfo.class, qn3), new org.apache.axis.encoding.ser.BeanDeserializerFactory(WeatherInfo.class, qn3));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getWeatherForecast"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(WeatherForecastResponse.class);
			call.setReturnType(qn2, WeatherForecastResponse.class);
			
			response = (WeatherForecastResponse)call.invoke(new Object[]{weatherForecastRequest});
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

	public static void main(String args[])
	{
		WeatherForecastRequest rq = new WeatherForecastRequest();
		rq.setNation(new String("china"));
		rq.setCity(new String("Nanjing"));
		Date startDate = new Date();
		Date endDate = new Date();
		startDate.setTime(10);
		endDate.setTime(startDate.getTime()+24*3600000*3);
		System.out.println(startDate);
		
		rq.setStartDate(startDate);
		rq.setEndDate(endDate);
		
		WeatherForecastResponse response = new WeatherForecastResponse();	
		WeatherForecastTest cc = new WeatherForecastTest();
		response = cc.getWeatherForecast(rq,"WeatherForecastService1","http://localhost:8080/axis/services/WeatherForecastService1");
		
		ArrayList<WeatherInfo> weatherInfoList;
		weatherInfoList = response.getWeatherInfoList();
		for(int i=0;i<weatherInfoList.size();i++)
		{		
			WeatherInfo info = weatherInfoList.get(i);
			System.out.println("weatherStatus:"+info.getWeatherState()+"  WindPower:"+info.getWindPower()+"  WindDirection:"+info.getWindDirection()+"  LowestTemperature:"+info.getLowestTemperature()+"  MaximumTemperature:"+info.getMaximumTemperature());
	
		}
	}

	
}
