package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;


public class BookTrainTicketService5 implements Serializable
{
	private static final long serialVersionUID = 3820305919871972640L;
    
	public BookTrainTicketResponseList bookTrainTicket(BookTrainTicketRequestList bookTrainTicketRequestList)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookTrainTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ArrayList<BookTrainTicketRequestInfo> trainTicketRequestInfoList = bookTrainTicketRequestList.getTrainTicketRequestInfoList();
		ArrayList<BookTrainTicketResponseInfo> bookedTrainTicketInfoList = new ArrayList<BookTrainTicketResponseInfo>();
		boolean isFullBookSucceed = true;
		for(int i=0;i<trainTicketRequestInfoList.size();i++)
		{
//			BookTrainTicketResponseInfo info = new BookTrainTicketResponseInfo();
//			info.setTrainNum(trainTicketRequestInfoList.get(i).getTrainNum());
//			
//			if(Math.random()<Double.parseDouble(config.getProperty("isBookSucceed")))
//			{
//				info.setIsBookSucceed(true);
//				info.setTicketKind(config.getProperty("ticketKind1"));
//			}
//			else
//			{
//				info.setIsBookSucceed(false);
//				isFullBookSucceed = false;
//			}
//			bookedTrainTicketInfoList.add(info);
			
			BookTrainTicketRequestInfo requestInfo = trainTicketRequestInfoList.get(i);
			for(int j=0;j<requestInfo.getBookCount();j++)
			{
				BookTrainTicketResponseInfo info = new BookTrainTicketResponseInfo();
				info.setTrainNum(trainTicketRequestInfoList.get(i).getTrainNum());
				if(Math.random()<Double.parseDouble(config.getProperty("isBookSucceed")))
				{
					info.setIsBookSucceed(true);
					info.setTicketKind(config.getProperty("ticketKind1"));
				}
				else
				{
					info.setIsBookSucceed(false);
					isFullBookSucceed = false;
				}
				bookedTrainTicketInfoList.add(info);
			}
		}
		BookTrainTicketResponseList response = new BookTrainTicketResponseList();
		response.setBookedTrainTicketInfoList(bookedTrainTicketInfoList);
		response.setIsFullBookSucceed(isFullBookSucceed);
		return response;
	}
	
	public TrainNumResponse getTrainNum(TrainNumRequest trainNumRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookTrainTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Date   trainDate = trainNumRequest.getTrainDate();
		ArrayList<TrainNumInfo> trainNumInfoList = new ArrayList<TrainNumInfo>();
		TrainNumInfo info1 = new TrainNumInfo();
		TrainNumInfo info2 = new TrainNumInfo();
		info1.setTrainNum(config.getProperty("trainNum1"));
		info1.setStartOffTime(trainDate);
		info1.setArrivalTime(trainDate);
		
		info2.setTrainNum(config.getProperty("trainNum2"));
		info2.setStartOffTime(trainDate);
		info2.setArrivalTime(trainDate);
		
		trainNumInfoList.add(info1);
		trainNumInfoList.add(info2);
		
		TrainNumResponse response = new TrainNumResponse();
		response.setTrainNumInfoList(trainNumInfoList);
		
		return response;
	}
	
	public TicketPriceResponse getTrainTicketPrice(TrainTicketPriceRequest trainTicketPriceRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookTrainTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String ticketKind = trainTicketPriceRequest.getTicketKind();
		
		TicketPriceResponse response = new TicketPriceResponse();
		
		if(ticketKind.compareTo("FirstClass")==0)
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice1")));	
		else if (ticketKind.compareTo("SecondClass")==0)
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice2")));
		else
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice3")));
		return response;
	}
}
