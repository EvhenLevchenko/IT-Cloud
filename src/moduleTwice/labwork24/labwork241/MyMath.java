package moduleTwice.labwork24.labwork241;

public class MyMath {

    private static final double Pi = 3.14;

    public static int findMin(int[] a) {
        int minValue = a[0];
        for (int element : a) {
            if (element <= minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    public static int findMax(int[] a) {

        int maxValue = a[0];
        for (int element : a) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static double areaOfCircle(double Radius) {
        return (Pi * Radius * Radius);
    }
}
