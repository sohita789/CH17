package com.workz.Airport.Grinder;

public class Saree {
	private String brand;
	private String material;
	private double cost;
	private String color;
	private int noOf;
	private boolean hasOffer;
	public Saree(String brand, String material, double cost, String color, int noOf, boolean hasOffer) {
		super();
		this.brand = brand;
		this.material = material;
		this.cost = cost;
		this.color = color;
		this.noOf = noOf;
		this.hasOffer = hasOffer;
	}
	public Saree(String brand, String material, String color) {
		super();
		this.brand = brand;
		this.material = material;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return"Saree[brand="+brand+",material="+material+",color="+color+"]";
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in saree");
		if(obj!=null) {
			
			if(obj instanceof Saree) {
				Saree casted=(Saree)obj;
				if(this.brand.equals(casted.brand)&&this.material.equals(casted.material)&&this.color.equals(casted.color)) {
					System.out.println("left equals to right");
					return true;
					}}
					else {
						System.out.println("obj is not a saree");
					}
					}
		return hasOffer;
			
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setNoOf(int noOf) {
		this.noOf = noOf;
	}
	
	
  
}
