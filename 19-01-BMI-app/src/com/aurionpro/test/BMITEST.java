package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMITEST {
	public static void main(String[] args) {
		Person person = new Person("Akshay", 22, 1.77, 73);
		BMI bmi = new BMI(person);
		System.out.println("BMI of " + person.getName() + " is " + bmi.getBMI());
		System.out.println(person.getName() +" is in " + bmi.getBodyType()+" category ");

	}
}
