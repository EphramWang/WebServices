package com.ics.tcg.service.javadescription.bookairticketservice;

import java.util.ArrayList;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		BookAirTicketService1 sss = new BookAirTicketService1();
		
		
		BookAirTicketRequestInfo bookAirTicketRequestInfo1 = new BookAirTicketRequestInfo();
		BookAirTicketRequestInfo bookAirTicketRequestInfo2 = new BookAirTicketRequestInfo();
		//bookAirTicketRequestInfo1.setUserInfo(user1);
		bookAirTicketRequestInfo1.setFlightsName("FlightsName1");
		bookAirTicketRequestInfo1.setBookCount(2);
		//bookAirTicketRequestInfo2.setUserInfo(user2);
		bookAirTicketRequestInfo2.setFlightsName("FlightsName2");
		bookAirTicketRequestInfo2.setBookCount(1);
		
		ArrayList<BookAirTicketRequestInfo> requestList = new ArrayList<BookAirTicketRequestInfo>();
		requestList.add(bookAirTicketRequestInfo1);
		requestList.add(bookAirTicketRequestInfo2);
		
		BookAirTicketRequestList bookAirTicketRequestList = new BookAirTicketRequestList();
		bookAirTicketRequestList.setAirTicketRequestList(requestList);				
		
		BookAirTicketResponseList bookAirTicketResponseList = new BookAirTicketResponseList();
		
		bookAirTicketResponseList = sss.bookAirTicket(bookAirTicketRequestList);
		
		ArrayList<BookAirTicketResponseInfo> responseList = new ArrayList<BookAirTicketResponseInfo>();
		responseList = bookAirTicketResponseList.getAirTicketResponseList();
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println(" isBookSucceed:"+responseList.get(i).getIsBookSucceed()+" ticketkind:"+responseList.get(i).getTicketKind());
			System.out.println(" isFullBookSucceed: "+bookAirTicketResponseList.getIsFullBookSucceed());
		}
		
		

	}

}
