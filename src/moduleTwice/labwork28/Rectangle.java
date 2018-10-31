package moduleTwice.labwork28;


public  class Rectangle extends Shape implements Comparable,Dwarable {

    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This if Rectangle, color id : " + super.getColor() +
                " height=" + height +
                ", width=" + width;
    }

    @Override
    public void draw() {
        System.out.println(toString() + " area is: " + calculateArea());
    }


    @Override
    public int compareTo(Object o) {
        Rectangle rectangle=(Rectangle) o;
        if(this.calculateArea()>rectangle.calculateArea())return 1;
        if(this.calculateArea()<rectangle.calculateArea())return -1;
        return 0;
    }
}
