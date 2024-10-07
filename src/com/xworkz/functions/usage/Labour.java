package com.xworkz.functions.usage;

import com.xworkz.functions.FoodApp;
import com.xworkz.functions.Starter;

public class Labour {
	public void startMotors(Starter starter) {
		
		if(starter!=null) {//null check to avoid exception
			System.out.println("starter is not null");
		starter.on();
		}
		else {
			System.out.println("starter is null");
		}
		System.out.println("exit startMotor in labour");
		
				
		}
	
public void orderFood(FoodApp foodApp) {
	if(foodApp!=null) {
		System.out.println("");
		foodApp.order("idli", 1);
		
	}
	
}
	
}


