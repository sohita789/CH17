package com.xworkz.interfaces.Address;

import com.xworkz.vehicle.VehicleService;
import com.xworkz.vehicle.VehicleServiceImpl;

public class AddressRunner {

	public static void main(String[] args) {
	
		
		AddressService service=new AddressServiceImpl(null);
		VehicleService vehicleservice=new VehicleServiceImpl();
		vehicleservice.clear(10);
		
		vehicleservice.merge();
		
		vehicleservice.persist();
		
		vehicleservice.search(10);
		service.push();
		service.refresh();
		service.load();
		service.remove();
		

	}
	

}
