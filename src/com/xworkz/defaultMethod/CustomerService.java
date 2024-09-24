package com.xworkz.defaultMethod;

public interface CustomerService {
	
	void run();
	
	default void stop() {
		System.out.println("stop in customerService");
	}
		
	}
	


