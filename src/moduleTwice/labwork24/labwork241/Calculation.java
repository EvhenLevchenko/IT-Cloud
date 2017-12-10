package moduleTwice.labwork24.labwork241;

public class Calculation {

    public static void main(String[] args) {

        MyMath m3 = new MyMath();
        MyMath m4 = new MyMath();


        System.out.println(m3.findMin(new int[]{-1, 0, 1, 2, 3}));
        System.out.println(m4.findMax(new int[]{-10, -88, -212}));

        System.out.println("Area:" + MyMath.areaOfCircle(10));


        Employee e1 = new Employee("Alex", "Salax", "salesmen", 414111);
        Employee e2 = new Employee("Ben", "Chadli", "policmen", 0445455455);
        Employee e3 = new Employee("John", "Smith", "doctor", 46544556);
        Employee e4 = new Employee("Meri", "Venth", "taxi driver", 112151554);
        System.out.println("Employee = " + Employee.getNumberOfEmployees());

    }
}