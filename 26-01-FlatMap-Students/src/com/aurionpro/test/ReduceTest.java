package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class ReduceTest {
	public static void main(String[] args) {
		List<Employee> empDetails = Arrays.asList(new Employee(11, "Ak", 35000, "Ceo"),
				new Employee(12, "Sn", 19000, "HR"), new Employee(13, "Mo", 20000, "Manager"),
				new Employee(14, "Sa", 19000, "HR"), new Employee(15, "Ad", 21000, "Inveter"));
		System.out.println(empDetails);
//		------------------------------------ using reduce method ------------------------------------
		Optional<Double> sum = empDetails.stream().map(Employee::getSalary).reduce((a, b) -> (a + b));
//		System.out.println(sum);
		System.out.println();
		if (sum.isPresent()) {
			System.out.println(sum);
		}
		System.out.println();
//		------------------------------------ Optional ------------------------------------
		/*
		 * if this is not under optional we will have to face nullPointerException error
		 * because if the condition is not satisfied it will throw null.
		 */

// ------------------------------------ using findFirst ------------------------------------
//		empDetails.stream().filter(emp->emp.getDepartment().matches("HR")).findFirst().ifPresent(System.out::println);
		// OR
		System.out.println("Using findFirst find HR from department: ");
		Optional<Employee> findFirstTest = empDetails.stream().filter(emp -> emp.getDepartment().matches("HR"))
				.findFirst();
		System.out.println(findFirstTest);

// ------------------------------------ using findAny ------------------------------------
		System.out.println();
		System.out.print("Using findAny: ");
		// do this if you don't want Optional at first
		// but if the condition is not satisfied it will throw null
		empDetails.stream().filter(emp -> emp.getDepartment().matches("HR")).findAny().ifPresent(System.out::println);
	}
}
