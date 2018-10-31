package moduleTwice.labwork22.labwork223;

import java.util.Arrays;

class Employee {
    public void calcukateStage(String name,double... stage){
        double sum=0;

        for (double age:stage) {
            sum+=+age;
        }
        System.out.println("Name: "+name+" stage: "+ sum);
    }

    public  void calculateSalary(String name, double... salary) {
        double sum = 0;

        for (double money : salary) {
            sum += money;
        }
        System.out.println("Name:" + name + " Salary:" + sum);
    }
}

class Accountent {
    static Employee Create_Employee() {
        return new Employee();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee staff = new Employee();
        staff.calculateSalary("John", 55.3, 44, 9, 40.03);
        staff.calcukateStage("John", 2.2,3,10.6);
    }
}