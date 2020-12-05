package com.programmr.java.methods;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class AreaOfACircle {
    public static void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double userInput = scanner.nextFloat();
        double result = Math.PI * (userInput * userInput);
        System.out.printf("Area of circle is: %.2f", result);
    }

    public static void main(String[] args) {
        getArea();
    }
}
