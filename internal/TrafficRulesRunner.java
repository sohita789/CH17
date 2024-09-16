package com.xworkz.internal;

public class TrafficRulesRunner {

	public static void main(String[] args) {
		
		TrafficRuleTest test=new TrafficRuleTest();
		TrafficSignals signal;
		
		test.safety();
		test.noOfVehicles();
		test. regulatesTrafficFlow();
		test. helmet();
		test.noOfpollutedvehicles();
		test. license();
		test. vehicleEfficiency();
		test. zebracrossing();
	    test. noOfSignals();
		test. noOftrafficpolice();
		test. checkInsurance();
		
		System.out.println(test);
		
		

	}

}
