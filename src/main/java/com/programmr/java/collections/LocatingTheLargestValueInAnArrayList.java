package com.programmr.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class LocatingTheLargestValueInAnArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the number of integers that will be inserted: ");
        int size = scanner.nextInt();
        System.out.println("Enter some integers to insert to the ArrayList: ");
        while (size-- > 0) {
            al.add(scanner.nextInt());
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < al.size(); i++) {
            if (max < al.get(i)) {
                max = al.get(i);
                maxIndex++;
            }
        }
        System.out.println("The largest value is " + max + "; which is in slot " + (maxIndex - 1));
    }
}
