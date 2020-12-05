package com.programmr.java.methods;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ConvertUpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        String input;
        input = scanner.next();
        input = lowerCase(input);
        System.out.println(input);
    }

    public static String lowerCase(String x) {
        return x.toLowerCase();
    }
}
