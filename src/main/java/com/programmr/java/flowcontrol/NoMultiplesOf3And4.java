package com.programmr.java.flowcontrol;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class NoMultiplesOf3And4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
            if (i % 3 != 0 && i % 4 != 0) {
                System.out.println(i);
            }
        }
    }
}
