package com.aurionpro.test;

import com.aurionpro.model.IGreetable;

public class AddTest {
	public static void main(String[] args) {

//        USing Method Reference
		IGreetable obj = (n) -> System.out.println("Konichiwa " + n);
		obj.greet("Tanjiro");
// static method i.e welcome
		IGreetable obj1 = AddTest::welcome;
		obj1.greet("Akshay");

//      For non-static  we are creating an object and through that object we are giving reference
		AddTest test = new AddTest();
		IGreetable obj2 = test::heollAll;
		obj2.greet("Aditya");

	}

	public static void welcome(String name) {
		System.out.println("Welcome " + name);
	}

	// non-static method
	public void heollAll(String name) {
		System.out.println("Hello " + name);
	}

}
