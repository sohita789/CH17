package com.xworkz.Airport;
//Add least 6 properties
//Override toString & equals
//use least 3 properties in equals
//Two instances and compare with equals


public class Jeans {
	private String brand;
	private String type;
	private int quantity;
	private int size;
	private double price;
	private String color;
	
	public Jeans(String brand, String type, int quantity, int size, double price, String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.quantity = quantity;
		this.size = size;
		this.price = price;
		this.color = color;
	}

	public Jeans(String brand, int quantity, double price) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Jeans [brand=" + brand + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in jeans");
	if (obj!= null) {
			if(obj  instanceof Jeans) {
				Jeans casted=(Jeans)obj;
				if(this.brand.equals(casted.brand)&&this.quantity==casted.quantity &&this.price==casted.price) {
					System.out.println("left side is equal to right");
					return true;
					}
				}
				else {
					System.out.println("obj is not Jeans");
				}}
	return false;}
				
				
				public void setBrand(String brand) {
	this.brand = brand;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void setPrice(double price) {
	this.price = price;
}
}