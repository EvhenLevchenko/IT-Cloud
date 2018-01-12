package moduleThird.LabworkOne.labwork3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class MyFileCopy {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        RandomAccessFile rafi = null;

        try {
            raf = new RandomAccessFile("input.txt", "rw");
            rafi = new RandomAccessFile("output.txt", "rw");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
                FileInputStream fileInputStream = new FileInputStream("input.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) fileOutputStream.write(i);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
