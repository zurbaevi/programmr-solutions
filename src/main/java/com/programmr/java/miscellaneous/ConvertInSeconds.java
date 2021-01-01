package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ConvertInSeconds {
    public static void main(String[] args) {
        int hours = 0, minutes = 0, seconds = 0, number_of_seconds = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Hours:");
        hours = scan.nextInt();
        number_of_seconds += hours * 3600;
        System.out.println("Enter number of Minuts:");
        minutes = scan.nextInt();
        number_of_seconds += minutes * 60;
        System.out.println("Enter number of Seconds:");
        seconds = scan.nextInt();
        number_of_seconds += seconds;
        System.out.println("Total number of seconds :");
        System.out.println(number_of_seconds);
    }
}
