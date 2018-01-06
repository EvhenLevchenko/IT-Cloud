package moduleTwice.labwork26.example;

public class Triagle {
    private double a;
    private double b;
    private double c;


    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getArea() {
        double area;
        double s=(a+b+c)/2;
        area=Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return area;
    }
}
