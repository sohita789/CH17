package com.workz.Airport.Grinder;

public class Grinder {
	private String brand;
	private String model;
	private double capacity;
	private String color;
	private int power;
	private boolean hasSafety;
	public Grinder(String brand, String model, double capacity, String color, int power, boolean hasSafety) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.color = color;
		this.power = power;
		this.hasSafety = hasSafety;
	}
	public Grinder(String brand, double capacity) {
		super();
		this.brand = brand;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return"Grinder[brand="+brand+",capacity="+capacity+"]";
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Grinder");
		if(obj!=null) {
			
			if(obj instanceof Grinder) {
				Grinder casted=(Grinder)obj;
				if(this.brand.equals(casted.brand)&&this.capacity==casted.capacity) {
					System.out.println("left equals to right");
					return true;}}
					else {
						System.out.println("obj is not a Grinder");
					}
					}
		return hasSafety;
			
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
