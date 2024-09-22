package com.deloitte.lab5.ex3;

import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class EmployeeValidation {

	public static void main(String[] args) throws EmployeeException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Employee ID: ");
		int id = scan.nextInt();
		System.out.println("Enter Employee Salary: ");
		int salary = scan.nextInt();

		try {
			validateSalary(salary);
			System.out.println("\n---------Employee Details: -----------");
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Salary: INR " + salary);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close(); // Close the scanner resource
		}
	}

	public static void validateSalary(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary cannot be less than INR 3000.");
		}
	}
}