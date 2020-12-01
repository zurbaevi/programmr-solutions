package com.programmr.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class GettingTheLargestValueInAnArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the number of integers that will be inserted: ");
        int size = scanner.nextInt();
        System.out.println("Enter some integers to insert to the ArrayList: ");
        while (size-- > 0) {
            al.add(scanner.nextInt());
        }
        System.out.println("The largest value: " + Collections.max(al));
    }
}
