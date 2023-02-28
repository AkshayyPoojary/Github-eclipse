package com.aurionpro.test;

import com.aurionpro.model.IAddInteger;
import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetString;
import com.aurionpro.model.IGreetable;

public class AddTest {
	public static void main(String[] args) {
//            ******* calling the class  *******
		IAddInteger obb = new IAddInteger();
		System.out.println(obb.add(20, 17));
//		IAddable addObj = new IAddInteger();
//		System.out.println(addObj.add(10, 20));
//-----------------------------------------------------
//   ******* anonymous class or unknown class   *******
//		IAddable addObj2 = new IAddable() {
//
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//		};
//		System.out.println(addObj2.add(10, 1));
//------------------------------------------------------		
		IAddable addObj3 = (a, b) -> (a + b);
		System.out.println(addObj3.add(17, 13));

//------------------------------------------------------------	

// by creating a class and calling the class
		IGreetString addObj4 = new IGreetString();
		addObj4.greet(" Akshay");

//		 ******* anonymous class or unknown class  *******
		IGreetable b = new IGreetable() {

			@Override
			public void greet(String a) {
				System.out.println("hello " + a);
			}
		};
		b.greet("Akshay Poojary");
// using Lmabda
		IGreetable obj = (a) -> System.out.println("Hello " + a);
		obj.greet("Aditya");
	}

}
