package com.programmr.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String input = sc.next();
        if (input.toLowerCase().equals("admin")) {
            System.out.println("Username accepted");
        } else {
            System.out.println("Invalid username");
        }
    }
}
