package com.ics.tcg.service.javadescription.weatherforecastservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import com.ics.tcg.service.javadescription.weatherforecastservice.WeatherForecastRequest;
import com.ics.tcg.service.javadescription.weatherforecastservice.WeatherForecastResponse;
import com.ics.tcg.service.javadescription.weatherforecastservice.WeatherInfo;
/**
 * 
 * @author ephram1987
 *
 */

public class WeatherForecastService9 
{
	
	public WeatherForecastResponse getWeatherForecast(WeatherForecastRequest request)
	{
		/**read configure file*/
		Properties config = new Properties();
		try
		{
			config.load(new java.io.FileInputStream("c:/conf/WeatherForecast.prop"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/**error*/
		double errorProbability = Double.parseDouble(config.getProperty("errorProbability")); 
		double random1 = Math.random();
		if(random1<errorProbability)
			return null;
		
		Date startDate = new Date();
		Date endDate = new Date();
		startDate = request.getStartDate();
		endDate = request.getEndDate();
		long startTime = startDate.getTime();
		long endTime = endDate.getTime();
		int numOfDays = (int)(endTime-startTime)/(3600000*24);
		
		ArrayList<WeatherInfo> WeatherInfoList = new ArrayList<WeatherInfo>();
		for(int i=0;i<numOfDays;i++)
		{
			Date date = new Date();
			date.setTime(startTime+i*24*3600000);
			WeatherInfo info = new WeatherInfo();
			/**set date*/
			info.setDate(date);
			/**set temperature*/
			info.setLowestTemperature(Integer.parseInt(config.getProperty("lowestTemperature")));
			info.setMaximumTemperature(Integer.parseInt(config.getProperty("maximumTemperature")));
			/**set wind direction*/
			double windDirectionNorth = Double.parseDouble(config.getProperty("windDirectionNorth"));
			double windDirectionWest = Double.parseDouble(config.getProperty("windDirectionWest"));
			double windDirectionEast = Double.parseDouble(config.getProperty("windDirectionEast"));
			double windDirectionSouth = Double.parseDouble(config.getProperty("windDirectionSouth"));
			double random2 = Math.random();
			if(random2<windDirectionNorth)
				info.setWindDirection("North");
			else if(random2<windDirectionNorth+windDirectionWest)
				info.setWindDirection("West");
			else if(random2<windDirectionNorth+windDirectionWest+windDirectionEast)
				info.setWindDirection("East");
			else 
				info.setWindDirection("South");			
			/**set wind power*/	
			double windPowerStrong = Double.parseDouble(config.getProperty("windPowerStrong"));
			double windPowerWeak = Double.parseDouble(config.getProperty("windPowerWeak"));
			double random3 = Math.random();
			if(random3<windPowerStrong)
				info.setWindPower("Strong");
			else
				info.setWindPower("Weak");
			/**set weather state*/
			double rainyProbability = Double.parseDouble(config.getProperty("weatherStateRainy"));
			double sunnyProbability = Double.parseDouble(config.getProperty("weatherStateSunny"));
			double cloudyProbability = Double.parseDouble(config.getProperty("weatherStateCloudy"));
			double random4 = Math.random();
			if(random4<rainyProbability)
				info.setWeatherState("rainy");
			else if(random4<rainyProbability+sunnyProbability)
				info.setWeatherState("sunny");
			else
				info.setWeatherState("cloudy");
			/**add to weather list*/
			WeatherInfoList.add(info);
		}
		
		
		WeatherForecastResponse response = new WeatherForecastResponse();
		response.setWeatherInfoList(WeatherInfoList);
		
		
		
		return response;
	}
}