package com.programmr.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Nika Zurbaevi
 */
public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        System.out.println("Sum:" + sumNumbers(string));
    }

    public static String sumNumbers(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int result = 0;
        int start = 0;
        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            result += Integer.parseInt(value);
            start = matcher.end();
        }
        return Integer.toString(result);
    }
}
