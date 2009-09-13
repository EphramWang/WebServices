package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.io.Serializable;
import java.util.Date;

//import com.ics.tcg.service.javadescription.UserInfo;

public class BookTrainTicketRequestInfo implements Serializable
{
	private static final long serialVersionUID = -8781137668480877687L;
	
    private UserInfo userInfo;//��������Ϣ
    
	private String trainTicketAgentName;//��Ʊ��������
	private String ticketKind;//��Ʊ����
	private String trainNum;//�𳵳���
	private Integer bookCount;//������Ʊ������
	private Date   trainTime;//�𳵷���ʱ��
	
	public BookTrainTicketRequestInfo()
	{
		userInfo = new UserInfo();
		
		trainTicketAgentName = new String();
		ticketKind = new String();
		trainNum = new String();
		trainTime = new Date();
	}
	
	public String getTrainTicketAgentName() 
	{
		return trainTicketAgentName;
	}

	public void setTrainTicketAgentName(String trainTicketAgentName) 
	{
		this.trainTicketAgentName = trainTicketAgentName;
	}

	public String getTicketKind() 
	{
		return ticketKind;
	}

	public void setTicketKind(String ticketKind) 
	{
		this.ticketKind = ticketKind;
	}

	public Date getTrainTime() 
	{
		return trainTime;
	}

	public void setTrainTime(Date trainTime) 
	{
		this.trainTime = trainTime;
	}

	public String getTrainNum() 
	{
		return trainNum;
	}

	public void setTrainNum(String trainNum) 
	{
		this.trainNum = trainNum;
	}

	public Integer getBookCount() 
	{
		return bookCount;
	}

	public void setBookCount(Integer bookCount)
	{
		this.bookCount = bookCount;
	}

	public UserInfo getUserInfo() 
	{
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) 
	{
		this.userInfo = userInfo;
	}
}
