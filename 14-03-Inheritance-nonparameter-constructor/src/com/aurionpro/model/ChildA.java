package com.aurionpro.model;

public class ChildA extends Parent {
	public ChildA() {
//		super();  //default constructor with non-parameter constructor
		super("Helloooooooo"); // calling the parameter constructor.
		// we can choose super class explicitly
		System.out.println("Inside child Constructor.");
	}
}
