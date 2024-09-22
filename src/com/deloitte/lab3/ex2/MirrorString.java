package com.deloitte.lab3.ex2;

import java.util.*;

public class MirrorString {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1=scan1.nextLine();

		StringBuffer buffer=new StringBuffer(str1);
		
		buffer.reverse();
		
		System.out.println(str1+ " | " +buffer.toString());
		
	}
}
