package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class SwitchCase {
    public static void main(String[] args) {
        String choice = "";
        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int entered_number = scanner.nextInt();
        switch (entered_number) {
            case 1: choice = "one"; break;
            case 2: choice = "two"; break;
            case 3: choice = "three"; break;
            default: choice = "unknown";
        }
        System.out.println("Your choice was:\n" + choice);
    }
}
