package com.xworkz.datatypes.assign;

public class Devu {
public Waterbottle waterbottle;
	
	public void fold() {
		if(waterbottle!=null) {
			waterbottle.fill();
			System.out.println(waterbottle.quantity);
			waterbottle.empty();
			System.out.println(waterbottle.color);
			waterbottle.crush();
		}
		else {
			System.out.println("waterbottle is null");
		}
	}

}


