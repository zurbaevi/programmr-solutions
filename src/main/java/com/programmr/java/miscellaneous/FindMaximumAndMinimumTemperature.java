package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class FindMaximumAndMinimumTemperature {
    public static void main(String[] args) throws Exception {
        double maxTemp = 0.0, minTemp = 0.0;
        Scanner scanner = new Scanner(System.in);
        double[] doubles = new double[7];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = scanner.nextDouble();
        }
        for (double aDouble : doubles) {
            if (minTemp > aDouble) {
                minTemp = aDouble;
            }
        }
        for (double aDouble : doubles) {
            if (maxTemp < aDouble) {
                maxTemp = aDouble;
            }
        }
        System.out.println("Maximum:");
        System.out.println(maxTemp);
        System.out.println("Minimum:");
        System.out.println(minTemp);
    }
}
