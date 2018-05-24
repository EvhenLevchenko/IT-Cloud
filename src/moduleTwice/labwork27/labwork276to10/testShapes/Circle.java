package moduleTwice.labwork27.labwork276to10.testShapes;

import moduleTwice.labwork27.labwork276to10.testShapes.Shape;

import static java.lang.Math.PI;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color is : "+super.getColor()+", radius=" + radius ;
    }
}