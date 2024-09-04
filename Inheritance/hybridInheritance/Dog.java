package com.xworkz.hybridInheritance;
// Class extending Animal (Single Inheritance) and implementing Domestic


public	class Dog extends Animal implements Domestic {
	    @Override
	    public void domesticBehavior() {
	        System.out.println("The dog is friendly and loyal.");
	    }
	}

	

