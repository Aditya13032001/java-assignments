package com.deloitte.lab1.ex5;
import java.util.*;

public class Divisibleby {
	 public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
		 
		 System.out.print("Enter The value of n: ");
		 int n=s1.nextInt();
		 
		 
		 int result =calculateSum(n);
		 System.out.println(result);
	 }
	 
	 
	 public static int calculateSum(int n) {
		 int sum=0;
		 for(int i=0;i<=n;i++) {
			 if(i%3==0 || i%5==0) {
				 sum+=i;
			 }
			 
		 }
		return sum;
		 	
	 }
}
