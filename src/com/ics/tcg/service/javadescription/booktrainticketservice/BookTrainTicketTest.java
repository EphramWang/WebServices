package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

//import com.ics.tcg.service.javadescription.UserInfo;


public class BookTrainTicketTest {

	public BookTrainTicketResponseList bookTrainTicket(BookTrainTicketRequestList bookTrainTicketRequestList,String serviceName,String url)
	{
		BookTrainTicketResponseList responseList = new BookTrainTicketResponseList();
		
		try
		{
			//String url = "http://localhost:8080/axis/services/BookTrainTicketService1";
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BookTrainTicketRequestList");
			QName qn2 = new QName("urn:"+serviceName,"BookTrainTicketResponseList");
			QName qn3 = new QName("urn:"+serviceName,"BookTrainTicketRequestInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"BookTrainTicketResponseInfo");
			QName qn5 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(BookTrainTicketRequestList.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookTrainTicketRequestList.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookTrainTicketRequestList.class, qn1));
			call.registerTypeMapping(BookTrainTicketResponseList.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookTrainTicketResponseList.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookTrainTicketResponseList.class, qn2));
			call.registerTypeMapping(BookTrainTicketRequestInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookTrainTicketRequestInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookTrainTicketRequestInfo.class, qn3));
			call.registerTypeMapping(BookTrainTicketResponseInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookTrainTicketResponseInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookTrainTicketResponseInfo.class, qn4));
			call.registerTypeMapping(UserInfo.class, 
					qn5, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn5), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn5));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"bookTrainTicket"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(BookTrainTicketResponseList.class);
			call.setReturnType(qn2, BookTrainTicketResponseList.class);
			
			responseList = (BookTrainTicketResponseList)call.invoke(new Object[]{bookTrainTicketRequestList});
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
	
	public TrainNumResponse getTrainNum(TrainNumRequest trainNumRequest, String serviceName, String url)
	{
		TrainNumResponse response = new TrainNumResponse();	
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"TrainNumRequest");
			QName qn2 = new QName("urn:"+serviceName,"TrainNumResponse");
			QName qn3 = new QName("urn:"+serviceName,"TrainNumInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(TrainNumRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TrainNumRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TrainNumRequest.class, qn1));
			call.registerTypeMapping(TrainNumResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TrainNumResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TrainNumResponse.class, qn2));
			call.registerTypeMapping(TrainNumInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TrainNumInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TrainNumInfo.class, qn3));
			call.registerTypeMapping(UserInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn4));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getTrainNum"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(TrainNumResponse.class);
			call.setReturnType(qn2, TrainNumResponse.class);
			
			response = (TrainNumResponse)call.invoke(new Object[]{trainNumRequest});
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
	public TicketPriceResponse getTrainTicketPrice(TrainTicketPriceRequest trainTicketPriceRequest, String serviceName, String url)
	{
		TicketPriceResponse response = new TicketPriceResponse();	
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"TrainTicketPriceRequest");
			QName qn2 = new QName("urn:"+serviceName,"TicketPriceResponse");

			call.registerTypeMapping(TrainTicketPriceRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TrainTicketPriceRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TrainTicketPriceRequest.class, qn1));
			call.registerTypeMapping(TicketPriceResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(TicketPriceResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(TicketPriceResponse.class, qn2));

			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getTrainTicketPrice"));
			call.addParameter("request",qn1,ParameterMode.IN);
			call.setReturnClass(TicketPriceResponse.class);
			call.setReturnType(qn2, TicketPriceResponse.class);
			
			response = (TicketPriceResponse)call.invoke(new Object[]{trainTicketPriceRequest});
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
		 * test bookTrainTicket
		 */
		UserInfo user1 = new UserInfo();
		user1.setUserName("user1");
		UserInfo user2 = new UserInfo();
		user1.setUserName("user2");
		
		BookTrainTicketRequestInfo bookTrainTicketRequestInfo1 = new BookTrainTicketRequestInfo();
		BookTrainTicketRequestInfo bookTrainTicketRequestInfo2 = new BookTrainTicketRequestInfo();
		bookTrainTicketRequestInfo1.setUserInfo(user1);
		bookTrainTicketRequestInfo1.setTrainNum("T66");
		bookTrainTicketRequestInfo1.setBookCount(3);
		bookTrainTicketRequestInfo2.setUserInfo(user2);
		bookTrainTicketRequestInfo2.setTrainNum("T55");
		bookTrainTicketRequestInfo2.setBookCount(1);
		
		ArrayList<BookTrainTicketRequestInfo> requestList = new ArrayList<BookTrainTicketRequestInfo>();
		requestList.add(bookTrainTicketRequestInfo1);
		requestList.add(bookTrainTicketRequestInfo2);
		
		BookTrainTicketRequestList bookTrainTicketRequestList = new BookTrainTicketRequestList();
		bookTrainTicketRequestList.setTrainTicketRequestInfoList(requestList);		
		
		BookTrainTicketResponseList bookTrainTicketResponseList = new BookTrainTicketResponseList();
		
		BookTrainTicketTest tt = new BookTrainTicketTest();
		bookTrainTicketResponseList = tt.bookTrainTicket(bookTrainTicketRequestList,"BookTrainTicketService1","http://localhost:8080/axis/services/BookTrainTicketService1");
		
		ArrayList<BookTrainTicketResponseInfo> responseList = new ArrayList<BookTrainTicketResponseInfo>();
		responseList = bookTrainTicketResponseList.getBookedTrainTicketInfoList();
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println(" isBookSucceed:"+responseList.get(i).getIsBookSucceed()+" trainNum:"+responseList.get(i).getTrainNum()+" isFullBookSucceed:"+bookTrainTicketResponseList.getIsFullBookSucceed());
			
		}
	
		/*
		 * test getTrainNum
		 */
		TrainNumRequest trainNumRequest = new TrainNumRequest();
		TrainNumResponse trainNumresponse = tt.getTrainNum(trainNumRequest, "BookTrainTicketService1", "http://localhost:8080/axis/services/BookTrainTicketService1");
		System.out.println("train number:   "+trainNumresponse.getTrainNumInfoList().get(0).getTrainNum());
		/*
		 * test getTrainTicketPrice
		 */
		TrainTicketPriceRequest trainTicketPriceRequest = new TrainTicketPriceRequest();
		trainTicketPriceRequest.setTicketKind("FirstClass");
		TicketPriceResponse ticketPriceResponse = tt.getTrainTicketPrice(trainTicketPriceRequest, "BookTrainTicketService1", "http://localhost:8080/axis/services/BookTrainTicketService1");
		System.out.println("ticket price:   "+ticketPriceResponse.getTicketPrice());
	}

}
