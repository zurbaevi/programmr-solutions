package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        for (int i = 0; i < max; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of Odd no. is: " + sum);
    }
}
