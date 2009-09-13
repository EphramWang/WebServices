package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.Date;

import com.ics.tcg.service.javadescription.DataType;

public class BusNumRequest extends DataType implements Serializable
{
	private static final long serialVersionUID = 1683811685307882003L;
    
	private String busTicketAgentName;//��Ʊ���������
	private String startAddress;//������
	private String destination;//Ŀ�ĵ�
	private Date   busDate;//��������
	
	public BusNumRequest()
	{
		busTicketAgentName = new String();
		startAddress = new String();
		destination = new String();
		busDate = new Date();
	}
	
	public String getBusTicketAgentName()
	{
		return busTicketAgentName;
	}
	
	public void setBusTicketAgentName(String busTicketAgentName) 
	{
		this.busTicketAgentName = busTicketAgentName;
	}
	
	public String getStartAddress() 
	{
		return startAddress;
	}
	
	public void setStartAddress(String startAddress) 
	{
		this.startAddress = startAddress;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public Date getBusDate() 
	{
		return busDate;
	}
	
	public void setBusDate(Date busDate) 
	{
		this.busDate = busDate;
	}
}
