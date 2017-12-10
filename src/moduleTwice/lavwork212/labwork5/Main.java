package moduleTwice.lavwork212.labwork5;

public class Main {
    public static void main(String[] args) {
        new MyTestClass().test();

        System.out.println(new MyTestClass().getTest());
        new MyTestClass().metodLokal();
        System.out.println(new MyTestClass().new MyInner().getInnerTest());
        System.out.println(MyTestClass.MyStaticNested.getStatiktest());

    }
}