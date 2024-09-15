package com.xworkz.Abstract;

public class DellProvider extends Provider {

	public DellProvider(String name, String CEOName) {
		super(name, CEOName);
		System.out.println("created the dellprovider with name and CEOName");
	}
	
	public void show() {
		System.out.println("running the show in DellProvider");
		
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

}
