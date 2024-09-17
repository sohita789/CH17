package com.xworkz.inherits;

public class Circle extends Shape{

	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("running calculateArea in Circle");
    }
}

