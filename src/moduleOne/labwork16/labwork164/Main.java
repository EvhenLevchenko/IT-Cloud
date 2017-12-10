package moduleOne.labwork16.labwork164;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{-3, -6, 4, -5, 9, -8, -9, -10, 10};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of 10 is:" + Arrays.binarySearch(array, -10));
    }
}