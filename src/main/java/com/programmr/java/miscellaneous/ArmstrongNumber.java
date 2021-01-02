package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0, a, temp;
        int n = scanner.nextInt();
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.print("Number is a Armstrong number");
        else
            System.out.print("Number is not a Armstrong number");
    }
}