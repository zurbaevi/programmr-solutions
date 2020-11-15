package com.programmr.java.variables;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
