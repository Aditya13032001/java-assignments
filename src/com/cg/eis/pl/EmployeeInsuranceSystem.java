package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceSystem {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();

        Employee employee = service.getEmployeeDetailsFromUser();
        String scheme = service.findInsuranceScheme(employee);
        employee.setInsuranceScheme(scheme);

        service.displayEmployeeDetails(employee);
    }
}