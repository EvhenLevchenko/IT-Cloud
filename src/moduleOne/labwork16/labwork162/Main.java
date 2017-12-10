package moduleOne.labwork16.labwork162;


public class Main {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min, max, average;
        min = max = average = m[0];
        for (int i = 1; i < 12; i++) {
            if (m[i] < min) min = m[i];
            if (m[i] > max) max = m[i];
            if (m[i] >= (min / max)) average = m[i];
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
        System.out.println("Average:" + average);

    }

}