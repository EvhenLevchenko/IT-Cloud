package moduleTwice.labwork25.labwork251;

public class MyInitTest {

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    public MyInitTest() {
        System.out.println("First constructor ");
    }

    public MyInitTest(int maxSpeed) {
        maxSpeed = 1;
        System.out.println("Twice constructor ");
    }
}

class Main {
    public static void main(String[] args) {
        MyInitTest myInitTest = new MyInitTest();
    }
}