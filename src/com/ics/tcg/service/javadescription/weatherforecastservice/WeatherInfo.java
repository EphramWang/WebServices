package com.ics.tcg.service.javadescription.weatherforecastservice;

import java.io.Serializable;
import java.util.Date;

public class WeatherInfo implements Serializable
{
	private static final long serialVersionUID = -7775424171316670044L;
    
	private Date   date;
	private Integer lowestTemperature;
	private Integer maximumTemperature;
	private String windPower;
	private String windDirection;
	private String weatherState;

	public WeatherInfo()
	{
		date = new Date();
		windPower = new String();
		windDirection = new String();
		weatherState = new String();
	}
	
	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date) 
	{
		this.date = date;
	}
	
	public Integer getLowestTemperature()
	{
		return lowestTemperature;
	}
	
	public void setLowestTemperature(Integer lowestTemperature) 
	{
		this.lowestTemperature = lowestTemperature;
	}
	
	public Integer getMaximumTemperature() 
	{
		return maximumTemperature;
	}
	
	public void setMaximumTemperature(Integer maximumTemperature) 
	{
		this.maximumTemperature = maximumTemperature;
	}
	
	public String getWindPower()
	{
		return windPower;
	}
	
	public void setWindPower(String windPower) 
	{
		this.windPower = windPower;
	}
	
	public String getWindDirection()
	{
		return windDirection;
	}
	
	public void setWindDirection(String windDirection)
	{
		this.windDirection = windDirection;
	}

	public String getWeatherState() 
	{
		return weatherState;
	}

	public void setWeatherState(String weatherState) 
	{
		this.weatherState = weatherState;
	}
}
