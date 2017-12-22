package moduleTwice.labwork216.labwork1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Dog animal2 = new Dog();

        foo(animal);
        foo(animal1);
        foo(animal2);
    }


    static void foo(Animal animal) {
        System.out.println("animaldog.Animal ");
    }

    static void foo(Dog dog) {
        System.out.println("animaldog.Dog ");
    }
}
