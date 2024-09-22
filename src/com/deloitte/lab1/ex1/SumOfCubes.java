package com.deloitte.lab1.ex1;
import java.util.*;

public class SumOfCubes {

    public static int sumOfCubesOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage: Get user input
        System.out.print("Enter an n-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Calculate and display the sum of cubes of digits
        int sumOfCubes = sumOfCubesOfDigits(number);
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
    }
}