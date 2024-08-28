package Hen;

import animal.Bull;
import animal.Veternary;

public class ChickenRunner {

	public static void main(String[] args) {
		ChickenType chickentype=new ChickenType();
		 Chicken chicken=new Chicken("hybrid", "red", 1, 2, false, 3, "yes", 1, 200);
			
			System.out.println(chicken.breed);
			System.out.println(chicken.color);
			System.out.println(chicken.age);
			System.out.println(chicken.weight);
			System.out.println(chicken.isEggLaying);
			System.out.println(chicken.eggcount);
			System.out.println(chicken.habitat);
			System.out.println(chicken.height);
			System.out.println(chicken.price);
			
			chicken.show();
			chicken.print();
			chicken.run();
			chicken.display();
			chicken.read();
			
	}
}
			

	
	