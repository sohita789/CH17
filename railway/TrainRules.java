package com.xworkz.railway;

import com.xworkz.railway.Train;

public class TrainRules implements Train{
	
	public TrainRules() {
		super();
		System.out.println("created the TrainRules with no Args constructor");
	}

	@Override
	public boolean Reservation() {
		System.out.println("running Reservation in TrainRules");
		return false;
	}

	@Override
	public boolean bookTicket() {
		System.out.println("running bookTicket in TrainRules");
		
		return false;
	}

	@Override
	public boolean checkTrainSchedule() {
		System.out.println("Running checktrainTickets in TrainRules");

		return false;
	}

	@Override
	public boolean buyTicket() {
	System.out.println("Running buyTickets in Trainrules");
		return false;
	}

	@Override
	public boolean validateTicket() {
		System.out.println("running validateTrain in Trainrules ");
		return false;
	}

	@Override
	public boolean boardTrain() {
		System.out.println("running boardTrain in train rules");
		return false;
	}

	@Override
	public boolean alightTrain() {
	System.out.println("running alightTrain in TrainRules");
		return false;
	}

	@Override
	public boolean requestInformation() {
		System.out.println("running requestInformation in TrainRules");
		return false;
	}

	@Override
	public boolean reportLostAndFound() {
		System.out.println("running reportLostAndFound in TrainRules");
		
		return false;
	}

	@Override
	public boolean useRestroom() {
		System.out.println("running useRestRoom in Trainrules");
		return false;
	}

	@Override
	public boolean accessWaitingArea() {
		System.out.println("running accessWaitingArea");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkLuggage() {
	System.out.println("running checkluggage");
		return false;
	}

	@Override
	public boolean getPlatformInformation() {
		System.out.println("running getPlatformInformation");
		return false;
	}

	@Override
	public boolean inquireAboutTrainDelays() {
	System.out.println("running inquireAboutTrainDelays");
		return false;
	}

	@Override
	public boolean requestAssistanceForDisabled() {
		System.out.println("running requestAssistanceForDisabled");
		return false;
	}

	@Override
	public boolean useRefreshmentFacilities() {
	System.out.println("running useRefreshmentFacilities in TrainRukes");
		return false;
	}

	@Override
	public boolean findTaxiOrOtherTransport() {
		System.out.println("findTaiOrOtherTransport");
		return false;
	}

}
