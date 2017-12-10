package moduleTwice.labwork211.labwork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isShapesGreated = true;
        Shape[] array = new Shape[3];
        try {

            array[0] = Shape.parseShape("Rectangle : RED:10,20");
            array[0] = Shape.parseShape("Triagle: WHITE:9,19,20");
            array[0] = Shape.parseShape("Circle:BLUE:17");

        } catch (InvalidShapeStringException e) {
            System.out.println(e.getMessage());
            isShapesGreated = false;
        }
        if (isShapesGreated) {
            for (Shape shape : array) {
                shape.draw();
            }
        }
    }
}
