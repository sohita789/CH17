package com.xworkz.Vehicle;

public class City {
	private String[]names=new String[7];
	private int area=0;

	public void run(String name) {
		System.out.println("running the run in city");
		this.names[this.area]=name;
		this.area++;
	}
	public void displayNames() {
		System.out.println("running the displayNames in run");
		
		for(String name:this.names) {
			System.out.println("Name:"+name);
		}
			
		}
}
