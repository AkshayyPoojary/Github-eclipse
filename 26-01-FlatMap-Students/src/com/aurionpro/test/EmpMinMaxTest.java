package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Employee;

public class EmpMinMaxTest {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1001, "Jack", 80000, "HR"),
				new Employee(1002, "Monkey D Luffy", 180000, "Ceo"),
				new Employee(1003, "Zoro Roronova", 45000, "Employee"),
				new Employee(1004, "Trafalgar D Law", 65000, "IT"), new Employee(1005, "Brook", 75000, "HR"),
				new Employee(1006, "God Usopp", 20000, "Staff"));
		
//		ifPresent(System.out::println) returns the value after condition applied
		// findAny
		//findFirst
		System.out.print("Max salary: ");
		empList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println); 
		System.out.print("Min salary: ");
		empList.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		Optional<Employee> min = empList.stream().min(Comparator.comparing(Employee::getSalary));
		if(min.isPresent()) {
			System.out.println(min);
		}
		
		
	}
}
