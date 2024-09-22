package com.deloitte.lab3.ex3;

import java.util.*;

public class ReplaceToConsonant {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter A String to Check: ");
		String str1=scan1.nextLine();
		
		System.out.println("Original String: ");
		System.out.println(str1);
		System.out.println("Altered String: ");
		System.out.println(alterString(str1));
	}

	private static String alterString(String str1) {
		char [] charArray=str1.toCharArray();
		for(int i=0;i<charArray.length;i++) {
				char currenChar=charArray[i];
				
				if(Character.isLetter(currenChar)&& !isVowel(currenChar)) {
					charArray[i]=(char)(currenChar+1);
				}
		}
		return new String(charArray);
	}

	private static boolean isVowel(char c) {
		c=Character.toLowerCase(c);
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}

}
