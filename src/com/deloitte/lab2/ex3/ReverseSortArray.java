package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class ReverseSortArray {
	 public static int[] reverseSort(int[] arr) {
	        // Convert numbers to strings to reverse them
	        String[] strArr = new String[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            strArr[i] = String.valueOf(arr[i]);
	        }

	        // Reverse the strings
	        for (int i = 0; i < strArr.length / 2; i++) {
	            String temp = strArr[i];
	            strArr[i] = strArr[strArr.length - 1 - i];
	            strArr[strArr.length - 1 - i] = temp;
	        }

	        // Convert strings back to integers 
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = Integer.parseInt(strArr[i]);
	        }

	        // Sort the array
	        Arrays.sort(arr);

	        return arr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {123, 456, 789, 987, 654, 321};
	        int[] result = reverseSort(arr);
	        System.out.println(Arrays.toString(result));
	    }
}
