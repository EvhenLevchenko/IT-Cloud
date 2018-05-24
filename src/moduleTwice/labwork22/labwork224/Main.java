package moduleTwice.labwork22.labwork224;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPerson("Julia", 21, 3452);
        person.setPerson("Julia","Akteeva","Woman");
        person.setPerson("Max",19);
        person.setPerson("Mark","Yujo");
        person.setPerson("Julia","Martieva",26,"Woman",2341);
        System.out.println(person.toString());
    }
}