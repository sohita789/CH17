package com.xworkz.constants;

public enum SeatType {
	
	RECLINER(4),PREMIUM(3),EXECUTIVE(2);
	
	
	private final int seatNO;
	
	private SeatType(int seatNO) {
		this.seatNO = seatNO;
	}
	
	public int getseatNo() {
		return seatNO;
		
	}


}
