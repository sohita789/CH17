package com.xworkz.protector.external;

import com.xworkz.protector.internal.Gun;
import com.xworkz.protector.internal.Weapon;

  public class MachineGun extends Weapon {
	    @Override
	    protected void use() {
	        System.out.println("Using the machine gun");
	    }

	    @Override
	    public void fire() {
	        System.out.println("Firing the machine gun");
	    }

	    public void performActions() {
	        use();
	        fire();
	    }
	}



