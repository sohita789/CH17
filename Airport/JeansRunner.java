package com.xworkz.Airport;

public class JeansRunner {

	public static void main(String[] args) {
	
		Jeans jeans=new Jeans("max", 1, 900);
		Jeans jeans1=new Jeans("zudio",2,999);
		
		System.out.println(jeans.toString());
        System.out.println(jeans1.toString());

        System.out.println("jeans equals jeans1: " + jeans.equals(jeans1));
    }
}


