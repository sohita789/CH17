package com.workz.polymorphism;
//polymorphism means an object having many forms
//In polymorphism we are having two types: Overloading and over-riding
//Overloading:1.Method overloading: The 2 methods having the same name but there will be change 
//in parameters(noOf parameters or datatype);
//* overloading is known as the Compile time polymorphism.  
//2.constructor overloading: The 2 or more constructors having the same name but change in
//  parameters (noOf parameters or datatype);


//


public class Condiments {
	
	String productName;
	String ownerName;
	double productCost;
	
	public Condiments() {
		super();
	}
	
	public Condiments(String productName, String ownerName, double productCost) {
		super();
		this.productName = productName;
		this.ownerName = ownerName;
		this.productCost = productCost;
	}
	public Condiments(String productName, String ownerName) {
		super();
		this.productName = productName;
		this.ownerName = ownerName;
	}

	public void sale() {
		System.out.println("productName:"+productName);
		System.out.println("ownerName:"+ownerName);
		System.out.println("productCost:"+productCost);
	}	
	public void sale(String chipsName) {
		System.out.println("ChipsName:"+chipsName);
		
	}
	}
	


