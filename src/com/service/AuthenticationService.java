package com.service;

import com.repository.*;

public class AuthenticationService {

	UserRepository repository = new UserRepository();

    public Boolean authenticate(Integer userId, String password) {
        
    	Boolean passwordcheck = Boolean.FALSE;
    	
    	if(repository.employeePresent(userId).equals(password))
    	{
    		passwordcheck = Boolean.TRUE;
    	}
    	return passwordcheck;
    }

}
