package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);
		System.out.println("Minimum value in list: ");
		numbers.stream().mapToInt(num -> num).min().ifPresent(System.out::println);
		System.out.println("Maximum value in list: ");
		numbers.stream().mapToInt(num -> num).max().ifPresent(System.out::println);
	}
}
