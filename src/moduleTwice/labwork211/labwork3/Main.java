package moduleTwice.labwork211.labwork3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Pol");
        person.setLastName("Drake");

        try {
            person.setAge(122);
            System.out.println("Good age ");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("Not good age ");
        }
    }
}