package com.aurionpro.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
	public static void main(String[] args) {

		String names = "C:\\Users\\LENOVO\\Desktop\\namesOfStudents.txt";
		try (Stream<String> lines = Files.lines(Paths.get(names))) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
