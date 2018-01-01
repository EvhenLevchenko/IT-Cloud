package moduleOne.labwork16.labwork161;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            array [i] = 2*(i+1);
        }
        System.out.println(Arrays.toString(array));
    }
}