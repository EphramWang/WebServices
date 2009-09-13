package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;


public class BookBusTicketService4 implements Serializable
{
	private static final long serialVersionUID = 6998991637817082603L;
    
	public BookBusTicketResponseList bookBusTicket(BookBusTicketRequestList bookBusTicketRequestList)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookBusTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ArrayList<BookBusTicketRequestInfo> busTicketRequestInfoList = bookBusTicketRequestList.getBusTicketRequestInfoList();
		ArrayList<BookBusTicketResponseInfo> bookedBusTicketInfoList = new ArrayList<BookBusTicketResponseInfo>();
		boolean isFullBookSucceed = true;
		for(int i=0;i<busTicketRequestInfoList.size();i++)
		{
			/*
			BookBusTicketResponseInfo info = new BookBusTicketResponseInfo();
			info.setBusNum(busTicketRequestInfoList.get(i).getBusNum());			
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
			bookedBusTicketInfoList.add(info);
			*/
			BookBusTicketRequestInfo requestInfo = busTicketRequestInfoList.get(i);
			for(int j=0;j<requestInfo.getBookCount();j++)
			{
				BookBusTicketResponseInfo info = new BookBusTicketResponseInfo();
				info.setBusNum(busTicketRequestInfoList.get(i).getBusNum());
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
				bookedBusTicketInfoList.add(info);
			}
		}
		BookBusTicketResponseList response = new BookBusTicketResponseList();
		response.setBookedBusTicketInfoList(bookedBusTicketInfoList);
		response.setIsFullBookSucceed(isFullBookSucceed);
		return response;
	}
	
	public BusNumResponse getBusNum(BusNumRequest busNumRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookBusTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Date   busDate = busNumRequest.getBusDate();
		ArrayList<BusNumInfo> BusNumInfoList = new ArrayList<BusNumInfo>();
		BusNumInfo info1 = new BusNumInfo();
		BusNumInfo info2 = new BusNumInfo();
		info1.setBusNum(config.getProperty("busNum1"));
		info1.setStartOffTime(busDate);
		info1.setArrivalTime(busDate);
		
		info2.setBusNum(config.getProperty("busNum2"));
		info2.setStartOffTime(busDate);
		info2.setArrivalTime(busDate);
		
		BusNumInfoList.add(info1);
		BusNumInfoList.add(info2);
		
		BusNumResponse response = new BusNumResponse();
		response.setBusNumInfoList(BusNumInfoList);
		
		return response;
	}
	
	public TicketPriceResponse getBusTicketPrice(BusTicketPriceRequest busTicketPriceRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookBusTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String ticketKind = busTicketPriceRequest.getTicketKind();
		
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
