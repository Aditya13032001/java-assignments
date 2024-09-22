package com.deloitte.lab9.ex4;


class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeDemo {
    public static Employee createEmployee(String name, int salary) {
        return new Employee(name, salary);
    }

    public static void main(String[] args) {
        Employee employee = EmployeeDemo::createEmployee; // Method reference to createEmployee
        employee.setName("John Doe");
        employee.setSalary(50000);
        System.out.println(employee);
    }
}