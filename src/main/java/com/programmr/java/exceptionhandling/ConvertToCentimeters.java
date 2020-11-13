package com.programmr.java.exceptionhandling;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ConvertToCentimeters {
    private static double height(int feet, int inches) {
        return (feet * 30.48) + (inches * 2.54); // 1 foot = 30.48 cm // 1 inch = 2.54 cm
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        try {
            System.out.println("Enter height in feet:");
            int feet = scanner.nextInt();
            System.out.println("and in inches:");
            if (feet < 0) {
                System.out.println("Please enter positive values only.");
            }
            int inches = scanner.nextInt();
            double result = height(feet, inches);
            System.out.println("Result:" + result + " cm");
            continueLoop = false;
        } catch (Exception e) {
            System.out.println("You must enter integers. Please try again.");
        }
    }
}
