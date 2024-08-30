package com.xworkz.sanitizer.things;

public class WashingMachine{
	
	
	    private String brand;
	    private String type;
	    private int capacity;

	    public WashingMachine(String brand, String type, int capacity) {
	        this.brand = brand; // Instance variable
	        this.type = type;   // Instance variable
	        this.capacity = capacity; // Instance variable
	    }

	    public void rinse() {
	        System.out.println("Rinsing the clothes...");
	    }

	    public void show() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Type: " + type);
	        System.out.println("Capacity: " + capacity);
	    }
}
