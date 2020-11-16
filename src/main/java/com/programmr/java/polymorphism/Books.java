package com.programmr.java.polymorphism;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] book = new Book[2];
        System.out.println("Title of fiction book:");
        String t = scanner.nextLine();
        book[0] = new Fiction(t);
        System.out.println("Title of non fiction book:");
        String t1 = scanner.nextLine();
        book[1] = new NonFiction(t1);
        for (Book value : book) {
            System.out.println(value);
        }
    }
}

abstract class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

class Fiction extends Book {

    public Fiction(String title) {
        super(title, 24.99);
    }

    @Override
    public String toString() {
        return "Title-" + title + " Cost-$" + price;
    }
}

class NonFiction extends Book {

    NonFiction(String title) {
        super(title, 37.99);
    }

    @Override
    public String toString() {
        return "Title-" + title + " Cost-$" + price;
    }
}
