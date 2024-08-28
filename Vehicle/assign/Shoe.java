package com.xworkz.datatypes.assign;

public class Shoe {
//1. Shoe : brand,cost, safeGuard(),enhanceWalk() ;
	//Divya: local shoe ,Omkar: Param ,Harshitha: instance variable
public String brand="Bata";
public double cost=900;
	
	public Shoe() {
		System.out.println("created shoe with no args constructor");
		
	}
	public void safeguard() {
		System.out.println("running safeguard in shoe");
		}
	public void enhancewalk() {
		System.out.println("running enhancewalk in shoe");
		}
	

}


