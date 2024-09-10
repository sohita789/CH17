package com.xworkz.Airport;

public class Kettle {
	private String brand;
	private String model;
	private double capacity;
	private String color;
	private int power;
	private boolean shutOff;
	
	public Kettle(String brand, String model, double capacity) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
	}

	public Kettle(String brand, String model, double capacity, String color, int power, boolean shutOff) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.color = color;
		this.power = power;
		this.shutOff = shutOff;
	}
	@Override
	public String toString() {
		return "Kettle[brand="+brand+",model="+model+",capacity="+capacity+"]";
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Kettle");
		if(obj!=null) {
			if(obj instanceof Kettle) {
				Kettle casted=(Kettle)obj;
				if(this.brand.equals(casted.brand)&&this.model.equals(casted.model)&&this.capacity==casted.capacity) {
					System.out.println("left equals to right");
					return true;
				}}
			else {
				System.out.println("obj is not Kettle" );
			}
			
		return true;
		}
		return true;}	
				
			
		
public void setBrand(String brand) {
		this.brand = brand;
	}
public void setModel(String model) {
		this.model = model;
	}
public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	}
	
	
	


