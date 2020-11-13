package com.programmr.java.exceptionhandling;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class SlopePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Point point = new Point(x, y);
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(point.slope(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Zero is an invalid denominator. Please try again.");
        }
    }
}


class Point {
    private int x;
    private int y;

    public Point(int num1, int num2) {
        x = num1;
        y = num2;
    }

    public int slope(int num3, int num4) throws ArithmeticException {
        int numerator = num4 - y;
        int denominator = num3 - x;
        int slope = (numerator) / (denominator);
        return Math.abs(slope);
    }
}
