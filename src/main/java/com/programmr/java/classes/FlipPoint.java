package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class FlipPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinate:");
        int num1 = scanner.nextInt();
        System.out.println("Enter y coordinate:");
        int num2 = scanner.nextInt();
        Point point = new Point(num1, num2);
        point.flip();
    }
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void flip() {
            System.out.println("x coordinate: " + y);
            System.out.println("y coordinate: " + x);
        }
    }
}


