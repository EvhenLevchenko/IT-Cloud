package moduleTwice.labwork215.labwork1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Number:" + i);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
