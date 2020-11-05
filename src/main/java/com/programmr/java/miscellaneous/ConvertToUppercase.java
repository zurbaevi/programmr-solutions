package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nika Zurbaevi
 */
public class ConvertToUppercase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str = br.readLine();
        System.out.println("Uppercase conversion: " + str.toUpperCase());
    }
}
