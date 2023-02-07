package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("", "Akshay", 200000);
		Account account2 = new Account("", "Sneha");
		Account account3 = new Account(""," ",1003);
		Account account4 = new Account();

		System.out.println();
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);

	}

}
