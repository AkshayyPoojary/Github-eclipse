package com.aurionpro.model;

public class Parent {
	static{
		System.out.println("inside parent static block.");
	}
	
	
//	public Parent() {         // non-parameter constructor
//		System.out.println("Inside parent Constructor.");
//	}

	
	public Parent(String message) {    // parameter constructor
		System.out.println("Inside parent Constructor."+ message);
	}
}
