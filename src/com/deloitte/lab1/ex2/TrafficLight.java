package com.deloitte.lab1.ex2;

import java.util.*;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		// Take Input
		System.out.println("****Traffic Simulator****");
		System.out.println("1) Red");
		System.out.println("2) Yellow");
		System.out.println("3) Green\n");
		System.out.print("Choose YOur Light: ");

		int choice = s1.nextInt();

		switch (choice) {
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("Invalid Number Please enter 1 , 2 or 3");
			
		}
	}

}
