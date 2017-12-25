package moduleTwice.labwork217.labwork6;

public class Main {
    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {
            d.makePizza();
        }
        for (int i = 1; i <= 20; i++) {
            Thread thread=new Thread(new DiningHall());
            thread.start();
        }
    }
}
