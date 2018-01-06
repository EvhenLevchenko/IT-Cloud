package moduleTwice.labwork25.labwork255;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        InitTest test1 = new InitTest();
        InitTest test2 = new InitTest();
        InitTest test3 = new InitTest();
        InitTest test4 = new InitTest();
        InitTest test5 = new InitTest();

        System.out.println(test1.getId());
        System.out.println(test2.getId());
        System.out.println(test3.getId());
        System.out.println(test4.getId());
        System.out.println(test5.getId());

    }

    static class InitTest {
        private int id;
        static int nextId;

        static {
            Random ran = new Random();
            nextId = ran.nextInt(1000);
        }

        public InitTest(){
            nextId ++;
            id = nextId;
        }

        public int getId() {
            return id;
        }
    }
}
