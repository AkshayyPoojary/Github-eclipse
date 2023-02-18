package com.aurionpro.test;


import java.util.HashSet;
import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<>();
		Account acc = new Account(1, "Akshay", 15000);  // same object
		set.add(acc);  
		set.add(new Account(6, "Akshay", 15000));
		set.add(new Account(1, "Akshay", 15000));
		set.add(new Account(2, "Thappa", 12400));
		set.add(new Account(3, "Sneha", 22500));
		set.add(new Account(4, "Rahul", 51100));
		listCart(set);

	}

	private static void listCart(HashSet<Account> set) {
		double totalBalance = 0;
		for (Account x: set) {
			System.out.println(x);
			totalBalance += x.getBalance();

		}
		System.out.println("Total balance of all account: " + totalBalance);
	}
}
