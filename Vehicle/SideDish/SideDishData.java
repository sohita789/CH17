package com.xworkz.SideDish;

public class SideDishData {

String name;
double price;
String type;

public  SideDishData( String name,double price,String type)
{
	this.name=name;
	this.price=price;
	this.type=type;
}

public void display()
{
	System.out.println("name:"+this.name);
	System.out.println("price:"+this.price);
	System.out.println("type:"+this.type);
}

}

