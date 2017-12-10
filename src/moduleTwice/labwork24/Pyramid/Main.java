package moduleTwice.labwork24.Pyramid;

public class Main {
    public static void main(String[] args) {
        MyPyramid.printPyramid(4);
    }
}

class MyPyramid {

    static void printPyramid(int h) {
        int z = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = h - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i - 1; k >= -(i - 1); k--) {
                System.out.print(i - Math.abs(k));
            }
            z += 2;
            System.out.println();
        }

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
