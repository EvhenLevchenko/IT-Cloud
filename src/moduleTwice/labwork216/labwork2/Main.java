package moduleTwice.labwork216.labwork2;

public class Main {
    public static void main(String[] args) {
    byte b=9;
    foo(b);
    }
    static void foo(int i){
        System.out.println("int");
    }
    static void foo(Byte i){
        System.out.println("Byte");
    }

}
