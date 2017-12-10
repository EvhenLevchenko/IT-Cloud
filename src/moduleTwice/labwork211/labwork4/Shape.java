package moduleTwice.labwork211.labwork4;

public abstract class Shape implements Drawable {
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

    @Override
    public String toString() {
        return "Shape color is: " + color;
    }

    public abstract double calculateArea();

    public static Shape parseShape(String shape) throws InvalidShapeStringException {
        String[] paramsOfShape = shape.split(":");
        switch (paramsOfShape[0]) {
            case ("Rectangle"):
                return Rectangle.parseRectangle(shape);
            case ("Triangle"):
                return Triagle.parseTriangle(shape);
            case ("Circle"):
                return Circle.parseCircle(shape);
            default:
                return null;

        }
    }
}
