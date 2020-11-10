package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class FindLengthOfTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        System.out.println("Length of the string is:" + userInput.length());
    }
}
