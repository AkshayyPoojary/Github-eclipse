package com.aurionpro.model;

public class Circle extends Shape {
	private double radius;

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius; // because we have added a new variable as radius

	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI; // can also use 3.14
	}

}
