package com.xworkz.sanitizer.runner;

import com.xworkz.sanitizer.things.Bhumika;
import com.xworkz.sanitizer.things.Dboss;
import com.xworkz.sanitizer.things.Godsee;
import com.xworkz.sanitizer.things.Gun;
import com.xworkz.sanitizer.things.Lakshmi;
import com.xworkz.sanitizer.things.Megha;
import com.xworkz.sanitizer.things.Nayana;
import com.xworkz.sanitizer.things.Police;
import com.xworkz.sanitizer.things.Soldier;
import com.xworkz.sanitizer.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
	        Megha megha=new Megha();
			megha.wash();
			
			
			Lakshmi lakshmi = new Lakshmi();
			WashingMachine machine=new WashingMachine("Lenovo","good",30);
			lakshmi.washing(machine);
			
			
			WashingMachine washingMachine1 = new WashingMachine("Aqua","excellent",50);
			
			Bhumika bhumika = new Bhumika(washingMachine1);
			bhumika.cleanse();
			
			Nayana nayana=new Nayana();
			WashingMachine ref= nayana.machine();
			
			if(ref!=null) {
				ref.rinse();
				ref.show();
			}
			else {
				System.out.println("machine  is null");
			}
			
			

		}

	


	}


