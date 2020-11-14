package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class DateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        Date d = new Date(day, month, year);
        d.DisplayDate();
    }
}

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void DisplayDate() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }
}