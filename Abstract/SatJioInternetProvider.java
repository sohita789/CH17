package com.xworkz.Abstract;

public class SatJioInternetProvider extends JioInternetProvider  {
	
	double cost;
	int launchDate;
	
	
	public SatJioInternetProvider(String name, String CEOName, double cost, int launchDate) {
		super(name, CEOName);
		this.cost = cost;
		this.launchDate = launchDate;
		
		
		System.out.println("Created the SatJioInternetProvider with name,CEOName ,cost and launchDate");
	}
	}
