package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Zurbaevi Nika
 */
public class RemoveCharacter {
    public static void main(String[] args) throws Exception {
        String s;
        char deleteChar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        s = br.readLine();
        System.out.println("Enter Character which you want to delete:");
        deleteChar = (char) br.read();
        System.out.println("Result String is:\n" + s.replaceAll(String.valueOf(deleteChar), ""));
    }
}
