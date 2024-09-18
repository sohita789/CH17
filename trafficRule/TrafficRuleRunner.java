package com.xworkz.trafficRule;
public class TrafficRuleRunner {

	public static void main(String[] args) {
TrafficPolice police=new TrafficPolice();
		
		TrafficRule rule=new PoliceStation();
		police.setTrafficRule(rule);//association
		police.inspection();//using interface method

	}


	}


