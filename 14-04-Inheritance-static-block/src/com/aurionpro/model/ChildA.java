package com.aurionpro.model;

public class ChildA extends Parent {
	static {                     //static block
		System.out.println("Inside child static block");
	}

//	public ChildA() {
//		System.out.println("Inside child Constructor.");
//	}
//	
	public ChildA(String msg) {
		super(message); // to
		System.out.println("Inside child Constructor.");
	}
}
