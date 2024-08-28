package com.xworkz.datatypes.assign;

import com.xworkz.datatypes.things.Hat;

public class Renuka {

public Biscuit biscuit;
	
	public void fold(Biscuit biscuit2) {
		if(biscuit!=null) {
			biscuit.eat();
			System.out.println(biscuit.brand);
			
			biscuit.taste();
			System.out.println(biscuit.cost);
				}
		else {
			System.out.println("biscuit is null");
		}
	}

}


