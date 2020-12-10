package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zurbaevi Nika
 */
public class ConvertBinaryToDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Binary value:");
        String str = bf.readLine();
        int decimal = Integer.parseInt(str, 2);
        System.out.println("Decimal:\n" + decimal);
    }
}
