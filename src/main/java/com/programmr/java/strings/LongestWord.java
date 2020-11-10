package com.programmr.java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nika Zurbaevi
 */
public class LongestWord {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a sentence:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String[] splitString = s1.split(" ");
        String longestWord = splitString[0];
        for (String s : splitString) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        System.out.println("The longest word in the sentence is:" + longestWord);
    }
}