package moduleTwice.labwork23;

public class Main {
    public static void main(String[] args) {
        Window[] windows = new Window[5];

        windows[0] = new Window();
        windows[1] = new Window(1.0, 11.3);
        windows[2] = new Window(2.4, 22.02, 22, "Yelov", false);
        windows[3] = new Window(3, 33, 33, "Black");
        windows[4] = new Window(4.1, 43, 44, "Brown", false);

        for (int i = 0; i < windows.length; i++) windows[i].printFields();
    }
}
