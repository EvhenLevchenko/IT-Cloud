package moduleTwice.labwork23;

public class Main {
    public static void main(String[] args) {


        Window window1 = new Window();
        Window window2 = new Window(1.0, 11.3);
        Window window3 = new Window(2.4, 22.02, 22, "Yelov", false);
        Window window4 = new Window(3, 33, 33, "Black");
        Window window5 = new Window(4.1, 43, 44, "Brown", false);


        Window[] arrayOfWindows = new Window[5];

        arrayOfWindows[0] = window1;
        arrayOfWindows[1] = window2;
        arrayOfWindows[2] = window3;
        arrayOfWindows[3] = window4;
        arrayOfWindows[4] = window5;

        for (int i = 0; i < arrayOfWindows.length; i++) arrayOfWindows[i].printFields();
    }
}
