package com.xworkz.constants.dto;

import com.xworkz.constants.ProductType;
import com.xworkz.constants.SeatType;
import com.xworkz.constants.TicketType;

public class Runner {

	public static void main(String[] args) {
		
		 
        CustomerDTO customer = new CustomerDTO("Sohita", "sohitapatil217@gmail.com", ProductType.KITCHEN);
        customer.setProductType(ProductType.FOOTWEAR);
        customer.getProductType();
        
        

       
        TicketBookDTO ticket = new TicketBookDTO("Devara", "IMAX", TicketType.ONLINE, SeatType.RECLINER);
        ticket.setSeatType(SeatType.EXECUTIVE);
        ticket.setSeatType(SeatType.PREMIUM);
        ticket.setSeatType(SeatType.RECLINER);
        customer.getProductType();
        
        
        
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
		System.out.println("ProductType:+prodctType.getProductType");
		System.out.println("TicketType:+ticketType.getTicketType");
		System.out.println("SeatType:+seatType.getSeatType");
		

	}

}
