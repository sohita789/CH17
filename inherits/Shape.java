package com.xworkz.inherits;

public abstract class Shape {

	   
	    public static final double PI = 3.14159;
	    public static final int DEFAULT_COLOR = 0xFFFFFF; // white

	    
	    public abstract void calculateArea();

	    
	    public void displayInfo() {
	        System.out.println("PI: " + PI);
	        System.out.println("Default Color: " + DEFAULT_COLOR);
	    }
	}

	
