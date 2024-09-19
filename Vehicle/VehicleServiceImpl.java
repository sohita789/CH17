package com.xworkz.vehicle;

public class VehicleServiceImpl implements VehicleService {
	VehicleRepository repository;

	public VehicleServiceImpl() {
		System.out.println("created the VehiceServiceimpl");
	}
		
	@Override
	public String persist() {
		System.out.println("running persist in VehicleserviceImpl");
		if(repository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			String save=repository.save();
			if(save != null) {
				return "success" ;
			}
			else {
				return "failure";
			}
		}
		return "issue";
	}

	@Override
	public String merge() {
		System.out.println("running merge in VehicleserviceImpl");
		if(repository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			String save=repository.save();
			if(save != null) {
				return "success" ;
			}
			else {
				return "failure";
			}
		}
		return "issue";
	}

	
		
	

	@Override
	public String clear(int vehicleId) {
		System.out.println("running clear in Vehicleserviceimpl");
		if(repository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			String save=repository.save();
			if(save != null) {
				return "success" ;
			}
			else {
				return "failure";
			}
		}
		return "issue";
	}

	@Override
	public VehicleService search(int vehicleId) {
		System.out.println("running search in vehicleServiceImpl");
		if(repository!=null)
		{
			System.out.println("running update in MachineServieImpl");
			
			String save=repository.save();
			if(save != null) {
				return null;
			}
			else {
				return null;
			}
		}
		return null;
	}


	}
	
	    


