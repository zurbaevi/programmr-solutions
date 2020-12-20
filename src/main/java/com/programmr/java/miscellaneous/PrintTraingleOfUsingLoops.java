package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class PrintTraingleOfUsingLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        System.out.println("Traingle is:");
        print_(size);
    }

    public static void print_(int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
