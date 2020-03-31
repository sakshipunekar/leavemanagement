package com.view;

import java.util.Scanner;

public class LeaveTypeViewPage {

	public Integer leaveTypeOption() {
		Scanner leavechoice = new Scanner(System.in);
		
		System.out.println("Enter type of leave: /n1.casual leave /n2.sick leave /n3.earned leave /n4.unpaid leave");
		return leavechoice.nextInt();
	}
}
