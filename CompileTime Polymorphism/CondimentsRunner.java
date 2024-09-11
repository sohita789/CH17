package com.workz.polymorphism;

public class CondimentsRunner {

	public static void main(String[] args) {
	
		Condiments condiments=new Condiments();
		Condiments condiment1=new Condiments("laddu","shravani",80);
		Condiments condiment2=new Condiments("Barfi","akshay");
		
		condiments.sale();
		condiment1.sale();
		condiment1.sale("DryFruitLaddu");
		condiment2.sale();

	}

}
