package com.xworkz.protector.internal;

public class Board {
	
	//2 instance variables or properties
        private String color;
	    private int height;

	    protected Board() {
	        //Board with No-arg constructor
	    	System.out.println("no argument constructor");
	    }

	    public Board(String color, int height) {
	    	//Board with 2 arguments constructor
	    	super();
	        this.color= color;
	        this.height = height;
	    }

	   


}
