package com.xworkz.sanitizer.things;

public class Railway {
	
	public void run(Telephone telephone) {
		
		System.out.println("running run in railway");
		if(telephone!=null) {
		telephone.call();
		telephone.receive();
		
		}
		else {
			System.out.println("telephone is null")	;	}
		
	}
}


