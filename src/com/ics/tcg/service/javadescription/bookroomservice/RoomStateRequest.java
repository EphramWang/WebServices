package com.ics.tcg.service.javadescription.bookroomservice;

import java.io.Serializable;

import com.ics.tcg.service.javadescription.DataType;

public class RoomStateRequest extends DataType implements Serializable
{
	private static final long serialVersionUID = -3383920477588317568L;
	
	private String hotelName;//�õ����
	private String roomNum;//�����
	
	public RoomStateRequest()
	{
		hotelName = new String();
		roomNum = new String();
	}
	
	public String getHotelName() 
	{
		return hotelName;
	}
	
	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}
	
	public String getRoomNum() 
	{
		return roomNum;
	}
	
	public void setRoomNum(String roomNum) 
	{
		this.roomNum = roomNum;
	}
}
