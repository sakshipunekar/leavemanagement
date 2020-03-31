package com.service;

import com.view.LeaveInfoObjectCreater;

public interface Leave {

	public void applyLeave(LeaveInfoObjectCreater leaveobject);
	public void updateLeave();
	public void cancelLeave();
	
}