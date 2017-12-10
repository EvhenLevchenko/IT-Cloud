package moduleTwice.labwork29.testString1;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(revereString(myStr));


    }

    public static String revereString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
