package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        System.out.println("The Maximum No is:\n" + Math.max(number1, number2));
    }
}
