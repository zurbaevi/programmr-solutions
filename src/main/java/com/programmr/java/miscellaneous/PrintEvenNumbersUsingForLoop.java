package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class PrintEvenNumbersUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
