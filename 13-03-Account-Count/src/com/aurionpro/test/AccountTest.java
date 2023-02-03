package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(1001, "Akshay", 200000);
		Account account2 = new Account(1002, "sneha");
		Account account3 = new Account(1003, " ", 1000);
		Account account4 = new Account();

		System.out.println();
		int count = Account.getAccountCount(); // calling method directly by its class name
//		i.e Account bcoz it is a static type
		System.out.println("There are " + count + " object in this class");

	}

}
