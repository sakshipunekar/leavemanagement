package com.controller;

import com.service.*;
import com.view.LeaveInfoViewPage;

public class LeaveTypeController {

	LeaveInfoViewPage leaveinfo = new LeaveInfoViewPage();
	
	public void leavechoice(Integer choiceofleave) {
		
		if(choiceofleave==1) {
			Leave casualtype = new CasualLeave();
			casualtype.applyLeave(leaveinfo.takeLeaveInfo());
		}
		
		else if(choiceofleave==2) {
			Leave sicktype = new SickLeave();
			sicktype.applyLeave(leaveinfo.takeLeaveInfo());
		}
		
		else if(choiceofleave==3) {
			Leave earnedtype = new EarnedLeave();
			earnedtype.applyLeave(leaveinfo.takeLeaveInfo());
		}
		
		else if(choiceofleave==4) {
			Leave unpaidtype = new UnpaidLeave();
			unpaidtype.applyLeave(leaveinfo.takeLeaveInfo());
		}
		
		else {
			System.out.println("invalid output");
		}
	}
}
