package com.view;

import java.util.Scanner;

import com.controller.HrPolicyController;

public class HrChangePolicyView {

	HrPolicyController hrpolicy = new HrPolicyController();
	public void hrChangeInput()
	{
		Scanner hrinput = new Scanner(System.in);
		
		System.out.println("Change Policy: /n1.Casual Leave /n2.Sick Leave /n3.Earned Leave /n4.Paid Leave");
		hrpolicy.hrChanges(hrinput.nextInt());
	}
}
