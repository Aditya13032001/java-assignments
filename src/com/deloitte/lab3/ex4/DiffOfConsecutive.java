package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class DiffOfConsecutive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		String strNum = Integer.toString(num);
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i < strNum.length(); i++) {
			int diff = Math
					.abs(Character.getNumericValue(strNum.charAt(i)) - Character.getNumericValue(strNum.charAt(i - 1)));
			sb.append(diff);
		}

		int result = Integer.parseInt(sb.toString());
		System.out.println("Modified number: " + result);
	}
}