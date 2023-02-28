package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> asList = Arrays.asList(new Account(1, "Akshay", 22000), new Account(2, "Prathamesh", 22000),
				new Account(3, "Sankalp", 25000), new Account(4, "Tejas", 27000), new Account(5, "Amogh", 20000));
		System.out.println("Minimum balance: ");
		asList.stream().min(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);

		System.out.println("Maximum balance: ");
		asList.stream().max(Comparator.comparing(Account::getBalance)).ifPresent(System.out::println);

		System.out.println("Name which has more than 6 char: ");
		List<Account> collect = asList.stream().filter(name -> name.getName().length() > 6)
				.collect(Collectors.toList());
		System.out.println(collect);

//		total balance of all acount:
		int totalBal = 0;
		for (Account x : asList) {
			totalBal += x.getBalance();
		}
		System.out.println("total balance of all acounts: " + totalBal);
	}

}
