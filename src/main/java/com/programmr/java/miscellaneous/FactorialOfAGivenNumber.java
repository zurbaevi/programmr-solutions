package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class FactorialOfAGivenNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Factorial is: " + foo(num));
    }

    private static int foo(int n) {
        if (n == 1) return 1;
        return (n * foo(n - 1));
    }
}
