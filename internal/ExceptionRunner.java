package com.xworkz.exception.internal;

public class ExceptionRunner {

	public static void main(String[] args) throws Exception {
		MyService myservice = new MyService();
		System.out.println("running before save email");
		myservice.save("sohita@gmail.com");
		System.out.println("running after save email");

		System.out.println("running before accept price");
		myservice.acceptprice(50);
		System.out.println("running after accept price");
	}
}
