package com.view;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeaveInfoViewPage {

		public LeaveInfoObjectCreater takeLeaveInfo() {
		
			Scanner takeinfo = new Scanner(System.in);
		
		System.out.println("Enter date in YYYY-MM-DD");
		System.out.println("enter start date:");
		String startdate = takeinfo.next();
		System.out.println("enter end date:");
		String enddate = takeinfo.next();
		System.out.println("reason for taking leave:");
		String reason = takeinfo.next();
		
		LocalDate leavestartdate = LocalDate.parse(startdate);
		LocalDate leaveenddate = LocalDate.parse(enddate);
		
		int numberofdays = (int) ChronoUnit.DAYS.between(leavestartdate, leaveenddate);
		numberofdays++;
		
		
		return new LeaveInfoObjectCreater(startdate,enddate,reason,numberofdays);
	}
	
	}
