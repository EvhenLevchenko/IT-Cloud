package moduleTwice.labwork210.testWrapper1;

public class Main {
    public static void main(String[] args) {

        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");
        Integer x5 = 127;

        System.out.println(x1 == x2);
        System.out.println(x2 == x3);
        System.out.println(x3 == x4);
        System.out.println(x4 == x5);
        System.out.println("**********************");
        System.out.println(x1.equals(x2));
        System.out.println(x2.equals(x3));
        System.out.println(x3.equals(x4));
        System.out.println(x4.equals(x5));
        System.out.println();
        System.out.println("with140");

        Integer a1 = 140;
        Integer a2 = new Integer(140);
        Integer a3 = 140;
        Integer a4 = Integer.valueOf(140);
        Integer a5 = Integer.parseInt("140");

        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        System.out.println(a3 == a4);
        System.out.println(a4 == a5);
        System.out.println("**********************");
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
        System.out.println(a3.equals(a4));
        System.out.println(a4.equals(a5));

    }
}