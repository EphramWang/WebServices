package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

//import com.ics.tcg.service.javadescription.UserInfo;


public class BookBusTicketTest {

	public BookBusTicketResponseList bookBusTicket(BookBusTicketRequestList bookBusTicketRequestList,String serviceName,String url)
	{
		BookBusTicketResponseList responseList = new BookBusTicketResponseList();
		
		try
		{
			//String url = "http://localhost:8080/axis/services/BookBusTicketService1";
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BookBusTicketRequestList");
			QName qn2 = new QName("urn:"+serviceName,"BookBusTicketResponseList");
			QName qn3 = new QName("urn:"+serviceName,"BookBusTicketRequestInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"BookBusTicketResponseInfo");
			QName qn5 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(BookBusTicketRequestList.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookBusTicketRequestList.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookBusTicketRequestList.class, qn1));
			call.registerTypeMapping(BookBusTicketResponseList.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookBusTicketResponseList.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookBusTicketResponseList.class, qn2));
			call.registerTypeMapping(BookBusTicketRequestInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookBusTicketRequestInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookBusTicketRequestInfo.class, qn3));
			call.registerTypeMapping(BookBusTicketResponseInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookBusTicketResponseInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookBusTicketResponseInfo.class, qn4));
			call.registerTypeMapping(UserInfo.class, 
					qn5, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn5), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn5));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"bookBusTicket"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(BookBusTicketResponseList.class);
			call.setReturnType(qn2, BookBusTicketResponseList.class);
			
			responseList = (BookBusTicketResponseList)call.invoke(new Object[]{bookBusTicketRequestList});
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
	
	public BusNumResponse getBusNum(BusNumRequest BusNumRequest, String serviceName, String url)
	{
		BusNumResponse response = new BusNumResponse();	
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BusNumRequest");
			QName qn2 = new QName("urn:"+serviceName,"BusNumResponse");
			QName qn3 = new QName("urn:"+serviceName,"BusNumInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(BusNumRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BusNumRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BusNumRequest.class, qn1));
			call.registerTypeMapping(BusNumResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BusNumResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BusNumResponse.class, qn2));
			call.registerTypeMapping(BusNumInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BusNumInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BusNumInfo.class, qn3));
			call.registerTypeMapping(UserInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn4));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getBusNum"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(BusNumResponse.class);
			call.setReturnType(qn2, BusNumResponse.class);
			
			response = (BusNumResponse)call.invoke(new Object[]{BusNumRequest});
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
	public TicketPriceResponse getBusTicketPrice(BusTicketPriceRequest BusTicketPriceRequest, String serviceName, String url)
	{
		TicketPriceResponse response = new TicketPriceResponse();	
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BusTicketPriceRequest");
			QName qn2 = new QName("urn:"+serviceName,"TicketPriceResponse");

			call.registerTypeMapping(BusTicketPriceRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BusTicketPriceRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BusTicketPriceRequest.class, qn1));
			call.registerTypeMapping(TicketPriceResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TicketPriceResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TicketPriceResponse.class, qn2));

			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getBusTicketPrice"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(TicketPriceResponse.class);
			call.setReturnType(qn2, TicketPriceResponse.class);
			
			response = (TicketPriceResponse)call.invoke(new Object[]{BusTicketPriceRequest});
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
		/*
		 * test bookBusTicket
		 */
		UserInfo user1 = new UserInfo();
		user1.setUserName("user1");
		UserInfo user2 = new UserInfo();
		user1.setUserName("user2");
		
		BookBusTicketRequestInfo bookBusTicketRequestInfo1 = new BookBusTicketRequestInfo();
		BookBusTicketRequestInfo bookBusTicketRequestInfo2 = new BookBusTicketRequestInfo();
		bookBusTicketRequestInfo1.setUserInfo(user1);
		bookBusTicketRequestInfo1.setBusNum("bus NO.1");
		bookBusTicketRequestInfo1.setBookCount(3);
		bookBusTicketRequestInfo2.setUserInfo(user2);
		bookBusTicketRequestInfo2.setBusNum("bus NO.1");
		bookBusTicketRequestInfo2.setBookCount(1);
		
		ArrayList<BookBusTicketRequestInfo> requestList = new ArrayList<BookBusTicketRequestInfo>();
		requestList.add(bookBusTicketRequestInfo1);
		requestList.add(bookBusTicketRequestInfo2);
		
		BookBusTicketRequestList bookBusTicketRequestList = new BookBusTicketRequestList();
		bookBusTicketRequestList.setBusTicketRequestInfoList(requestList);		
		
		BookBusTicketResponseList bookBusTicketResponseList = new BookBusTicketResponseList();
		
		BookBusTicketTest tt = new BookBusTicketTest();
		bookBusTicketResponseList = tt.bookBusTicket(bookBusTicketRequestList,"BookBusTicketService1","http://localhost:8080/axis/services/BookBusTicketService1");
		
		ArrayList<BookBusTicketResponseInfo> responseList = new ArrayList<BookBusTicketResponseInfo>();
		responseList = bookBusTicketResponseList.getBookedBusTicketInfoList();
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println(" isBookSucceed:"+responseList.get(i).getIsBookSucceed()+" BusNum:"+responseList.get(i).getBusNum());
			
		}
	
		/*
		 * test getBusNum
		 */
		BusNumRequest BusNumRequest = new BusNumRequest();
		BusNumResponse BusNumresponse = tt.getBusNum(BusNumRequest, "BookBusTicketService1", "http://localhost:8080/axis/services/BookBusTicketService1");
		System.out.println("Bus number:   "+BusNumresponse.getBusNumInfoList().get(0).getBusNum());
		/*
		 * test getBusTicketPrice
		 */
		BusTicketPriceRequest BusTicketPriceRequest = new BusTicketPriceRequest();
		BusTicketPriceRequest.setTicketKind("FirstClass");
		TicketPriceResponse ticketPriceResponse = tt.getBusTicketPrice(BusTicketPriceRequest, "BookBusTicketService1", "http://localhost:8080/axis/services/BookBusTicketService1");
		System.out.println("ticket price:   "+ticketPriceResponse.getTicketPrice());
	}

}
