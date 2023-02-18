package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.aurionpro.model.Account;


public class AccountTest {
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<Account>();
//		Account item1 = new Account(1, "Akshay", 15000);
//		Account item2 = new Account(2, "Thappa", 12400);
//		Account item3 = new Account(3, "Sneha", 22500);
//		Account item4 = new Account(4, "Rahul", 51100);
//		list.add(item1);
//		list.add(item2);
//		list.add(item3);
//		list.add(item4);

		list.add(new Account(1, "Akshay", 15000));
		list.add(new Account(2, "Thappa", 12400));
		list.add(new Account(3, "Sneha", 22500));
		list.add(new Account(4, "Rahul", 51100));
		listCart(list);
		System.out.println("--------------------------------------------------------");
		System.out.println("List after Sorting in decending order: ");
		Collections.sort(list);
//		Collections.sort(list,Collections.reverseOrder());

		listCart(list);
		highestbalance(list);
		leastblanace(list);

	}

	private static void leastblanace(ArrayList<Account> list) {
		double min = list.get(0).getBalance();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i).getBalance()) {
				min = list.get(i).getBalance();
				index = i;
			}
		}
		System.out.println("Minimum balance in " + list.get(index));
	}

	private static void highestbalance(ArrayList<Account> list) {
		double max = list.get(0).getBalance();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i).getBalance()) {
				max = list.get(i).getBalance();
				index = i;
			}
		}
		System.out.println("Maximum balance in " + list.get(index));

	}

	private static void listCart(ArrayList<Account> list) {
		double totalBalance = 0;
		for (Account x : list) {
			System.out.println(x);
			totalBalance += x.getBalance();

		}
		System.out.println("Total balance of all account: " + totalBalance);
	}
}
