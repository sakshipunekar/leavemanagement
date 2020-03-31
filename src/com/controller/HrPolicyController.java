package com.controller;

import com.service.ChangeHrPolicy;

public class HrPolicyController {

	ChangeHrPolicy change = new ChangeHrPolicy();
	public void hrChanges(Integer hrinput) {
		
		if(hrinput==1){
			change.casualLeavePolicy();
		}
		
		if(hrinput==2){
			change.sickLeavePolicy();
		}
		
		if(hrinput==3){
			change.earnedLeavePolicy();
		}
		
		if(hrinput==3){
			change.paidLeavePolicy();
		}

	}
}
