package moduleTwice.labwork211.labwork11$1to2;

public class Main {
    public static void main(String[] args) {

        /* try {
            throw new Exception("This my string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I'm here");
        }*/


        try {
            throw new MyException("This is my Exception");
        } catch (MyException e) {
            e.printText();
        }

        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException e) {
            e.printText();
        }

        MyTest myTestNull = null;
        try {
            myTestNull.test();
        } catch (MyException e) {
            e.printText();
        } catch (NullPointerException e) {
            System.out.println(e.toString() + " caught");
            ;
        }
    }
}