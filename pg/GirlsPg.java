package com.xworkz.pg;

public class GirlsPg implements PgRule{

	@Override
	public double costPerMonth() {
		System.out.println("running costPerMonth in GirlsPg");
		return 0;
	}

	@Override
	public boolean wifi() {
		System.out.println("running wifi in GirlsPg");
		return false;
	}
	

}
