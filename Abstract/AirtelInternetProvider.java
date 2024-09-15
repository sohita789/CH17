package com.xworkz.Abstract;

public class AirtelInternetProvider extends InternetProvider{

	public AirtelInternetProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created the AirtelInternetProvider with name,CEOname");
		
	}
	public void show() {
		System.out.println("running show in AirtelInternetprovider");
	}
      
}
