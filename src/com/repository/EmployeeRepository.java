package com.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.entity.Employee;
import com.util.Role;

public class EmployeeRepository {

    private static Map<Integer, Employee> employeeMap = new HashMap<>();

    static {
        Employee fourth = new Employee(104, "Darshan", Arrays.asList(Role.EMPLOYEE, Role.HR, Role.SUPERVISOR), null);
        Employee first = new Employee(101, "Abhijeet", Arrays.asList(Role.EMPLOYEE, Role.HR), fourth);
        Employee third = new Employee(103, "Sakshi", Arrays.asList(Role.EMPLOYEE, Role.SUPERVISOR), fourth);
        Employee second = new Employee(102, "Akshay", Arrays.asList(Role.EMPLOYEE), third);

        employeeMap.put(first.getId(), first);
        employeeMap.put(second.getId(), second);
        employeeMap.put(third.getId(), third);
        employeeMap.put(fourth.getId(), fourth);
    }

    public Employee getEmployee(Integer empId) {
        return employeeMap.getOrDefault(empId, null);
    }

//    public Boolean contains(Integer employeeId) {
//        return employeeMap.containsKey(employeeId);
//    }

}
