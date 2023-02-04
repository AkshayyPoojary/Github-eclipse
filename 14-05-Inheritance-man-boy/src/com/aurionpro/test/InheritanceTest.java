package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {
	
public static void main(String[] args) {
	case1();
	case2();
	
}

private static void case2() {

	Man man = new Boy();   // parent can give reference to child
	/* even though parent is giving reference to child
	  it will only give methods which are present in parent class.  
	 */
	man.eat();
//	man.read(); // .read() is from Child class(Boy) therefore  it will give error
	man.play();
}

private static void case1() {

	Boy boy = new Boy();
	boy.eat();
	boy.read();
	
	Kid kidd = new Kid();
	kidd.play();
	kidd.eat(); //takes from parent i.e man
}
}
