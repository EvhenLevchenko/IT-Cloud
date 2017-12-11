package moduleTwice.labwork214.labwork2$3;



public class MyTestMethod {


    public static <T> int calculateNumber(T[] array, T maxElement) {
        int counter = 0;
        if (maxElement instanceof Integer) {
            for (T t : array) {
                if ((Integer) t > (Integer) maxElement) {
                    counter++;
                }
            }
        }
        if (maxElement instanceof Double) {
            for (T t : array) {
                if ((Double) t > (Double) maxElement) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static <T> T calculateSum(T[] array, T maxElement) {

        T sumOfElements = null;
        if (maxElement instanceof Integer) {
            Integer intSum = 0;
            for (T t : array) {
                if ((Integer) t > (Integer) maxElement) {
                    intSum += (Integer) t;
                }
            }
            sumOfElements = (T) intSum;
        }

        if (maxElement instanceof Double) {
            Double doubleSum = 0.00000;
            for (T t : array) {
                if ((Double) t > (Double) maxElement) {
                    doubleSum += (Double) t;
                }
            }
            sumOfElements = (T) doubleSum;
        }
        return sumOfElements;
    }
}