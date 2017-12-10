package moduleTwice.labwork27.labwork276to10.testShapes;

import moduleTwice.labwork27.labwork276to10.testShapes.Shape;

import static java.lang.Math.PI;

public class Circle extends Shape {

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    private double radius;

    @Override
    public double calculateArea() {
        return PI * (radius * 2);
    }


    @Override
    public String toString() {
        return "This is Circle, color is : "+super.getColor()+", radius=" + radius ;
    }
}