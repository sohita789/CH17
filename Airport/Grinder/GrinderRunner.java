package com.workz.Airport.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder grinder=new Grinder("Butterfly", 340);
		System.out.println(grinder.toString());
		
		Grinder grinder1=new Grinder("prestige",34);
		System.out.println(grinder1.toString());
		grinder.setBrand("NutriPro");
		grinder.setCapacity(500);
		grinder.setColor("white");
		boolean check=grinder1.equals(grinder1);
		System.out.println("grinder1 is same as grinder");

	}
		

	}


