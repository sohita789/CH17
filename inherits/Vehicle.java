package com.xworkz.inherits;

public abstract class Vehicle {
	// Abstract class with constants

	     
	    public static String VEHICLE_TYPE = "Motorized";

	    // Abstract method (must be implemented by subclasses)
	    public abstract void start();

	    // Regular method
	    public void displayInfo() {
	        
	        System.out.println("Vehicle Type: " + VEHICLE_TYPE);
	    }
	}

	


