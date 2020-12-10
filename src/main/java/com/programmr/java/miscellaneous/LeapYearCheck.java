package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();
        System.out.println("Year is: ");
        if (checkLeapYear(year))
            System.out.println("Leap");
        else
            System.out.println("Not leap");
    }

    private static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
