package com.programmr.java.methods;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ShareDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println(shareDigit(num1, num2));
    }

    public static boolean shareDigit(int a, int b) {
        int lefta = a / 10;
        int righta = a % 10;
        int leftb = b / 10;
        int rightb = b % 10;
        return lefta == leftb || lefta == rightb || righta == leftb || righta == rightb;
    }
}
