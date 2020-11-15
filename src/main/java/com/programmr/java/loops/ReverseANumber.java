package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt(), reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse is :" + reversed);
    }
}
