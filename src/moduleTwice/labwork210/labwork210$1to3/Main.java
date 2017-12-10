package moduleTwice.labwork210.labwork210$1to3;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = Shape.parseShape("Rectangle:RED:5,20");
        array[1] = Shape.parseShape("Triangle:GREEN:9,7,12");
        array[2] = Shape.parseShape("Circle:BLACK:10");

        for (Shape shape : array) {
            shape.draw();
        }
        System.out.println();

        System.out.print("Enter the number of shapes?: ");
        Scanner sc = new Scanner(System.in);
        final int arrayShape = Integer.parseInt(sc.nextLine());

        Shape[] newArrayOfShapes = new Shape[arrayShape];
        IntStream.range(0, arrayShape).forEach((int i) -> {
            System.out.printf("Enter a shape #%d" + ": ", i + 1);
            newArrayOfShapes[i] = Shape.parseShape(sc.nextLine());
        });

        System.out.println();
        for (Shape shape : newArrayOfShapes) {
            shape.draw();
        }
    }
}