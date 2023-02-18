package com.aurionpro.model;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	HashSet<Integer> hash = new HashSet<>();  // this is unordered i.e it does not has indexing
	
//	hash.add(new );
	hash.add(20);
	hash.add(20);      //  HashSet does not store duplicate  values
	hash.add(40);
	hash.add(50);
	System.out.println(hash);
	System.out.println("Using for loops: ");
	for(Integer x: hash) {
		System.out.println(x);
	}
}
}
