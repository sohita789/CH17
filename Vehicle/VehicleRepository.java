package com.xworkz.vehicle;

public interface VehicleRepository {
	
	
	    String save();
	    String update();
	    String delete(int vehicleId);
	    String read(int vehicleId);
	}



