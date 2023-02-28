package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Accounts;

public class AccountTest {
	public static void main(String[] args) {
		List<Accounts> listDetails = Arrays.asList(new Accounts(1, "Akshay", 15000), new Accounts(1, "Akshay", 20000),
				new Accounts(1, "Akshay", 10000), new Accounts(1, "Akshay", 8000), new Accounts(1, "Akshay", 12000));
		System.out.println("All the Account detail: " + listDetails);

		System.out.println();
// Give the employee detail of those who earns MORE than 10,000
		List<Accounts> collect = listDetails.stream().filter(n -> n.getBalnace() >= 10000).collect(Collectors.toList());
		System.out.print("Employee which earns more than 10k:  " + collect);

// Give the employee detail of those who earns LESS than 10,000  ......(using forEach-loop)
		listDetails.stream().filter(n -> n.getBalnace() <= 10000).forEach(System.out::println);

	}
}
