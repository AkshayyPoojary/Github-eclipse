package com.aurionpro.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
//	ArrayList<Integer> list = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(6);        //  ArrayList store duplicate values
		li.add(14);
		li.add(27);
		li.add(1);

	System.out.println(li);
//	System.out.println(list.size());
//	System.out.println();
//----------------------------------------------
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//	}
//	for(Integer i : list) {                  //enhanced
//		System.out.println(i);
//	}
//	list.forEach(System.out::println);

//----------------------------------------------	
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//----------------------------------------------

		// to remove by index
		li.remove(0);
		System.out.println(li);

		//to remove by creating obj bcoz it will take it as value
		li.remove(new Integer(27));
		System.out.println(li);
//----------------------------------------------
		
//		// to clear list
//		li.clear();
//		System.out.println(li);
//----------------------------------------------
		
		// to check if the vallue is there or not
		
//		System.out.println(li.contains(1));
	}
}
