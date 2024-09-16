package com.xworkz.railway;

public class RailwayStationRunner {

	public static void main(String[] args) {

		TrainRules rules=new TrainRules();
		 rules. checkTrainSchedule();
		  rules.buyTicket();
		  rules. validateTicket();
		  rules.boardTrain();
		    rules. alightTrain();
		    rules. requestInformation();
		   rules. reportLostAndFound();
		    rules. useRestroom();
		    rules. accessWaitingArea();
		    rules. checkLuggage();
		    rules. getPlatformInformation();
		    rules. inquireAboutTrainDelays();
		    rules. requestAssistanceForDisabled();
		    rules. useRefreshmentFacilities();
		    rules. findTaxiOrOtherTransport();
		    
		    System.out.println(rules);
		}
		
		Train rule=new TrainRules();
}