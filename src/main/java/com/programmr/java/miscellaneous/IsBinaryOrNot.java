package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class IsBinaryOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        System.out.println(isBinary(sc.nextInt()) ? "Binary" : "Not Binary");
    }

    public static boolean isBinary(int number) {
        int copyOfInput = number;
        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }
}
