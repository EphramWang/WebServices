package com.ics.tcg.service.javadescription.bookairticketservice;

import java.io.Serializable;

import com.ics.tcg.service.javadescription.DataType;

public class AirTicketPriceRequest extends DataType implements Serializable
{
	private static final long serialVersionUID = 3016151269990015792L;
	
	private String airLineName;//���չ�˾���
	private String ticketKind;//�ɻ�Ʊ������
	private String flightName;//�������
	
	public AirTicketPriceRequest()
	{
		airLineName = new String();
		ticketKind = new String();
		flightName = new String();
	}
	
	public String getAirLineName() 
	{
		return airLineName;
	}
	
	public void setAirLineName(String airLineName)
	{
		this.airLineName = airLineName;
	}
	
	public String getTicketKind() 
	{
		return ticketKind;
	}
	
	public void setTicketKind(String ticketKind)
	{
		this.ticketKind = ticketKind;
	}
	
	public String getFlightName() 
	{
		return flightName;
	}
	
	public void setFlightName(String flightName) 
	{
		this.flightName = flightName;
	}
}
