package com.view;

import java.util.Scanner;

import com.controller.HomepageController;
import com.controller.MenuController;
import com.controller.RoleController;
import com.entity.Employee;

public class HomePage {

    HomepageController controller = new HomepageController();
    Integer count = 1;
    RoleController role = new RoleController();
    
    public void showHomePage(Employee employee) {
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("Welcome " + employee.getName() + " " + employee.getRoles());
        
        controller.showOptions(employee).forEach(item -> System.out.println(count++  +item));
        
        System.out.println("select from the above options:");
        role.roleOption(input.nextInt(),employee);

    }
}
