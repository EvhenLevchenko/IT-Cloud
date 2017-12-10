package moduleTwice.labwork29.testString3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Using methods of class String";
        System.out.println(Arrays.toString(uniqueChars(str)));
    }

    public static char[] uniqueChars(String string) {
        string = string.toLowerCase();
        char[] array = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : array) {
            if (string.indexOf(c) == string.lastIndexOf(c)) {
                builder.append(c);
            }
        }
        return builder.toString().toCharArray();
    }
}
