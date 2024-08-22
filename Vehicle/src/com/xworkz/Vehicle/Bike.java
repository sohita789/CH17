package com.xworkz.Vehicle;

public class Bike {
private String[]names=new String[7];
private int index=0;

public void save(String name) {
	System.out.println("running the save in Bike");
	this.names[this.index]=name;
	this.index++;
}
public void showNames() {
	System.out.println("running the showNames in save");
	
	for(String name:this.names) {
		System.out.println("Name:"+name);
	}
		
	}
}

