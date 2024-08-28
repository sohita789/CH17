package com.xworkz.datatypes.assign;

import com.xworkz.datatypes.things.Hat;

public class Shwetha {
public Waterbottle waterbottle;
	
	public void fold(Waterbottle waterbottle) {
		if(waterbottle!=null) {
			waterbottle.fill();
			System.out.println(waterbottle.color);
			System.out.println(waterbottle.quantity);
		}
		else {
			System.out.println("waterbottle is null");
		}
	}

}



