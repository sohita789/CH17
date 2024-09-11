package com.xworkz.hashCode;
// HashCode:*  It is a method.*it is a  Unique Id used by the JVM.

import java.util.Objects;

public class Basket {
	
	String type;
	int quantity;
	double cost;
	
	public Basket(String type, int quantity, double cost) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.cost = cost;
		System.out.println("created the Basket with String ,int and double ");
	}
    public Basket() {
		super();
		System.out.println("Created the Basket with no-arg constructor");
		}
    
	@Override
	public int hashCode() {
		return Objects.hash(cost);
	}
	
    public void display() {
    	System.out.println("type:"+type);
    	System.out.println("quantity:"+quantity);
    	System.out.println("cost:"+cost);
    }
	
	
	
	

}
