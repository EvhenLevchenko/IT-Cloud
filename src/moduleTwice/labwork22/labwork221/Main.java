package moduleTwice.labwork22.labwork221;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.matrixSum(genetatedmatrix.generateMatrixA(), genetatedmatrix.generateMatrixB());
        matrix.matrixMultiplication(genetatedmatrix.generateMatrixA(), genetatedmatrix.generateMatrixB());
    }
}


class Matrix {
    private int ROW = 4;
    private int COLUME = 4;

    void matrixSum(int[][] matrixA, int[][] matrixB) {
        System.out.println("Matrix sum");
        int[][] matrixSum = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void matrixMultiplication(int[][] matrixA, int[][] matrixB) {
        System.out.println("Matrix Multiplication");
        int[][] matrixMultiplication = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixMultiplication[i][j] = matrixA[i][j] * matrixB[i][j];
                System.out.print(matrixMultiplication[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class genetatedmatrix {
    private static final int ROW = 4;
    private static final int COLUME = 4;

    static int[][] generateMatrixA() {
        System.out.println("Matrix first");
        int[][] matrixA = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        return matrixA;
    }

    static int[][] generateMatrixB() {
        System.out.println("Matrix second");
        int[][] matrixB = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                matrixB[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        return matrixB;
    }
}