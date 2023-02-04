package com.aurionpro.model;

public class Boy extends Man {
	
	// Derive state
	public void read() {         
		System.out.println("Boy is reading");
	}
	
	@Override
	public void play() {         
		System.out.println("Boy plays..");
	}
	
	@Override
	public void eat() {    
		System.out.println("Boy is eating");
	}
}
