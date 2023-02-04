package com.aurionpro.model;

public class ChildA extends Parent {
	static {
		System.out.println("Inside child static block");
	}

	public ChildA() {
		System.out.println("Inside child Constructor.");
	}
}
