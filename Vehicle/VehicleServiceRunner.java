package com.xworkz.vehicle;

public class VehicleServiceRunner {
	
	
	    public static void main(String[] args) {
	       
	        VehicleService vehicleService = new VehicleServiceImpl();
	        VehicleRepositoryImpl repository=new VehicleRepositoryImpl();

	        
	        VehicleService vehicle1 = new VehicleServiceImpl();
	        

	        vehicleService.persist();
	        vehicleService.persist();

	        
	        System.out.println("Searching Vehicles:");
	        System.out.println(vehicleService.search(10));
	        System.out.println(vehicleService.search(0));

	      
	        
	        vehicleService.merge();
	        System.out.println("After Update:");
	        System.out.println(vehicleService.search(110));

	        
	        vehicleService.clear(220);
	        System.out.println("After Deletion:");
	        System.out.println("Vehicle 2: " + vehicleService.search(230));
	    }
	}



