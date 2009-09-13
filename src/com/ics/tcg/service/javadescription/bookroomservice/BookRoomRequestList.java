package com.ics.tcg.service.javadescription.bookroomservice;

import com.ics.tcg.service.javadescription.DataType;

import java.io.Serializable;
import java.util.ArrayList;

public class BookRoomRequestList extends DataType implements Serializable 
{
	private static final long serialVersionUID = -5074302362676755828L;
	
	private ArrayList<BookRoomRequestInfo> roomRequestInfoList;
	
	public BookRoomRequestList()
	{
		roomRequestInfoList = new ArrayList<BookRoomRequestInfo>();
	}

	public ArrayList<BookRoomRequestInfo> getRoomRequestInfoList() 
	{
		return roomRequestInfoList;
	}

	public void setRoomRequestInfoList(ArrayList<BookRoomRequestInfo> roomRequestInfoList) 
	{
		this.roomRequestInfoList = roomRequestInfoList;
	}
}
