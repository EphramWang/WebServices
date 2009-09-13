package com.ics.tcg.service.javadescription.booktrainticketservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class TrainNumResponse extends DataType implements Serializable
{
	private static final long serialVersionUID = -6886108539228069169L;
    
	private ArrayList<TrainNumInfo> trainNumInfoList;

	public TrainNumResponse()
	{
		trainNumInfoList = new ArrayList<TrainNumInfo>();
	}
	
	public ArrayList<TrainNumInfo> getTrainNumInfoList()
	{
		return trainNumInfoList;
	}

	public void setTrainNumInfoList(ArrayList<TrainNumInfo> trainNumInfoList) 
	{
		this.trainNumInfoList = trainNumInfoList;
	}
}
