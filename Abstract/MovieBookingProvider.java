package com.xworkz.Abstract;

public class MovieBookingProvider  extends BookingProvider{

	public MovieBookingProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created the MovieBookingProvider with name,CEOname");
	}
	public void book() {
		System.out.println("name:"+name);
		System.out.println("CEOName:"+CEOName);
		System.out.println("running book in MovieBookingProvider");
		
	}
	public void cancel() {
		System.out.println("name:"+name);
		System.out.println("CEOName:"+CEOName);
		System.out.println("running cancel in MovieBookingProvider");
	}

}
