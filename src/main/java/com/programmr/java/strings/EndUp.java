package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class EndUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = scanner.next();
        char[] c = s.toCharArray();
        if (s.length() < 3) {
            System.out.println(s.toUpperCase());
        }
        for (int i = c.length - 1; i > 8; i--) {
            c[i] = Character.toUpperCase(c[i]);
        }
        System.out.println(String.valueOf(c));
    }
}
