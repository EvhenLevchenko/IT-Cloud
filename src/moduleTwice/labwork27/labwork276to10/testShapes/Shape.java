package moduleTwice.labwork27.labwork276to10.testShapes;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape, color is:" + color;
    }
}

