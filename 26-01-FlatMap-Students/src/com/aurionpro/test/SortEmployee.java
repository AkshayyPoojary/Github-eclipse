package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1001, "Jack", 80000, "HR"),
				new Employee(1002, "Monkey D Luffy", 180000, "Ceo"),
				new Employee(1003, "Zoro Roronova", 45000, "Employee"),
				new Employee(1004, "Trafalgar D Law", 65000, "IT"), new Employee(1005, "Brook", 75000, "HR"),
				new Employee(1006, "God Usopp", 20000, "Staff"));

//     this won't print  all the object

//		List<Double> salary = empList.stream().map(n->n.getSalary()).sorted().collect(Collectors.toList());
//		System.out.println(salary);

//		List<String> dep = empList.stream().map(n->n.getDepartment()).sorted().collect(Collectors.toList());
//		System.out.println(dep);

//------------------------------------------------------------------------------------------------------------		

//	     This will print all the object

		List<Employee> empSalary = empList.parallelStream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		// parallelStream is used when we have a huge list
		// parallelStream will not make any difference here
		System.out.println(empSalary);

		List<Employee> empDepartment = empList.stream().sorted(Comparator.comparing(Employee::getDepartment))
				.collect(Collectors.toList());
		
		System.out.println(empDepartment);
		
		List<Employee> empDepName = empList.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println(empDepName);
	}
}
