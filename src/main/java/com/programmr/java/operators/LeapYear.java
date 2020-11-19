package com.programmr.java.operators;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked: ");
        int year = scanner.nextInt();
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else
                leap = true;
        } else
            leap = false;
        System.out.println(leap);
    }
}
