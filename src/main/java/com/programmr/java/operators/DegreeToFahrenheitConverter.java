package com.programmr.java.operators;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class DegreeToFahrenheitConverter {
    public static void main(String[] args) {
        System.out.println("Enter a temperature in Celsius: ");
        Scanner scanCelsius = new Scanner(System.in);
        double celsius = scanCelsius.nextDouble();
        double fahrenheit = (9.0/5.0)*celsius + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}
