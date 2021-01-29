package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class CountOnes {
    public static void main(String[] args) {
        int count = 0, r;
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            int n = i;
            while (n != 0) {
                r = n % 10;
                if (r == 1) {
                    count++;
                }
                n = n / 10;
            }

        }
        System.out.println(count);
    }
}
