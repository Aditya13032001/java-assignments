package com.deloitte.lab9.ex2;

import java.util.Scanner;
import java.util.function.Function;

public class SpaceInChar {
	public static String formatString(String input) {
		Function<String, String> formatter = str -> str.chars().mapToObj(c -> String.valueOf(Character.toChars(c)))
				.reduce("", (acc, character) -> acc + character + " ");
		return formatter.apply(input).trim();
	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter A String: ");
		String input = scan1.nextLine();
		String formattedString = formatString(input);
		System.out.println("Formatted String: " + formattedString);
	}
}