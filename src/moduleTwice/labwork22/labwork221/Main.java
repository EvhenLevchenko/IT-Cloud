package moduleTwice.labwork22.labwork221;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ROW = 4;
        final int COLUME = 4;

        System.out.println("Matrix first");
        int[][] matrixA = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Matrix second");
        int[][] matrixB = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixB[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Matrix sum");
        Matrix.matrixSum(matrixA, matrixB);
        System.out.println("Matrix Multiplication");
        Matrix.matrixMultiplication(matrixA, matrixB);

    }
}


class Matrix {
    static void matrixSum(int[][] matrixA, int[][] matrixB) {
        final int ROW = 4;
        final int COLUME = 4;
        int[][] matrixSum = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println();
        }
       // System.out.println();
    }

    static void matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        final int ROW = 4;
        final int COLUME = 4;
        int[][] matrixMultiplication = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixMultiplication[i][j] = matrixA[i][j] * matrixB[i][j];
                System.out.print(matrixMultiplication[i][j] + "\t");
            }
            System.out.println();
        }
       // System.out.println();
    }
}