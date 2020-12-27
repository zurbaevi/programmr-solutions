package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class FirstTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            if (i == 1) break;
        }
    }
}
