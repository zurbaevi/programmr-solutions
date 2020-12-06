package com.programmr.java.loops;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class PalindromicWord {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
