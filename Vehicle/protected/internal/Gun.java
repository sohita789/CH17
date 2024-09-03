package com.xworkz.protector.internal;

public class Gun extends Weapon{
	
        @Override
	    protected void use() {
	        System.out.println("running  the use in Gun");
	    }

	    @Override
	    public void fire() {
	        System.out.println("running  the fire in Gun");
	    }

	    public void shoot() {
	    	
	    	System.out.println("running the shoot in Gun");
	    	
	        use();
	        fire();
	    }
	}



