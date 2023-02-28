package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
	public static void main(String[] args) {

// print all lists in one list
		List<Integer> List1 = Arrays.asList(10, 20, 30);
		List<Integer> List2 = Arrays.asList(1, 20, 30);
		List<Integer> List3 = Arrays.asList(20, 20, 30);
//now this List<List<Integer>> will take every list individually
		List<List<Integer>> mergeLists = new ArrayList<>();
		mergeLists.add(List1);
		mergeLists.add(List2);
		mergeLists.add(List3);
//		OR
//		List<Integer> List = new ArrayList<>();   // this will add all the list elements together
//		List.addAll(List1);
		System.out.println(mergeLists);

		List<Integer> resultList = new ArrayList<Integer>();
		// object type is List<Integer> so each list will go as li
		for (List<Integer> li : mergeLists) {
			// And each i contains li elements i.e (values of list)
			// Integer type of li
			for (Integer i : li) {
//				if (!resultList.contains(i))         // will remove duplicate elements
				resultList.add(i);
			}
		}
		System.out.println(resultList);

// Above lines of code can be solved using flatMap() and for removing duplicates add .distinct

		List<Integer> collect = mergeLists.stream().flatMap(list -> list.stream()).distinct()
				.collect(Collectors.toList());
		System.out.println("After removing duplicate elements from each list: " + collect);
	}
}
