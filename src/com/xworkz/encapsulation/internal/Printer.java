package com.xworkz.encapsulation.internal;

// * Hiding the variables and giving the access to read and write Methods.
//It is specific to the variables.

public class Printer {
	private boolean print;
	private String brand="Hp";
	
	public Printer(boolean print, String brand) {
		super();
		this.print = print;
		this.brand = brand;
	}

	public boolean isPrint() {
		return this.print;
		}
	
	void SetPrint(boolean Print) {
		System.out.println("SetPrint with parameter boolean print  method in Printer");
		this.print=print;
		
	}
	public  String getBrand() {
		return this.brand;
	}
		
	 public void SetBrand(String brand) {
		 System.out.println("SetBrand with parameter String brand method in Printer");
    	this.brand=brand;
    }
}
