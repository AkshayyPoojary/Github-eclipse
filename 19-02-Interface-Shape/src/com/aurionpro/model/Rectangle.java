package com.aurionpro.model;

public class Rectangle implements Shape {   //this implements interface shape.java
	public int height;
	public double weight;
	
	public Rectangle(int height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double calculateArea() {
		return height * weight ;
	}

	@Override
	public void showColor() {
		System.out.println("It is in red colour");

	}

}
