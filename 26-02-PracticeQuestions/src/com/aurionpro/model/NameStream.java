package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NameStream {
	public static void main(String[] args) {
		String[] names = { "Jayesh", "Nimesh", "Mahesh", "Ramesh" };
////	with for-loop
//		for (String x : names) {
//			System.out.println(x);
//		}

		System.out.println("Using Stream  and then for-each loop:");
		Stream<String> nameLi = Stream.of("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		nameLi.forEach(System.out::println);
		System.out.println("--------------------------------------------");

		System.out.println("Using Arrays.asList and then for-each loop:");
		List<String> asList = Arrays.asList("Jayesh", "Nimesh", "Mahesh", "Ramesh");
		asList.forEach(System.out::println);
		System.out.println("--------------------------------------------");

		IString str = NameStream::hello;
		str.greet(names);

	}

	public static void hello(String[] name) {
		for (String x : name) {
			System.out.println("welcome " + x);
		}
	}
}
