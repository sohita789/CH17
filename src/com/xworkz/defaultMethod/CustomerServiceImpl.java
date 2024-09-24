package com.xworkz.defaultMethod;

public class CustomerServiceImpl implements CustomerService{
	
	public CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
    @Override
	public void run() {
    	if(customerRepository!=null) {
    		customerRepository.save();
    	
		System.out.println("run in CustomerServiceImpl");
		
	}
	

}}
