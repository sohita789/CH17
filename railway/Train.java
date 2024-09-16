package com.xworkz.railway;

public interface Train extends RailwayStation,RailwayStationRule{
	
	 boolean bookTicket();
	    boolean checkTrainSchedule();
	    boolean buyTicket();
	    boolean validateTicket();
	    boolean boardTrain();
	    boolean alightTrain();
	    boolean requestInformation();
	    boolean reportLostAndFound();
	    boolean useRestroom();
	    boolean accessWaitingArea();
	    boolean checkLuggage();
	    boolean getPlatformInformation();
	    boolean inquireAboutTrainDelays();
	    boolean requestAssistanceForDisabled();
	    boolean useRefreshmentFacilities();
	    boolean findTaxiOrOtherTransport();
	}

	



