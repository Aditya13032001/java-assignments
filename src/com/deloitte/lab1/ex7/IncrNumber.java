package com.deloitte.lab1.ex7;

import java.util.*;

public class IncrNumber {
	public static void main(String args[]) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n=s1.nextInt();
		
//		call checNumber and store value
		boolean result=checkNumber(n);
		System.out.print(result);
		
	}

	public static boolean checkNumber(int number) {

		int lastNumber=9;
		
		while(number>0){
			int currentDigit=number%10;
			if(currentDigit>lastNumber) {
				return false;
			}
			lastNumber=currentDigit;
			number/=10;
		}
		
		return true;

	}

}