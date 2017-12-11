package moduleTwice.labwork214.labwork2$3;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int INTEGER_MAX_VALUE = 4;
        System.out.println("intArray :" + Arrays.toString(intArray));
        System.out.println("INTEGER_MAX_VALUE " + INTEGER_MAX_VALUE);
        System.out.printf("Elements after the INTEGER_MAX_VALUE  :", INTEGER_MAX_VALUE);
        System.out.println(MyTestMethod.calculateNumber(intArray, INTEGER_MAX_VALUE));
        System.out.println(MyTestMethod.calculateSum(intArray, INTEGER_MAX_VALUE));
        System.out.println("*****************************************************************");

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        final Double DOUBLE_MAX_VALUE = 3.2999999999;
        System.out.println("doubleArray :" + Arrays.toString(doubleArray));
        System.out.println("DOUBLE_MAX_VALUE " + DOUBLE_MAX_VALUE);
        System.out.printf("Elements after the DOUBLE_MAX_VALUE  :", DOUBLE_MAX_VALUE);
        System.out.println(MyTestMethod.calculateNumber(doubleArray, DOUBLE_MAX_VALUE));
        System.out.println(MyTestMethod.calculateSum(doubleArray,DOUBLE_MAX_VALUE));

    }
}
