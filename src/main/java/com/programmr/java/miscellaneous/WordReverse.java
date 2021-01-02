package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class WordReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:\n");
        String s;
        s = input.nextLine();
        String rev = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        rev = stringBuilder.toString();
        System.out.println("Reverse:\n" + rev);
    }
}
