package moduleTwice.labwork24;

import java.util.Arrays;
import java.util.Random;

public class Claculation {
    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = (int) (Math.random()*20);

        }


        for (int i = 0; i < array2.length ; i++) {
            array2[i] = (int) (Math.random()*10);
        }
        System.out.println("The first array is: " + Arrays.toString(array1));
        System.out.println("Min: " + MyMath.findMax(array1) + ", Max: " + MyMath.findMin(array1)+", Avg: "+MyMath.avg(array1));
        System.out.println("The second array is: " + Arrays.toString(array2));
        System.out.println("Min: " + MyMath.findMax(array2) + ", Max: " + MyMath.findMin(array2)+", Avg: "+MyMath.avg(array2));

 }
}
