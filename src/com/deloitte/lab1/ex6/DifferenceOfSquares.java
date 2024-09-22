package com.deloitte.lab1.ex6;
import java.util.*;

public class DifferenceOfSquares {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		 
		 System.out.print("Enter The value of n: ");
		 int n=s1.nextInt();
		 
		 
		 int result =calculateDifference(n);
		 System.out.println(result);

	}
	
	public static int calculateDifference(int n) {
		int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * 2;
            sum += i;
        }

        int squareOfSum = sum * sum;


        return squareOfSum - sumOfSquares;
		
	}

}
