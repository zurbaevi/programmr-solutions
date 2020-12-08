package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class WhileLoopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        System.out.println("Numbers in descending order are:");
        while (size != 0) {
            System.out.println(size--);
        }
    }
}
