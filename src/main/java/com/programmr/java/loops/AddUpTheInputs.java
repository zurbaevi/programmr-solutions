package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class AddUpTheInputs {
    public static void main(String[] args){
        int n,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        n = scanner.nextInt();
        while (n != 0) {
            sum += n;
            n = scanner.nextInt();
        }
        System.out.println("The total is:"+sum);
    }
}
