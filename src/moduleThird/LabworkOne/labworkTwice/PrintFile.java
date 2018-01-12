package moduleThird.LabworkOne.labworkTwice;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintFile {
    public static void main(String[] args) {


        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("t.txt");
            bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
