package com.programmr.java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zurbaevi Nika
 */
public class RemoveVowelsFromAWord {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter the Word:");
        String str = br.readLine();
        String newStr = str.replaceAll("[aeiou]", "");
        System.out.println("Edited Word:" + newStr);
    }
}
