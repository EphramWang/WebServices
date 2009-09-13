package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.io.Serializable;
import java.util.Date;

import com.ics.tcg.service.javadescription.DataType;

public class TrainNumRequest extends DataType implements Serializable
{
	private static final long serialVersionUID = -1527237836869929785L;
    
	private String trainTicketAgentName;//��Ʊ��������
	private String startAddress;//������
	private String destination;//Ŀ�ĵ�
	private Date   trainDate;//�𳵷�������
	
	public TrainNumRequest()
	{
		trainTicketAgentName = new String();
		startAddress = new String();
		destination = new String();
		trainDate = new Date();
	}
	
	public String getTrainTicketAgentName() 
	{
		return trainTicketAgentName;
	}
	
	public void setTrainTicketAgentName(String trainTicketAgentName)
	{
		this.trainTicketAgentName = trainTicketAgentName;
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
	
	public Date getTrainDate() 
	{
		return trainDate;
	}
	
	public void setTrainDate(Date trainDate)
	{
		this.trainDate = trainDate;
	}
}
