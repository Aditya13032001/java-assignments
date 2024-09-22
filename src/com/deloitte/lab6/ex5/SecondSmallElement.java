
package com.deloitte.lab6.ex5;

import java.util.*;

public class SecondSmallElement {

	public static int findSecondSmallest(int[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements.");
		}

		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = null;

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int secondSmallest = findSecondSmallest(arr);
		System.out.println("Second smallest element: " + secondSmallest);
	}
}