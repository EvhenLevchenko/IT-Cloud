package moduleTwice.labwork25.labwork252;

import java.util.Arrays;
import java.util.Random;


public class MyInit {
    public static int[] array;

    static {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(99) - 1);


        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}

class Main {
    public static void main(String[] args) {
        MyInit array1 = new MyInit();
        array1.printArray();
        MyInit array2 = new MyInit();
        array2.printArray();
    }
}