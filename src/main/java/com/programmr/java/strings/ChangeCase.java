package com.programmr.java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nika Zurbaevi
 */
public class ChangeCase {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter the Word:");
        String str = br.readLine();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char) (c[i] - 32);
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char) (c[i] + 32);
            }
        }
        System.out.println("Edited Word: " + String.valueOf(c));
    }
}
