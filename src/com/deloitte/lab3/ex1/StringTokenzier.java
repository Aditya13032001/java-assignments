package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenzier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of integers: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number); 
            sum += number; 

        System.out.println("Sum of all integers: " + sum);
    }
}
}