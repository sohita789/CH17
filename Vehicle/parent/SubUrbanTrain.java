package com.xworkz.parent;

public class SubUrbanTrain extends Train{

	public SubUrbanTrain(int no, String source, String destination) {
		super(50509, "gulbarga", "bangalore");
		
		System.out.println("created the constructor with int, string,string ");
		
	}
	public void show() {
		System.out.println("running show in SubTrain");
	}
	

}
