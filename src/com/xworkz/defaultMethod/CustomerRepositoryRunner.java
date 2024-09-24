package com.xworkz.defaultMethod;

public class CustomerRepositoryRunner {

	public static void main(String[] args) {
		
		CustomerRepositoryImpl customerRepositoryImpl=new CustomerRepositoryImpl();
		customerRepositoryImpl.save();
		
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl(customerRepositoryImpl );

	}

}
