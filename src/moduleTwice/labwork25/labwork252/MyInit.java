package moduleTwice.labwork25.labwork252;

import java.util.Arrays;
import java.util.Random;


public class MyInit {
    public static void main(String[] args) {
        MyInt arr1 = new MyInt();
        MyInt arr2 = new MyInt();

        arr1.printArray();
        arr2.printArray();

    }

    static class MyInt {
        int[] arr = new int[10];

        {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = (int) (100 * Math.random());
            }
        }

        private void printArray() {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}