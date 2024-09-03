package com.xworkz.protector.external;

import com.xworkz.protector.internal.Gun;
import com.xworkz.protector.internal.Weapon;

public class Ramesh {
	
    public void store() {
    	System.out.println("running the store in Ramesh");
        Weapon weapon = new Weapon();
        
        weapon.fire();
    }

    public void show() {
    	System.out.println("running the show in Ramesh");
        Gun gun = new Gun();
        
        gun.fire();
    }
}



