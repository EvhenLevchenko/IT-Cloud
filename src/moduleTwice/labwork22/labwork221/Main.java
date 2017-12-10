package moduleTwice.labwork22.labwork221;

public class Main {
    public static void main(String[] args) {


        int[][] matrixA = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = (int) (Math.random() * 100);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        int[][] matrixB = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = (int) (Math.random() * 100);
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix sum");
        Matrix.matrixSum(matrixA, matrixB);
        System.out.println("Matrix Multiplication");
        Matrix.matrixMultiplication(matrixA, matrixB);
    }
}

class Matrix {
    static void matrixSum(int[][] matrixA, int[][] matrixB) {
        int[][] matrixSum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        int[][] matrixMultiplication = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixMultiplication[i][j] = matrixA[i][j] * matrixB[j][i];
                System.out.print(matrixMultiplication[i][j] + "  \t");
            }
            System.out.println();
        }
        System.out.println();
    }
}