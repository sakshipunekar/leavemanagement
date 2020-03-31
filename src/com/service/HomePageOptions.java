package com.service;

import java.util.Arrays;
import java.util.List;

import com.entity.Employee;
import com.util.Role;

public class HomePageOptions {

	 private static final String APPLYLEAVE = "Apply Leave";
	    private static final String CHECKLEAVE = "Check Leave";
	    private static final String UPDATELEAVE = "Update Leave";
	    private static final String CANCELLEAVE = "Cancel Leave";
	    private static final String CHECKALLLEAVE = "Approve Employee Leave";
	    private static final String CHANGEPOLICY = "Change Leave Policy";

	    private static final List<String> HR_OPTIONS = Arrays.asList(APPLYLEAVE, UPDATELEAVE, CANCELLEAVE,CHECKLEAVE, CHANGEPOLICY);
	    private static final List<String> SUPERVISOR_OPTIONS = Arrays.asList(APPLYLEAVE, UPDATELEAVE, CANCELLEAVE,CHECKLEAVE,CHECKALLLEAVE);
	    private static final List<String> EMPLOYEE_OPTIONS = Arrays.asList(APPLYLEAVE, UPDATELEAVE, CANCELLEAVE,CHECKLEAVE);
	    private static final List<String> HR_SUPERVISOR_OPTIONS = Arrays.asList(APPLYLEAVE, UPDATELEAVE, CANCELLEAVE,CHECKLEAVE,CHANGEPOLICY, CHECKALLLEAVE);

	    public List<String> options(Employee employee) {
	        if (employee.getRoles().containsAll(Arrays.asList(Role.HR, Role.SUPERVISOR))) {
	            return HR_SUPERVISOR_OPTIONS;
	        } else if (employee.getRoles().contains(Role.HR)) {
	            return HR_OPTIONS;
	        } else if (employee.getRoles().contains(Role.SUPERVISOR)) {
	            return SUPERVISOR_OPTIONS;
	        } else {
	            return EMPLOYEE_OPTIONS;
	        }
	    }
}
