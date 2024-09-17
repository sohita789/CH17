package com.xworkz.inherits;

public  class SimpleCalculator extends Calculator  {
	
	public SimpleCalculator() {
		System.out.println("created the noArg constructor");
	}
	
	
	    @Override
	    public int add(int a, int b) {
	        return a + b;
	    }

	    @Override
	    public double add(double a, double b) {
	        return a + b;
	    }
	}

	
