package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 2) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int recursiveResult = fibonacciRecursive(n);
        int iterativeResult = fibonacciIterative(n);

        System.out.println("Recursive result: " + recursiveResult);
        System.out.println("Iterative result: " + iterativeResult);
    }
}