package com.xworkz.vehicle;

public class VehicleRepositoryImpl implements VehicleRepository{
	VehicleRepository repository;
	

	public VehicleRepositoryImpl() {
		this.repository=repository;
		System.out.println("created the VehicleRepositoryImpl with noArgs");
	}
	
	@Override
	public String save() {
		System.out.println("running save in vehicleRepositoryImpl");
		return null;
		
	}

	@Override
	public String update() {
		
		System.out.println("running update in vehicleRepositoryImpl");
		return null;
		
	}

	@Override
	public String delete(int vehicleId) {
		System.out.println("running delete in vehicleRepositoryimpl");
		return null;
	}

	@Override
	public String read(int vehicleId) {
		System.out.println("running read in vehiclerepositoryimpl");
		return null;
	}

}
