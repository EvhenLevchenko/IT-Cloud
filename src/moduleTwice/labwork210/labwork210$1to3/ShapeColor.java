package moduleTwice.labwork210.labwork210$1to3;

import java.util.Comparator;

public class ShapeColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.getColor().compareTo(shape2.getColor());
    }
}
