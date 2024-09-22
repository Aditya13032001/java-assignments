package com.deloitte.lab1.ex8;
import java.util.*;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter a Number To Check: ");
		int number = scan1.nextInt();

//		call isPowerOfTwo and store value
		boolean result = isPowerOfTwo(number);
		System.out.print(result);

	}

	public static boolean isPowerOfTwo(int number) {

		if (number==0)
			return false;
		
		if(number>1 && number%2==0) {
			number=number/2;
			return true;
		}else {
			return false;
		}
	}
}
