package com.xworkz.Abstract;

public class BookingProvider extends Provider  {

	public BookingProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created the constructor with name and CEOname");
	}
	public void show() {
		System.out.println("running the show in Bookingprovider");
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}
	

}
