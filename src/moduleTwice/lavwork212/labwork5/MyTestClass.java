package moduleTwice.lavwork212.labwork5;

public class MyTestClass {
    private byte test = 34;

    public static class MyStaticNested {

        private static byte statikTest = 3;

        public static byte getStatiktest() {
            return statikTest;
        }

        public static byte getTest() {
            return new MyTestClass().test;
        }
    }
    public void test() {
        System.out.println("Hi");
    }

    class MyInner {
        private int innerTest = 2;

        public int getInnerTest() {
            return innerTest;
        }

        public byte getTest() {
            return new MyTestClass().test;
        }
    }

    public void metodLokal() {
        class MyLocal {
            private int localTest = 1;

            public int getLocalTest() {
                return localTest;
            }
        }
    }

    public byte getTest() {
        return test;
    }
}