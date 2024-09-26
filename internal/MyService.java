package com.xworkz.exception.internal;

public class MyService {

	public void save(String email) throws Exception {
		if (email == null || email.equals("@") || email.equals(".")) {
			System.out.println("invalid data,will stop the execution");
			throw new Exception();
		} else {
			System.out.println("valid data will coninue execution");
		}
	}

	public void acceptprice(double price) {
		if (price > 0 && price < 100) {
			System.out.println("valid data will continue execution" + price);
		} else {
			System.out.println("invalid datawill continue execution");
			throw new InvalidAmountException();
		}
	}
}
