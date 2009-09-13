package com.ics.tcg.service.javadescription.bookairticketservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;


public class BookAirTicketService9 implements Serializable
{
	private static final long serialVersionUID = -1455753278079165473L;
    
	public BookAirTicketResponseList bookAirTicket(BookAirTicketRequestList bookAirTicketRequestList)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookAirTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ArrayList<BookAirTicketRequestInfo> airTicketRequestList = bookAirTicketRequestList.getAirTicketRequestList();
		ArrayList<BookAirTicketResponseInfo> airTicketResponseList = new ArrayList<BookAirTicketResponseInfo>();
		boolean isFullBookSucceed = true;
		for(int i=0;i<airTicketRequestList.size();i++)
		{
			/*
			BookAirTicketResponseInfo info = new BookAirTicketResponseInfo();
			String flightsName = airTicketRequestList.get(i).getFlightsName();
			info.setFlightsName(flightsName);
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
			airTicketResponseList.add(info);
			*/
			BookAirTicketRequestInfo requestInfo = airTicketRequestList.get(i);
			for(int j=0;j<requestInfo.getBookCount();j++)
			{
				BookAirTicketResponseInfo info = new BookAirTicketResponseInfo();
				String flightsName = airTicketRequestList.get(i).getFlightsName();
				info.setFlightsName(flightsName);
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
				airTicketResponseList.add(info);
			}
		}
		
		BookAirTicketResponseList response = new BookAirTicketResponseList();
		response.setAirTicketResponseList(airTicketResponseList);
		response.setIsFullBookSucceed(isFullBookSucceed);
		
		return response;
	}
	
	public FlightsNameResponse getFlightsName(FlightsNameRequest flightsNameRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookAirTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String airLineName = flightsNameRequest.getAirLineName();
		String startAddress = flightsNameRequest.getStartAddress();
		String destination = flightsNameRequest.getDestination();
		Date   flightDate = flightsNameRequest.getFlightDate();
		ArrayList<FlightsInfo> flightsInfoList = new ArrayList<FlightsInfo>();
		
		FlightsInfo info1 = new FlightsInfo();
		info1.setFlightName(config.getProperty("flightName1"));
		Date takeOffTime1 = new Date();
		Date landingTime1 = new Date();
		takeOffTime1.setTime(flightDate.getTime()+3600000*5);
		landingTime1.setTime(takeOffTime1.getTime()+3600000);
		info1.setTakeOffTime(takeOffTime1);
		info1.setLandingTime(landingTime1);	
		flightsInfoList.add(info1);
		
		FlightsInfo info2 = new FlightsInfo();
		info1.setFlightName(config.getProperty("flightName2"));
		Date takeOffTime2 = new Date();
		Date landingTime2 = new Date();
		takeOffTime2.setTime(flightDate.getTime()+3600000*3);
		landingTime2.setTime(takeOffTime2.getTime()+3600000);
		info2.setTakeOffTime(takeOffTime2);
		info2.setLandingTime(landingTime2);	
		flightsInfoList.add(info1);
		
		FlightsNameResponse response = new FlightsNameResponse();
		response.setFlightsInfoList(flightsInfoList);
		
		return response;
	}
	
	public TicketPriceResponse getAirTicketPrice (AirTicketPriceRequest ariTicketPriceRequesst)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/BookAirTicket.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		TicketPriceResponse response = new TicketPriceResponse();
		
		String airLineName = ariTicketPriceRequesst.getAirLineName();
		String ticketKind = ariTicketPriceRequesst.getTicketKind();
		String flightName = ariTicketPriceRequesst.getFlightName();
		
		if(ticketKind.compareTo("FirstClass")==0)
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice1")));
		else if(ticketKind.compareTo("SecondClass")==0)
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice2")));
		else
			response.setTicketPrice(Float.parseFloat(config.getProperty("ticketPrice3")));
		
		return response;
	}
}
