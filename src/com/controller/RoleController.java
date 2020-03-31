package com.controller;

import java.util.Arrays;
import java.util.List;

import com.entity.Employee;
import com.util.Role;

public class RoleController {

	MenuController menu = new MenuController();
	public void roleOption(Integer input, Employee employee) {
		
        if (employee.getRoles().containsAll(Arrays.asList(Role.HR, Role.SUPERVISOR))) {
            if(input>=1 && input<=4)
            {
            	menu.menuOptions(input);
            }
            else if(input==5){
            	//changepolicy();
            	System.out.println("change policy");
            }
            else if(input==6) {
            	System.out.println("approve leave");
            }
            else {
            	System.out.println("invalid input");
            }
        	
        } 
        
        else if (employee.getRoles().contains(Role.HR)) {
        	
        	if(input>=1 && input<=4)
            {
            	menu.menuOptions(input);
            }
            else if(input==5){
            	//changepolicy();
            	System.out.println("change policy");
            }
            else {
            	System.out.println("invalid input");
            }
        } 
        
        else if (employee.getRoles().contains(Role.SUPERVISOR)) {
        	if(input>=1 && input<=4)
            {
            	menu.menuOptions(input);
            }
            
            else if(input==5) {
            	System.out.println("approve leave");
            }
            else {
            	System.out.println("invalid input");
            }
        }
        
        else {
        	if(input>=1 && input<=4)
            {
            	menu.menuOptions(input);
            }
            
            else {
            	System.out.println("invalid input");
            }
        }
        
        
    }
}
