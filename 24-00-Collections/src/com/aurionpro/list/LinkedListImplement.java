package com.aurionpro.list;

import java.util.LinkedList;

public class LinkedListImplement {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		LinkedList<Integer> li2 = new LinkedList<>();
// to add integer in list
		li.add(1);
		li.add(11);
		li.addLast(12);
		li.addFirst(21);
		li.add(2, 41); // first index then element
		li.add(51);

// using Advanced for-loop for printing all element in a line
		for (Integer in : li)
			System.out.print(in + " ");
		System.out.println();
		System.out.println(li);
		System.out.println("The size of list is: " + li.size());
		System.out.println("Extracting elements form index-value: " + li.get(2));
		System.out.println("First elements of list: " + li.getFirst());
		System.out.println("Last elements of list: " + li.getLast());
// to remove element using index-value from list
		li.remove(2);
		System.out.println("Removed element form first: " + li.removeFirst());
		System.out.println("Removed element form last: " + li.removeLast());
		System.out.println("Updated list: " + li);

// creating Second LIST---------------
		li2.add(42);
		li2.add(65);
		li2.add(77);
// adding all element from another list
		li.addAll(li2);
		System.out.println("All element from another list is added: " + li);
// to clone existing list into new object
		li2 = (LinkedList) li.clone();
		System.out.println("After cloneing it to another list: " + li2);
// to clear all elements from list
		li.clear();
		System.out.println("Emplty list looks like this: " + li);
	}
}
