package com.xworkz.mall;

public class MallRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Visitors visitor1 = new Visitors("12345");
	        System.out.println("Visitor 1 ID Valid: " + visitor1.validId());

	        // Create an instance of Visitor with an invalid ID
	        Visitors visitor2 = new Visitors("123");
	        System.out.println("Visitor 2 ID Valid: " + visitor2.validId());
	    }
	
	}


