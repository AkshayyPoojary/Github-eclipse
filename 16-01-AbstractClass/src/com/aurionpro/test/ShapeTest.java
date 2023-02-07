package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circles = new Circle(Color.red, 6);
		System.out.println("The color of circle is: " + circles.getColor()); // to call the color
		System.out.println("The area of circle is: " + circles.calculateArea());

		Rectangle rectangles = new Rectangle(Color.blue, 2, 3);
		System.out.println("The color of rectangle is: " + rectangles.getColor());
		System.out.println("The area of rectangles is: " + rectangles.calculateArea());
	}

}
