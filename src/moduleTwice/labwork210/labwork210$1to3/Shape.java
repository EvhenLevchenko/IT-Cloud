package moduleTwice.labwork210.labwork210$1to3;

public abstract class Shape implements Dwarable{
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

    public static Shape parseShape(String string) {
        String[] paramsOfShape = string.split(":");
        switch (paramsOfShape[0]) {
            case ("Rectangle"):
                return Rectangle.parseRectangle(string);
            case ("Triangle"):
                return Triagle.parseTriangle(string);
            case ("Circle"):
                return Circle.parseCircle(string);
            default:
                return null;

        }
    }
}

