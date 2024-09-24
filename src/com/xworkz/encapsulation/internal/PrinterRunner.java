package com.xworkz.encapsulation.internal;

public class PrinterRunner{
	
	public static void main(String[]args, Printer brand) {
		
	
	Printer printer=new Printer(false,"dell");
	
    printer.getBrand();
    printer.SetBrand("lenovo");
	
	System.out.println("Brand:"+brand.getBrand());
	System.out.println("created the brand");
	}
}
	
	
	
		

		
		       

		       