package com.xworkz.abstraction;

public class Sweets implements Condiments{
	
	public Sweets() {
		System.out.println("created the constructor Sweets with no args");
	}

	@Override
	public void sale() {
	System.out.println("running sale in Sweets");
		
	}

	@Override
	public void distribute() {
    System.out.println("running distribute in Sweets");
		
	}

}
