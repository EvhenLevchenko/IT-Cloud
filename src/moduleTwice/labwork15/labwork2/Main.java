package moduleTwice.labwork15.labwork2;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number:" + random.nextInt(10));
        }
    }
}
