package com.xworkz.hybridInheritance;

public class Animal {
	
	 public void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Interface 1
	interface Domestic {
	  public  void domesticBehavior();
	}

	// Interface 2
	interface Wild {
	  public  void wildBehavior();
	}

	