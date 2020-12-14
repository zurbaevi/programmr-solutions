package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class Replacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        System.out.print("Enter the character to be replaced:");
        String c = sc.nextLine();
        System.out.print("Enter the substitute character:");
        String r = sc.nextLine();
        String newStr = s.replaceAll("[" + c + "]", r);
        System.out.println("Edited Word:" + newStr);
    }
}
