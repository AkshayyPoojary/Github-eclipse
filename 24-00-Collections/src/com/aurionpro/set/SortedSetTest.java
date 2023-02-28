package com.aurionpro.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set.add("Akshay");
		set.add("Aditya");
		set.add("Ashwini");
		set.add("Abhishek");
		System.out.println(set);
		// Advanced for-loop
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("Returns firts element: " + set.first());
		System.out.println("Returns last element: " + set.last());
// to check if the element is there or not
		System.out.println(set.contains("Akshay"));
// is used to returns a view of the portion of the given set whose elements are greater than or equal 
		System.out.println(set.tailSet("Abhishek"));

	}
}
