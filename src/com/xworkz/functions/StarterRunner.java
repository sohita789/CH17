package com.xworkz.functions;

import com.xworkz.functions.usage.Labour;

public class StarterRunner {

	public static void main(String[] args) {
		
    Starter starter=()->{//lambda expression 
    	System.out.println("running on method in LambaRunner");
    	
    };
    Labour labour=new Labour();//instantiation
    labour.startMotors(starter);//invoking the method
	}
	
}