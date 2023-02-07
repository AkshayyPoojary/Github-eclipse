package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cow;
import com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("Wild animal",true);
		animal.eat();
		System.out.println(animal);
		
		Cow cow =new Cow("Domestic animal",false);
		System.out.println(cow);
		
		Lion lion =new Lion("Wild animal",true);
		System.out.println(lion);
	}
}
