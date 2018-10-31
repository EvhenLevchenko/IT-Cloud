package moduleTwice.labwork22.labwork224;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void setPerson(String firstName, int age) {
        this.age = age;
        this.firstName = firstName;
    }

    public void setPerson(String firstName, int age, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public void setPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPerson(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
    }

    public void setPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
