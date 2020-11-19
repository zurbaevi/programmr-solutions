package com.programmr.java.arrays;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class EvenNumbersOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checkEven = false;
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j : arr) {
            if (j % 2 == 1) {
                System.out.println(j);
                checkEven = true;
            }
        }
        if (!checkEven) {
            System.out.println("Even number not found in array.");
        }
    }
}
