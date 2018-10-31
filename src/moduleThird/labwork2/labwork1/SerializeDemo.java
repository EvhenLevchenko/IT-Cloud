package moduleThird.labwork2.labwork1;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Employee("Bob", "fs", 0, 1);
        Employee e;

        FileInputStream fos = new FileInputStream("E:\\Game2\\Progrm\\project\\It\\IT-Cloud\\input.txt");
        ObjectInputStream oos = new ObjectInputStream(fos);

        try {

            e = (Employee) oos.readObject();
            System.out.println(e.getName());
            System.out.println(e.getAddress());
            System.out.println(e.getSSN());
            System.out.println(e.getNumber());
        }
        finally {
            oos.close();
        }
    }
}


