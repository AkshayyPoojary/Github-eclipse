package com.aurionpro.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListImplementation {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		arr.add(12);
		arr.add(4);
		arr.add(2);
		arr.add(16);
		arr.add(5);
		arr.add(1, 7);
		System.out.println(arr);
// Advanced for-loop
		for (Integer x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
// to check the list is empty
		System.out.println("List is empty or not: " + arr.isEmpty());
// to get an element from the list
		System.out.println("Fetching element using index: " + arr.get(3));
// Using iterator for printing every element from the list		
		Iterator<Integer> it= arr.iterator();
		while (it.hasNext())  
		{  
		Integer i = it.next();  
		System.out.print(i+ " ");  
		} System.out.println();
// to remove an element from the list	
		System.out.println("Removing element using index-value: "+arr.remove(2));
// to add existing elements into new object
		arr2.add(51);
		arr2.add(83);
		arr2.add(79);
		arr2.add(63);
		arr.addAll(arr2);
		System.out.println("Updated arraylist: "+arr);
// to check the size of an list
	System.out.println("Size of the list is: "+arr.size());
	arr.contains(arr);	
// to clear list
	arr.clear();
	System.out.println("Empty list looks like this: "+arr);
	
	
	}
}
