package com.controller;

import com.entity.Employee;
import com.service.AuthenticationService;
import com.service.EmployeeService;

public class LoginController {

    AuthenticationService service = new AuthenticationService();
    EmployeeService employeeService = new EmployeeService();

//    private Boolean userExists(Integer userId) {
//        return employeeService.employeeExists(userId);
//    }

    public Employee authenticate(Integer userId, String password) {
        if (/*userExists(userId) &&*/ service.authenticate(userId, password)) {
            return employeeService.getEmployee(userId);
        }
        return null;
    }
}
