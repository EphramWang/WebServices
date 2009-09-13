package com.ics.tcg.service.javadescription.bookairticketservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;



public class BookAirTicketTest 
{
	public BookAirTicketResponseList bookAirTicket(BookAirTicketRequestList bookAirTicketRequestList,String serviceName,String url)
	{
		BookAirTicketResponseList responseList = new BookAirTicketResponseList();
		
		try
		{
			//String url = "http://localhost:8080/axis/services/BookAirTicketService2";
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BookAirTicketRequestList");
			QName qn2 = new QName("urn:"+serviceName,"BookAirTicketResponseList");
			QName qn3 = new QName("urn:"+serviceName,"BookAirTicketRequestInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"BookAirTicketResponseInfo");
			QName qn5 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(BookAirTicketRequestList.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookAirTicketRequestList.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookAirTicketRequestList.class, qn1));
			call.registerTypeMapping(BookAirTicketResponseList.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookAirTicketResponseList.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookAirTicketResponseList.class, qn2));
			call.registerTypeMapping(BookAirTicketRequestInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookAirTicketRequestInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookAirTicketRequestInfo.class, qn3));
			call.registerTypeMapping(BookAirTicketResponseInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookAirTicketResponseInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookAirTicketResponseInfo.class, qn4));
			call.registerTypeMapping(UserInfo.class, 
					qn5, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn5), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn5));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"BookAirTicket"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(BookAirTicketResponseList.class);
			call.setReturnType(qn2, BookAirTicketResponseList.class);
			
			responseList = (BookAirTicketResponseList)call.invoke(new Object[]{bookAirTicketRequestList});
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
		return responseList;
	}
	
	public TicketPriceResponse getAirTicketPrice (AirTicketPriceRequest ariTicketPriceRequesst,String serviceName,String url)
	{
		TicketPriceResponse response = new TicketPriceResponse();
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"AirTicketPriceRequest");
			QName qn2 = new QName("urn:"+serviceName,"TicketPriceResponse");

			call.registerTypeMapping(AirTicketPriceRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(AirTicketPriceRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(AirTicketPriceRequest.class, qn1));
			call.registerTypeMapping(TicketPriceResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TicketPriceResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TicketPriceResponse.class, qn2));

			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getAirTicketPrice"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(TicketPriceResponse.class);
			call.setReturnType(qn2, TicketPriceResponse.class);
			
			response = (TicketPriceResponse)call.invoke(new Object[]{ariTicketPriceRequesst});
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
	public FlightsNameResponse getFlightsName(FlightsNameRequest flightsNameRequest,String serviceName,String url)
	{
		FlightsNameResponse response = new FlightsNameResponse();
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"FlightsNameRequest");
			QName qn2 = new QName("urn:"+serviceName,"FlightsNameResponse");
			QName qn3 = new QName("urn:"+serviceName,"FlightsInfo");

			call.registerTypeMapping(FlightsNameRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(FlightsNameRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(FlightsNameRequest.class, qn1));
			call.registerTypeMapping(FlightsNameResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(FlightsNameResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(FlightsNameResponse.class, qn2));
			call.registerTypeMapping(FlightsInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(FlightsInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(FlightsInfo.class, qn3));

			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getAirTicketPrice"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(FlightsNameResponse.class);
			call.setReturnType(qn2, FlightsNameResponse.class);
			
			response = (FlightsNameResponse)call.invoke(new Object[]{flightsNameRequest});
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
//		UserInfo user1 = new UserInfo();
//		user1.setUserName("user1");
//		UserInfo user2 = new UserInfo();
//		user1.setUserName("user2");
		
		BookAirTicketRequestInfo bookAirTicketRequestInfo1 = new BookAirTicketRequestInfo();
		BookAirTicketRequestInfo bookAirTicketRequestInfo2 = new BookAirTicketRequestInfo();
		//bookAirTicketRequestInfo1.setUserInfo(user1);
		bookAirTicketRequestInfo1.setFlightsName("FlightsName1");
		bookAirTicketRequestInfo1.setBookCount(2);
		//bookAirTicketRequestInfo2.setUserInfo(user2);
		bookAirTicketRequestInfo2.setFlightsName("FlightsName2");
		bookAirTicketRequestInfo2.setBookCount(1);
		
		ArrayList<BookAirTicketRequestInfo> requestList = new ArrayList<BookAirTicketRequestInfo>();
		requestList.add(bookAirTicketRequestInfo1);
		requestList.add(bookAirTicketRequestInfo2);
		
		BookAirTicketRequestList bookAirTicketRequestList = new BookAirTicketRequestList();
		bookAirTicketRequestList.setAirTicketRequestList(requestList);				
		
		BookAirTicketResponseList bookAirTicketResponseList = new BookAirTicketResponseList();
		
		BookAirTicketTest tt = new BookAirTicketTest();
		bookAirTicketResponseList = tt.bookAirTicket(bookAirTicketRequestList,"BookAirTicketService1","http://localhost:8080/axis/services/BookAirTicketService1");
		
		ArrayList<BookAirTicketResponseInfo> responseList = new ArrayList<BookAirTicketResponseInfo>();
		responseList = bookAirTicketResponseList.getAirTicketResponseList();
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println(" isBookSucceed:"+responseList.get(i).getIsBookSucceed()+" ticketkind:"+responseList.get(i).getTicketKind());
			System.out.println(" isFullBookSucceed: "+bookAirTicketResponseList.getIsFullBookSucceed());
		}
		
		TicketPriceResponse priceResponse = new TicketPriceResponse();
		AirTicketPriceRequest priceRequest = new AirTicketPriceRequest();
		priceRequest.setAirLineName("airline1");
		priceRequest.setFlightName("flightName1");
		priceRequest.setTicketKind("FirstClass");
		priceResponse = tt.getAirTicketPrice(priceRequest,"BookAirTicketService1","http://localhost:8080/axis/services/BookAirTicketService1");
		System.out.println("returned Ticket Price: "+priceResponse.getTicketPrice());

	}

}
