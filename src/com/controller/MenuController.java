package com.controller;

import com.service.*;
import com.view.*;

public class MenuController {

	LeaveTypeViewPage leaveTypepage = new LeaveTypeViewPage();
	LeaveTypeController passchoice = new LeaveTypeController();
	 Leave status;
	public void menuOptions(Integer input)
	{
		
		if(input==1){
			System.out.println("APPLY LEAVE");
			passchoice.leavechoice(leaveTypepage.leaveTypeOption()); 
		}
		
		else if(input==2) {
			//status.updateLeave();
			System.out.println("leave update");
		}
			
		else if(input==3) {
			//status.cancelLeave();
			System.out.println("leave cancel");
		}
		else {
			//checkLeave();
			System.out.println("leave check");
		}
		
		
	}
}
