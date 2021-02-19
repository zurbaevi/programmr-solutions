package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ArithmeticDemonstration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
