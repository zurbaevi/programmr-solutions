package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeString {
    public static void main(String a[]) throws Exception {
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn = br.readLine();
        System.out.println("Result string is:");
        for (int i = 0; i < strn.length(); i++) {
            if (strn.charAt(i) != strn.charAt(strn.length() - i - 1)) {
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
