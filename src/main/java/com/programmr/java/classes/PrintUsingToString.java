package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class PrintUsingToString {

    String name;
    String age;

    PrintUsingToString(String name, String age) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name:");
        String name = scanner.next();
        System.out.print("Enter the age:");
        String age = scanner.next();

        PrintUsingToString test = new PrintUsingToString(name, age);
        System.out.println(test);

    }

    public String toString() {
        return ("Name=>" + name + " and " + "Age=>" + age);
    }
}
