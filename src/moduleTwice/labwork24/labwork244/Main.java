package moduleTwice.labwork24.labwork244;

public class Main {
    private int m;

    public static void main(String[] args) {
        Employee Avenger1 = new Employee("Tony", "Stark", "IronMan", 9485);
        Employee Avenger2 = new Employee("Steven", "Rogers", "Captain America", 9495);
        Employee Avenger3 = new Employee("Natasha", "ROmanova", "Black Widow", 9596);
        Employee Avenger4 = new Employee("Bruce", "Banner", "Hulk", 9500);
        Employee Avenger5 = new Employee("Bobby", "Fisher", "");
        System.out.println(Avenger5);

        System.out.println("There are " + Employee.getNumberOfEmployee() + " avengers registered.");
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    private static int numberOfEmployee = 0;

    public Employee() {
        this("Bobby", "Fisher2", "ocupation", 2);
    }

    public Employee(String firstName) {
        this(firstName, "Fisher", "ocupation1", 3);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, "ocupation", 4);
    }

    public Employee(String firstName, String lastName, String occupation) {
        this(firstName, lastName, occupation, 5);
    }


    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.occupation = occupation;
        this.telephone = telephone;
        this.lastName = lastName;
        numberOfEmployee++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        Employee.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}