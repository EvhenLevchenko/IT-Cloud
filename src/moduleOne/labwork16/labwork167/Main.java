package moduleOne.labwork16.labwork167;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] MATRIX = {{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        for (int[] ints : MATRIX) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < MATRIX.length; i++) {
           System.out.print("Line" + (i + 1) + ": [ ");
            for (int j = 0; j <= MATRIX.length; j++) {
                if (MATRIX[i][j] == number) {
                    System.out.print(j + " ");
                }
            }
            
            System.out.println("]");
        }
    }
}
