package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class SumOf5Integers {
    public static void main(String[] args) {
        int total = 0;
        int number;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            number = scan.nextInt();
            total += number;
        }
        System.out.println("Total is:" + total);
    }
}
