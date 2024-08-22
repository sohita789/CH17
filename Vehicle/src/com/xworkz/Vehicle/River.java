package com.xworkz.Vehicle;

public class River {
	private String[]names=new String[7];
	private int waterflow=0;

	public void flow(String name) {
		System.out.println("running the flow in river");
		this.names[this.waterflow]=name;
		this.waterflow++;
	}
	public void displayNames() {
		System.out.println("running the displayNames in flow");
		
		for(String name:this.names) {
			System.out.println("Name:"+name);
		}
			
		}
}

