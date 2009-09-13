package com.ics.tcg.service.javadescription.bookbusticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class BusNumResponse extends DataType implements Serializable
{
	private static final long serialVersionUID = -3903691736960033473L;
    
	private ArrayList<BusNumInfo> busNumInfoList;

	public BusNumResponse()
	{
		busNumInfoList = new ArrayList<BusNumInfo>();
	}
	
	public ArrayList<BusNumInfo> getBusNumInfoList() 
	{
		return busNumInfoList;
	}

	public void setBusNumInfoList(ArrayList<BusNumInfo> busNumInfoList) 
	{
		this.busNumInfoList = busNumInfoList;
	}
}
