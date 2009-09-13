package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class BookBusTicketResponseList extends DataType implements Serializable
{
	private static final long serialVersionUID = 4044931304581029325L;
    
	private ArrayList<BookBusTicketResponseInfo> bookedBusTicketInfoList;
	private Boolean isFullBookSucceed;
	
	public BookBusTicketResponseList()
	{
		bookedBusTicketInfoList = new ArrayList<BookBusTicketResponseInfo>();
	}
	
	public ArrayList<BookBusTicketResponseInfo> getBookedBusTicketInfoList() 
	{
		return bookedBusTicketInfoList;
	}
	
	public void setBookedBusTicketInfoList(ArrayList<BookBusTicketResponseInfo> bookedBusTicketInfoList) 
	{
		this.bookedBusTicketInfoList = bookedBusTicketInfoList;
	}
	
	public Boolean getIsFullBookSucceed() 
	{
		return isFullBookSucceed;
	}
	
	public void setIsFullBookSucceed(Boolean isFullBookSucceed)
	{
		this.isFullBookSucceed = isFullBookSucceed;
	}
}
