package moduleTwice.labwork28;

import static java.lang.Math.PI;

public  class Circle extends Shape implements Dwarable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(toString() + " area is: " + calculateArea());
    }

    @Override
    public double calculateArea() {
        return PI * (radius * 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color is : " + super.getColor() + ", radius=" + radius;
    }
}