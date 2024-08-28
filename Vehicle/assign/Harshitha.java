package com.xworkz.datatypes.assign;

import com.xworkz.datatypes.things.Hat;

public class Harshitha {

public Shoe shoe;
	
	public void fold() {
		if(shoe!=null) {
			shoe.safeguard();
			System.out.println(shoe.brand);
			shoe.enhancewalk();
			System.out.println(shoe.cost);
		}
		else {
			System.out.println("shoe is null");
		}
	}

}


