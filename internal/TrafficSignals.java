package com.xworkz.internal;

public interface TrafficSignals extends TrafficRules,StandardTrafficRules {

	boolean safety();
	int noOfVehicles();
	boolean regulatesTrafficFlow();
	boolean helmet();
	int noOfpollutedvehicles();
	String license();
	boolean vehicleEfficiency();
	boolean zebracrossing();
	int noOfSignals();
	int noOftrafficpolice();
	String checkInsurance();
	
	

}
