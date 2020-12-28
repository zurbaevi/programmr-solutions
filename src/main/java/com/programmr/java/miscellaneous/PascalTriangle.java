package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int i, k, number = 1, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Pascals : ");
        int input = scan.nextInt();
        System.out.print("_");
        for (i = 0; i < input; i++) {
            for (k = input; k > i; k--) {
                System.out.print(" ");
            }
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + "_");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
