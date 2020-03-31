package com.controller;

import java.util.List;

import com.entity.Employee;
import com.service.HomePageOptions;

public class HomepageController {


	public List<String> showOptions(Employee employee) {
        
		HomePageOptions pageoption = new HomePageOptions();
    	return pageoption.options(employee);
    }

}
