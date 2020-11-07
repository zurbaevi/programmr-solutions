package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the array elements[" + i + "]:");
            arr[i] = scan.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + "  ");
    }
}
