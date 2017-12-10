package moduleTwice.labwork27.labwork276to10.testShapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "This if Rectangle, color id : " +super.getColor()+
                "height=" + height +
                ", width=" + width ;
    }
}
