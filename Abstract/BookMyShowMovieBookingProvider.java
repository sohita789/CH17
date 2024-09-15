package com.xworkz.Abstract;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider{
	
	int totalHalls;
	
	public BookMyShowMovieBookingProvider(String name, String CEOName) {
		super(name, CEOName);
		
	}

	public BookMyShowMovieBookingProvider(String name, String CEOName, int totalHalls) {
		super(name, CEOName);
		this.totalHalls = totalHalls;
	System.out.println("created BookMYShowMovieBookingProvider using name,CEOName");
	}

	public void book() {
		System.out.println("running book in BookMyShowMovieBookingProvider");
		
		
	}
	public void cancel() {
		System.out.println("running cancel in BookMyShowMovieBookingProvider");
	}
}
