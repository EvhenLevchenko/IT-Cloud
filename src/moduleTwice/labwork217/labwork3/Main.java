package moduleTwice.labwork217.labwork3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE_OF_ARRAY = 1000;
        int[] myArray = new int[SIZE_OF_ARRAY];


        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            myArray[i] = new Random().nextInt(SIZE_OF_ARRAY);
        }

        MySumCount mySumCount = new MySumCount(1, 2);


        mySumCount.setArray(myArray);

        Thread thread = new Thread(mySumCount);

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("The sum of 1st array " + mySumCount.getResultSum());
    }
}

