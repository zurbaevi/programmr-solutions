package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class DecodeURL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL :");
        String s = sc.nextLine();
        s = decodeURL(s);
        System.out.print("Decoded URL is :" + s);
    }

    private static String decodeURL(String s) {
        if (s.contains("%20")) {
            return s.replace("%20", " ");
        } else if (s.contains("%3A")) {
            return s.replace("%3A", "?");
        } else {
            return s.replace("%3D", ".");
        }
    }
}
