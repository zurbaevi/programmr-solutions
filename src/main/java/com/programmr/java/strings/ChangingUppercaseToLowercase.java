package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ChangingUppercaseToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Uppercase letter:");
        String userInput = scanner.nextLine();
        System.out.println(userInput.toLowerCase());
    }
}
