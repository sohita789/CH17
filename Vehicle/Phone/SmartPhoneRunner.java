package Phone;

import Halwa.Halwa;
import Halwa.HalwaVariety;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		Android android=new Android();
		SmartPhone smartphone=new SmartPhone("galaxy","black",2,25000);
		
		System.out.println(android.name);
		System.out.println(android.color);
		System.out.println(android.quantity);
		System.out.println(android.price);
		
		android.name="galaxy";
		android.color="black";
		android.quantity=2;
		android.price=25000;
		
		android.order();
		android.display();
		
		

	}

}
