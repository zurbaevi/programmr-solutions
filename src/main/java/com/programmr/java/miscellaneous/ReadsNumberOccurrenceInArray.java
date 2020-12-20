package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class ReadsNumberOccurrenceInArray {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int countOccurrence = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Number [" + i + "]:");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter a number which exist in the array:");
        int number = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                countOccurrence++;
            }
        }
        System.out.println("Occurrence of " + number + " :");
        System.out.println(countOccurrence);
    }
}
