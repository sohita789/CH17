package com.xworkz.datatypes.assign;

import com.xworkz.datatypes.things.Hat;

public class Sohita {
	
	public void wear() 
	{
		Biscuit biscuit=new Biscuit();//allocate,copy iv,invokes const,chaining,init iv,returns location
		
	     biscuit.eat();//accessing the method
		 biscuit.taste();
		 biscuit.display();
		 
		System.out.println(biscuit.brand);//accessing var
		System.out.println(biscuit.cost);
	}
}


