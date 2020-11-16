package com.programmr.java.variables;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input number:");
        int num = scanner.nextInt();
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Input number is a prime number");
        else
            System.out.println("Input number is not a prime number");
    }
}
