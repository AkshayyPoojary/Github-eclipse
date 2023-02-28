package com.aurionpro.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class employee {
	int id;
	String name;

	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}

}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<employee> hs = new HashSet<>();

		hs.add(new employee(101, "Akshay"));
		hs.add(new employee(102, "Tejas"));
		hs.add(new employee(103, "Sankalp"));
		hs.add(new employee(104, "Abhishek"));
		hs.add(new employee(105, "Aditya"));
		for (employee em : hs) {
			System.out.println(em);
		}
//---------------------------------------------------
		HashSet<String> hset = new HashSet<>();
		hset.add("Ak");
		hset.add("Sh");
		hset.add("Ay");
		hset.add("Po");
		hset.add("Oj");
		hset.add("Ary");
		Iterator<String> i = hset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
// to clear
		hset.clear();
		System.out.println("Emplty list looks like this: " + hset);

//------------------------------------------------------------------------------
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		System.out.println("Linked Hash Set elements:");
// add elements to the hash set
		lhs.add("Bbb");
		lhs.add("Aaa");
		lhs.add("Ddd");
		lhs.add("Eee");
		lhs.add("Ccc");
		lhs.add("Fff");
		System.out.println(lhs);
		// to remove specific element
	        lhs.remove("Aaa");  
			System.out.println("Removing specific element from list: " + lhs);

//		Iterator<String> ls = lhs.iterator();
//		while (i.hasNext()) {
//			System.out.println(ls.next());
//		}

	}
}
