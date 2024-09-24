package com.xworkz.defaultMethod;

public interface CustomerRepository {
	void save();
	
	default void delete() {
		System.out.println("run in CustomerRepository");
	}

}
