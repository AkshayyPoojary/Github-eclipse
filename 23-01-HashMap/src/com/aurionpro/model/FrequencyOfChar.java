package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character or name: ");
		String input = sc.nextLine();
		Map<Character, Integer> charCountMap = new HashMap<>();
		for(Character c:input.toLowerCase().toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				if(charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c)+1);
				}
				else {
					charCountMap.put(c, 1);
				}
			}
		}
		charCountMap.forEach((key,value)->System.out.println(key+" : "+value));
	}
}
