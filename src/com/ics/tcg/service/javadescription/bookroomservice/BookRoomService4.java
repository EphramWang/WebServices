package com.ics.tcg.service.javadescription.bookroomservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.io.Serializable;
/**
 * 
 * @author ephram
 *
 */
public class BookRoomService4 implements Serializable
{
	public BookRoomResponseList bookingRoom(BookRoomRequestList bookRoomRequestList)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookRoom.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		BookRoomResponseList responseList = new BookRoomResponseList();
		responseList.setIsFullBookSucceed(true);
		
		ArrayList<BookRoomRequestInfo> requestList = bookRoomRequestList.getRoomRequestInfoList();
		ArrayList<BookRoomResponseInfo> responseInfoList = new ArrayList<BookRoomResponseInfo>();
		for (int i = 0; i < requestList.size(); i++)
		{
			/**input*/
			String hotelName = requestList.get(i).getHotelName();
			String roomKind = requestList.get(i).getRoomKind();
			Date roomCheckInTime = requestList.get(i).getRoomCheckInTime();
			Date roomLeaveTime = requestList.get(i).getRoomLeaveTime();
			Integer roomCount = requestList.get(i).getRoomCount();
			/**output*/
			BookRoomResponseInfo bookRoomResponseInfo = new BookRoomResponseInfo();
			bookRoomResponseInfo.setRoomNum(config.getProperty("roomNum"));
			if(Math.random() < Double.parseDouble(config.getProperty("isBookSucceed")))
				bookRoomResponseInfo.setIsBookSucceed(true);
			else
			{
				bookRoomResponseInfo.setIsBookSucceed(false);
				responseList.setIsFullBookSucceed(false);
			}
			
			responseInfoList.add(bookRoomResponseInfo);
		}
		
		responseList.setBookRoomResponseInfoList(responseInfoList);
		
		return responseList;
	}
	
	public RoomPriceResponse getRoomPrice(RoomPriceRequest roomPriceRequest)
	{
		/**Load Configure File*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookRoom.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**input*/
		String hotelName = roomPriceRequest.getHotelName();
		String roomNum = roomPriceRequest.getRoomNum();
		/**output*/
		RoomPriceResponse roomPriceResponse = new RoomPriceResponse();
		double random = Math.random();
		Float roomPrice = new Float(0);
		if(random<0.33)
			roomPrice = Float.parseFloat(config.getProperty("roomPrice1"));
		else if(random<0.67)
			roomPrice = Float.parseFloat(config.getProperty("roomPrice2"));
		else
			roomPrice = Float.parseFloat(config.getProperty("roomPrice3"));
		
		roomPriceResponse.setRoomPrice(roomPrice);
		
		return roomPriceResponse;
	}
	
	public RoomStateResponse getRoomState(RoomStateRequest roomStateRequest)
	{
		/**Load Configure File*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookRoom.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**input*/
		String hotelName = roomStateRequest.getHotelName();
		String roomNum = roomStateRequest.getRoomNum();
		/**output*/
		RoomStateResponse roomStateResponse = new RoomStateResponse();
		String roomState = new String();
		double roomAvailable = Double.parseDouble(config.getProperty("roomAvailable"));
		if(Math.random()<roomAvailable)
			roomState = "Available";
		else
			roomState = "Unavailable";
		
		roomStateResponse.setRoomState(roomState);
		
		return roomStateResponse;
	}
	
}
