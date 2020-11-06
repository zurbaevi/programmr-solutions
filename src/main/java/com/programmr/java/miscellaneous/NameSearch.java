package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class NameSearch {
    public static String[] names = {"harry", "michael", "will", "tom", "jackie"};
    public static String[] surnames = {"potter", "jackson", "smith", "cruise", "chan"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter the name:");
        name = sc.next();

        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                System.out.print("Full name of the celebrity is: " + names[i] + " " + surnames[i]);
            }
        }
    }
}
