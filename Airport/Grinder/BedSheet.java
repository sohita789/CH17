package com.workz.Airport.Grinder;

public class BedSheet {
	private String brand;
	private String material;
	private double cost;
	private String color;
	private int noOf;
	private boolean hasOffer;
	public BedSheet(String brand, String material, double cost, String color, int noOf, boolean hasOffer) {
		super();
		this.brand = brand;
		this.material = material;
		this.cost = cost;
		this.color = color;
		this.noOf = noOf;
		this.hasOffer = hasOffer;
	}
	public BedSheet(String brand, String material) {
		super();
		this.brand = brand;
		this.material = material;
	}
	
	@Override
	public String toString() {
		return"BedSheet[brand="+brand+",material="+material+"]";
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in bedsheet");
		if(obj!=null) {
			
			if(obj instanceof BedSheet) {
				BedSheet casted=(BedSheet)obj;
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



