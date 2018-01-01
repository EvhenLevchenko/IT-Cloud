package moduleOne.labwork16.labwork162;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        System.out.println("An array: " + Arrays.toString(array));
        System.out.println();

        Arrays.sort(array);
        System.out.println("the minimum value is " + array[0]);
        System.out.println("the maximum value is " + array[array.length - 1]);

        float sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("the average value is " + (sum / array.length));
    }

}