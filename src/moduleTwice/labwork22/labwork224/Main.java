package moduleTwice.labwork22.labwork224;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPerson1(597135564, "Bobby");
        person.setPerson2(4644445, "Mark", "Men");
        person.setPerson3("Lisa", "Fisher", "Woman");
        person.setPerson4("John", "Smit", "Men", 99, 1565151);
        person.setPerson5("Ken", "Woman", 44, 44454);
        System.out.println(Arrays.toString(new Person[]{person}));
    }
}