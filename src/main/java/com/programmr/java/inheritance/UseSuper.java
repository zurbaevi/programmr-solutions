package com.programmr.java.inheritance;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class UseSuper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of apples:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number of bananas:");
        int num2 = scanner.nextInt();
        Banana obj = new Banana(num1, num2);
        obj.show();
    }

    static class Apple {
        int number_of_items;

        Apple(int number_of_items) {
            this.number_of_items = number_of_items;
        }
    }

    static class Banana extends Apple {
        int number_of_items;

        public Banana(int num1, int num2) {
            super(num1);
            number_of_items = num2;
        }

        void show() {
            System.out.println("Number of bananas: " + super.number_of_items);
            System.out.println("Number of bananas: " + number_of_items);
        }
    }
}
