package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

    public Employee getEmployeeDetailsFromUser();

    public String findInsuranceScheme(Employee employee);

    public void displayEmployeeDetails(Employee employee);
}