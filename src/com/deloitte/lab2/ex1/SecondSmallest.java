package com.deloitte.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int number = scan1.nextInt();
        int array1[] = new int[number];
        System.out.println("\nEnter Array Elements: ");

        for (int i = 0; i < array1.length; i++) { // Use `<` for loop condition
            array1[i] = scan1.nextInt();
        }

        getSecondSmallest(array1); // Call the function
    }

    public static void getSecondSmallest(int array1[]) {
        if (array1.length == 1 || array1 == null) {
            System.out.println("Array Size is 1 so no Second Smallest element");
        } else {
            Arrays.sort(array1); // Sort the array
            System.out.println("Second Smallest element is : " + array1[1]); // Access element at index 1
        }
    }
}