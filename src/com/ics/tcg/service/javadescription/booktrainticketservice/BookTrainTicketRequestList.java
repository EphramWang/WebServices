package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class BookTrainTicketRequestList extends DataType implements Serializable
{
	private static final long serialVersionUID = -2952197801956669136L;
    
	private ArrayList<BookTrainTicketRequestInfo> trainTicketRequestInfoList;

	public BookTrainTicketRequestList()
	{
		trainTicketRequestInfoList = new ArrayList<BookTrainTicketRequestInfo>();
	}
	
	public ArrayList<BookTrainTicketRequestInfo> getTrainTicketRequestInfoList() 
	{
		return trainTicketRequestInfoList;
	}

	public void setTrainTicketRequestInfoList (ArrayList<BookTrainTicketRequestInfo> trainTicketRequestInfoList)
	{
		this.trainTicketRequestInfoList = trainTicketRequestInfoList;
	}
}
