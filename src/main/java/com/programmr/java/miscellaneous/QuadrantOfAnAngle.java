package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class QuadrantOfAnAngle {
    public static void main(String[] args) {
        int angle = 0;
        System.out.println("Type an integer angle (in degrees) and press Enter:");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextInt();
        int quadrant;
        if (angle < 90)
            quadrant = 1;
        else if (angle < 180)
            quadrant = 2;
        else if (angle < 270)
            quadrant = 3;
        else
            quadrant = 4;
        // output
        System.out.println("Quadrant is :" + quadrant);
    }
}
