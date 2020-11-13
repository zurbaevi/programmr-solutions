package com.programmr.java.exceptionhandling;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AskForCertainNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("correct");
        } else {
            System.out.println("wrong");
        }
    }
}
