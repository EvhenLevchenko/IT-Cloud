package moduleThird.LabworkOne.labwork4;

import java.io.*;

public class ReplacementInFile {
    public static void main(String[] args) {
        RandomAccessFile rafi = null;

        try {
            rafi = new RandomAccessFile("outputCode.txt", "rw");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("PrintFile.java");
             FileOutputStream fileOutputStream = new FileOutputStream("outputCode.txt")) {
            String str = "";
            int c;
            while ((c = fileInputStream.read()) != -1) {
                str = str + (char) c;
            }
            System.out.println(str);
            System.out.println("\n\n\n");
            str = str.replace("public", "private");
            for (int i = 0; i < str.length(); i++) fileOutputStream.write(str.charAt(i));
            System.out.println(str);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
