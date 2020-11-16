package com.programmr.java.polymorphism;

/**
 * @author Nika Zurbaevi
 */
public class OverridingExample {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Dog()};
        for (Animal animal : animals) {
            animal.move();
        }
    }
}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}