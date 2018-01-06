package moduleTwice.labwork24.Pyramid;

import static moduleTwice.labwork24.Pyramid.MyPyramid.printPyramid;

public class Main {
    public static void main(String[] args) {

        printPyramid(4);
    }
}

class MyPyramid {

    static void printPyramid(int num) {
        int rows = 1;
        if ((num > 1) && (num < 10)) {
            for (int i = num; i > 0; i--) {
                for (int j = 1; j <= i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= rows; j++) {
                    System.out.print(j + " ");
                }
                for (int j = rows - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
                rows++;
            }
        } else System.out.println("Invalid input value.");

      /*  if (h >= 1 && h <= 9) {
            for (int i = 1; i <= h; i++) {
                for (int j = h - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j < i ; j++) {
                    System.out.print(j);
                }
                for (int j = i ; j > 0; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }*/

    }
}
