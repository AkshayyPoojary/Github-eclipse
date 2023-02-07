package com.aurionpro.model;

public class Rectangle extends Shape {
	private double hight;
	private double width;

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.hight = height; // because we have added a new variable as height
		this.width = width; // because we have added a new variable as width

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return hight * width;
	}

}
