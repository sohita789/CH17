package com.xworkz.LocalDate;

import java.time.LocalDate;

public class Hospital {

	public static void main(String[]args) {
		LocalDate futureDate=LocalDate.now().plusMonths(4);
		
		System.out.println("futureDate:"+futureDate);
	}
}
