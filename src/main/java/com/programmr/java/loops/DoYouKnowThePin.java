package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class DoYouKnowThePin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 12345;
        for (int i = 1; i < 3; i++) {
            int userInput = scanner.nextInt();
            if (userInput == pin) {
                System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT. \n");
            } else {
                System.out.println("INCORRECT PIN. TRY AGAIN. ");
            }
        }
        System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}
