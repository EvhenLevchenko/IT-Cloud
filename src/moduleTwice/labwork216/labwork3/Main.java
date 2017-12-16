package moduleTwice.labwork216.labwork3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        foo(10,14);
        foo(10,14,18);
    }

    static  void foo(int a,int b){
        System.out.println("a:"+a+", b:"+b);

    }
    static  void foo(int... a){
        System.out.println(Arrays.toString(a));

    }
}
