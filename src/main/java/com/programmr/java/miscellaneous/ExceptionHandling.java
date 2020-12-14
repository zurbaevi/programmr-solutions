package com.programmr.java.miscellaneous;

/**
 * @author Zurbaevi Nika
 */
public class ExceptionHandling extends Exception {
    public ExceptionHandling() {
        System.out.println("The number is greater than 100");

    }

    public ExceptionHandling(String description) {
        super(description);
    }

    public static void main(String[] args) {

        int sum = 110;
        try {
            if (sum > 100)
                throw new ExceptionHandling("The number is greater than 100.");
        } catch (ExceptionHandling e) {
            e.printStackTrace();
        }
    }
}