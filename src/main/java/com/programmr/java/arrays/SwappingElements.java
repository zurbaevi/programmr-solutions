package com.programmr.java.arrays;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class SwappingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        for (int i = 0; i < input.length - 1; i += 2) {
            int temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
