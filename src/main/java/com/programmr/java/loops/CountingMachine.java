package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class CountingMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count to: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
