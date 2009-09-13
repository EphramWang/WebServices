package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;

import com.ics.tcg.service.javadescription.DataType;

public class UserInfo extends DataType implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3265967429398045262L;
	private String userName;
	private String userPhoneNum;
	private String userCredentialsNum;
	
	public UserInfo()
	{
		userName = new String();
		userPhoneNum = new String();
		userCredentialsNum = new String();
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getUserPhoneNum() 
	{
		return userPhoneNum;
	}
	
	public void setUserPhoneNum(String userPhoneNum) 
	{
		this.userPhoneNum = userPhoneNum;
	}
	
	public String getUserCredentialsNum() 
	{
		return userCredentialsNum;
	}
	
	public void setUserCredentialsNum(String userCredentialsNum)
	{
		this.userCredentialsNum = userCredentialsNum;
	}
}
