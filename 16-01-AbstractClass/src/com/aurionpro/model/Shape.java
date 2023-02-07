package com.aurionpro.model;

abstract class Shape { // Abstract class
	private Color color;

	public Shape(Color color) {

		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public abstract double calculateArea(); // abstract method must close with ";"
}
