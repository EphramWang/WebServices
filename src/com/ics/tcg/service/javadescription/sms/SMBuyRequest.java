package com.ics.tcg.service.javadescription.sms;

import java.io.Serializable;

import com.ics.tcg.service.javadescription.DataType;

public class SMBuyRequest extends DataType implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 563799158884637129L;
	
	private String buyerId;
	private String buyerPassword;
	private Integer buyerTelNum;
	private Integer smCount;
	
	public SMBuyRequest()
	{
		buyerId = new String();
		buyerPassword = new String();
	}
	
	public Integer getBuyerTelNum()
	{
		return buyerTelNum;
	}
	
	public void setBuyerTelNum(Integer buyerTelNum)
	{
		this.buyerTelNum = buyerTelNum;
	}
	
	public String getBuyerId() 
	{
		return buyerId;
	}
	
	public void setBuyerId(String buyerId) 
	{
		this.buyerId = buyerId;
	}
	
	public String getBuyerPassword()
	{
		return buyerPassword;
	}
	
	public void setBuyerPassword(String buyerPassword)
	{
		this.buyerPassword = buyerPassword;
	}
	
	public Integer getSmCount() 
	{
		return smCount;
	}
	
	public void setSmCount(Integer smCount)
	{
		this.smCount = smCount;
	}
}
