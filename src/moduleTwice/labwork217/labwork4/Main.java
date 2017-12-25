package moduleTwice.labwork217.labwork4;

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
        MySumCount mySumCount1 = new MySumCount(998, 999);
        Thread thread = new Thread(mySumCount);
        Thread thread1 = new Thread(mySumCount1);

        mySumCount.setArray(myArray);
        mySumCount1.setArray(myArray);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("The sum of 1st array " + mySumCount.getResultSum());
        System.out.println("The sum of 2st array " + mySumCount1.getResultSum());

    }
}