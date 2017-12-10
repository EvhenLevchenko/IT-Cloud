package moduleOne.labwork14.labwork145;

public class Main {
    public static void main(String[] args) {
        int i = 341654;
        int b = 54564;
        int c, d;

        c = i << 1;
        d = b >> 2;

        System.out.println(Integer.toBinaryString(i));
        System.out.println(c + "  " + Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(d + " " + Integer.toBinaryString(d));

    }
}