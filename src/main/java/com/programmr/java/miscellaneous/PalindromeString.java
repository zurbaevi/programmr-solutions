package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Nika Zurbaevi
 */
public class PalindromeString {
    public static void main(String args[]) throws Exception {
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println("Result string is:");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                flag = 0;
            } else {
                flag = 1;
            }

        }
        //end
        if (flag == 1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome");

    }
}
