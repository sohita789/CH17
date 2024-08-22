package com.xworkz.Vehicle;

public class Dam {
	private String[]names=new String[7];
	private int position=0;

	public void save(String name) {
		System.out.println("running the save in Dam");
		this.names[this.position]=name;
		this.position++;
	}
	public void displayNames() {
		System.out.println("running the displayNames in save");
		
		for(String name:this.names) {
			System.out.println("Name:"+name);
		}
			
		}
}
