package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        System.out.println(line.toUpperCase());
    }
}
