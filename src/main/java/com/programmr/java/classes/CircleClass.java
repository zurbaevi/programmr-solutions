package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class CircleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double rad = scanner.nextDouble();
        System.out.println("Enter color:");
        String col = scanner.next();
        MyCircle mc = new MyCircle(rad, col);
        System.out.println(mc.getArea());
        System.out.println(mc.color);
    }
}

class MyCircle {
    double rad;
    String color;

    public MyCircle(double rad, String color) {
        this.rad = rad;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * (rad * rad);
    }
}
