package com.programmr.java.operators;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        System.out.println("The result of adding is " + (a + b));
        System.out.println("The result of subtracting is " + (a - b));
        System.out.println("The result of multiplying is " + (a * b));
        System.out.println("The result of dividing is " + (a / b));
    }
}
