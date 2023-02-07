package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
//	case1();
//	case2();
//	case3();
		case4();

	}

	private static void case4() {

		// Object is a wrapper class
		Object x;
		x = 100; // Auto-Boxing that converts it's type for eg. Integer
		System.out.println(x.getClass());
		x = "hello"; // Auto-Boxing that converts it's type for eg. String
		System.out.println(x.getClass());

	}

	private static void case3() {
        // one method can hold many reference
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());

		// this method indirectly calls case2 type of method

	}

	private static void atThePark(Man man) {
		man.play(); // this has to be in parent class.
     //	man.eat();
	}

	private static void case2() {

		Man man = new Boy(); // parent can give reference to child
		man.eat();
		man.play();
	}

	private static void case1() {

		Boy boy = new Boy();
		boy.eat();

	}
}
