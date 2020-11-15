package com.programmr.java.variables;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class MultiplyAnyTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 0;
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        product = num1 * num2;
        System.out.println("The product of the two numbers is:" + product);
    }
}
