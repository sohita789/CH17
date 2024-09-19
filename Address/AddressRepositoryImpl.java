package com.xworkz.interfaces.Address;

public class AddressRepositoryImpl implements AddressRepository{
	public AddressRepositoryImpl() {
		
	}

	@Override
	public boolean save() {
		System.out.println("running save in AddressRepositoryImpl");
		return false;
	}

	@Override
	public int update() {
		System.out.println("running update in AddressRepositoryImpl");
		return 0;
	}

	@Override
	public void delete() {
	System.out.println("running delete in AddressRepositoryImpl");
		
	}

	@Override
	public String read() {
		System.out.println("running read in AddressRepositoryImpl");
		return null;
	} 
	
	
}
