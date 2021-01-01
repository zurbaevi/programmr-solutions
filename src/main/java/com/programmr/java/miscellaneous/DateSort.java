package com.programmr.java.miscellaneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Zurbaevi Nika
 */
public class DateSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first date(mm/dd/yyyy):");
        String d1 = br.readLine();
        System.out.println("Enter the second date(mm/dd/yyyy):");
        String d2 = br.readLine();
        System.out.println("Sorted dates are(mm/dd/yyyy):");
        if (Integer.parseInt(d1.substring(6)) > Integer.parseInt(d2.substring(6))) {
            System.out.println(d1);
            System.out.println(d2);
        } else {
            System.out.println(d2);
            System.out.println(d1);
        }
    }
}
