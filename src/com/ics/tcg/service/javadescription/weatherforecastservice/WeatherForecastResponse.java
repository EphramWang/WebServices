package com.ics.tcg.service.javadescription.weatherforecastservice;

import java.io.Serializable;
import java.util.ArrayList;

import com.ics.tcg.service.javadescription.DataType;

public class WeatherForecastResponse extends DataType implements Serializable
{
	private static final long serialVersionUID = -3699442329718577165L;
    
	private ArrayList<WeatherInfo> weatherInfoList;

	public WeatherForecastResponse()
	{
		weatherInfoList = new ArrayList<WeatherInfo>();
	}
	
	public ArrayList<WeatherInfo> getWeatherInfoList() 
	{
		return weatherInfoList;
	}

	public void setWeatherInfoList(ArrayList<WeatherInfo> weatherInfoList) 
	{
		for(int i=0;i<weatherInfoList.size();i++)
		{
			this.weatherInfoList.add(weatherInfoList.get(i));
		}
	}
//	public void setWeatherInfoList(WeatherInfo[] weatherInfoList) 
//	{
//		//this.weatherInfoList = weatherInfoList;
//		for(int i=0;i<weatherInfoList.length;i++)
//		{
//			this.weatherInfoList[i].setDate(weatherInfoList[i].getDate());
//			this.weatherInfoList[i].setLowestTemperature(weatherInfoList[i].getLowestTemperature());
//			this.weatherInfoList[i].setMaximumTemperature(weatherInfoList[i].getMaximumTemperature());
//			this.weatherInfoList[i].setWeatherState(weatherInfoList[i].getWeatherState());
//			this.weatherInfoList[i].setWindDirection(weatherInfoList[i].getWindDirection());
//			this.weatherInfoList[i].setWindPower(weatherInfoList[i].getWindPower());
//		}
//	}
//	public void setWeatherInfoList(WeatherInfo[] weatherInfoList) 
//	{
//		this.weatherInfoList = weatherInfoList;
//	}
}
