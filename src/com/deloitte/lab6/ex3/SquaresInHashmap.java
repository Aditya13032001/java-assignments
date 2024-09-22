package com.deloitte.lab6.ex3;

import java.util.*;

public class SquaresInHashmap {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter number of Elements: ");
		int n = scan1.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter Array Elements: ");

		for (int i = 0; i < n; i++) {
			arr1[i] = scan1.nextInt();
		}

		Map<Integer, Integer> squareMap = getSquares(arr1);
		System.out.println("-----Squares-----");
		squareMap.forEach((key, value) -> System.out.println(key + " squared is: " + value));
	}

	public static Map<Integer, Integer> getSquares(int[] arr1) {
		Map<Integer, Integer> squareMap = new HashMap<>();

		for (int a1 : arr1) {
			squareMap.put(a1, a1 * a1);
		}
		return squareMap;
	}
}
