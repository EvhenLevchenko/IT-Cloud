package moduleTwice.labwork29.testTokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String,split by StringTokenizer. Greated by Student:John";
        StringTokenizer sk = new StringTokenizer(myStr, ",.");
        while (sk.hasMoreElements()) {
            System.out.println(sk.nextElement().toString().trim());
        }
    }
}
