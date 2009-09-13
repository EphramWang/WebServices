package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class BookBusTicketRequestList extends DataType implements Serializable
{
	private static final long serialVersionUID = -5227445561231474579L;
    
	private ArrayList<BookBusTicketRequestInfo> busTicketRequestInfoList;
	
	public BookBusTicketRequestList()
	{
		busTicketRequestInfoList = new ArrayList<BookBusTicketRequestInfo>();
	}

	public ArrayList<BookBusTicketRequestInfo> getBusTicketRequestInfoList()
	{
		return busTicketRequestInfoList;
	}

	public void setBusTicketRequestInfoList(ArrayList<BookBusTicketRequestInfo> busTicketRequestInfoList) 
	{
		this.busTicketRequestInfoList = busTicketRequestInfoList;
	}
}
