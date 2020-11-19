package com.programmr.java.arithmetic;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AbsoluteEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        if (num1 < 0) num1 *= -1;
        if (num2 < 0) num1 *= -1;
        System.out.println("Result is:" + (num1 == num2));
    }
}
