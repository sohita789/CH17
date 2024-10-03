package com.xworkz.constants;

public enum TicketType {
	
	ONLINE(350),OFFLINE(400);
	
	private final int cost;
	
	private TicketType(int cost) {
		this.cost = cost;
	}
	public int getCost() {
		return cost;
		
	}
 

	
	

}
