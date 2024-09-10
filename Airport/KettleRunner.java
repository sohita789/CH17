package com.xworkz.Airport;

public class KettleRunner {

	public static void main(String[] args) {
		Kettle kettle=new Kettle("abc", "xyz", 250);
		System.out.println(kettle.toString());
		
		kettle.setBrand("abc");
		kettle.setModel("pqr");
		kettle.setCapacity(320);
		
		Kettle kettle1=new Kettle("def","ABC",560);
		System.out.println(kettle1.toString());
		boolean check=kettle1.equals(kettle1);
		System.out.println("kettle1 is same as kettle");

	}
}
