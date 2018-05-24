package moduleTwice.labwork28;

import static java.lang.Math.PI;

public class Circle extends Shape implements Comparable, Dwarable {
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
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color is : " + super.getColor() + ", radius=" + radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calculateArea() > circle.calculateArea()) return 1;
        if (this.calculateArea() < circle.calculateArea()) return -1;
        return 0;
    }
}