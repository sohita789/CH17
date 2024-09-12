package com.xworkz.LocalDateTime;

import java.time.LocalDateTime;

public class Railway {
	
	public static void main(String[]args) {
		
		LocalDateTime pastDateTime=LocalDateTime.now().minusDays(10);
		System.out.println("PastDateTime:"+pastDateTime);
	}

}
