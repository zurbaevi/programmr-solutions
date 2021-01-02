package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be converted into binary: ");
        int n = scanner.nextInt();
        if (n <= 0) System.out.println("0");
        System.out.println(Integer.toBinaryString(n));
    }
}
