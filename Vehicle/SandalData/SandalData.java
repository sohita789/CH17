package com.xworkz.SandalData;

public class SandalData {

       String brand;
		int size;
		double cost;
		String color;
		
		
		public  SandalData(String brand,int size,double cost,String color)
		{
			this.brand=brand;
			this.size=size;
			this.cost=cost;
			this.color=color;
		}


		public void display() {
		
			System.out.println("brand:"+brand);
			System.out.println("size:"+size);
			System.out.println("cost:"+cost);
			System.out.println("color:"+color);
		}

}
		 
	