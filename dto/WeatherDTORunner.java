package com.xworkz.dataTransfer.dto;

public class WeatherDTORunner {

	public static void main(String[] args) {
		
		WeatherDTO weather=new WeatherDTO();
		weather.setMaxTemp(20);
		weather.setHumidity(30);
		weather.getHumidity();
		weather.getLocation();
		weather.setWindSpeed(30);
		weather.toString();
		weather.hashCode();
		weather.setWindSpeed(50);
		weather.setMinTemp(34);
		weather.getMinTemp();
		weather.getWindSpeed();

	}

}
