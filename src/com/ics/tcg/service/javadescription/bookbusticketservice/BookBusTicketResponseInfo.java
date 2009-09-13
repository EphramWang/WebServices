package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.Date;

public class BookBusTicketResponseInfo implements Serializable
{
	private static final long serialVersionUID = -1671351471487470143L;
    
	private String busNum;//����
	private String ticketKind;//��Ʊ������
	private String seatInfo;//��λ��Ϣ
	private Date   startOffTime;//����ʱ��
	private Boolean isBookSucceed;//�Ƿ񶩹��ɹ�
	
	public BookBusTicketResponseInfo()
	{
		busNum = new String();
		ticketKind = new String();
		seatInfo = new String();
		startOffTime = new Date();
	}
	
	public String getBusNum() 
	{
		return busNum;
	}
	
	public void setBusNum(String busNum) 
	{
		this.busNum = busNum;
	}
	
	public String getTicketKind()
	{
		return ticketKind;
	}
	
	public void setTicketKind(String ticketKind) 
	{
		this.ticketKind = ticketKind;
	}
	
	public String getSeatInfo()
	{
		return seatInfo;
	}
	
	public void setSeatInfo(String seatInfo) 
	{
		this.seatInfo = seatInfo;
	}
	
	public Date getStartOffTime() 
	{
		return startOffTime;
	}
	
	public void setStartOffTime(Date startOffTime) 
	{
		this.startOffTime = startOffTime;
	}

	public Boolean getIsBookSucceed()
	{
		return isBookSucceed;
	}

	public void setIsBookSucceed(Boolean isBookSucceed)
	{
		this.isBookSucceed = isBookSucceed;
	}
}
