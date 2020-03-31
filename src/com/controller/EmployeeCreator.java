package com.controller;

import java.util.Arrays;

import com.entity.Employee;
import com.util.Role;

public class EmployeeCreator {

    public Employee createEmployee(Integer id) {
    	
        return new Employee(id, "XXX", Arrays.asList(Role.EMPLOYEE), null);
    }

    public boolean isSupervisor(Employee employee) {
        return employee.getRoles().contains(Role.SUPERVISOR);
    }
}
