package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private Scanner scanner;

    public EmployeeServiceImpl() {
        scanner = new Scanner(System.in);
    }

    @Override
    public Employee getEmployeeDetailsFromUser() {
        System.out.println("Enter Employee Details: ");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        return new Employee(id, name, salary, designation, null); // Insurance scheme set later
    }

    @Override
    public String findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        if (salary > 50000 && designation.equalsIgnoreCase("manager")) {
            return "Scheme A";
        } else if (salary > 30000 && (designation.equalsIgnoreCase("programmer") || designation.equalsIgnoreCase("analyst"))) {
            return "Scheme B";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee.toString());
    }
}