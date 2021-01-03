package com.programmr.java.inheritance;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AreaOfACircleUsingInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = scanner.nextDouble();
        new AreaOfACircleUsingInheritance().method(radius);
    }

    public void method(double radius) {
        Circle myCircle = new Circle();
        myCircle.setRadius(radius);
        System.out.print(myCircle.getDisplayText());
    }

    public abstract class CircleShape {
        public double radius;

        public CircleShape() {
        }

        public CircleShape(double radius) {
            this.radius = radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String toString() {
            return "Radius " + radius;
        }

        abstract String getDisplayText();
    }

    public class Circle extends CircleShape {
        private double area;

        public double area() {
            return radius * radius * 3.14;
        }

        public String getDisplayText() {
            return "Radius " + radius + " and Area is " + area();
        }
    }
}
