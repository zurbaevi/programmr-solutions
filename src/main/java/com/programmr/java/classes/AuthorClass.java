package com.programmr.java.classes;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class AuthorClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author aut;

        System.out.println("Enter name:");
        String someName = scanner.nextLine();

        System.out.println("Enter email:");
        String sEmail = scanner.nextLine();

        System.out.println("Enter book name:");
        String sBook = scanner.nextLine();

        aut = new Author(someName, sEmail, sBook);

        System.out.println(aut.name + "\n" + aut.email + "\n" + aut.book);

    }

}

class Author {
    String name;
    String email;
    String book;

    public Author(String name, String email, String book) {
        this.name = name;
        this.email = email;
        this.book = book;
    }
}
