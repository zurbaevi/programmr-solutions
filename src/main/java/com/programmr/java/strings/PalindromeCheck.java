package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                check = false;
                break;
            }
            check = true;
        }
        System.out.println(check ? "Entered string is a palindrome." : "Entered string is not a palindrome." );
    }
}
