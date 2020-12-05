package com.programmr.java.methods;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class SquareRootOfANumber {
    public static void calculateSquare(double number) {
        System.out.println("The square root is: " + Math.round(Math.sqrt(number)));
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        calculateSquare(number);
    }
}
