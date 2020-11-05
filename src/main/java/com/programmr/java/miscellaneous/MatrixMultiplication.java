package com.programmr.java.miscellaneous;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix 1st [" + i + "][" + j + "]:");
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matrix 2nd [" + i + "][" + j + "]:");
                array1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array2[i][j] += array[i][k] * array1[k][j];
                }
            }
        }
        System.out.println("Multiply of both matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
