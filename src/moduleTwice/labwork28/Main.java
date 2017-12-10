package moduleTwice.labwork28;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shape[] array = new Shape[9];
        array[0] = new Rectangle("Red", 1, 1);
        array[1] = new Rectangle("Black", 1, 2);
        array[2] = new Rectangle("Blue", 2, 3);
        array[3] = new Rectangle("White", 3, 4);
        array[4] = new Rectangle("Orange", 4, 5);
        array[5] = new Circle("Brown", 6);
        array[6] = new Circle("Pink", 7);
        array[7] = new Triagle("Grey", 8, 9, 10);
        array[8] = new Triagle("Coral", 11, 12, 13);
        Arrays.sort(array, new ShapeColor());
        for (Shape shape : array) {
            shape.draw();
        }

        System.out.println();

        Rectangle rectangleFirst = new Rectangle("Red", 1, 1);
        Rectangle rectangleTwice = new Rectangle("Orange", 4, 5);
        rectangleFirst.draw();
        rectangleTwice.draw();
        System.out.println(rectangleFirst.compareTo(rectangleTwice));
        System.out.println();


        Rectangle[] array1 = new Rectangle[6];
        array1[0] = new Rectangle("Red", 1, 1);
        array1[1] = new Rectangle("Black", 44, 2);
        array1[2] = new Rectangle("Blue", 42, 4);
        array1[3] = new Rectangle("White", 14, 99);
        array1[4] = new Rectangle("Orange", 11, 5);
        array1[5] = new Rectangle("Pink", 4, 5);
        for (Shape shape : array1) {
            shape.draw();
        }
    }
}
