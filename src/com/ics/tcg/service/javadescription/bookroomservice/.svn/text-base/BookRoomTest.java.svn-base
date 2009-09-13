package com.ics.tcg.service.javadescription.bookroomservice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * 
 * @author ephram
 *
 */
public class BookRoomTest 
{
	public BookRoomResponseList bookingRoom(BookRoomRequestList bookRoomRequestList,String serviceName,String url)
	{
		BookRoomResponseList responseList = new BookRoomResponseList();
		try
		{
			//String url = "http://localhost:8080/axis/services/BookRoomService1";
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"BookRoomRequestList");
			QName qn2 = new QName("urn:"+serviceName,"BookRoomResponseList");
			QName qn3 = new QName("urn:"+serviceName,"BookRoomRequestInfo"); 
			QName qn4 = new QName("urn:"+serviceName,"BookRoomResponseInfo");
			QName qn5 = new QName("urn:"+serviceName,"UserInfo");
			call.registerTypeMapping(BookRoomRequestList.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookRoomRequestList.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookRoomRequestList.class, qn1));
			call.registerTypeMapping(BookRoomResponseList.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookRoomResponseList.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookRoomResponseList.class, qn2));
			call.registerTypeMapping(BookRoomRequestInfo.class, 
					qn3, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookRoomRequestInfo.class, qn3), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookRoomRequestInfo.class, qn3));
			call.registerTypeMapping(BookRoomResponseInfo.class, 
					qn4, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(BookRoomResponseInfo.class, qn4), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(BookRoomResponseInfo.class, qn4));
			call.registerTypeMapping(UserInfo.class, 
					qn5, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(UserInfo.class, qn5), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(UserInfo.class, qn5));
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"bookingRoom"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(BookRoomResponseList.class);
			call.setReturnType(qn2, BookRoomResponseList.class);
			
			responseList = (BookRoomResponseList)call.invoke(new Object[]{bookRoomRequestList});
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
	public RoomPriceResponse getRoomPrice(RoomPriceRequest roomPriceRequest,String serviceName,String url)
	{
		RoomPriceResponse response = new RoomPriceResponse();
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"RoomPriceRequest");
			QName qn2 = new QName("urn:"+serviceName,"RoomPriceResponse");

			call.registerTypeMapping(RoomPriceRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(RoomPriceRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(RoomPriceRequest.class, qn1));
			call.registerTypeMapping(RoomPriceResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(RoomPriceResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(RoomPriceResponse.class, qn2));
			
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getRoomPrice"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(RoomPriceResponse.class);
			call.setReturnType(qn2, RoomPriceResponse.class);
			
			response = (RoomPriceResponse)call.invoke(new Object[]{roomPriceRequest});
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
	public RoomStateResponse getRoomState(RoomStateRequest roomStateRequest,String serviceName,String url)
	{
		RoomStateResponse response = new RoomStateResponse();
		try
		{
			Service service = new Service();
			Call call = (Call)service.createCall();
			QName qn1 = new QName("urn:"+serviceName,"RoomStateRequest");
			QName qn2 = new QName("urn:"+serviceName,"RoomStateResponse");

			call.registerTypeMapping(RoomStateRequest.class, 
					qn1, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(RoomStateRequest.class, qn1), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(RoomStateRequest.class, qn1));
			call.registerTypeMapping(RoomStateResponse.class, 
					qn2, 
					new org.apache.axis.encoding.ser.BeanSerializerFactory(RoomStateResponse.class, qn2), 
					new org.apache.axis.encoding.ser.BeanDeserializerFactory(RoomStateResponse.class, qn2));
			
			call.setTargetEndpointAddress(new java.net.URL(url));
			call.setOperationName(new QName(serviceName,"getRoomState"));
			call.addParameter("request",qn1,ParameterMode.IN);
			//call.addParameter("request",XMLType.XSD_ANYTYPE,ParameterMode.IN);
			call.setReturnClass(RoomStateResponse.class);
			call.setReturnType(qn2, RoomStateResponse.class);
			
			response = (RoomStateResponse)call.invoke(new Object[]{roomStateRequest});
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/***/
		UserInfo user1 = new UserInfo();
		user1.setUserName("user1");
		UserInfo user2 = new UserInfo();
		user1.setUserName("user2");
		
		BookRoomRequestInfo bookRoomRequestInfo1 = new BookRoomRequestInfo();
		BookRoomRequestInfo bookRoomRequestInfo2 = new BookRoomRequestInfo();
		bookRoomRequestInfo1.setUserInfo(user1);
		bookRoomRequestInfo1.setHotelName("hotel1");
		bookRoomRequestInfo1.setRoomCount(2);
		bookRoomRequestInfo2.setUserInfo(user2);
		bookRoomRequestInfo2.setHotelName("hotel2");
		bookRoomRequestInfo2.setRoomCount(1);
		
		ArrayList<BookRoomRequestInfo> requestList = new ArrayList<BookRoomRequestInfo>();
		requestList.add(bookRoomRequestInfo1);
		requestList.add(bookRoomRequestInfo2);
		
		BookRoomRequestList bookRoomRequestList = new BookRoomRequestList();
		bookRoomRequestList.setRoomRequestInfoList(requestList);				
		
		BookRoomResponseList bookRoomResponseList = new BookRoomResponseList();
		
		BookRoomTest tt = new BookRoomTest();
		bookRoomResponseList = tt.bookingRoom(bookRoomRequestList,"BookRoomService1","http://localhost:8080/axis/services/BookRoomService1");
		
		ArrayList<BookRoomResponseInfo> responseList = new ArrayList<BookRoomResponseInfo>();
		responseList = bookRoomResponseList.getBookRoomResponseInfoList();
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println(" isBookSucceed:"+responseList.get(i).getIsBookSucceed()+" roomNum:"+responseList.get(i).getRoomNum());
			
		}
	

	}

}
