package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class SubstringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:");
        String s = sc.nextLine();
        System.out.print("Enter second string:");
        String sub = sc.next();
        if (s.substring(2).equals(sub)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
