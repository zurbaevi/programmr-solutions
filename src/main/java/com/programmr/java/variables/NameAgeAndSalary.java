package com.programmr.java.variables;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hi " + userName + "! How old are you?");
        int userAge = scanner.nextInt();
        System.out.println(" So you're " + userAge + " eh? That's not old at all! ");
        System.out.println("How much do you make " + userName + "?");
        float userPrice = scanner.nextInt();
        System.out.println(userPrice + "! I hope that's per hour and not per year! LOL!");
    }
}
