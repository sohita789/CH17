package com.xworkz.vehicle;

public interface VehicleService {
	
	    String persist();
	    String merge();
	    String clear(int vehicleId);
	    VehicleService search(int vehicleId);
	}


