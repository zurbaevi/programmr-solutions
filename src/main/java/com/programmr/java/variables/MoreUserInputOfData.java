package com.programmr.java.variables;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!:");

        System.out.print("First name: ");
        String fn = scanner.next();
        System.out.print("Last name: ");
        String ln = scanner.next();
        System.out.print("Grade (9-12): ");
        int grade = scanner.nextInt();
        while (grade < 9 || grade > 12) {
            System.out.println("Invalid Grade");
            System.out.println("Grade (9-12): ");
            grade = scanner.nextInt();
        }
        System.out.print("Student ID: ");
        String id = scanner.next();
        System.out.print("Login: ");
        String login = scanner.next();
        System.out.print("GPA (0.0-4.0): ");
        double gpa = scanner.nextDouble();

        System.out.println("Login: " + login);
        System.out.println("ID: " + id);
        System.out.println("Name: " + ln + "; " + fn);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
}
