package com.xworkz.hybridInheritance;


public class Lion extends Animal implements Wild {
	    @Override
	    public void wildBehavior() {
	        System.out.println("The lion roars in the wild.");
	    }
	}
