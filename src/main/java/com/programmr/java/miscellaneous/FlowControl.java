package com.programmr.java.miscellaneous;

/**
 * @author Zurbaevi Nika
 */
public class FlowControl {
    public static void main(String[] args) {
        int num = 11;
        if (isPrime(num)) {
            System.out.println("The number is prime.");
        }
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
}
