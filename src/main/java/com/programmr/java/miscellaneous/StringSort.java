package com.programmr.java.miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class StringSort {
    public static String sortString(String inputString) {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(sortString(a));
    }
}
