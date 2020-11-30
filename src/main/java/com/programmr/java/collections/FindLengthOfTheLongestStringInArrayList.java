package com.programmr.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class FindLengthOfTheLongestStringInArrayList {
    static int max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int size = 6;
        System.out.println("Enter 5 Strings to store in arraylist:");
        while (size-- > 0) {
            al.add(scanner.next());
        }
        System.out.println("The largest value: " + maxLength(al));
    }

    static int maxLength(ArrayList<String> al) {
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i).length() > max) {
                max = al.get(i).length();
            }
        }
        return max;
    }
}
