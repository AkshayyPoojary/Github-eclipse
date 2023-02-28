package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(101, "Sneha", Arrays.asList("Playing Guitar")),
				new Student(102, "Akshay", Arrays.asList("Reading")),
				new Student(103, "Rahul", Arrays.asList("Boxing")));
//		System.out.println(students);

		// to get Hobbies of every students with condition
		List<String> listOfHobbies = students.stream().flatMap(s -> s.getHobbies().stream())
				.filter(n -> n.endsWith("ing")).distinct().collect(Collectors.toList());

		// to get name of every students using(map)
		List<String> collect = students.stream().map(stu -> stu.getName()).distinct().collect(Collectors.toList());

		// to get name of every students using(map) nd then using flatMap
		List<String> collect2 = students.stream().map(m -> m.getHobbies()).flatMap(li -> li.stream()).distinct()
				.collect(Collectors.toList());
		System.out.println("List of all students name: " + collect + "  and their hobbies:  " + collect2);
		System.out.println("List of all students hobbies which ends with 'ing': " + listOfHobbies);
	}
}
