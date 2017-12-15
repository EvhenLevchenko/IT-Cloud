package moduleTwice.labwork215.labwork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("num_" + i);
            linkedList.add("Num_" + i);
        }
        System.out.println("Array:");
        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("****************************************");
        System.out.println("Array:");
        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        Random random = new Random();
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int position = random.nextInt(linkedList.size());
            linkedList.add(position, iterator.next());
        }
        printElement(linkedList);
    }

    static void printElement(Collection c) {
        System.out.println("\nThere are all elements on Collection: ");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
