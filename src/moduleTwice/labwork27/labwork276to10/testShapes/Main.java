package moduleTwice.labwork27.labwork276to10.testShapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("Red", 11, 22);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calculateArea());

        Triagle triagle = new Triagle("BlacK", 5, 5, 5);
        System.out.println(triagle);
        System.out.println("Shape area is: " + triagle.calculateArea());
        System.out.println("*******************************************************");

        final int SHAPES = 9;
        Shape[] array = new Shape[SHAPES];
        array[0] = new Rectangle("Red", 1, 1);
        array[1] = new Rectangle("Black", 1, 2);
        array[2] = new Rectangle("Blue", 2, 3);
        array[3] = new Rectangle("White", 3, 4);
        array[4] = new Rectangle("Orange", 4, 5);
        array[5] = new Circle("Brown", 6);
        array[6] = new Circle("Pink", 7);
        array[7] = new Triagle("Grey", 8, 9, 10);
        array[8] = new Triagle("Coral", 11, 12, 13);

        for (Shape shape : array) {
            System.out.println(shape + ", area is :+" + shape.calculateArea());
        }
        double sumArea = 0;
        for (Shape shape : array) {
            sumArea = sumArea + shape.calculateArea();
        }
        System.out.println();
        System.out.println("Shapes total area is " + sumArea);

        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriagleArea = 0;
        for (Shape shape : array) {
            if (shape instanceof Circle) {
                sumCircleArea += shape.calculateArea();
            }
            if (shape instanceof Rectangle) {
                sumRectangleArea = sumRectangleArea + shape.calculateArea();
            }
            if (shape instanceof Triagle) {
                sumTriagleArea = sumTriagleArea + shape.calculateArea();
            }
        }

        System.out.println("Rectangle total area " + sumRectangleArea);
        System.out.println("Circle total area " + sumCircleArea);
        System.out.println("Triagle total area " + sumTriagleArea);
    }
}
