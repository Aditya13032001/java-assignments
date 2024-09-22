package com.deloitte.lab6.ex2;

import java.util.*;

public class CountCharacters {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some Characters: ");
		String ch = scan1.nextLine();
		char[] charArray = ch.toCharArray();
		Map<Character, Integer> charCounts = countChars(charArray);
		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static Map<Character, Integer> countChars(char[] charArray) {
		Map<Character, Integer> characterCountMap = new HashMap<>();

		for (char c : charArray) {
			characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
		}

		return characterCountMap;
	}
}
