package com.xworkz.dataTransfer.dto;

import java.io.Serializable;
import java.util.Objects;

// DTO means Data transfer object
//* used to transfer data from one class to another class
//* transfer data from one layer to another layer
// for example: UI to server
// or server To Database
// The class name has to end with DTO as Suffix.

//6 Rules to write a DTO class
//1.It should be a Non-Final class
//2.This class must implements Serializable.
//3.It should have 1 no-args constructor.
//4.All the variables should be private.
//5.to access provide the getter and setters.
//6.we don't write the methods with logic(functions).


public class WeatherDTO implements Serializable {//class name implements the interface serializable
	
	private double minTemp;//the variables declared should be private(access Specifier)
	private double maxTemp;
	private int windSpeed;
	private int humidity;
	private String location;
	
	public WeatherDTO() {//its an no args constructor 
		System.out.println("created the no-args constructor");
		}
	
	public WeatherDTO(double minTemp, double maxTemp, int windSpeed, int humidity, String location) {//parameterized constructor
		super();//it calls the coonstructor of parent class
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.windSpeed = windSpeed;
		this.humidity = humidity;
		this.location = location;// this is keyword,it is used to give the current instance 
	}

	public double getMinTemp() {//get method
		return minTemp;
	}

	public void setMinTemp(double minTemp) {//set method 
		this.minTemp = minTemp;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	@Override
	public String toString() {//String representation :it gives the location or address of the variable
		return "WeatherDTO [minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", windSpeed=" + windSpeed + ", humidity="
				+ humidity + ", location=" + location + "]";
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {//it's an unique code generated by the JVM at time of object classes
		return Objects.hash(humidity, location, maxTemp, minTemp, windSpeed);
	}

	@Override
	public boolean equals(Object obj) {//it is used to compare the 2 objects for equality,and returns the value based upon whether it is true or false.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDTO other = (WeatherDTO) obj;
		return humidity == other.humidity && Objects.equals(location, other.location)
				&& Double.doubleToLongBits(maxTemp) == Double.doubleToLongBits(other.maxTemp)
				&& Double.doubleToLongBits(minTemp) == Double.doubleToLongBits(other.minTemp)
				&& windSpeed == other.windSpeed;
	}

	

}