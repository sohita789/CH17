package com.xworkz.Airport;

import com.workz.Airport.Grinder.Saree;

public class CreditCardRunner {

	public static void main(String[] args) {
		
		CreditCard card=new CreditCard("AxisBank","sohita",50000);
		System.out.println(card.toString());
		
		CreditCard card1=new CreditCard("canara","Ashwini",90000);
		System.out.println(card1.toString());
		
		card.setcardNo("SBI");
		card.setcardHolder("renuka");
		card.setcreditcardLimit(10000);

		boolean check=card.equals(card1);
		System.out.println("card1 is same as card");

	}


	

	}


