package com.aurionpro.model;

public class Unchecked {
	public static void main(String[] args) {
		method1();
		System.out.println("Main");
	}

	private static void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
			// getMessage is for removing alerts and only showing message
		}
		System.out.println("method 1");
	}

	private static void method2(){
		method3();
		System.out.println("method 2");
	}

	private static void method3(){
		throw new RuntimeException("An exception is occured");

	}
}
