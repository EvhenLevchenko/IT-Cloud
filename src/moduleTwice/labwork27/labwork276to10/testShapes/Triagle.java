package moduleTwice.labwork27.labwork276to10.testShapes;

import static java.lang.Math.sqrt;

public class Triagle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triagle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s=(a+b+c)/2;
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String toString() {
        return "This is Triagle color is :" + super.getColor()+
                "a=" + a +
                ", b=" + b +
                ", c=" + c ;
    }
}

