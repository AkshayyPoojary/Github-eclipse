package com.aurionpro.model;

public class Bike extends Vehicle implements IMovable {

	public Bike(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(this.getName()+" Bike is moving");
	}

}
