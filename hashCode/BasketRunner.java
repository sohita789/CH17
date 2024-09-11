package com.xworkz.hashCode;

public class BasketRunner {

	public static void main(String[] args) {
	
		Basket basket=new Basket();
		Basket basket1=new Basket("SchoolBasket",20,200);
		basket.display();
		basket1.display();
		
		System.out.println("basket:"+basket.hashCode());
		System.out.println("basket1:"+basket1.hashCode());
		
		int basketcode =basket.hashCode();
		System.out.println("basketcode:"+basketcode);
		
		int basket1code =basket1.hashCode();
		System.out.println("basket1code:"+basket1code);
		
		int originalHashCodebasket1=System.identityHashCode(basket1);
		System.out.println("originalHashCodebasket1:"+originalHashCodebasket1);

		int originalHashCodebasket=System.identityHashCode(basket);
		System.out.println("originalHashCodebasket:"+originalHashCodebasket);
	}

}
