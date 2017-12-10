package moduleTwice.labwork211.labwork4;

import static java.lang.StrictMath.sqrt;

public class Triagle extends Shape implements Drawable {
    private double a;
    private double b;
    private double c;

    public Triagle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println(toString() + " area is: " + calculateArea());
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is Triagle color is :" + super.getColor() +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public int compareTo(Object o) {
        Triagle triangle = (Triagle) o;
        if (this.calculateArea() < triangle.calculateArea()) return -1;
        {
            if (this.calculateArea() > triangle.calculateArea()) return 1;
            return 0;
        }
    }

    public static Triagle parseTriangle(String shape) {
        String[] paramOfShape = shape.split(":");
        String[] param = paramOfShape[2].split(",");

        return new Triagle(paramOfShape[1],

                Double.parseDouble(param[0]),
                Double.parseDouble(param[1]),
                Double.parseDouble(param[2]));

    }
}