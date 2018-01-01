package moduleOne.labwork16.labwork166;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] aveTemp = {-5.5, -4.3, 0.3, 7.0, 12.6, 15.5,
                17.6, 16.4, 12.3, 6.3, 2.2, -2.8};
        System.out.println("Average temperature by month: ");
        System.out.println(Arrays.toString(aveTemp));
        double x;

        //Arrays.sort(aveTemp);
        for (int i = 0; i < aveTemp.length; i++) {
            for (int j = aveTemp.length - 1; j > i; j--) {
                if(aveTemp[j-1] > aveTemp[j]) {
                    x = aveTemp[j-1];
                    aveTemp[j-1] = aveTemp[j];
                    aveTemp[j] = x;
                }
            }
        }
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(aveTemp));
    }
}