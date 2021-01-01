package com.programmr.java.flowcontrol;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class RightOrWrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is 12+12?");
        int userInput = scanner.nextInt();
        if (userInput == 24) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
