package com.xworkz.functions.usage;

import com.xworkz.functions.FoodApp;
import com.xworkz.functions.Starter;

public class Zomato {
	
public void order(FoodApp food) {
		
		if(food!=null) {//null check to avoid exception
			System.out.println("food is not null");
		food.order("idli", 40);
		}
		else {
			System.out.println("food is null");
		}
		System.out.println("exit food in Zomato");
		
				
		}}
	



