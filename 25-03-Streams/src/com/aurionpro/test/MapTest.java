package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Accounts;

public class MapTest {
	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10, 25, 45, 20, 30, 40, 50);

//		.map(n->n*n) this means it will take individual value in n

// Square all the numbers of list
		List<Integer> listNum = num.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(listNum);

// Square only even numbers 
		List<Integer> numLi = num.stream().filter(n -> (n % 2 == 0)).map(n -> n * n).collect(Collectors.toList());
		System.out.println(numLi);
// Change to Upper-Case of all string values
		List<String> li = Arrays.asList("Tushar", "Ajay", "Ravi", "Vishnu");
		List<String> collect2 = li.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);

// Add 6% interest to every employees balance		
		List<Accounts> accListDetails = Arrays.asList(new Accounts(1001, "Akshay", 15000),
				new Accounts(1002, "Aditya", 20000), new Accounts(1003, "Ashwini", 10000),
				new Accounts(1004, "Abhishek", 8000), new Accounts(1005, "Mohan", 12000));
		List<Accounts> collect4 = accListDetails.stream()
				.map(n -> new Accounts(n.getAccountnumber(), n.getName(), n.getBalnace() * 1.06))
				.collect(Collectors.toList());
		System.out.println("After Adding 6% on every employees pay: " + collect4);

// print specific accNumber i.e 1002 
		 List<Accounts> collect3 = accListDetails.stream().filter(n->n.getAccountnumber()==1002).collect(Collectors.toList());
		 System.out.println("acc "+collect3);
	}

}
