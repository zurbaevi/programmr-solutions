package com.programmr.java.arrays;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AddElementsOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] arr;
        arr = new int[10];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (i == 9)
                break;
        }
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements of the array:" + sum);
    }
}
