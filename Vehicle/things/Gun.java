package com.xworkz.sanitizer.things;

public class Gun {
	
	    private String name;
	    private String countryMade;
	    private String type;
	    
	    public Gun(String name, String countryMade, String type) {
	        this.name = name;
	        this.countryMade = countryMade;
	        this.type = type;
	    }
	    
	    public void fire() {
	        System.out.println("running fire in Gun");
	    }
	    
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Country Made: " + countryMade);
	        System.out.println("Type: " + type);
	    }
	}


