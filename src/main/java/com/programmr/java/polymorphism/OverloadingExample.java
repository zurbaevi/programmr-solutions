package com.programmr.java.polymorphism;

/**
 * @author Nika Zurbaevi
 */
public class OverloadingExample {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int result;
        overload.test(10);
        overload.test(10, 20);
        result = overload.test('a');
        System.out.println("Result " + result);
    }
}

class Overload {
    public void test(int a) {
        System.out.println("a " + a);
    }

    public void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    public int test(char c) {
        System.out.println("char " + c);
        return c;
    }
}
