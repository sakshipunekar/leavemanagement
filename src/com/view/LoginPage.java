package com.view;

import java.util.Scanner;

import com.controller.LoginController;
import com.entity.Employee;

public class LoginPage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID ");
        int userId = scanner.nextInt();

        System.out.println("Enter Password ");
        String password = scanner.next();

        LoginController loginController = new LoginController();

        Employee user = loginController.authenticate(userId, password);
        if (user != null) {
            HomePage homepage = new HomePage();
            homepage.showHomePage(user);
        } else {
            System.out.println("UserID Or Password Invalid");
        }

        scanner.close();
    }
}
