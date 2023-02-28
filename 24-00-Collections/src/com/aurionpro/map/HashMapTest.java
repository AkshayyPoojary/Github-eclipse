package com.aurionpro.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "akshay");
		mp.put(2, "tejas");
		mp.put(3, "abhishek");
		mp.put(4, "sankalp");
		System.out.println("List of elements: " + mp);
		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		mp.remove(2);
		System.out.println("Updated list: " + mp);
		mp.remove(4, "sankalp");
		System.out.println("Updated list: " + mp);
		mp.putIfAbsent(5, "Aditya");
		System.out.println("Adding an element:"+ mp);
		mp.replace(5, "Aditya", "Amogh");
		System.out.println("After replacing values: "+mp);
	}
}
