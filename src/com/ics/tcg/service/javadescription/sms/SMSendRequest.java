package com.ics.tcg.service.javadescription.sms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.ics.tcg.service.javadescription.DataType;

public class SMSendRequest extends DataType implements Serializable
{
	private static final long serialVersionUID = 3527507316990708850L;
	
	private String userId;//�û��˺�
	private String userPassword;//�û�����
	private String smContent;//��������	
	private Integer senderTelNum;//���ŷ�������ϵ��ʽ
	private ArrayList<Integer> smReceiverTelNum;//���Ž����ߵ��ֻ����
	private Date   smSendTime;//���ŷ���ʱ��

	public SMSendRequest()
	{
		userId = new String();
		userPassword = new String();
		smContent = new String();
		smSendTime = new Date();
		smReceiverTelNum = new ArrayList<Integer>();
	}
	
	public String getUserId() 
	{
		return userId;
	}

	public void setUserId(String userId) 
	{
		this.userId = userId;
	}

	public String getUserPassword() 
	{
		return userPassword;
	}

	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}

	public Integer getSenderTelNum() {
		return senderTelNum;
	}

	public void setSenderTelNum(Integer senderTelNum) {
		this.senderTelNum = senderTelNum;
	}

	public Date getSmSendTime() 
	{
		return smSendTime;
	}

	public void setSmSendTime(Date smSendTime)
	{
		this.smSendTime = smSendTime;
	}

	public String getSmContent()
	{
		return smContent;
	}

	public void setSmContent(String smContent) 
	{
		this.smContent = smContent;
	}

	public ArrayList<Integer> getSmReceiverTelNum()
	{
		return smReceiverTelNum;
	}

	public void setSmReceiverTelNum(ArrayList<Integer> smReceiverTelNum) 
	{
		this.smReceiverTelNum = smReceiverTelNum;
	}
}
