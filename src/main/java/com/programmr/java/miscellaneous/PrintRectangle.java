package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class PrintRectangle {
    public static void main(String[] args) throws Exception {
        int h, w;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length:");
        w = scan.nextInt();
        System.out.println("Enter the width:");
        h = scan.nextInt();
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 ||
                        j == 0 || j == w - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }
}
