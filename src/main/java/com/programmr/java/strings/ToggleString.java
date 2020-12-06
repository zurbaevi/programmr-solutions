package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        input = String.valueOf(chars);
        System.out.println(input);
    }
}
