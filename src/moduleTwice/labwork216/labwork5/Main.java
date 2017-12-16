package moduleTwice.labwork216.labwork5;

public class Main {
    public static void main(String[] args) {
        byte b=5;

        foo(5);
        foo(b);
    }

    static  void foo(int i){
        System.out.println("int");

    }
    static  void foo(byte b){
        System.out.println("byte");

    }
}
