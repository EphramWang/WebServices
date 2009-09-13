package com.ics.tcg.service.javadescription.sms;

import java.io.Serializable;
import java.util.Properties;


public class SMS1 implements Serializable
{
	private static final long serialVersionUID = -666983915659228938L;
    
	public Boolean smBuy(SMBuyRequest smBuyRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/SMS.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**return*/
		if(Math.random()<Double.parseDouble(config.getProperty("buySuccessRatio")))
		{
			return true;
		}
		return false;
	}
	
	public Boolean smSend(SMSendRequest smSendRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/SMS.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**return*/
		if(Math.random()<Double.parseDouble(config.getProperty("sendSuccessRatio")))
		{
			return true;
		}
		return false;
	}
	
	//public Boolean smBuy(Integer buyerTelNum, String buyerId, String buyerPassword, Integer smCount);
}
