package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AddTheStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String total = "";
        total = scanner.next();
        total += scanner.next();
        total += scanner.next();
        System.out.println(total);
    }
}
