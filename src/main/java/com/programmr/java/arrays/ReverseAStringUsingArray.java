package com.programmr.java.arrays;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ReverseAStringUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(str);
        String newStr = stringBuilder.reverse().toString();
        System.out.println(newStr);
    }
}
