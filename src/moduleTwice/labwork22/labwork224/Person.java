package moduleTwice.labwork22.labwork224;

class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int phoneNumber;

    public void setPerson1(int phoneNumber, String firstName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

    public void setPerson2(int phoneNumber, String firstName, String gender) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.gender = gender;
    }

    public void setPerson3(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setPerson4(String firstName, String lastName, String gender, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }

    public void setPerson5(String lastName, String gender, int age, int phoneNumber) {
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;

    }
}

