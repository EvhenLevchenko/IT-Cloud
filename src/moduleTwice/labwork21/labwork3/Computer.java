package moduleTwice.labwork21.labwork3;

public class Computer {
    private static void computerObject() {
        Computer[] computer = new Computer[5];
        for (int i = 0; i < 5; i++) computer[i] = new Computer();
    }

    public static void main(String[] args) {
        computerObject();
    }
}

