package com.aurionpro.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(1, "book");
		sm.put(2, "bag");
		sm.put(3, "Bottel");
		sm.put(4, "Pencil");
		System.out.println(sm);
// Getting values from the sorted map
		System.out.println("Value of 2 is : " + sm.get(2));
// getting both key-value using Advanced for-loop
		for (Integer key : sm.keySet()) {
			System.out.println("Key: " + key + ", Value: " + sm.get(key));
		}
// Removing elements from the sorted map
		System.out.println("Retriving valuse from 4 : " + sm.remove(4));
//----------------------------------------------------------------------------------------
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1002, "gun");
		tm.put(1003, "bike");
		tm.put(1004, "jacket");
		tm.put(1005, "glasses");
		// can change order
		System.out.println(tm.descendingMap());
		// returns value less then equal to
		System.out.println(tm.headMap(1003, true));
		// returns value greater then equal to
		System.out.println(tm.tailMap(1002, true));
		// returns value from given range of value
		System.out.println(tm.subMap(1003, 1005));

	}
}
