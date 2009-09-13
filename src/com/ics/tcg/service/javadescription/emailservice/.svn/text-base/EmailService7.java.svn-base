package com.ics.tcg.service.javadescription.emailservice;

import java.io.Serializable;
import java.util.Properties;

public class EmailService7 implements Serializable
{
	private static final long serialVersionUID = 4961187440341919106L;
    
	public Boolean emailSend(EmailSendRequest emailSendRequest)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/Email.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**return*/
		if(Math.random()<Double.parseDouble(config.getProperty("sendSuccessRatio1")))
		{
			return true;
		}
		return false;
	}
}
