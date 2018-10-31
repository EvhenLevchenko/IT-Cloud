package moduleTwice.labwork25.labwork253;

public class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int) (Math.random() * 1000);
    }

    {
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}

class Main {
    public static void main(String[] args) {

        InitTest[] initTest = new InitTest[5];
        for (int i = 0; i < initTest.length; i++) {
            initTest[i] = new InitTest();
            System.out.println(initTest[i].getId());
        }
    }
}