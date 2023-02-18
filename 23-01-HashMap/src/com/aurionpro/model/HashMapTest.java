package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		// Stores in Key value pairs.
//		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> hashmap = new HashMap<Integer, String>(); // hashmap implements map(parent)
		hashmap.put(01, "Akshay");
		hashmap.put(02, "Sk");
		hashmap.put(03, "Tejas");
		hashmap.put(04, "Rahul");
//		hashmap.put(03, "Mohan");
		System.out.println(hashmap);

//--------------------------------------------------------------------------		
		// to remove certain key
//		hashmap.remove(03);
//		System.out.println(hashmap);
//--------------------------------------------------------------------------		
//		hashmap.containsValue("Tejas");    // to check if value is there or not
//		if (hashmap.containsValue("Tejas")) {
//			hashmap.remove(03); // to check if value is there and if it is there remove it.
//		}
//		System.out.println(hashmap);
//--------------------------------------------------------------------------

		// To remove an certain object, if there is an

//		int index = -1;                         // bcoz 0 is also an index value
//		for (Entry<Integer, String> m : hashmap.entrySet()) {
//			if (m.getValue().equals("Tejas")) {
//				index = m.getKey();
//			}
//		}
//		hashmap.remove(index);

//--------------------------------------------------------------------------
		
		
		
//--------------------------------------------------------------------------	
////		Set<Entry<Integer, String>> entrySet = hashmap.entrySet(); 
//		for(Entry<Integer, String> m: hashmap.entrySet()) {
//			System.out.println(m.getKey() + " : " + m.getValue());
//		}
//--------------------------------------------------------------------------		
//
//		/* to call the key and value pair we use Map.Entry and .entrySet is it's
//		 instance class.
//		*/
//		
//		for (Map.Entry x : hashmap.entrySet()) { //
//			System.out.println(x.getKey() + " " + x.getValue());
//		}
//--------------------------------------------------------------------------	
//		
//	// For each
		hashmap.forEach((key, value) -> System.out.println(key + " : " + value));

//--------------------------------------------------------------------------	
	}
}
