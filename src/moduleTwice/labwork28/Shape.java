package moduleTwice.labwork28;

public abstract class Shape implements Dwarable {
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

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Shape, color is:" + color;
    }


}
