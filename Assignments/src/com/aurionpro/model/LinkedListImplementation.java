package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {
	public static void main(String[] args) {
//	LinkedList<Integer> linkedLi= new LinkedList<>();
//	linkedLi.add(1);
////	linkedLi.addAll(17,"akshay");
//	linkedLi.contains(1);
//	System.out.println(linkedLi);

		ArrayList<Integer> arrayLi = new ArrayList<>();
		arrayLi.add(1);
		arrayLi.add(2);
		arrayLi.add(3);
		arrayLi.add(4);
		arrayLi.add(5);
		System.out.println(arrayLi);

		arrayLi.remove(1);
//		arraylist(arrayLi);
		System.out.println(arrayLi);
		Iterator it = arrayLi.iterator();

	}

}
