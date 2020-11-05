package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class NumberToStringFormat {
    public static final String[] ones = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static final String[] tens = {" ", " ", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
    }
}
