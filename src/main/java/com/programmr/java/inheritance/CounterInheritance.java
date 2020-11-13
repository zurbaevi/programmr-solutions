package com.programmr.java.inheritance;

/**
 * @author Nika Zurbaevi
 */
public class CounterInheritance {
    static class Counter {

        int i = 0;
        Counter increment() {
            i++;
            return this;
        }
        void print() {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 3; i++) {
            counter.increment();
        }
        counter.print();
    }
}
