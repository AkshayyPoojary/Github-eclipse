package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,30);
		System.out.println(rec.calculateArea());
		rec.showColor();
	}

}
