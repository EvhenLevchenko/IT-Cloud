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
}

 class MyInt {
    static  int[] arr = new int[10];

    static { for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (100 * Math.random()); }
    }

     public void printArray() {
         System.out.println(Arrays.toString(arr));
    }
}
