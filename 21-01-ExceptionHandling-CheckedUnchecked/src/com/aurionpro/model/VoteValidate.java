package com.aurionpro.model;

import java.util.Scanner;

public class VoteValidate {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
			validateage(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void validateage(int age)throws InvalidAgeException {
		if (age > 18) {
			System.out.println("Your are eligible!");
		}
//		else {
//			throw new RuntimeException("YOU ARE UNDERAGE!!");  // to throw error explicitly
//		}
		else {
			 // UserDefined Exception i.e InvalidAgeException
			throw new InvalidAgeException("YOU ARE UNDERAGE!!"); 
		}
	}
}
