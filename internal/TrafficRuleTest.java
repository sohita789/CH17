package com.xworkz.internal;

public class TrafficRuleTest implements TrafficSignals {
	
	public TrafficRuleTest() {
		super();
		System.out.println("created with no Args");
		
	}

	@Override
	public boolean followRules() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean safety() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noOfVehicles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean regulatesTrafficFlow() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean helmet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noOfpollutedvehicles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String license() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean vehicleEfficiency() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean zebracrossing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noOfSignals() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int noOftrafficpolice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String checkInsurance() {
		// TODO Auto-generated method stub
		return null;
	}

}
