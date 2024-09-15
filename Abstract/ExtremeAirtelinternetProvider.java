package com.xworkz.Abstract;

public class ExtremeAirtelinternetProvider extends AirtelInternetProvider{

	public ExtremeAirtelinternetProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created  ExtremeAirtelInternetProvider with name and CEOname");
	}

	public void show() {
		System.out.println("running show in extreme");
	}
}
