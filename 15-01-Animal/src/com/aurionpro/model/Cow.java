package com.aurionpro.model;

public class Cow extends Animal {

	public Cow(String name, boolean isCarnivorous) {
		super(name, isCarnivorous);

	}
	

	@Override
	public void eat() {    
		System.out.println("Cow is eating");
	}
	
	@Override
	public String toString() {    
		return super.toString();
		
	}
}
