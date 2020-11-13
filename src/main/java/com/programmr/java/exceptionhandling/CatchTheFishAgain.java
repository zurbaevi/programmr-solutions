package com.programmr.java.exceptionhandling;

/**
 * @author Nika Zurbaevi
 */
public class CatchTheFishAgain {
    static class ExceptionA extends Exception {
    }

    static class ExceptionB extends ExceptionA {
    }

    static class ExceptionC extends ExceptionB {
    }

    static class Challenge {

        public static void main(String args[]) {
            try {
                throw new ExceptionC();
            } catch (ExceptionA a) {
                System.out.println(a);
            }
            try {
                throw new ExceptionB();
            } catch (ExceptionA a) {
                System.out.println(a);
            }
            System.exit(0);
        }
    }
}
