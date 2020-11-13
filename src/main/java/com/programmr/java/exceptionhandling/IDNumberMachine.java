package com.programmr.java.exceptionhandling;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class IDNumberMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int num;

        System.out.println("Enter the ID number:");
        input = scanner.next();
        try {
            if (input.length() == 10) {
                num = Integer.parseInt(input);
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        } catch (Exception e) {
            System.out.println("incorrect");
        }
    }
}
