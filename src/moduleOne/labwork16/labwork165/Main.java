package moduleOne.labwork16.labwork165;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] A = new int[n][n];
        int i, j, tmp;
        System.out.println("Матрица до транспонирования:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = (int) (10 * Math.random());
                System.out.print(A[i][j] + (j != n - 1 ? " " : "\n"));
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
        System.out.println("Матрица после транспонирования:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + (j != n - 1 ? " " : "\n"));
            }
        }
    }
}
