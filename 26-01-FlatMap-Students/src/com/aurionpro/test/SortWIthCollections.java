package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortWIthCollections {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(11, 2, 1, 20, 30);
		// to sort a number using collections
		// and with reverse order
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);

		// Using stream
		List<Integer> sortedList = numList.stream().filter(n -> n % 2 == 0).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Using stream to sort: " + sortedList);

		List<String> nameList = Arrays.asList("Akshay", "Aditya", "Amogh");
		// to sort a name using collections
		// and with reverse order
		Collections.sort(nameList, Collections.reverseOrder());
		System.out.println(nameList);

	}
}
