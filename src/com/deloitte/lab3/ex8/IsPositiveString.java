package com.deloitte.lab3.ex8;

import java.util.*;

public class IsPositiveString {

	public static boolean isPositiveString(String str) {
		if (str.isEmpty()) {
			System.out.println("Enter a String");
		}

		char prevChar = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar <= prevChar) {
				return false;
			}
			prevChar = currentChar;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter A String to Check: ");
		String str1 = scan1.nextLine();

		System.out.println(str1 + " is positive: " + isPositiveString(str1));

	}
}
