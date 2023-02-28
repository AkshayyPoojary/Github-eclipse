package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class CreateStreamsTest {

	public static void main(String[] args) {
//		int[] num = { 1, 2, 4, 3, 5 };
//		for(int x: num) {
//			System.out.println(x);
//		}
//		Stream<int[]> obj = Stream.of(num);     //Stream.of(num) -> clt+1
		Stream<Integer> obj = Stream.of(10, 2, 30, 15);
		obj.forEach((n) -> System.out.println(n));
//		value of stream  will ome in n and each value which comes inside n will get print

		Stream<String> streamOfString = Stream.of("Akshay", "Mohan");
		streamOfString.forEach(System.out::println);

		System.out.println();
		List<String> players = Arrays.asList("Aditya", "Rahul", "Saurabh", "yash");
		List<String> playersUpper = Arrays.asList("Aditya", "Rahul", "Saurabh", "yash");
//		players.forEach(System.out::println);
		players.stream().forEach(System.out::println);
//		playersUpper.stream().forEach(System.out::println);
//		for (int i = 0; i < players.size(); i++) {
//			playersUpper.add(players.get(i).toUpperCase());
//		}
//		System.out.println(playersUpper);
		
		System.out.println();
		Stream<String> javaStream = Stream.generate(()->"Java").limit(5);
		javaStream.forEach(System.out::println);
		
		System.out.println();
		Stream<Integer> interateStream = Stream.iterate(100, n->n+10).limit(5);
		interateStream.forEach(System.out::println);
		
		
		// for single insertion
		Stream.Builder<String> builder = Stream.builder();
		
		System.out.println();
		Stream<String> build = builder.add("A").add("K").add("S").add("H").add("A").add("Y").build();
		build.forEach(System.out::println);
	}

}
