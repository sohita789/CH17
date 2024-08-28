package com.xworkz.datatypes.assign;

import com.xworkz.datatypes.things.Hat;

public class Gunashree {
	public void wear() 
	{
		Waterbottle waterbottle=new Waterbottle();//allocate,copy iv,invokes const,chaining,init iv,returns location
		
		waterbottle.fill();//accessing the method
		
		System.out.println(waterbottle.color);//accessing var
		System.out.println(waterbottle.quantity);
	}
}


