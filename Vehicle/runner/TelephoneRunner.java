package com.xworkz.sanitizer.runner;

import com.xworkz.sanitizer.things.Airport;
import com.xworkz.sanitizer.things.Hospital;
import com.xworkz.sanitizer.things.Institute;
import com.xworkz.sanitizer.things.Railway;
import com.xworkz.sanitizer.things.Telephone;

public class TelephoneRunner {

	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.call();
		
		Railway railway=new Railway();
		Telephone telephone=new Telephone("samsung","mahesh","bidar");
		
		railway.run(telephone);
		
		Telephone telephone1=new Telephone("nokia","suresh","hyderabad");
		
		Institute institute=new Institute(telephone1);
		institute.show();
		
		Airport airport=new Airport();
		Telephone ref=airport.telephone();
		
		if(ref!=null) {
			ref.call();
			ref.receive();
		}
		else {
			System.out.println("telephone is null");
			
		}
	}
	
		
		
		
		

	}


