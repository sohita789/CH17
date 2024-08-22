package com.xworkz.Vehicle;

public class BikeRunner {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.showNames();
		bike.save("Activa");
		bike.save("Jupiter");
		bike.save("Tvs");
		bike.save("Deo");
		bike.save("Honda");
		bike.save("pulser");
		bike.save("RoyalEnfield");
		
		bike.showNames();
	}

}
