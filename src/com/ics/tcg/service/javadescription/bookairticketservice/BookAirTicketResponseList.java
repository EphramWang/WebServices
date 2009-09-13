package com.ics.tcg.service.javadescription.bookairticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class BookAirTicketResponseList extends DataType implements Serializable
{
	private static final long serialVersionUID = 8619390029212999102L;
    
	private ArrayList<BookAirTicketResponseInfo> airTicketResponseList;
	private Boolean isFullBookSucceed;
    
	public BookAirTicketResponseList()
	{
		airTicketResponseList = new ArrayList<BookAirTicketResponseInfo>();
	}
	
	public ArrayList<BookAirTicketResponseInfo> getAirTicketResponseList() 
	{
		return airTicketResponseList;
	}

	public void setAirTicketResponseList(ArrayList<BookAirTicketResponseInfo> airTicketResponseList) 
	{
		this.airTicketResponseList = airTicketResponseList;
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
