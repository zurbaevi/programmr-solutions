package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class StringTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String str = "", strng = "";
        System.out.println("Enter a string:");
        str = scanner.nextLine();
        System.out.println("How many times?:");
        n = scanner.nextInt();
        strng = stringTimes(str, n);
        System.out.println("stringTimes:" + strng);
    }

    public static String stringTimes(String str, int n) {
        return String.valueOf(str).repeat(Math.max(0, n));
    }
}
