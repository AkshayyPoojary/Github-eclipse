package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTest {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 25, 45, 20, 30, 40, 50);
//		System.out.println(num);
//		for (Integer i : num) {
//			if (i % 10 == 0) {
//				System.out.println(i);    // this will directly throw the answer and will not store result
//			}
//		}

// this will store the data into new Object i.e divisibleByTen
		List<Integer> divisibleByTen = new ArrayList<>();
		for (Integer i : num) {
			if (i % 10 == 0) {
				divisibleByTen.add(i);
			}
		}
		System.out.println("Numbers that are divisible by 10: " + divisibleByTen); // now we have 2 list

//                          predicate will take the value if it  is true
//                          filter - this are INTERMIDIATE OPERATOR
//                          collector - this are TERMINAL OPERATOR

// Give the values that are divisible by 10 (using forEach-loop)		
		num.stream().filter(n -> n % 10 == 0).forEach(System.out::println);

// Give the values that are divisible by 10	
		List<Integer> collect = num.stream().filter(n -> n % 10 != 0).collect(Collectors.toList());
		System.out.println("Values that are divisible by 10 are:	" + collect);

// Strings which has length greater than 5		
		List<String> li = Arrays.asList("Tushar", "Ajay", "Ravi", "Vishnu");
		List<String> collect1 = li.stream().filter(n -> n.length() >= 5).collect(Collectors.toList());
		System.out.println("Strings which has length greater than 5 are: " + collect1);

	}
}
