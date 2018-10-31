package moduleTwice.labwork28;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangleFirst = new Rectangle("Red", 1, 1);
        Rectangle rectangleTwice = new Rectangle("Orange", 4, 5);
        rectangleFirst.draw();
        rectangleTwice.draw();
        System.out.println(rectangleFirst.compareTo(rectangleTwice));



        final int SHAPES = 6;
        Rectangle[] rectangles = new Rectangle[SHAPES];
        rectangles[0] = new Rectangle("Red", 1, 1);
        rectangles[1] = new Rectangle("Black", 44, 2);
        rectangles[2] = new Rectangle("Blue", 42, 4);
        rectangles[3] = new Rectangle("Orange", 11, 5);
        rectangles[4] = new Rectangle("Orange", 11, 5);
        rectangles[5] = new Rectangle("Pink", 4, 5);
        Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
rectangle.draw();
            }


        System.out.println("*****************************************");
        final int SHAPESS = 9;
        Shape[] shapes = new Shape[SHAPESS];
        shapes[0] = new Rectangle("Red", 1, 1);
        shapes[1] = new Rectangle("Black", 1, 2);
        shapes[2] = new Rectangle("Blue", 2, 3);
        shapes[3] = new Rectangle("White", 3, 4);
        shapes[4] = new Rectangle("Orange", 4, 5);
        shapes[5] = new Circle("Brown", 6);
        shapes[6] = new Circle("Pink", 7);
        shapes[7] = new Triagle("Grey", 8, 9, 10);
        shapes[8] = new Triagle("Coral", 11, 12, 13);
//       Arrays.sort(shapes, new ShapeColorComparator());
//        for (Shape shape : shapes) {
//            shape.draw();
//        }

        Arrays.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return o1.getColor().compareTo(o2.getColor());


            }
        });
        for (Shape s : shapes) {
           s.draw();
        }


    }
}