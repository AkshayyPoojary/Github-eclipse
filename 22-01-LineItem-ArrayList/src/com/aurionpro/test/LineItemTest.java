package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList<LineItem> list = new ArrayList<>();
		LineItem item1 = new LineItem(1, "WheyProtein", 3, 1500);
		LineItem item2 = new LineItem(2, "Oats", 1, 400);
		LineItem item3 = new LineItem(3, "BCAA", 2, 2500);
		LineItem item4 = new LineItem(4, "MultiV", 5, 1100);
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(new LineItem(5, "Chicken", 1, 300));       // another way to store items
		listCart(list);
	}

	private static void listCart(ArrayList<LineItem> list) {
		double totalCost = 0;
		for (LineItem x : list) {
			System.out.println(x);
			totalCost += x.calculateCost();
		}
		System.out.println();
		System.out.println("Total cost of product: "+totalCost);		
	}
}
