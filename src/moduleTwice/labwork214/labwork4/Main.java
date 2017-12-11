package moduleTwice.labwork214.labwork4;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[]intArray={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(intArray));
        Collections.shuffle(Arrays.asList(intArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println("*********************************************************888");
        String[]strings={"one","two","three","four","five"};
        Collections.shuffle(Arrays.asList(strings));
        System.out.println(Arrays.toString(strings));

    }}
