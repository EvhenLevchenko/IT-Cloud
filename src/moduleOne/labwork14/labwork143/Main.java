package moduleOne.labwork14.labwork143;

public class Main {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a & b);
        System.out.println(a & a);
        System.out.println(b & b);
        System.out.println((b & a) + "\n");
        System.out.println(a | b);
        System.out.println(a | a);
        System.out.println(b | b);
        System.out.println((b | a) + "\n");
        System.out.println(a ^ b);
        System.out.println(a ^ a);
        System.out.println(b ^ b);
        System.out.println((b ^ a) + "\n");
        System.out.println(!b);
        System.out.println(!a);

        System.out.println((a & b | a ^ b) | a);


   /*int a= 18346;
        int b= 17659;
        System.out.println("Представление числа: "+a+" в двоичной системе исчесления:               " + Integer.toBinaryString(a));
        System.out.println("Представление числа: "+b+" в двоичной системе исчесления:               " + Integer.toBinaryString(b)+"\n");
        int c=a&b;
        System.out.println("Оператор AND  Представление числа: "+c+" в двоичной системе исчесления: " + Integer.toBinaryString(c)+"\n");
        int d=a|b;
        System.out.println("Оператор OR   Представление числа: "+d+" в двоичной системе исчесления: " + Integer.toBinaryString(d)+"\n");
        int e= ~a;
        System.out.println("Оператор NOT Представление числа e :" + e + " в двоичной системе исчесления: "+Integer.toBinaryString(e)+"\n");
        int g=a^b;
        System.out.println("Оператор XOR   Представление числа: "+g+" в двоичной системе исчесления: " + Integer.toBinaryString(g));*/

    }
}
