package moduleTwice.labwork21.labwork4;

public class Computer {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private static void increasePrice() {
        Computer[] computer = new Computer[5];
        float f = 1f;
        for (int i = 0; i < 5; i++) computer[i] = new Computer();
        for (int i = 0; i < 5; i++) {
            f = f + 0.1f;
            computer[i].setPrice(100 * f);
        }
    }

    public static void main(String[] args) {
        increasePrice();
    }
}