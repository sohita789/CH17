package com.xworkz.hybridInheritance;


	// Hybrid class extending Animal (Single Inheritance) and implementing both Domestic and Wild

public	class HybridAnimal extends Animal implements Domestic, Wild {
		
	    @Override
	    public void domesticBehavior() {
	        System.out.println("The hybrid animal shows domestic behavior.");
	    }
	    
	    @Override
	    public void wildBehavior() {
	        System.out.println("The hybrid animal exhibits wild behavior.");
	    }
	}

	
	