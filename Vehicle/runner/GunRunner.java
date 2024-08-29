package com.xworkz.sanitizer.runner;

import com.xworkz.sanitizer.things.Dboss;
import com.xworkz.sanitizer.things.Godsee;
import com.xworkz.sanitizer.things.Gun;
import com.xworkz.sanitizer.things.Police;
import com.xworkz.sanitizer.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		
		Soldier soldier=new Soldier();
		soldier.useGun();
		
		
		Police police = new Police();
		Gun gun=new Gun("Ak-47","russia","rifle");
		police.inspectGun(gun);
		
		
		Gun gun1 = new Gun("M4","usa","pistul");
		
		Dboss dboss = new Dboss(gun1);
		dboss.fire();
		
		Godsee godsee=new Godsee();
		Gun ref= godsee.getGun();
		
		if(ref!=null) {
			ref.fire();
			ref.display();
		}
		else {
			System.out.println("gun is null");
		}
		
		

	}

}
