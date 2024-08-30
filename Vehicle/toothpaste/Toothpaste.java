package com.xworkz.sohita.things;

public class Toothpaste {
	
	private String name;
	private boolean salt;
	public Toothpaste(String name, boolean salt) {
		super();
		this.name = name;
		this.salt = salt;
		System.out.println("created the 2 args const");
	}
	
	public Toothpaste(String name) {
		this.name=name;
		System.out.println("created the 1 arg const");
	}
	
	public void display() {
		
		System.out.println("running display in toothpaste");
		
		  System.out.println("Name: "+ name);
	        System.out.println("salt: "+ salt);
	        
	    }
	
		
	}
	


